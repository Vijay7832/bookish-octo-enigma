package projectoops;
import java.io.File;
import java.text.Collator;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Sample {
	File s;
	String ff;
	//creating constructor to receive string link
	public Sample(File s,String ff) {
		this.s=s;
		this.ff=ff;
	}
	//methods to sort in ascending and display
	public void getSortOrder() {
		int yy=0;
		String[] j=s.list();
		if(j.length==0)
			System.out.println("Directory is empty");
		else {
		    Arrays.sort(j,Collator.getInstance());
		    for(String vij:j) {
		    	File s=new File(ff+vij);
		    	if(s.isFile()) {
		    		 System.out.println(vij);
		    	     yy=yy+1;}
		    	}
		    if(yy==0)
		    	System.out.println("no files found");}
		    
	}
	public void manipulation() throws IOException {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Edit");
		System.out.println("1.Add a file");
		System.out.println("2.Remove a file");
		System.out.println("3.Search a file");
		System.out.println("4.Back to homescreen");
		//System.out.println();
		String nn;
		nn=sc.next();
		if(nn.equals("4")) {
			break;}
        //file creation operation
		if(nn.equals("1")) {
			System.out.println("Enter file name");
		    String km=sc.next();
	        File g=new File(ff+km);
	        boolean kk=g.createNewFile();
	        if(kk==true)
				   System.out.println("file added");
			else 
			       System.out.println("Already exist .file cannot be  added");
	               System.out.println();
		}
		//search operation
		else if(nn.equals("3")) {
			System.out.println("Enter file name");
		    String km=sc.next();
	        File g=new File(ff+km);
	        boolean kk=g.exists();
	        if(kk==true)
				   System.out.println("file exists");
			else 
			       System.out.println("file does not exists");
	               System.out.println();
		}
		//delete operation
		else if(nn.equals("2")) {
			 System.out.println("Enter file name");
		     String km=sc.next();
	         File g=new File(ff+km);
		     boolean kk=g.delete();
             if(kk==true)
			       System.out.println("file removed");
		     else 
		           System.out.println("file does not exists");
                   System.out.println();
		}
		else
			System.out.println("Enter a valid input");
			
		}	
	
	}
}		
	
	
	
	


