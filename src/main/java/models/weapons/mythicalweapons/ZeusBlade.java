package models.weapons.mythicalweapons;

import models.weapons.Weapon;
import models.weapons.WeaponActions;
import types.weapontypes.MythicalWeaponType;

import java.util.UUID;

public class ZeusBlade extends Weapon implements WeaponActions {
    public ZeusBlade(UUID weaponId) {
        super(weaponId, MythicalWeaponType.ZEUS_BLADE.name(), MythicalWeaponType.ZEUS_BLADE);
    }

    @Override
    public void attack() {
        System.out.println("Attacking with Zeus Blade");
    }

    @Override
    public void defend() {
        System.out.println("Defending with Zeus Blade");
    }

    @Override
    public void pickup() {
        System.out.println("Picking up Zeus Blade");
    }

    @Override
    public Weapon select() {
        System.out.println("Selecting Zeus Blade");
        return this;
    }
}
