import java.io.*;
import java.util.*;

 class read  {
	
	private Scanner scan;
	
	public void openFile()
	{
		try {
		scan= new Scanner (new File ("words.txt"));
	}catch(Exception e) {System.out.println("Error");}
	}
	
	public String readFile()
	{
		int i=0;
		String words[] = new String[1000];
		while(scan.hasNext()) {
			String str = scan.next();
			words[i]=str;
			
			i++;
		}
		Random rand = new Random(); 
		int value = rand.nextInt(1000); 
		System.out.println(words[value]);
		return words[value];
		
	}
	
	public void close()
	{
		scan.close();
	}
	
	
}
 
 class game {
	 
	 public void show(String word)
	 {
		 int life=3,right=0;
		 Scanner reader= new Scanner(System.in);
		 int length = word.length();
		 Boolean[] exist = new Boolean[length];
		 Arrays.fill(exist, Boolean.FALSE);
		 char answer;
		 int j=1;
		
		 while(j==1&&life!=0&&right!=length) {
			 
			 int flag=0,temp=0;
			 System.out.println("Lifes : "+life);
		 for (int i=0;i<length;i++)
		 {
			 if(exist[i]==true)
			 {
				 System.out.print(word.charAt(i)+" ");
				 
			 }
			 else
			 {
				 System.out.print("_ ");
			 }
			 
			 
		 }
		 answer = reader.next().charAt(0);
		 for (int i=0;i<length;i++)
		 {
			 if(answer==word.charAt(i))
			 {
				 if(exist[i]==true) {flag=2;}
				 else {
				 exist[i]=true;
				 flag=1;
				 temp++;}
			 }
			 
		 }
		 if(flag==0) {System.out.println("Wrong answer"); life--;}
		 else if(flag==2)System.out.println("You entered this letter before");
		 else {System.out.println("Right answer");
		 
		right+=temp;
	 }
	 }
		 if(life==0)System.out.print("GAME OVER. THE WORD WAS : "+word);
		 else System.out.print("Great you won. The word was : "+word);
	 
	 
	 
 }
	 
	
 }

public class hang {
	public static void main(String [] args) {
	
	String word;
	read r= new read();
	r.openFile();
	word=r.readFile();
	r.close();
	game g= new game();
	g.show(word);
	}
	

}
