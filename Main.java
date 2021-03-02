package CROC;

/**
 * Homework 1 CROC
 * @author Kazaev Vadim
 */

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++ ){
            if(i%3 == 0 && i%5 == 0) {
                System.out.printf("%nFizzBuzz ");
            }
            else {
                if(i%3 == 0) {
                    System.out.print("Fizz ");
                }
                else {
                        if(i%5 == 0) {
                            System.out.printf("Buzz ");
                        }
                        else {
                            System.out.printf("%d ",i);
                        }
                }
            }
        }
    }
}