	
			public class PrimeNumbers2{

		    // Function to check if a number is prime
    
		public static boolean isPrime(int number) {
       	
	 if (number <= 1) return false;

		        for (int i = 2; i <= Math.sqrt(number); i++) {
            	
	if (number % i == 0) return false;
        	
			}
        		
		return true;
    			
			}


	    // Function to display the first 50 prime numbers
    		
		public static void displayPrimeNumbers() {
        	
	int count = 0;
        	int num = 2;

	
	        System.out.println("First 50 prime numbers:");
        	while (count < 50) {
            	if (isPrime(num)) {
                
	System.out.print(num + " ");
                	count++;
            			}
            	num++;
        			}
			    }

    public static void main(String[] args) {
        displayPrimeNumbers();
			    }

			}