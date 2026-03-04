package Model;

public enum Genre {
    ROCK,
    POP,
    JAZZ,
    HIPHOP,
    CLASSICAL,
    ELEKTRONIC;

    public static <IllegalArgumentException> Genre fromString(String input) {
        try {
            return Genre.valueOf();
        } catch (IllegalArgumentException e ) {
            System.out.println("Ugyldig genre!");
            return null;
        }

    }

}
