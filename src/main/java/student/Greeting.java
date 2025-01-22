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

    public Greeting(int localityID, String localityName, String asciiGreeting, String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    public Greeting(int localityID, String localityName, String asciiGreeting) {
        this(localityID, localityName, asciiGreeting, asciiGreeting, String.format("%s, %%s!", asciiGreeting));
    }

    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");
    }

    public int getLocalityID() {
        return localityID;
    }

    public String getLocalityName() {
        return localityName;
    }

    public String getAsciiGreeting() {
        return asciiGreeting;
    }

    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    public String getFormatStr() {
        if(formatStr.contains("%%s")) {
            return String.format("%%s, %s!", unicodeGreeting);
        }
        return formatStr;
    }

    public String getFormatStr(boolean useAscii) {
        if(useAscii) {
            return String.format("%%s, %s!", asciiGreeting);
        }
        return getFormatStr();
    }


    @Override
    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityID, localityName, asciiGreeting, unicodeGreeting);
    }
}
