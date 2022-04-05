package challenges;

public class ReverseString {

    public static void main(String[] args) {

        String string1 = new String("Hello World");
        System.out.println(string1);
        System.out.println(string1.length());
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = string1.length() - 1; i >= 0; i--) {
            stringBuilder.append(string1.charAt(i));
        }

        string1 = "go away";
        System.out.println(string1);
        string1 = String.valueOf(stringBuilder);
        System.out.println(string1);
        System.out.println(stringBuilder);
    }
}
