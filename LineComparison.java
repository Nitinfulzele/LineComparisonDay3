package LineComparisonDay3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison");
		Scanner sc = new Scanner(System.in);
		DecimalFormat decForm = new DecimalFormat("0.##");
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		double length;
		
		System.out.println("enter X1 coordinates :");
		x1=sc.nextInt();
		System.out.println("enter Y1 coordinates :");
		y1=sc.nextInt();
		System.out.println("enter X2 coordinates :");
		x2=sc.nextInt();
		System.out.println("enter Y2 coordinates :");
		y2=sc.nextInt();
		
		sc.close(); 
		
		 length = Math.sqrt(Math.pow(x2-x1, 2) + (Math.pow(y2-y1, 2)));
         System.out.println("The Length is " + decForm.format(length));

	}

}
