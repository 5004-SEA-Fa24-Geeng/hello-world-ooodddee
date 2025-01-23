package student;

/**
 * This class represents a greeting message associated with a locality.
 * It stores the locality ID, name, and greetings in both ASCII and Unicode formats.
 * <p>
 * More details: <a href="https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html">
 * Package Summary</a>.
 * </p>
 */
public class Greeting {

    /** The unique identifier of the locality. */
    private int localityID;

    /** The name of the locality. */
    private String localityName;

    /** The greeting message in ASCII format. */
    private String asciiGreeting;

    /** The greeting message in Unicode format. */
    private String unicodeGreeting;

    /** The format string used for generating greetings. */
    private String formatStr;

    /**
     * Constructs a Greeting object with all required parameters.
     *
     * @param localityID      the unique identifier of the locality
     * @param localityName    the name of the locality
     * @param asciiGreeting   the greeting message in ASCII format
     * @param unicodeGreeting the greeting message in Unicode format
     * @param formatStr       the format string for generating greetings
     */
    public Greeting(int localityID, String localityName, String asciiGreeting,
                    String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * Constructs a Greeting object with default Unicode greeting.
     *
     * @param localityID    the unique identifier of the locality
     * @param localityName  the name of the locality
     * @param asciiGreeting the greeting message in ASCII format
     */
    public Greeting(int localityID, String localityName, String asciiGreeting) {
        this(localityID, localityName, asciiGreeting, asciiGreeting,
                String.format("%s, %%s!", asciiGreeting));
    }

    /**
     * Constructs a Greeting object with a default ASCII greeting of "Hello".
     *
     * @param localityID   the unique identifier of the locality
     * @param localityName the name of the locality
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");
    }

    /**
     * Gets the locality ID.
     *
     * @return the locality ID
     */
    public int getLocalityID() {
        return localityID;
    }

    /**
     * Gets the locality name.
     *
     * @return the locality name
     */
    public String getLocalityName() {
        return localityName;
    }

    /**
     * Gets the ASCII greeting.
     *
     * @return the ASCII greeting
     */
    public String getAsciiGreeting() {
        return asciiGreeting;
    }

    /**
     * Gets the Unicode greeting.
     *
     * @return the Unicode greeting
     */
    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    /**
     * Gets the formatted greeting string.
     *
     * @return the formatted greeting string
     */
    public String getFormatStr() {
        if (formatStr.contains("%%s")) {
            return String.format("%%s, %s!", unicodeGreeting);
        }
        return formatStr;
    }

    /**
     * Gets the formatted greeting string, selecting between ASCII and Unicode.
     *
     * @param useAscii {@code true} to use the ASCII greeting, {@code false} to use Unicode
     * @return the formatted greeting string
     */
    public String getFormatStr(boolean useAscii) {
        if (useAscii) {
            return String.format("%%s, %s!", asciiGreeting);
        }
        return getFormatStr();
    }

    /**
     * Returns a formatted string representation of the Greeting object.
     *
     * @return a formatted string containing the locality ID, name, and greetings
     */
    @Override
    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", "
                        + "unicodeGreeting:\"%s\"}",
                localityID, localityName, asciiGreeting, unicodeGreeting);
    }
}
