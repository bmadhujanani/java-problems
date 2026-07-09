package javacom.example.finish;

public class Student1 {
    String name;
    int rollNo;
    int mark[] = new int[3];
    String department;
    
    Student1() {
    	this.department="ECE";
    	System.out.println("Insise NonParameterized Constructor");
    }
 
    Student1(String name,int rollNo,int marks[]){
    	this.name=name;
    	this.rollNo=rollNo;
    	this.mark=marks;
    
    }

    int TotalMarks() {
        int total = 0;
        for (int i = 0; i < mark.length; i++) {
            total += mark[i];
        }
        return total;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + TotalMarks());
    }
}