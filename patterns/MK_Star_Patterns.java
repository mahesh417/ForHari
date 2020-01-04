package patterns;

public class MK_Star_Patterns {

	public static void main(String[] args) {

		// starpattern1();
		// starpattern2();
		// starpattern3();
		// starpattern4();
		// starpattern5();
		// starpattern6();
		// starpattern7();
		// starpattern8();
		// starpattern9();
		// starpattern10();
		// starpattern11();
		// starpattern12();
		//starpattern13();
		//starpattern14();
		//starpattern15();
		//starpattern16();
		//starpattern17();
		//starpattern18();
		starpattern19();
	}
	// ======================================================================================================

		/**
		  		 
		 */
		
	public static void starpattern19() {

		int i, j;
		for (i = 0; i <= 2; i++) {
			for (j = 1; j <= 17; j++) {

				if ((j >= 3 - i && j <= 6 + i) || (j >= 12 - i && j <= 15 + i)) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");

		}
		for (i = 0; i < 9; i++) {
			for (j = 1; j <= 17; j++) {
				if (j >= i + 1 && j <= 17 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

	// ======================================================================================================

	/**
	  		* 
	  		** 
	  		*** 
	  		**** 
	  		***** 
	 */
	
	public static void starpattern1() {

		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	// ==================================================================================================================================

	/**
	 			***** 
	 			**** 
	 			*** 
	 			** 
	 			* 
	 */
	
	
	public static void starpattern2() {

		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	// ==============================================================================================
	/**
	  		*
	 		**
	 		***
	 		****
	 		*****
	 		****
	 		***
	 		**
	 		*	 
	   */
	
	public static void starpattern3() {

		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}

		for (int i = 1; i <= num; i++) {
			for (int j = num - 1; j >= i; j--) {
				System.out.print(j+" ");
				
			}
			
			System.out.println("");
			
		}
		
		

	}

	// ==========================================================================================================================
	
	/**		    * 
	 		   ** 
	 		  *** 
	 		 **** 
	 */
	public static void starpattern4() {

		int num = 4;
		for (int i = 1; i <= num; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

	// ===================================================================================================

	/**   ****
	 	   ***
	 	    **
	 	     *
	*/
	public static void starpattern5() {

		int num = 4;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = num; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	// ===================================================================================================

	/**
	  		     *
	  		    **
	  		   ***
	  		  ****
	  		   ***
	  		    **
	  		     *
    
	 */
	public static void starpattern6() {
		int num = 4;
		for (int i = 1; i <= num; i++) {
			for (int j = num-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = num - 1; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	//=====================================================================================================================
	
	/**
	 * 		     *
	 		    * *
	 		   * * *
	 		  * * * *
	 		 * * * * *
	
	 */
	
	public static void starpattern7() {
		
		int num=5;
		for(int i=1;i<=num;i++) {
			for(int j=num-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
		System.out.println();
		}
		
	}
	
	//===============================================================================================
	/**
		    *
		   ***
		  *****
		 *******
		*********
	 
	 */
	public static void starpattern8() {

		int num=5;
		for(int i=1;i<=num;i++) {
			for(int j=num;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			for(int l=2;l<=i;l++) {
				System.out.print("*");
			}
		System.out.println();
		}
				
		
	}
	
	//==============================================================================================================================================
	/**
	 			 *****************
	 			  ***************
	 			   *************
	 			    ***********
	 			     *********
	 			      *******
	 			       *****
	 			        ***
	 			         *
	 */
	public static void starpattern9() {
		
		int num=9;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("A");
			}
			for(int k=num;k>=i;k--) {
				System.out.print("M");
			}
			for(int l=num-1;l>=i;l--) {
				System.out.print("K");
			}
			System.out.println();	
		}
	}
	//==========================================================================================================================
	/**
	 			*
	 			 *
	 			  *
	 			   *
	 			    *
	 			     *
	 */
	
	public static void starpattern10() {
		
		int num=6;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				if(i>=2 &&j<=i-1) {
					System.out.print(" ");
				}else {
					System.out.print("*");	
				}
				
			}
			System.out.println();
		}
		
		
	}
//=========================================================================================================

	/**
	  		     *
	  		    * 
	  		   *  
	  		  *   
	  		 *    

	 */
	
	public static void starpattern11() {
		int num = 5;
		int i, j;
		for (i = 1; i <= num; i++) {
			for (j = num; j >= i; j--) {

				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				if (i >= 2 && k > 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				
			}
			System.out.println();

		}

	}
//============================================================================================================================================
	/**			*****
	 			*    *
	 			*    *
	 			*    *
	 			*****
	*/
	
	public static void starpattern12() {
	
		int num = 5;
		int i, j;
		for (i = 1; i <= num; i++) {
			for (j = 1; j <= num; j++) {

				if (i >= 2 && j >= 2 && i <= (num - 1) && j <= (num - 1)) {

					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
 			System.out.println();

		}
	}
//========================================================================================================================================

	/**      
	  		    *****
	 			** **
	 			* * *
	 			** **
	 			*****
	*/
		
	public static void starpattern13() {

		int num = 5;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {

				if (i == 1 || j == 1 || i == num || j == num || i == j || (i == 2 && j == num - 1)
						|| (i == num-1 && j == 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
						}

			}	
				
				System.out.println();
			}

		}
	
	//==============================================================================================	

	/**      *****
			   *  
			   *  
			   *  
			 *****
    */

	public static void starpattern14() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 5) {
					System.out.print("*");
				} else if (i == 2 || i == 3 || i == 4) {
					if (j == 3) {
						System.out.print("*");

					} else {
						System.out.print(" ");
					}

				}

			}
			System.out.println();
		}
	}
//======================================================================================================================================
	
	/**      *****
	 		   *  
	 		 *****
	 		   *  
	 		 *****
  */	
	public static void starpattern15() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 3 || i == 5) {
					System.out.print("*");
				} else if (i == 2 || i == 4) {
					if (j == 3) {
						System.out.print("*");

					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}

	}

//==========================================================================================================================================================

	/**                   *****
                              * 
                            *  
                           *   
                          *****
    */
		
	public static void starpattern16() {
		int x = 5;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 5) {
					System.out.print("*");
				} else if (i == 2 || i == 3 || i == 4) {
					if (x == j) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}

			}
			x--;
			System.out.println("");
		}

	}
	
//=================================================================================================================================================================================
	
	/**     	******
	 			 **** 
	 			  **  
	 			  **  
	 			 **** 	
	 			******
	 */
	public static void starpattern17() {

		int max = 6;
		int i, j;
		for (i = 1; i <= max; i++) {
			for (j = 1; j <= max; j++) {
				if (i == 1 || i == 6) {
					System.out.print("*");
				}

				else if (i == 3 || i == 4) {
					if (j == 3 || j == 4) {
						System.out.print("*");
					} else {

						System.out.print(" ");
					}
				}

				{
					if (i == 2 || i == 5) {

						if (j == 1 || j == 6) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					}
				}

			}
			System.out.println("");
		}

	}
	// ====================================================================================================================================================

	/**		*   * 
	 		 * *  
	 		  *   
	 		 * *  
	 		*   * 
	*/
	public static void starpattern18() {
		int n = 5;
		int count = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == i || j == count)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			count = count - 1;
			System.out.println(" ");
		}
	}

	// ==========================================================================================================================================
	
	
	
	
}
