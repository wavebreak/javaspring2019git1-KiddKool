import java.util.Scanner;

public class TextMsgExpander {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userLine;

        // Prompt user for text
        System.out.println("Enter text:");
        userLine = scnr.nextLine();
        System.out.println("You entered: " + userLine);
        System.out.println("");

        // Check for abbreviations
       if (userLine.indexOf("BFF") > -1) {
           userLine = userLine.replace("BFF", "best friends forever" );
       } else if (userLine.equals("IDK")) {
           System.out.println("I don't know");
       } else if (userLine.equals("JK")) {
           System.out.println("just kidding");
       } else if (userLine.equals("TMI")) {
           System.out.println("too much information");
        } else if (userLine.equals("TTYL")) {
           System.out.println("talk to you later");
       }




        // Output expanded text
        System.out.println("");
        System.out.println("Expanded: " + userLine);
    }
}