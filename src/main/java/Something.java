import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * This Javadoc Comment allows checkstyle to stop being an asshole perhaps.
 * @author Nikhil
 *
 */
public class Something {
    /**
     * Main method.
     * @param args
     */
    public static void main(String[] args){
        System.out.println("When the hell is Winds of Winter gonna come out?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the url you are interested in: ");
        String websiteContent = urlToString(scanner.nextLine());
        websiteContent.toLowerCase();
        Scanner wordToCount = new Scanner(System.in);
        System.out.println("What word would you like to specifically count?: ");
        String word = wordToCount.next();
        int specificWordCount = websiteContent.split(word).length;
        System.out.println(specificWordCount);
        System.out.println(websiteContent.split("\\w+").length);

    }
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

}
