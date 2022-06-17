import java.util.*;
class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("max value is:" + getMax(array, size));
        System.out.println("min value is:" + getMin(array, size));
        in.close();
    }
    
    public static int getMax(int array[], int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
       
        return max;
    }
    
    public static int getMin(int array[], int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
       
        return min;
    }
}