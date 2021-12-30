package models.characters.playablecharacters;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import models.characters.CharacterDetails;
import models.weapons.Weapon;

import java.util.List;

@Builder
@Setter
@Getter
public class PlayableCharacterDetails implements CharacterDetails {
    private PlayableCharacterActions characterActions;
    private Weapon currentWeapon;
    private List<Weapon> weaponInventory;
}
