package com.techmedevoted.pattern;

public class PatternEx08 {
/*


			*
		   * *
		  * * *
		 * * * * 
		  * * *
		   * *
		    *	
 
  
 */
	public static void main(String[] args) {		
		for(int i=0;i<=4;i++){
			
			for(int k=0;k<4-i;k++){
				System.out.print(" ");
			}
		
			for(int j=0;j<i;j++){
				
				System.out.print("*"+" ");			
				
			}
		
			System.out.println();
			}
		
		for(int i=3;i>=0;i--){
			
			for(int k=0;k<=3-i;k++){
				System.out.print(" ");
			}
		
			for(int j=0;j<i;j++){
				
				System.out.print("*"+" ");			
				
			}
		
			System.out.println();
			}
			
		}
			
		}
	

	


