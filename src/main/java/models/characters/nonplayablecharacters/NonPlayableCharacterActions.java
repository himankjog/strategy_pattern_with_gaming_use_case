package models.characters.nonplayablecharacters;

import models.characters.CharacterActions;
import models.weapons.Weapon;

public class NonPlayableCharacterActions implements CharacterActions {
    @Override
    public void move() {
        System.out.println("NonPlayableCharacter cannot move with instructions");
    }

    @Override
    public void fight(Weapon weapon) {

    }
}
