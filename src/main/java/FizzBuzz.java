import com.google.gson.internal.Streams;

import java.util.stream.IntStream;


public class FizzBuzz {
    public static void main(String[] args) {
        IntStream.range(1, 100).forEach(FizzBuzz::intToFizzBuzz);

        Runnable t1 = new Runnable(){
            @Override
            public void run() {
                System.out.println("test");
            }
        };
        Runnable t2 = () -> System.out.println("test2");

        new Thread(t2).start();

    }

    private static void intToFizzBuzz(int i) {
        if ((i%3)==0 && (i%5)==0) {
            System.out.println("Fizz Buzz");
        } else if ((i%3)==0) {
            System.out.println("Fizz");
        } else if ((i%5)==0) {
            System.out.println("Buzz");
        } else System.out.println(i);
    }
}
