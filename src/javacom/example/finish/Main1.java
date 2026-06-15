package javacom.example.finish;

public class Main1 {
    public static void main(String[] args) {
    	
    	int[] marks= {95,99,98};
    	Student1 s = new Student1("madhu",34,marks);
    	int total=s.TotalMarks();
    	System.out.println("Total: "+total);
    	s.display();
    	
        /*Student1 s = new Student1();

        s.name = "Madhu";
        s.rollNo = 23;
        s.mark[0] = 40;
        s.mark[1] = 47;
        s.mark[2] = 49;

        s.display();
        
        Student1 s1 = new Student1();

        s1.name = "janu";
        s1.rollNo = 40;
        s1.mark[0] = 44;
        s1.mark[1] = 46;
        s1.mark[2] = 50;
        
        s1.display();*/
    }
}
