package types.charactertypes;

public enum NonPlayableCharacterType implements CharacterType {
    DOG,
    ROCK,
    VILLAGER
    ;

    @Override
    public boolean isPlayable() {
        return false;
    }
}
