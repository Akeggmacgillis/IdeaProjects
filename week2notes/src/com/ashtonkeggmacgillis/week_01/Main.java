package com.ashtonkeggmacgillis.week_01;
//exercise 1
//Ashton Kegg-MacGillis
public class Main {

    public static void main(String[] args) {
	// write your code here
        String cityName = "Grove City";
        int zipCode = 43123;
        int tot = 0;
        int[] highs = {27, 28, 27, 12, 18};
        for(int i=0; i<highs.length; i++){
            tot = tot + highs[i];
        }
        int avg = tot / highs.length;
        System.out.println("City: " + cityName);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("Average High Temperature: " + avg);
    }
}
