// Kimberly Wilkes
// CIT 239
// Feb. 2, 2020
class LoopSums {
    public static void main(String args[]) {
	// For Loop Sum of #s
	int forLoopSum = 0;
		for (int h = 0; h  < 101; h++) {
			forLoopSum = forLoopSum + h;
		}
		System.out.println("For Loop Sum is " + forLoopSum);
		
	// While Loop Sum of #s
	int i = 1;
	int whileSum = 0;
		while (i < 101) {
			whileSum = whileSum + i;
			i++;
		}
		System.out.println("While Loop Sum is " + whileSum);
		
	// Do While Loop Sum of #s
	int j = 1;
	int doWhileSum = 0;
		do {
			doWhileSum = doWhileSum + j;
			j++;
		} while (j < 101);
		System.out.println("Do While Loop Sum is " + doWhileSum);
	}
}