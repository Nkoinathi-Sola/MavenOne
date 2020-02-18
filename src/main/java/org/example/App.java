package org.example;

import javax.swing.*;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // create a jframe
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");

        int[] randomNumbers = IntStream.generate(
                                () -> ThreadLocalRandom.current().nextInt(0, 10000 + 1))
                                        .limit(100)
                                        .boxed()
                                        .mapToInt(i -> i)
                                        .toArray();

        int largestNumber = Arrays.stream(randomNumbers)
                                    .max()
                                    .getAsInt();

        int smallestNumber = Arrays.stream(randomNumbers)
                                    .min()
                                    .getAsInt();

        System.out.println("Printing the whole array...");
        Arrays.stream(randomNumbers)
                .forEach(System.out::println);

        JOptionPane.showMessageDialog(frame, "\\n\\nThe largest number is: " + largestNumber);
        JOptionPane.showMessageDialog(frame, "\\n\\nThe smallest number is: " + smallestNumber);




    }
}
