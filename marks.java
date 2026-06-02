import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        12
        1

    

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        int sum = 0;
        int highest = 0;
        int failCount = 0;

        for(int i = 0; i < n; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            sum += marks[i];

            if(marks[i] > highest) {
                highest = marks[i];
            }

            if(marks[i] < 35) {
                failCount++;
            }
        }

        double average = (double) sum / n;

        System.out.println("Highest Mark = " + highest);
        System.out.println("Average Mark = " + average);
        System.out.println("Number of Fail Students = " + failCount);

        sc.close();
    }
}