		public class LeapYear{
 		   public static boolean isLeapYear(int year) {
    

    // A year is a leap year if it is divisible by 4, but not divisible by 100,
        // unless it is divisible by 400.
       

	 if (year % 4 == 0) {
          		 if (year % 100 == 0) {
           			    if (year % 400 == 0) {
                  
		  return true; // Divisible by 400, it's a leap year
             
		   } else {
                 
		   return false; // Divisible by 100 but not 400, not a leap year
               			 }
          		  } else {
            		
		    return true; // Divisible by 4 but not 100, it's a leap year
          			  }
     			
			   }
   		     return false; // Not divisible by 4, not a leap year
 			
			   }

 
   		}