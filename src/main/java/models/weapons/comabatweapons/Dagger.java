package models.weapons.comabatweapons;

import models.weapons.Weapon;
import models.weapons.WeaponActions;
import types.weapontypes.CombatWeaponType;

import java.util.UUID;

public class Dagger extends Weapon implements WeaponActions {
    public Dagger(final UUID weaponId) {
        super(weaponId, CombatWeaponType.DAGGER.name(), CombatWeaponType.DAGGER);
    }

    @Override
    public void attack() {
        System.out.println("Attacking with dagger");
    }

    @Override
    public void defend() {
        System.out.println("Defending with dagger");
    }

    @Override
    public void pickup() {
        System.out.println("Picked up dagger");
    }

    @Override
    public Weapon select() {
        System.out.println("Selected dagger");
        return this;
    }
}
