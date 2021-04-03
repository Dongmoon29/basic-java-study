package NumberOfVowels;

public class NumberOfVowels {
    public static int countVowels(String input) {
        int totalVowels = 0;
        String lowerCaseInput = input.toLowerCase();
        for(int i = 0; i < lowerCaseInput.length(); i++) {
            if(lowerCaseInput.charAt(i) == 'a' ) {
                totalVowels++;
            } else if(lowerCaseInput.charAt(i) == 'e') {
                totalVowels++;
            } else if(lowerCaseInput.charAt(i) == 'i') {
                totalVowels++;
            } else if (lowerCaseInput.charAt(i) == 'o') {
                totalVowels++;
            } else if (lowerCaseInput.charAt(i) == 'u') {
                totalVowels++;
            }
        }
        return totalVowels;
    }

    public static void main(String[] args) {
        System.out.println(NumberOfVowels.countVowels("Arrays"));
    }
}

