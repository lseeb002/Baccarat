public enum Suit {
    DIAMOND ("diamonds"),
    CLUB ("clubs"),
    HEART ("hearts"),
    SPADE ("spades");
    private final String displayName;

    private Suit(String s) {
        this.displayName = s;
    }

    public String getDisplayName() {
        return displayName;
    }
}

public enum Rank {
    ACE (1, "Ace"), TWO (2, "2"), THREE (3, "3"),
    FOUR (4, "4"), FIVE (5, "5"), SIX (6, "6"),
    SEVEN (7, "7"), EIGHT (8, "8"), NINE (9, "9"),
    TEN (10, "10"), JACK (10, "Jack"), QUEEN (10, "Queen"),
    KING (10, "King");
    private final int value;
    private final String displayName;

    private Rank (int v, String s) {
        this.value = v;
        this.displayName = s;
    }

    public int getValue() {
        return value;
    }
    
    public String getDisplayName() {
        return displayName;
    }
}
