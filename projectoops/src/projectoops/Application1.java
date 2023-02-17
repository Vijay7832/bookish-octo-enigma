package projectoops;
import java.io.File;
import java.io.IOException;
import java.text.Collator;
import java.util.*;
import java.util.Iterator;
public class Application1 {
	public static void main (String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean h=true;
		//setting directory
		String hh="C:/mono/";
		File f=new File(hh);
		Sample d=new Sample(f,hh);
		System.out.println("Developer: V S Vijay || Emailid: vijayaero67@gmail.com");
		//home screen
		while(true) {
			System.out.println("welcome");
			System.out.println("1.Display files");
			System.out.println("2.Edit");
			System.out.println("3.Exit");
			String x=sc.next();
			if(x.equals("1")) {
				d.getSortOrder();
			    System.out.println();}
			else if(x.equals("2")) {
			    d.manipulation();
			    System.out.println();}
			else if(x.equals("3")) {
				break;}
			else {
				System.out.println("Enter a valid input");}
			}
		}
	
}
	
		
		
		

	



