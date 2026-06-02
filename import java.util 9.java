import java.util.Scanner;
class Comp{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        if(str1.equals(str2)) {
            System.out.println("The two strings are the same.");
        } else {
            System.out.println("The two strings are different.");
        }
        sc.close();
    }
}
