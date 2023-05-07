package com.bridgelabz.DataStructurePrograms.PrimeNumberRange;

public class PrimeNumber {
    /*
     Prime Numbers between 0-1000
     */
    void prime() {
        for (int i = 2; i < 1000; i++) {
            num = i;
            print();
        }
    }
    /*
     Printing the Prime Numbers
     */
    void print() {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if(!flag) {
            /*
             Dividing the prime numbers into 10 arrays and each array insert the prime number range.
             */
            if(num<=99){
                insert0_100();
            } else if (num>100 && num <=200) {
                insert101_200();
            } else if (num>=201 && num <=300) {
                insert201_300();
            } else if (num>=301 && num <=400) {
                insert301_400();
            }else if (num>=401 && num <=500) {
                insert401_500();
            }else if (num>=501 && num <=600) {
                insert501_600();
            }else if (num>=601 && num <=700) {
                insert601_700();
            }else if (num>=701 && num <=800) {
                insert701_800();
            }else if (num>=801 && num <=900) {
                insert801_900();
            }else if (num>=901 && num <=1000) {
                insert901_1000();
            }
        }
    }
    /*
     * Storing the prime numbers in a 2D array,
     * there are 10 number of arrays and 25 number of prime numbers in each array
     * initializing elements in each array as s1,s2,....,s10
     */
    int[][] primeNumber = new int[10][25];
    static int num=0;
    static int s1,s2,s3,s4,s5,s6,s7,s8,s9,s10 = 0;

    void insert0_100() {
        /*
         Prime Number range between 0-100
         */
        if(num<=100) {
            primeNumber[0][s1]=num;
            s1++;
        }
    }
    void insert101_200() {
        /*
         Prime Number range between 101-200
         */
        primeNumber[1][s2]=num;
        s2++;
    }
    void insert201_300() {
        /*
         Prime Number range between 201-300
         */
        primeNumber[2][s3]=num;
        s3++;
    }
    void insert301_400() {
        /*
         Prime Number range between 301-400
         */
        primeNumber[3][s4]=num;
        s4++;
    }
    void insert401_500() {
        /*
         Prime Number range between 401-500
         */
        primeNumber[4][s5]=num;
        s5++;
    }
    void insert501_600() {
        /*
         Prime Number range between 501-600
         */
        primeNumber[5][s6]=num;
        s6++;
    }
    void insert601_700() {
        /*
         Prime Number range between 601-700
         */
        primeNumber[6][s7]=num;
        s7++;
    }
    void insert701_800() {
        /*
         Prime Number range between 701-800
         */
        primeNumber[7][s8]=num;
        s8++;
    }
    void insert801_900() {
        /*
         Prime Number range between 801-900
         */
        primeNumber[8][s9]=num;
        s9++;
    }
    void insert901_1000() {
        /*
         Prime Number range between 901-1000
         */
        primeNumber[9][10]=num;
        s10++;
    }
    void display(){
        /*
        To display the prime numbers in each range
         */
        for(int i =0;i< primeNumber.length;i++) {
            System.out.println();
            System.out.print("Range " + (i+1) + " (" +(i*100) + " - " + ((i+1)*100-1) + "): ");

            for(int j =0;j<25;j++) {
                System.out.print(primeNumber[i][j]+" ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Prime Numbers (0-1000) In 2D Array :-");
        PrimeNumber primeNumbers = new PrimeNumber();
        primeNumbers.prime();
        primeNumbers.display();
    }
}
