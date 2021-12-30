import models.characters.playablecharacters.King;
import models.characters.playablecharacters.PlayableCharacter;
import models.characters.playablecharacters.PlayableCharacterActions;
import models.characters.playablecharacters.PlayableCharacterDetails;
import models.characters.playablecharacters.Queen;
import models.weapons.Weapon;
import models.weapons.aerialweapons.Arrow;
import models.weapons.aerialweapons.Cannon;
import models.weapons.comabatweapons.Dagger;
import models.weapons.comabatweapons.Sword;
import models.weapons.mythicalweapons.ZeusBlade;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BattleBazookaApplication {
    public static void main(String[] args) {

        final PlayableCharacter king = getKing();
        final PlayableCharacter queen = getQueen();

        final List<PlayableCharacter> playableCharacters = new ArrayList<>();
        playableCharacters.add(king);
        playableCharacters.add(queen);

        final Game game = Game.builder().characterList(playableCharacters).currentCharacter(king).currentCharacterIndex(0).build();

        game.play();
        game.currentCharacterName();
        game.changeCharacter(1);
        game.currentCharacterName();
        game.play();
    }

    public static PlayableCharacter getKing() {
        final List<Weapon> kingWeaponInventory = new ArrayList<>();
        kingWeaponInventory.add(new Sword(UUID.randomUUID()));
        kingWeaponInventory.add(new Dagger(UUID.randomUUID()));
        kingWeaponInventory.add(new Arrow(UUID.randomUUID()));

        final PlayableCharacterDetails detailsOfKing = PlayableCharacterDetails.builder()
                .characterActions(new PlayableCharacterActions())
                .currentWeapon(kingWeaponInventory.get(0))
                .weaponInventory(kingWeaponInventory)
                .build();

        return new King(UUID.randomUUID(), 10, 90, detailsOfKing);
    }

    public static PlayableCharacter getQueen() {
        final List<Weapon> queenWeaponInventory = new ArrayList<>();
        queenWeaponInventory.add(new Arrow(UUID.randomUUID()));
        queenWeaponInventory.add(new ZeusBlade(UUID.randomUUID()));
        queenWeaponInventory.add(new Cannon(UUID.randomUUID()));

        final PlayableCharacterDetails detailsOfQueen = PlayableCharacterDetails.builder()
                .characterActions(new PlayableCharacterActions())
                .currentWeapon(queenWeaponInventory.get(0))
                .weaponInventory(queenWeaponInventory)
                .build();

        return new Queen(UUID.randomUUID(), 8, 75, detailsOfQueen);
    }
}
