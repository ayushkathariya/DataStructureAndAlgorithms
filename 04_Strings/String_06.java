/* WAP to convert first letter of each word to uppercase. */

public class String_06 {

    public static String toEachWordUppercase(String str) {
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "My name is Ayush Kathariya";

        System.out.println(toEachWordUppercase(str)); // My Name Is Ayush Kathariya
    }
}
