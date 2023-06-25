package project;

public class binumberRunner {

	public static void main(String[] args) {
		BiNumber numbers = new BiNumber(2,3);
		System.out.println(numbers.add());
		System.out.println(numbers.multiply());
		numbers.doubleValue();
		System.out.println(numbers.getI());
		System.out.println(numbers.getJ());

	}

}
