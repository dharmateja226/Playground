import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
      int num1 = in.nextInt();
      int second_last_digit = (num1%100)/10;
      System.out.println(second_last_digit);
	}
}