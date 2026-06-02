import java.util.Scanner;
 class Main {
     
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a indication");
        char n = sc.next().charAt(0);
        switch (n) {
            case 'r':
                System.out.println("stop " );
                break;
            case 'y':
                System.out.println("wait " );
                break;
            case 'g':
                System.out.println("go ");
                break;
            default:
                System.out.println("invalid input");
        }
        //sc.close();
    }
}
