import java.util.Scanner;
class Comp{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        for(str1 = str1.toLowerCase(); str1.length() > 0; str1 = str1.replace(str1.charAt(0)+"", "")){
            char ch = str1.charAt(0);
            int count1 = 0, count2 = 0;
            for(int i=0; i<str1.length(); i++){
                if(str1.charAt(i) == ch){
                    count1++;
                }
            }
            for(int i=0; i<str2.length(); i++){
                if(str2.charAt(i) == ch){
                    count2++;
                }
            }
            if(count1 != count2){
                System.out.println("The strings are not anagrams.");
                return;
            }
        }
        sc.close();
    }
}
