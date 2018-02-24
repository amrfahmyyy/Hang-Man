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
	
	public void readFile()
	{
		int i=0;
		String words[] = new String[1000];
		while(scan.hasNext()) {
			String str = scan.next();
			words[i]=str;
			System.out.println(words[i]);
			i++;
		}
		
	}
	
	public void close()
	{
		scan.close();
	}
	
	
}

public class hang {
	public static void main(String [] args) {
	
	read r= new read();
	r.openFile();
	r.readFile();
	r.close();
	}
	

}
