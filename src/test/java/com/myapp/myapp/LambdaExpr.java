package com.myapp.myapp;
 
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;
 
public class LambdaExpr {
	
	@SuppressWarnings("finally")
	public static int test() {
		try {
			return 1;
		}catch (Exception e) {
			throw new RuntimeException();
		}finally {
			return 2;
		}
	}
 
    public static void main(String[] args) {
    	
    	System.out.println(test());
    	
        int[] arr = {3,3,8,8,8};
        int sum=0,evenSum=0,oddSum =0;
        sum = Arrays.stream(arr).sum();
        System.out.println(sum);
//        for(int i=0;i<arr.length;i++) {
//            if(i%2 == 0) {
//                oddSum+=arr[i];
//            }else {
//                evenSum+=arr[i];
//            }
//        }
//        System.out.println(evenSum);
        System.out.println(
                Arrays.stream(arr).filter(e -> e % 2 == 0).mapToLong( e -> e).sum());
        
        System.out.println(IntStream.range(0, arr.length).filter(i -> i%2!=0)
                .map(i -> arr[i]).sum());
        
    }
 
}