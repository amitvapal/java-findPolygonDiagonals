import java.util.Scanner;


public class findPolygonDiagnals {

	public static void main(String[] args) {
		
		Scanner x = new Scanner (System.in);
		
		System.out.println("Enter the number of polygon sides");
		int polygonSideCount = x.nextInt();
				
		if (polygonSideCount <= 2) {
			
			System.out.println("Enter polgon of sides more than 2.");
		}
		else{
			
			System.out.println("This polygon has " + diagnalCount(polygonSideCount) + " diagnals." );
						
		}
				
	} // end of method main 
	
	
	
	
	private static int diagnalCount (int sideCount) {
		
		int countDiagnal = (sideCount * (sideCount - 3)) / 2;	
		return countDiagnal;
		
			
	} //end of method diagnalCount
	
	
} // end of findPolygonDiagnals class
