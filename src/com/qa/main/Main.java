//thank you elizabeth for producing readable, understandable and replicatable code

package com.qa.main;

public class Main {
	
    public interface FuncInterface {
		Object operation(int a);
    }
    public static void operate(int a, FuncInterface funcObj) {
        funcObj.operation(a);}
   
	
	public static void main(String[] args) {
	
		FuncInterface fizzBuzz = (int x) -> {
			String out = "";
			if (x % 3 ==0) {out += "Fizz";}
			if (x % 5 ==0) {out += "Buzz";}
			if (out == "") {out = ""+ x;}
			System.out.println(out);
			return out;
		};
		
		for (int i =1; i <= 100; i++) {
			operate(i,fizzBuzz);
		}

	}
	
}




