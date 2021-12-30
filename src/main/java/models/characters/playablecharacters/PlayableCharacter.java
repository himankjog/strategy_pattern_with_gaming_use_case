package models.characters.playablecharacters;

import models.characters.Character;
import types.charactertypes.PlayableCharacterType;

import java.util.Random;
import java.util.UUID;

public class PlayableCharacter extends Character {
    public PlayableCharacter(UUID characterId, String name, Integer height, Integer weight, PlayableCharacterType characterType, PlayableCharacterDetails characterDetails) {
        super(characterId, name, height, weight, characterType, characterDetails);
    }

    public void changeWeapon() {
        final PlayableCharacterDetails characterDetails = (PlayableCharacterDetails) getCharacterDetails();
        int randomInteger = new Random().ints(0, characterDetails.getWeaponInventory().size()).findFirst().getAsInt();
        System.out.println("Previous weapon: " + characterDetails.getCurrentWeapon().getName());
        characterDetails.setCurrentWeapon(characterDetails.getWeaponInventory().get(randomInteger));
        System.out.println("New weapon: " + characterDetails.getCurrentWeapon().getName());
    }

    public void attack() {
        final PlayableCharacterDetails characterDetails = (PlayableCharacterDetails) getCharacterDetails();
        System.out.println(getName() + " is attacking.");
        characterDetails.getCharacterActions().fight(characterDetails.getCurrentWeapon());
    }
}
