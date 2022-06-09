class CountingWords {
    public static void main(String[] args) {
        System.out.println(countOfWords("The sun rises in the east"));
        
    }
    public static int countOfWords(String input) {
        int spaces = 0;
        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ' || input.charAt(i) == '\0') {
                spaces++;
            }
        }
        return spaces + 1;
    } 
}
