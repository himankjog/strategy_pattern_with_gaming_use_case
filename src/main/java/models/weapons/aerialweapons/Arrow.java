package models.weapons.aerialweapons;

import models.weapons.Weapon;
import models.weapons.WeaponActions;
import types.weapontypes.AerialWeaponType;

import java.util.UUID;

public class Arrow extends Weapon implements WeaponActions {
    public Arrow(UUID weaponId) {
        super(weaponId, AerialWeaponType.ARROW.name(), AerialWeaponType.ARROW);
    }

    @Override
    public void attack() {
        System.out.println("Attacking with Arrow");
    }

    @Override
    public void defend() {
        System.out.println("defending with Arrow is not possible");

    }

    @Override
    public void pickup() {
        System.out.println("Picking up Arrow");

    }

    @Override
    public Weapon select() {
        System.out.println("Selecting Arrow");
        return this;
    }
}
