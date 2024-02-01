package com.DayEight;

import java.util.Arrays;

public class FindMaximumNumber <T extends Comparable<T>> {
		public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
			T max = x;
			if(y.compareTo(max) > 0)
				max=y;
			if(z.compareTo(max) > 0)
				max=z;
			return max;
		}

		public void testMax(T x, T y, T z) {
			T max=x;
			if(y.compareTo(max) > 0)
				max =y;
			if(z.compareTo(max) > 0)
				max=z;
			System.out.println("Maximum value is : "+max);
		}
		
		public void sort(int [] sortElements) {
			Arrays.sort(sortElements);
			System.out.println(Arrays.toString(sortElements));
		}
	
		//Cotr to find Maximum values
		public FindMaximumNumber(T x, T y, T z) {
			testMax(x, y, z);
			}

		public static void main(String[] args) {
			//First use case Based on three integer values
		System.out.printf("Maximum value of %d,%d and %d is %d\n\n",3,4,5,maximum(3, 4, 5));
		System.out.printf("Maximum value of %.1f,%.1f and %.1f is %.1f\n\n",6.6,8.8,7.7,maximum(6.6,8.8,7.7));
		System.out.printf("Maximum value of %s,%s and %s is %s\n\n","Apple","Peach","Banana",maximum("Apple","Peach","Banana"));
		FindMaximumNumber findMaximumNumbers = new FindMaximumNumber(10, 20, 30);
		
		}

}
