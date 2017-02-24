/**
 * Created by doug on 2/24/17.
 */
public class FizzBuzz {
    public void doIt(int start, int end){
        for(int x = start ; x <= end ; x++){
            if(x % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (x % 5 == 0) {
                System.out.println("Buzz");
            } else if (x % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(x);
            }
        }

    }
}
