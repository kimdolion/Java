public class largestDivisble{

     public static void main(String []args){
        int largestNum = 0;
        for (int i = 100000; i >= 0; i--) {
            if ((i % 7) == 0) {
                if ((i % 11) == 0) {
                    if ((i % 13) == 0) {
                        if ((i % 17) == 0) {
                            largestNum = i;
                            break;
                        }
                    }
                }
            }
            
        }
        System.out.println("The largest number divisble by all 4 numbers is "+ largestNum);
     }
}
