package love.programming;

public class StringProject {
    public static void main(String[] args) {
        String myString = "Bobby Francis";
        String otherString = new String("Love Programming");

        System.out.println(myString);

        System.out.println(myString.hashCode());

        System.out.println(myString.toUpperCase());

        System.out.println(myString.compareTo(otherString));

        System.out.println(myString.contentEquals(otherString));
        
        System.out.println(myString.length());


    }
}
