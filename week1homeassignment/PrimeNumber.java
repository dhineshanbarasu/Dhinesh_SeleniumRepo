package week1.week1homeassignment;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 9;

		int count = 0;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {

				count++;

			}
		}

		if (count == 2) {

			System.out.println("is prime no.");
		} else {

			System.out.println("is not a prime no.");
		}

	}

}
