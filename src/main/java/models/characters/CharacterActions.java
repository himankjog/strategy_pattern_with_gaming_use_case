package models.characters;

import models.weapons.Weapon;

public interface CharacterActions {
     void move();
     void fight(Weapon weapon);
}
