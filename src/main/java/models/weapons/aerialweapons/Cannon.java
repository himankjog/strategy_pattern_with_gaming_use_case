package models.weapons.aerialweapons;

import models.weapons.Weapon;
import models.weapons.WeaponActions;
import types.weapontypes.AerialWeaponType;

import java.util.UUID;

public class Cannon extends Weapon implements WeaponActions {
    public Cannon(UUID weaponId) {
        super(weaponId, AerialWeaponType.CANNON.name(), AerialWeaponType.CANNON);
    }

    @Override
    public void attack() {
        System.out.println("Attacking with Cannon");
    }

    @Override
    public void defend() {
        System.out.println("Defending with Cannon");
    }

    @Override
    public void pickup() {
        System.out.println("Picking up Cannon is not possible");
    }

    @Override
    public Weapon select() {
        System.out.println("Selecting Cannon");
        return this;
    }
}
