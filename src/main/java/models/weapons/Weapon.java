package models.weapons;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import types.weapontypes.WeaponType;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public abstract class Weapon implements WeaponActions {
    private final UUID weaponId;
    private final String name;
    private final WeaponType weaponType;
}
