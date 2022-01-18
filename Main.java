package com.hcl.dataarray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddEvenPattern();
		System.out.println();
		
		OddEvenPattern2();

		System.out.println();
		OddEvenPattern3();

		System.out.println();

	}
	
	
	private static void OddEvenPattern() {
		int k = 5;
		for(int i =1; i<= 5; i++) {
			int lastJCount =0;
			for(int j=1; j<k; j++) {
					System.out.print("*");
					lastJCount = j;
			}
			for(int a = lastJCount+1; a<=5; a++) {
				if(i%2 == 0) System.out.print("E");
				else System.out.print("O");
			}
		k--;
		System.out.println();
		}
		}
	
	private static void OddEvenPattern2() {
		int last = 5;
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j <= last; j++) {
				if(i%2 == 0 && (j == 0 || j == last)) {	
					System.out.print(" ");					
				}	else {
				System.out.print("*");		
				}
			}
			System.out.println();		
		}
		
	}
	
	
	private static void OddEvenPattern3() {
		int last = 6;
		for(int i =0; i < 5; i++) {
			for(int j = 0; j < last; j++) {
				
				if((j == last/2 || j+1 == last / 2)) {
					if(i % 2 == 0) {
						System.out.print("*");
					}else {
						System.out.print("E");
					}
						
					} else {
						if(i % 2 == 0) {
							System.out.print("O");
						}else {
							System.out.print("*");
						}
						
					}
			}
			System.out.println();
		}
	}

}
