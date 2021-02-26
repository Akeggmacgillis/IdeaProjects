package com.ashtonkeggmacgillis.week_01;

public class Main {

    public static void main(String[] args) {
        double[] m= {45,0.95};
        double[] tu= {29,0.60};
        double[] w= {10,0.25};
        double[] th= {22,0.05};
        double[] f= {41,0.00};
        double[] sa= {28,0.75};
        double[] su= {33,0.90};
        double[][] all= {m,tu,w,th,f,sa,su};
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int i;

        for (i = 0; i < all.length; i++) {
            if(all[i][0]<32 && all[i][1]>0.50){
                System.out.println(week[i]);
            }
        }
    }
}
