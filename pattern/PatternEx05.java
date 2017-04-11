package com.techmedevoted.pattern;

public class PatternEx05 {
/*
 
 *****
  ****
   ***
    **
     *
 
  
 */
	public static void main(String[] args) {
		int c=0;
		for(int i=0;i<5;i++){
			
			for(int k=c;k>0;k--){
				System.out.print(" ");
			}
			c++;
			for(int j=i;j<5;j++){
				
				System.out.print("*");			
				
			}
			System.out.println();
			}
			
		}

	}


