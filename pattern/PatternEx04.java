package com.techmedevoted.pattern;

public class PatternEx04 {
/*
 
 	 *
 	**
   ***	
  ****
 *****
 
  
 */
	public static void main(String[] args) {
		int c=4;
		for(int i=0;i<5;i++){
			
			for(int k=0;k<c;k++){
				System.out.print(" ");
			}
			c--;
			for(int j=0;j<=i;j++){
				
				System.out.print("*");			
				
			}
			System.out.println();
			}
			
		}

	}


