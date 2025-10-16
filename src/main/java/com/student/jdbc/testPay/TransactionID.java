package com.student.jdbc.testPay;

import java.util.Random;

public class TransactionID {
	public static Long transaction() {
		
		        Random r = new Random();
		        long res = Math.abs(r.nextLong()); 
		        long ans = 0;
		        while (String.valueOf(res).length() != 15) {
		            res = Math.abs(r.nextLong());
		        }

		        ans = res;
		        return ans;
		    }
		}
	