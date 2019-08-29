package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        double n1 = ap.nextDouble("Enter number 1 to be averaged");
        double n2 = ap.nextDouble("Enter number 2 to be averaged");
        double n3 = (n1+n2)/2;

        System.out.print("The average is " + n3);
    }
}