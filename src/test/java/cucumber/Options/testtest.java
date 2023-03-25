package cucumber.Options;

    public class testtest {
        public static void main(String[] args) {
            String str = "ravikiran";
            char[] charArray = str.toCharArray();
            char[] duplicates = new char[charArray.length];
            int count = 0;

            for (int i = 0; i < charArray.length; i++) {
                for (int j = i + 1; j < charArray.length; j++) {
                    if (charArray[i] == charArray[j]) {
                        // Check if the character is already in the duplicates array
                        boolean isDuplicate = false;
                        for (int k = 0; k < count; k++) {
                            if (charArray[i] == duplicates[k]) {
                                isDuplicate = true;
                                break;
                            }
                        }
                        // Add the character to the duplicates array if it's not already there
                        if (!isDuplicate) {
                            duplicates[count] = charArray[i];
                            count++;
                        }
                    }
                }
            }

            // Print the duplicates array
            for (int i = 0; i < count; i++) {
                System.out.print(duplicates[i] + " ");
            }
        }
    }



