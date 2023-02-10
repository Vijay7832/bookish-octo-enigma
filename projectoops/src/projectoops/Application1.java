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
		int x;
		boolean h=true;
		//setting directory
		String hh="/home/vijayaero67gmai/Desktop/vij/";
		File f=new File(hh);
		Sample d=new Sample(f,hh);
		//home screen
		while(true) {
			System.out.println("welcome");
			System.out.println("1.Display files");
			System.out.println("2.Edit");
			System.out.println("3.Exit");
			//System.out.println();
			x=sc.nextInt();
		if(x==1) {
			d.getSortOrder();
		    System.out.println();}
		else if(x==2) {
		    d.manipulation();
		    System.out.println();}
		else if(x==3) 
			break;
		else
			System.out.println("Enter a valid input");
		}
	}	

}
			
		
		
		

	



