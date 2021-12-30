import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import models.characters.playablecharacters.PlayableCharacter;

import java.util.List;

@Builder
@Getter
@Setter
public class Game {
    private List<PlayableCharacter> characterList;
    private PlayableCharacter currentCharacter;
    private Integer currentCharacterIndex;

    public void play() {
        currentCharacter.attack();
        currentCharacter.changeWeapon();
        currentCharacter.attack();
    }

    public void changeCharacter(final Integer currentCharacterIndex) {
        this.currentCharacterIndex = currentCharacterIndex;
        currentCharacter = characterList.get(currentCharacterIndex);
    }

    public void currentCharacterName() {
        System.out.println("Current character is " + currentCharacter.getName());
    }
}
