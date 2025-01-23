package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc
 *
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 *
 */
public class Greeting {
    private int localityID;
    private String localityName;
    private String asciiGreeting;
    private String unicodeGreeting;
    private String formatStr;

    /**
     * @param localityID the unique identifier of the locality
     * @param localityName the name of the locality
     * @param asciiGreeting the greeting message in ASCII format
     * @param unicodeGreeting the greeting message in Unicode format
     * @param formatStr the format string for generating greetings
     */
    public Greeting(int localityID, String localityName, String asciiGreeting, String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * @param localityID the unique identifier of the locality
     * @param localityName the name of the locality
     * @param asciiGreeting the greeting message in ASCII format
     */
    public Greeting(int localityID, String localityName, String asciiGreeting) {
        this(localityID, localityName, asciiGreeting, asciiGreeting, String.format("%s, %%s!", asciiGreeting));
    }

    /**
     * @param localityID the unique identifier of the locality
     * @param localityName the name of the locality
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");
    }

    /**
     * @return the locality ID
     */
    public int getLocalityID() {
        return localityID;
    }

    /**
     * @return the locality name
     */
    public String getLocalityName() {
        return localityName;
    }

    /**
     * @return the ASCII greeting
     */
    public String getAsciiGreeting() {
        return asciiGreeting;
    }

    /**
     * @return the Unicode greeting
     */
    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    /**
     * @return the formatted greeting string
     */
    public String getFormatStr() {
        if(formatStr.contains("%%s")) {
            return String.format("%%s, %s!", unicodeGreeting);
        }
        return formatStr;
    }
    /**
     * @param useAscii {@code true} to use the ASCII greeting, {@code false} to use Unicode
     * @return the formatted greeting string
     */
    public String getFormatStr(boolean useAscii) {
        if(useAscii) {
            return String.format("%%s, %s!", asciiGreeting);
        }
        return getFormatStr();
    }

    /**
     * @return a formatted string containing the locality ID, name, and greetings
     */
    @Override
    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityID, localityName, asciiGreeting, unicodeGreeting);
    }
}
