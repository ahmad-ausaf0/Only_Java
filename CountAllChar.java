class HelloWorld {
    public static void main(String[] args) {
        countCh("Hello@123");
    }
    public static void countCh(String input) {
        int uC = 0;
        int lC = 0;
        int nC = 0;
        int sC = 0;
        
         for (int i = 0; i < input.length(); i++) {
             char ch = input.charAt(i);
             if (ch >= 65 && ch <= 90) {
                 uC++;
             }
             else if (ch >= 97 && ch <= 122) {
                 lC++;
             }
             else if (ch >= 48 && ch <= 57) {
                 nC++;
             }
             else {
                 sC++;
             }
         }
          System.out.println("UpperC: "+ uC);
          System.out.println("LowerC: "+ lC);
          System.out.println("NumberC: "+ nC);
          System.out.println("SpecialC: "+ sC);
    }
}
