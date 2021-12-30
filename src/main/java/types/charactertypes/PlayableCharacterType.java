package types.charactertypes;

public enum PlayableCharacterType implements CharacterType{
    KING,
    QUEEN,
    JACK,
    SOLDIER,
    ARCHER,
    SPEARGUY;

    @Override
    public boolean isPlayable() {
        return true;
    }
}
