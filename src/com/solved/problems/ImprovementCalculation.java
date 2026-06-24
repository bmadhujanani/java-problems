package com.solved.problems;
import java.util.*;
public class ImprovementCalculation {
	public static int improvementcalculation(int s,double r) {
		if(s<=0 ||r<1 || r>5) {
			return -1;
		}
		else {
			double incrementsalary;
			if(r>=0 && r<=3) {
				incrementsalary=s+s*0.1;
			}
			else if(r>=3.1 && r<=4) {
				incrementsalary=s+s*0.25;
			}
			else {
				incrementsalary=s+s*0.3;
				
			}
		
			return (int) incrementsalary;
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the salary: ");
		int salary=sc.nextInt();
		System.out.println("Enter the Performance appraisal rating (1-5) : ");
		double rating=sc.nextDouble();
		ImprovementCalculation c=new ImprovementCalculation();
		int incrementsalary=c.improvementcalculation(salary, rating);
		if(incrementsalary==-1) {
			System.out.println("invalid input");
		}
		System.out.println(incrementsalary);
		
		
	}

}
