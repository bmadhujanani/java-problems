package javacom.example.finish;

public class Student {
	String name;
	int rollNo;
	int mark[]=new int[3];
	
	int TotalMarks() {
		int total=0;
		for(int i=0;i<mark.length;i++) {
			total+=mark[i];
		}
	
	return total;
	}



	public static void main(String[] args){
	Student s=new Student();
	s.name="madhu";
	s.rollNo=23;
	s.mark[0]=40;
	s.mark[1]=47;
	s.mark[2]=49;
	int total=s.TotalMarks();
	System.out.println(s.name);
	System.out.println(s.rollNo);
	System.out.println(total);

	}
}
