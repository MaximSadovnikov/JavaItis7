import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int digitsumMin = 0;
		int digitsum = 0;
		int memory = number;
		while (number != 0) {
			digitsumMin = digitsumMin + number % 10;
			number = number / 10;

		}
		number = scanner.nextInt();
		while (number != -1) {
			int memory1 = number;
			while (number != 0) {
				digitsum = digitsum + number % 10;
				number = number / 10;
			}
			if (digitsum <= digitsumMin) {
				digitsumMin = digitsum;
				memory = memory1;
			}
			digitsum = 0;
			number = scanner.nextInt();
		}
		System.out.println("Минимальная сумма цифр у числа " + memory + " с суммой цифр = " + digitsumMin );
	}

}