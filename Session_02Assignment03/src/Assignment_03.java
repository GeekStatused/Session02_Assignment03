
public class Assignment_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*This is the first outer loop to determine the 
		 * height of the pyramid
		 */
		for(int i = 1; i <=5; i++){
			
			System.out.println();
			
			/*this is the second loop to print out
			 * the numbers from the outer loop
			 */
			
			for(int j = 1; j <= i;j++){
				System.out.print(j);
				
			}
			
		}
		
		/*this is the second loop to determine
		 * the height of the loop
		 */
		for(int i = 5; i > 1; i--){
			
			System.out.println();
			
			/*inner loop to print the value of 
			 * the outer loop
			 */
	
			for(int j = 1; j < i;j++){
				System.out.print(j);
			}
		}
		

	}

}
