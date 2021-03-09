// When saving this quote a disk error has occurred. Please fix it!
// Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!
// Use pieces of the quote variable (instead of just redefining the string)!

public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String toBeInserted = "always takes longer than";
        Integer partToBeCut = 21;
        StringBuffer newStringWithAddedText = new StringBuffer(quote);
        newStringWithAddedText.insert(partToBeCut, toBeInserted);
        System.out.println(newStringWithAddedText);

    }
}
