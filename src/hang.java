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
		
		while(scan.hasNext()) {
			String x =  scan.nextLine();
			System.out.println(x);
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
