
public class Euler {

	public static void main(String[] args) {

		new Euler().returnNumber(0, 0);

	}

	public void returnNumber(int num, int sum) {

		if (num < 1000) {
			if ((num % 3 == 0 || num % 5 == 0)) {
				sum += num;
				num++;
				returnNumber(num, sum);
			} else {
				num++;
				returnNumber(num, sum);
			}
		}else{
			System.out.println("The sum is " + sum);
		}

	}

}
