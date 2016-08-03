
public class Euler {

	public static void main(String[] args) {
		int prod = 0, revNum = 0, largestNum = 0;
		// TODO Auto-generated method stub
		for (int i = 900; i < 1000; i++) {
			for (int j = 900; j < 1000; j++) {
				prod = i * j;
				revNum = reverseNum(prod);
				if (prod == revNum) {
					largestNum = prod;
				}
			}
		}
		
		System.out.println("The largest num is "+largestNum);
	}

	static int reverseNum(int num) {
		int rev = 0;
		while (num != 0) {
			rev = rev * 10;
			rev = rev + num % 10;
			num = num / 10;
		}

		return rev;

	}

}
