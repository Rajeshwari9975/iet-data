package com.binary.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo1 {
	
	public static void main(String[] args) {
		fetchValues();
	}

//	private static void fetchValues() {
//		int a = (int) Math.round((Math.random()) * 10 + 1);
//		int b = (int) Math.round((Math.random()) * 10 + 1);
//		int c = (int) Math.round((Math.random()) * 10 + 1);
//		int d = (int) Math.round((Math.random()) * 10 + 1);
//		
//		int e = a - b;
//		int f = b - c;
//		int g = c - d;
//		
//		int h = e - f;
//		int i = f - g;
//		
//		int j = h - i;
//		
//		if(a <= 0 || b <= 0 || c <= 0 || d <= 0 || e <= 0 || f <= 0 || g <= 0 || h <= 0 || i <= 0 || j <= 0) {
//			fetchValues();
//		}
//		Set<Integer> unique = new LinkedHashSet<Integer>();
//		
//		unique.add(a);
//		unique.add(b);
//		unique.add(c);
//		unique.add(d);
//		unique.add(e);
//		unique.add(f);
//		unique.add(g);
//		unique.add(h);
//		unique.add(i);
//		unique.add(j);
//		
//		
//		if(unique.size() < 10) {
//			fetchValues();
//		}
//		else {
//			for(int num : unique) {
//				System.out.println(num);
//			}
//		}
//		
//	}
	private static void fetchValues() {
        Set<Integer> unique = new LinkedHashSet<>();
        int attempts = 0;

        // Continue until we have 10 unique positive integers or until attempts exceed 100
        while (unique.size() < 10 && attempts < 100) {
            int a = (int) (Math.random() * 10) + 1;
            int b = (int) (Math.random() * 10) + 1;
            int c = (int) (Math.random() * 10) + 1;
            int d = (int) (Math.random() * 10) + 1;

            // Calculate derived values
            int e = a - b + 5; // Adjusted to ensure positivity
            int f = b - c + 5; // Adjusted to ensure positivity
            int g = c - d + 5; // Adjusted to ensure positivity

            // Ensure all derived values are positive
            if (e > 0 && f > 0 && g > 0) {
                unique.add(a);
                unique.add(b);
                unique.add(c);
                unique.add(d);
                unique.add(e);
                unique.add(f);
                unique.add(g);
            }
            attempts++;
        }

        if (unique.size() == 10) {
            for (int num : unique) {
                System.out.println(num);
            }
        } else {
            System.out.println("Failed to generate 10 unique positive values after " + attempts + " attempts.");
        }
    }

}
