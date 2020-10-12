package com.sapient.service;

import java.util.Vector;

public class MathService {

	public int getFibonacciNo(int index) {
		if (index < 0)
			return -1;
		else if (index == 0)
			return 0;
		else if (index == 1)
			return 1;
		else {
			int first = 0, second = 1, result = 0;
			for (int i = 2; i <= index; i++) {
				result = first + second;
				first = second;
				second = result;
			}
			return result;
		}

	}

	public int getFactorial(int no) {
		if (no < 0)
			return -1;
		else if (no == 0 || no == 1)
			return 1;
		else {
			int result = 1;
			for (int i = 2; i <= no; i++) {
				result *= i;
			}
			return result;
		}

	}

	public boolean checkPrime(int no) {
		if (no <= 1)
			return false;
		else {
			boolean isPrime = true;
			for (int i = 2; i <= Math.sqrt(no); i++) {
				if (no % i == 0) {
					isPrime = false;
					break;
				}
			}
			return isPrime;
		}
	}

	public Vector<Integer> returnPrimeArray(int start, int end) {
		Vector<Integer> output = new Vector<Integer>();
		if(start<=1 || end<=1)
			return output;
		else {
			
			if(start>end) {
				int temp = start;
				start = end;
				end = temp;
			}
			 
			for(int j=start;j<=end;j++) {
				boolean isPrime = true;
				for (int i = 2; i <= Math.sqrt(j); i++) {
					if (j % i == 0) {
						isPrime = false;
						break;
					}
				}
				if(isPrime) {
					output.add(j);
				}
			}
			return output;
		}
	}
}
