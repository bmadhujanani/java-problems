package javacom.example.finish;

public class Mutestring {
	public static void main(String[] args) {
		
		/*String s="java";
		s.concat("program");
		System.out.print(s);*/
		
		
		/*String a="java";
		String b="java";
		String c="madhu janani b";
		System.out.println(a.equals(b));
		System.out.println(a==b);
		System.out.println(a.length());
		System.out.println(a.charAt(3)+" "+c.charAt(7));
		System.out.println(c.toUpperCase());
		System.out.println(c.toLowerCase());
		System.out.println(a.concat(b));
		System.out.println(c.indexOf("m"));
		*/
		
		
		//counting vowels in string
		/*String s="cauliflower";
		String sl=s.toLowerCase();
		int count=0;
		for(int i=0;i<sl.length();i++) {
			char sch=sl.charAt(i);
			if(sch=='a'||sch=='e'||sch=='i'||sch=='o'||sch=='u') {
				count+=1;
			}
		}
		System.out.print(count);*/
		
		
		
		//counting consonants in string
		
		/*String s="cauliflower";
		String sl=s.toLowerCase();
		int count=0;
		for(int i=0;i<sl.length();i++) {
			char sch=sl.charAt(i);
			if(sch=='a'||sch=='e'||sch=='i'||sch=='o'||sch=='u') {
				continue;
			}
			else {
				count+=1;
			}
		}
		System.out.print(count);*/
		
		
		
		//reverse of string
		
		/*String s="cauliflower";
		int count=0;
		for(int i=s.length()-1;i>=0;i--) {
			char sch=s.charAt(i);
			System.out.print(sch);	
		}*/
		
		//count words 
		String s="hello wlcome to my office";
		String[] words=s.split(" ");
		System.out.print(words.length);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
