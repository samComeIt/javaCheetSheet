package project;

public class MultiplicationTable {
	
	void print() {
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d * %d = %d", 5, i, 5*i).println();
		}
	}
	
	void print(int table) {
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d * %d = %d", table, i, table*i).println();
		}
	}
	
}
