import java.util.*;
public class argumentCalculator {

	static void parity(int n) {
		if (n % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
	}

	static boolean isPrime(int n) {
		int factors = 0;
		for(int i = 1; i <= n; i++){
			if(n % i == 0) 
			factors++;
		}
		
		if(factors == 2)
			return true;
		else
			return false;
	}

	static int add(int n1, int n2) {
		return n1 + n2;
	}

	static int subtract(int n1, int n2) {
		return n1 - n2;
	}

	static int multiply(int n1, int n2) {
		return n1 * n2;
	}

	static int divide(int n1, int n2) {
		return n1 / n2;
	}

	static double average(int[] nums) {
		int sum = 0;
		for (int i : nums)
			sum += i;
		return sum / (nums.length * 1.0);
	}

	static double product(int[] nums) {
		int product = 1;
		for (int i : nums)
			product *= i;
		return product;
	}

	static void sort(int[] nums) {
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		if (args[0].equals("parity"))
			parity(Integer.parseInt(args[1]));

		if (args[0].equals("isPrime"))
			System.out.println(isPrime(Integer.parseInt(args[1])));

		if (args[0].equals("add"))
			System.out.println(
				add(
					Integer.parseInt(args[1]),
					Integer.parseInt(args[2])
					)
				);

		if (args[0].equals("subtract"))
			System.out.println(
				subtract(
					Integer.parseInt(args[1]),
					Integer.parseInt(args[2])
					)
				);

		if (args[0].equals("multiply"))
			System.out.println(
				multiply(
					Integer.parseInt(args[1]),
					Integer.parseInt(args[2])
					)
				);

		if (args[0].equals("divide"))
			System.out.println(
				divide(
					Integer.parseInt(args[1]),
					Integer.parseInt(args[2])
					)
				);
		
		// Extra Credit
		if (args[0].equals("average")) {
			int[] nums = new int[args.length - 1];
			for (int i = 1; i < args.length; i++)
				nums[i - 1] = Integer.parseInt(args[i]);
			System.out.println(average(nums));
		}

		if (args[0].equals("product")) {
			int[] nums = new int[args.length - 1];
			for (int i = 1; i < args.length; i++)
				nums[i - 1] = Integer.parseInt(args[i]);
			System.out.println(product(nums));
		}

		if (args[0].equals("sort")) {
			int[] nums = new int[args.length - 1];
			for (int i = 1; i < args.length; i++)
				nums[i - 1] = Integer.parseInt(args[i]);
			sort(nums);
		}
			
	}
}
