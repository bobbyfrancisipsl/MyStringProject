package love.programming;

public class StringProject {
    public static void main(String[] args) {
        String MyString = "Bobby Francis";
        String OtherString = new String ("Bobby francis");

        System.out.println(MyString);
        System.out.println(MyString.hashCode());
        System.out.println(MyString.toUpperCase());
        System.out.println(MyString.compareTo(OtherString));


    }
}
