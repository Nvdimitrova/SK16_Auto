package Exercises_06;

public class LastCharacter {
    public static void main(String[] args) {
        findLastCharacter("There is my sentence");
    }

    public static void findLastCharacter(String sentence){
        if (sentence.isEmpty()){
            System.out.println("There is no last character.");
        }else {
            char lastCharacter = sentence.charAt(sentence.length() - 1);
            System.out.println("The last character is: " + lastCharacter);
        }
    }
}