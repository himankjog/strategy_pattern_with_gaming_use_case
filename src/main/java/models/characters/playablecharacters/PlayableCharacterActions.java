package models.characters.playablecharacters;

import models.characters.CharacterActions;
import models.weapons.Weapon;

public class PlayableCharacterActions implements CharacterActions {
    @Override
    public void move() {
        System.out.println("Character is moving");
    }

    @Override
    public void fight(final Weapon weapon) {
        System.out.printf("Character is fighting with %s\n", weapon.getName());
        weapon.attack();
    }
}
