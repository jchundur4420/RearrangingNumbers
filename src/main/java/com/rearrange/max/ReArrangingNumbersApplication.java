package com.rearrange.max;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReArrangingNumbersApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ReArrangingNumbersApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		int N = 1234598890;
		long sum =  0, multiplyDigits = 1;
		String s = String.valueOf(N);
		char[] c = s.toCharArray();
		int[] count=new int[10];
		for(int i=0;i<c.length;i++)	{				
			//count[c[i] -'0']++; //or
			count[Character.getNumericValue(c[i])]++;
			//while converting from char to int gives byte value
			//But we the need the original value
		}
		
		for(int i=0;i<count.length;i++)	{	
			while(count[i]>0) {		
				sum = sum+(i*multiplyDigits);
				multiplyDigits = multiplyDigits*10;
				count[i]--;
			}
		}
		System.out.println("result" +sum);	
	}
	

}
