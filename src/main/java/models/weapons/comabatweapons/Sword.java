package models.weapons.comabatweapons;

import models.weapons.Weapon;
import models.weapons.WeaponActions;
import types.weapontypes.CombatWeaponType;

import java.util.UUID;

public class Sword extends Weapon implements WeaponActions {
    public Sword(final UUID weaponId) {
        super(weaponId, CombatWeaponType.SWORD.name(), CombatWeaponType.SWORD);
    }

    @Override
    public void attack() {
        System.out.println("Attacking with sword");
    }

    @Override
    public void defend() {
        System.out.println("Defending with sword");
    }

    @Override
    public void pickup() {
        System.out.println("Picked up sword");
    }

    @Override
    public Weapon select() {
        System.out.println("Selected Sword");
        return this;
    }
}
