package com.bridgelabz.AlgorithmPrograms;

public class PrimeNumberRange {
    public static void primeNumbers() {
        /*
         * Initialising the String for prime number
         * Range of 1 to 1000
         * "j" is the denominator value
         * So we can calculate the modulus is equal to 0, if zero then the count is incremented
         * when the count is equal to two then the number is Prime Number.
         * Because if 5 is a prime number,it can only write 2 ways(5/1 & 5/5).
         */
        String primeNumbers = " ";

        for (int i = 2; i <= 1000; i++) {
            int count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2)
                primeNumbers = primeNumbers + i + " ";
        }
        System.out.println("Prime Numbers Range of 0 to 1000 :-");
        System.out.println(primeNumbers);
    }
    public static void main(String[] args) {

        PrimeNumberRange.primeNumbers();

    }
}








