public class Rot{
    public static void main(String[]args){
        int[] queue = {1, 2, 3, 4, 5};
        int last = queue[queue.length - 1];
        for (int i = queue.length - 1; i > 0; i--) {
            queue[i] = queue[i - 1];
        }
        queue[0] = last;    
        System.out.print("array after rotation: ");
        for (int num : queue) {
            System.out.print(num + " ");
        }
    }
}