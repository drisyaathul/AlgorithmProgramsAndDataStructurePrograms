package com.bridgelabz.DataStructurePrograms.PrimeNumberRange;

public class PrimeAnagram extends PrimeNumber{

    void print() {
     /*
     Printing the Prime Numbers
     */
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        /*
         To find Anagram
         */
        if (!flag) {
            int temp = num;
            int rev = 0;
            while (temp != 0) {
                int last = temp % 10;
                rev = rev * 10 + last;
                temp = temp / 10;
            }
            if (rev == num) {
            /*
             Dividing the prime numbers into 10 arrays and each array insert the prime number range.
             */
                if (num <= 99) {
                    insert0_100();
                } else if (num > 100 && num <= 200) {
                    insert101_200();
                } else if (num >= 201 && num <= 300) {
                    insert201_300();
                } else if (num >= 301 && num <= 400) {
                    insert301_400();
                } else if (num >= 401 && num <= 500) {
                    insert401_500();
                } else if (num >= 501 && num <= 600) {
                    insert501_600();
                } else if (num >= 601 && num <= 700) {
                    insert601_700();
                } else if (num >= 701 && num <= 800) {
                    insert701_800();
                } else if (num >= 801 && num <= 900) {
                    insert801_900();
                } else if (num >= 901 && num <= 1000) {
                    insert901_1000();
                }
            }
        }
    }
    public static void main(String[] args) {

        System.out.println("Prime Numbers (0-1000) In 2D Array :-");
        PrimeAnagram primeAnagram = new PrimeAnagram();
        primeAnagram.prime();
        primeAnagram.display();
    }
}

