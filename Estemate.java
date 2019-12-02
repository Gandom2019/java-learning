import java.util.Scanner;
import cla.Job;
public class Estemate {

	public static void main(String[] args) {
		Job job1 = new Job();
		int b1;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("1. Add new job: ");
			System.out.println("2. Add new material: ");
			System.out.println("3. Add new labor: ");
			System.out.println("0. exit: ");
			System.out.println();
			System.out.println("Choice the item:");
			b1 = scanner.nextInt();
			switch (b1) {
        		case 1:  
		        	 System.out.println();
		        	 System.out.println("Inter the name of job : ");
		        	 String d=scanner.next();
		        	 job1.setName(d);
		        	 System.out.println("Inter the address of job : ");
		        	 String c=scanner.next();
		        	 job1.setAdd(c);
		        	 System.out.println("Inter the phone# relate to job : ");
		        	 String e=scanner.next();
		        	 job1.setPhone(e);
		        	 System.out.println("Inter the dictance of job : ");
		        	 double k=scanner.nextInt();
		        	 job1.setDistance(k);
	                 break;
        		case 2: 
        			System.out.print("Inter the name of 2 : ");
                 break;
        		case 3:  
        			System.out.print("Inter the name of 3 : ");
                  break;
        		case 4:  
        			System.out.print("Inter the name of 4 : ");
                  break;
        		default:
        			System.out.println( "Invalid inter: ");
                  break;
					}
			} while (b1 != 0);
		
	   	System.out.println("after while");
scanner.close();
	}

	
}
