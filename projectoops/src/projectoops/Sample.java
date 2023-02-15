package projectoops;
import java.io.File;
import java.text.Collator;
import java.util.Arrays;
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
		String[] j=s.list();
		if(j.length==0)
			System.out.println("Directory is empty");
		else 
		    Arrays.sort(j,Collator.getInstance());
		    for(String vij:j) 
			    System.out.println(vij);
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
		int nn;
		nn=sc.nextInt();
		if(nn==4)
			break;
		if(nn!=1 && nn!=2 && nn!=3 && nn!=4) {
			System.out.println("Enter a valid input");
			continue;
		}
		String km;
		System.out.println("Enter file name");
	    km=sc.next();
	    String hm=ff+km;
        File g=new File(hm);
        //file creation operation
		if(nn==1) {
	        boolean kk=g.createNewFile();
	        if(kk==true)
				   System.out.println("file added");
			else 
			       System.out.println("Already exist .file cannot be  added");
	        System.out.println();
		}
		//search operation
		else if(nn==3) {
	        boolean kk=g.exists();
	        if(kk==true)
				   System.out.println("file exists");
			else 
			       System.out.println("file does not exists");
	        System.out.println();
		}
		//delete operation
		else if(nn==2) {
		boolean kk=g.delete();
        if(kk==true)
			   System.out.println("file removed");
		else 
		       System.out.println("file does not exists");
        System.out.println();
		}
		}
		
	}
	
}		
	
	
	
	
	


