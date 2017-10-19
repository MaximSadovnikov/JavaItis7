import java.util.Scanner;
class Program {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digitSum = 0;
        int Total = 1;
        boolean isPrime = true ;
        while (number != -1) {
            while(number != 0) {
                digitSum = digitSum + number % 10 ;
                number = number / 10 ;
            }
            //System.out.println(digitSum); ### ПРОВЕРКА

            if (digitSum == 2 || digitSum == 3) {
                isPrime = true ;
            }
            if (digitSum > 3) {
                int i = 2 ;
                while (i * i <= digitSum) {
                    if (digitSum % i == 0){
                        isPrime = false ;
                        break;
                    }
                i = i + 1;
                }
            }
            //System.out.println(isPrime); ### ПРОВЕРКА
            if (isPrime == true) {
                Total = Total * digitSum;
                //System.out.println(Total); ### ПРОВЕРКА
            }
            isPrime = true;
            digitSum = 0;
            number = scanner.nextInt();
        }
        System.out.println("Итог : " + Total);
    }
}