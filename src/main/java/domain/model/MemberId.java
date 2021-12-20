package domain.model;

public record MemberId(int value) {

    public static MemberId of(int value) {
        return new MemberId(value);
    }

    public String getValue() {
        return String.valueOf(value);
    }
}
