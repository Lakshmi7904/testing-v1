public class VowesCount {

    public static void main(String[] args) {
        String input = "ravikiran";
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch);
                count++;
            }
        }
        System.out.println("Total vowels: " + count);

    }
}
