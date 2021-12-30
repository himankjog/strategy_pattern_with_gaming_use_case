package models.characters;

import lombok.Getter;
import lombok.Setter;
import types.charactertypes.CharacterType;
import lombok.AllArgsConstructor;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public abstract class Character {
    private final UUID characterId;
    private final String name;
    private final Integer height;
    private final Integer weight;
    private final CharacterType characterType;
    private final CharacterDetails characterDetails;
}
