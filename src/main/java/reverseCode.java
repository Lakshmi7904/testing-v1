public class reverseCode {
    public static void main(String[] args) {
        String str = "AvyanAnayra";
        String reverse = "";
        //We use a for loop to iterate through each character of the input string in reverse order.
        // We start by initializing the loop counter i to input.length() - 1,
        // which is the index of the last character in the input string.
        // We continue looping as long as i is greater than or equal to 0, and we decrement i by 1 in each iteration.
        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }
}
