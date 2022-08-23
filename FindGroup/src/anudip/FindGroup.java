package anudip;

  import java.util.Scanner;
	
	public class FindGroup {
	
		/*
		 * This Program is for grouping of student in four different groups
		 * sapphire - 1,5,9,13,17,21,....
		 * Pearl - 2,6,10,14,18,22,....
		 * ruby - 3,7,11,15,19,23,....
		 * Emerald - 4,8,12,16,20,24,....
		 */

		public static void main(String[] args) {
			
					//Creating scanner object
					Scanner in = new Scanner(System.in);
					
					//Taking user input
				    System.out.print("Enter Your Roll No: "); 
				    int rollNumber = in.nextInt();
				    
				    //Checking whether the roll no belongs to sapphire group
				    if(rollNumber==1||(rollNumber-1)%4==0) {
				    	System.out.println("Sapphire Group");
				    }
				    
				  //Checking whether the roll no belongs to pearl group
				    else if(rollNumber==2||(rollNumber-2)%4==0) {
				    	System.out.println("Pearl Group");
				    }
				    
				  //Checking whether the roll no belongs to ruby group
				    else if(rollNumber==3||(rollNumber-3)%4==0) {
				    	System.out.println("Ruby Group");
				    }
				    
				  //Checking whether the roll no belongs to emerald group
				    else if(rollNumber==4||(rollNumber%4==0)){
				    	System.out.println("Emerald Group");
				    }
			

		}

	}


