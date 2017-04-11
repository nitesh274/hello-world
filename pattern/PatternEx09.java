package com.techmedevoted.pattern;

public class PatternEx09 {
/*
 <pre>

			 *
			***
		   *****
		  *******
		 *********
		***********
			
</pre>
  
 */
	public static void main(String[] args) {		
		for(int i=0;i<=6;i++){
			for(int k=1;k<=(6-i);k++){
				System.out.print(" ");
			}
		   for(int j=0;j<i;j++){
				
				System.out.print("*");			
				
			}
		   for(int m=i-1;m>=1;m--){
				
				System.out.print("*");			
				
			}
			System.out.println();
			}
		
	}
			
		}
	

	


