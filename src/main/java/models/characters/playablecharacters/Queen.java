package models.characters.playablecharacters;

import types.charactertypes.PlayableCharacterType;

import java.util.UUID;

public class Queen extends PlayableCharacter {
    public Queen(UUID characterId, Integer height, Integer weight, PlayableCharacterDetails characterDetails) {
        super(characterId, PlayableCharacterType.QUEEN.name(), height, weight, PlayableCharacterType.QUEEN, characterDetails);
    }
}
