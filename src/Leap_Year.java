
public class Leap_Year {

	public static void main(String[] args) {

				int year=2000;
				
				if(year%4!=0)
					System.out.println("February=28");
				else if(year%100!=0)
					System.out.println("February=29");
				else if(year%400!=0)
					System.out.println("February=28");
				else
					System.out.println("February=29");
	}

}

