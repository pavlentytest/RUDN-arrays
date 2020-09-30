package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] a; // описание переменное
        int[] kk,bb;
        kk = new int[2];

        kk[0]=2;

        int[] b = new int[5]; // инициализация массива
        int n[] = new int[4];

        for(int i=0;i<b.length;i++) {
            if(i == 3) b[i] = 100;
          //  System.out.print(b[i] + " ");
        }
       // System.out.println(b[6]);

        int[] x = {4,5,6,7,8,-900};

        int[][] p = new int[3][4];
        for(int i=0;i<p.length;i++) {
            for(int j=0;j<p[i].length;j++) {
                Random r = new Random();
                p[i][j] = r.nextInt(100);
            }
        }
        for(int i=0;i<p.length;i++) {
            for(int j=0;j<p[i].length;j++) {
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }


        int[][] q = new int [4][];

        Random r = new Random();
        for(int k=0;k<q.length;k++) {
            q[k] = new int[r.nextInt(10)+1];
        }

        for(int i=0;i<q.length;i++) {
            for(int j=0;j<q[i].length;j++) {
                System.out.print(q[i][j] + " ");
            }
            System.out.println();
        }
        int counter=0;
        while(true) {
            if(counter == 4) break;
            counter++;
        }
        int aaa=0;
        do {
        aaa++;
        } while(false);

        for(int ll = 0;ll < 20; ll++) {
            // код

            if(ll == 10) continue;
            // код 2
        }


       // ArrayList<Integer> arr = new ArrayList<>();
       double hh = 399.26;
        System.out.printf("%.1f",hh);
       /*
        10 x 10

        1 2 3 4 5 6 7 8 9 10
                  15 14 13 12 11
                  */
    }
}