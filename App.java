/*This program is a coding practice.
the challenge is to find all the natural numbers below
1000 that are a multiple of 3 or 5, then sum those together. */
package app;

public class App {
    public static void main(String[] args) throws Exception {
        //initialize starting numbers
        int number = 1000;
        int test1 = 3;
        int test2 = 5;
        int sum = sumOfMultiples(number,test1,test2);
        System.out.println("The sum of the natural number is: "+sum);

    }
    /*Function name: sumOfMultiples
    Description: iterates through a number and find the multiples 
    of given numbers within the main number.
    Input: three integers, one main number to be iterated, and two
    test numbers
    Output: sum of the multiples of the test numbers */
    public static int sumOfMultiples(int main, int test, int test2){
        //initialize sum
        int sum = 0;
        /*iterate through main number. */
        for (int i = 0; i < main; i ++){
            //if there is no remainder after modulation it is 
            //a multiple
            if(i%test == 0){
                sum = sum +i;
                System.out.print(i+", ");
            }
            else if(i%test2 == 0){
                sum = sum + i;
                System.out.print(i+", ");
            }
            
        }
        System.out.println("");
        //return sum
        return sum;
    }

}