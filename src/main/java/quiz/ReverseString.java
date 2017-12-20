package quiz;

public class ReverseString {
    public String reverse(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.append(input.charAt(input.length() - 1 - i));
        }
        return sb.toString();
        // return new StringBuffer(input).reverse().toString();
    }
}