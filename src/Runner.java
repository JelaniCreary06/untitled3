public class Runner {
    public static void main(String[] args) {

        StringLoops loops = new StringLoops();
        System.out.println(loops.countCharacters("a", "Apples and bananas"));
        System.out.println(loops.countCharacters("A", "Apples and bananas"));
        System.out.println(loops.countCharacters("!", "Hello! Nice day!"));
        System.out.println(loops.reverseString("hello!"));
        System.out.println(loops.reverseString("Apples and bananas"));
        System.out.println(loops.reverseString2("hello!"));
        System.out.println(loops.reverseString2("Apples and bananas"));

        System.out.println(loops.countVowels("Apples and bananas"));
        System.out.println(loops.countVowels("Hello Joe"));
        System.out.println(loops.countVowels("Hmm.. pssh!"));
        System.out.println(loops.countVowels("I"));
        System.out.println(loops.countVowels("Supercalifragilisticexpialidocious")+"\n");

        System.out.println(loops.countString("an", "Apples and bananas"));
        System.out.println(loops.countString("tat", "Ratatattat"));
        System.out.println(loops.countString("lower", "sunflower"));
        System.out.println(loops.countString("haha", "Hahahahaha"));
        System.out.println(loops.countString("HAHA", "Hahahahaha"));
        System.out.println(loops.countString("rain", "it’s the brain drain pain train"));
        System.out.println(loops.countString("was", "I was about to call you"));
        System.out.println(loops.countString("but", "I was about to call you"));
        System.out.println(loops.countString("i", "Supercalifragilisticexpialidocious"));




    }
}
