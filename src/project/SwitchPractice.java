package project;

public class SwitchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isWeekDay(1));
	}
	
	public static boolean isWeekDay(int dayWeek) {
		switch(dayWeek) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:	
			return true;
		}
		
		
		
		
		return false;
	}

}
