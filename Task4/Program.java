import java.util.Scanner;
class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int m1 = 0;
        System.out.println("Enter array size :");
        int arraySize = scanner.nextInt();
        int array[] = new int[arraySize];
        while (true) {
            System.out.println("Menu : ");
            System.out.println("1. Add element");
            System.out.println("2. Reverse array");
            System.out.println("3. Sort array");
            System.out.println("4. Search element");
            System.out.println("5. Show elements");
            System.out.println("0. Exit");
            int commandMain = scanner.nextInt();
            switch (commandMain) {
                case 1: {
                    if (count == arraySize) {
                        System.err.println("Array is FULL");
                        break;
                    } else {
                        System.out.println("1. Add element from left   2. Add element from right");
                        int command1 = scanner.nextInt();
                        System.out.println("Enter element");
                        switch (command1) {
                            case 1: {
                                for (int i = count; i > 0; i--) {
                                    array[i] = array[i - 1];
                                }
                                array[0] = scanner.nextInt();
                                break;
                            }
                            case 2: {
                                array[count] = scanner.nextInt();
                                break;
                            }
                        }
                    }
                    count++;
                    break;
                }
                case 2: {
                    if(count == 0){
                        break;
                    } else {
                        for (int i = 0 ; i < count/2 ; i++ ) {
                            int a = array[i];
                            array[i] = array [count - 1 - i];
                            array[count -1 - i] = a;
                        }
                    }
                    break;
                }
                case 3:{
                    System.out.println("1. From Min to Max   2. From Max to Min");
                    int command3 = scanner.nextInt();
                    switch (command3){
                        case 1:{
                            for (int i = 0 ; i < count -1 ; i++ ){
                                int m = array[i];
                                for (int j = i+1 ; j < count ; j++) {

                                    if (array[j] < m) {
                                        m = array[j];
                                        m1 = j;
                                    }
                                    else{
                                        m1=i;
                                    }
                                    array[m1] = array[i];
                                    array[i] = m;
                                }
                            }
                        }
                        break;
                        case 2:{
                            for (int i = 0 ; i < count -1 ; i++ ){
                                int m = array[i];
                                for (int j = i+1 ; j < count ; j++) {

                                    if (array[j] > m) {
                                        m = array[j];
                                        m1 = j;
                                    }
                                    else{
                                        m1=i;
                                    }
                                    array[m1] = array[i];
                                    array[i] = m;
                                }
                            }

                        }
                        break;
                    }
                }break;
                case 4: {
                    System.out.println("1. Search Maximum element   2. Search Minimum element");
                    int command4 = scanner.nextInt();
                    switch (command4) {
                        case 1: {
                            int max = array[0];
                            for (int i = 1 ; i < count ; i++) {
                                if (array[i] > max) {
                                    max = array[i];
                                }
                            }
                            System.out.println("Maximum : " + max);
                            break;
                        }
                        case 2: {
                            int min = array[0];
                            for (int i = 1 ; i < count ; i++) {
                                if (array[i] < min) {
                                    min = array[i];
                                }
                            }
                            System.out.println("Minimum: " + min);
                            break;
                        }
                    }
                }break;

                case 5:{
                    System.out.print("Array : ");
                    for (int i = 0 ; i < count ; i++){
                        System.out.print(array[i] + " ");
                    }
                    System.out.println();
                }
                break;
                case 0: {
                    System.exit(0);
                }
                break;
            }
        }
    }
}