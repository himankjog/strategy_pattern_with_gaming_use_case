package models.characters.playablecharacters;

import lombok.Getter;
import lombok.Setter;
import types.charactertypes.PlayableCharacterType;

import java.util.UUID;

@Getter
@Setter
public class King extends PlayableCharacter {

    public King(UUID characterId, Integer height, Integer weight, PlayableCharacterDetails characterDetails) {
        super(characterId, PlayableCharacterType.KING.name(), height, weight, PlayableCharacterType.KING, characterDetails);
    }
}
