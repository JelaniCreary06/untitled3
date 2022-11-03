import java.util.Locale;

public class StringLoops
{
    // default constructor; no instance variables
    public StringLoops() { }

    /* Returns the number of times "character" appears in "searchString"
       This should be case sensitive!

       Examples:
       - if character = "a" and searchString = "Apples and bananas",
         this method returns 4
       - if character = "A" and searchString = "Apples and bananas",
         this method returns 1
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2
      */
    public int countCharacters(String character, String searchString)
    {
        int o = 0;
        for (int i = 0; i <= searchString.length() - 1; i++) {
            if ((searchString.charAt(i)+"").equals(character)) o++;
        }
        /* to be implemented */
        return o;
    }

    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString(String origString)
    {
        /* to be implemented */
        String rS = "";
        for (int i = origString.length() - 1; i >= 0; i--) {
            rS += origString.charAt(i);
        }

        return rS;
    }

    /* Returns the original string reversed -- SECOND IMPLEMENTATION

  Examples:
  - if origString = "hello!" this method returns "!olleh"
  - if origString = "Apples and bananas" this method returns "sananab dna selppA"
 */
    public String reverseString2(String origString)
    {
        String rS = "";
        int i = 0;
        while (origString.length() >= rS.length()) {
            if (((origString.length() - 1) - i) <= 0) rS += origString.charAt((0));
            else rS += origString.charAt((origString.length() - 1) - i);
            i++;
        }

        return rS;
    }

    /* Returns the number of vowels ("a", "e", "i", "o", "u") that appear in "origString";
    matches should NOT be case sensitive.

    (Note: you could do this by simply calling your countCharacters method 5 times in a
    row, one for each vowel, but that would lead to traversing the entire origString 5
    times -- it’s more efficient to only traverse the string once, so don’t use your
    countCharacters method for this!)

     Examples:
     - if origString = "Apples and bananas", this method returns 6: Apples and bananas
     - if origString = "Hello Joe", this method returns 4: Hello Joe
     - if origString = "Hmm.. pssh!", this method returns 0
     - if origString = "I", this method returns 1
     - if origString = "Supercalifragilisticexpialidocious", this method returns 16
    */
    public int countVowels(String origString)
    {
        int vc = 0;
        for (int i = 0; origString.length() > i; i++) {
            String c = origString.charAt(i)+"".toLowerCase();
            if (c.equals("a") || c.equals("e") || c.equals("i") ||c.equals("o") || c.equals("u")) vc++;
        }

        return vc;
    }

    /* Returns the number of times "searchString" appears in "origString";
    matches should NOT be case sensitive.

    Examples:
    - if searchString = "an" and origString = "Apples and bananas",
      this method returns 3: Apples and bananas
    - if searchString = "tat" and origString = "Ratatattat",
      this method returns 3: Ratatattat (note that two overlap)
    - if searchString = "lower" and origString = "sunflower",
      this method returns 1: sunflower
    - if searchString = "haha" and origString = "Hahahahaha",
      this method returns 4: Hahahahaha
(note that two overlap)
    - if searchString = "HAHA" and origString = "Hahahahaha",
      this method returns 4: Hahahahaha (note that two overlap)
    - if searchString = "rain" and origString = "it’s the brain drain pain train",
      this method returns 3: it’s the brain drain pain train
    - if searchString = "was" and origString = "I was about to call you, wasn’t I?",
      this method returns 2
    - if searchString = "but" and origString = "I was about to call you, wasn’t I?",
      this method returns 0
    - if searchString = "i" and origString = "Supercalifragilisticexpialidocious",
      this method returns 7
   */
    public int countString(String searchString, String origString)
    {
        searchString = searchString.toLowerCase(); origString = origString.toLowerCase();


        int sc = 0;

        

        return sc;
    }




}
