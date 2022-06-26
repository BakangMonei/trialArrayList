package FinalPack;

import java.util.*;

public class MainClass {
    static setswana sets;
    static french fre;
    public static void main(String[] args) {
        ArrayList<String> EnglishLanguage = new ArrayList<String>();
        EnglishLanguage.add("Hello");
        EnglishLanguage.add("Goodnight");
        EnglishLanguage.add("Evening");
        EnglishLanguage.add("Good");
        EnglishLanguage.add("Sleep");
        EnglishLanguage.add("Car");
        EnglishLanguage.add("Handsome");
        EnglishLanguage.add("Boy");
        EnglishLanguage.add("Hell");
        EnglishLanguage.add("Help");
        EnglishLanguage.add("Girl");
        EnglishLanguage.add("Love");
        EnglishLanguage.add("Food");
        EnglishLanguage.add("Eat");
        EnglishLanguage.add("Plane");
        System.out.println("Words stored in ArrayList");
        System.out.println(EnglishLanguage);

        System.out.println("*************************************************");
        System.out.println("Searching the word");
        // For Searching the word
        for (String element : EnglishLanguage){
            if (element.contains("P")){
                System.out.print(element + "\n");
            }
        }
        System.out.println("*************************************************");

        // Get the iterator
        System.out.println("Printing the first word");
        Iterator<String> it = EnglishLanguage.iterator();
        // Print the first item
        System.out.println(it.next());
        System.out.println("*************************************************");

        // Deleting
        while(it.hasNext()) {
            String  i = it.next();
            if(i == "Eat") {
                it.remove();
            }
            System.out.println(EnglishLanguage);
        }
    }
}
