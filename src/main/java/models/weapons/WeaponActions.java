package models.weapons;

public interface WeaponActions {
    void attack();
    void defend();
    void pickup();
    Weapon select();
}
