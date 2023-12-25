/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
	Double a = Double.parseDouble(args[0]);
	Double b = Double.parseDouble(args[1]);
		
	Double range = (b-a) ;
			
	int FirstNum = (int)((Math.random() * range) + a );
	int SecondNum =  (int)(((Math.random() * range)) + a );
	int ThirdNum = (int)(((Math.random() * range)) + a );
			
	int MinNum = (int)((Math.min(FirstNum, (Math.min (SecondNum, ThirdNum)))));
			
	System.out.println( FirstNum );
	System.out.println( SecondNum );
	System.out.println( ThirdNum );
		
	System.out.println("The lowest number value is "  + MinNum);
		 
			}
		}
