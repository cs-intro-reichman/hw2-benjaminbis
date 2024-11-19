public class Cheers {
    public static void main(String[] args) {
        String word = args[0].toUpperCase(); 
        int repeats = Integer.parseInt(args[1]); 

        String vowels = "AEFHILMNORSX";

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i); 

            String article;
            if (vowels.indexOf(letter) != -1) {
                article = "an";
            } else {
                article = "a";
            }
           String space = article.equals("a") ? "  " : " ";
           System.out.println("Give me " + article + " " + letter + ": " + letter + "!");
        }

        System.out.println("What does that spell?");

        for (int i = 0; i < repeats; i++) {
            System.out.println(word + "!!!");
        }
    }
}
