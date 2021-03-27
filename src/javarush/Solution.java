package javarush;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int min = console.nextInt();
        int secondMin = console.nextInt();

        if (min > secondMin) {
            int temp = min;
            min = secondMin;
            secondMin = temp;
        }

        while (console.hasNextInt()) {

            int x = console.nextInt();

            if (x < min) {
                secondMin = min;
                min = x;
            } else if (x > min && x < secondMin) {
                secondMin=x;
            }

        }

        System.out.println(secondMin);
    }
}



