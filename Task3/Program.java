import java.util.Scanner;
class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int array[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = 0;
        int min = 0;
        int maxElement = array[max];
        int minElement = array[min];
        for (int i = 1; i < arraySize; i++) {
            if (array[i] < minElement) {
                min = i;
                minElement = array[i];
            } else if (array[i] > maxElement) {
                max = i;
                maxElement = array[i];
            }
        }
        maxElement = array[max];
        array[max] = array[min];
        array[min] = maxElement;
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + " ");
        }
    }
}