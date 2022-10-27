package _03_operator.practice;

public class Practice {
	public static void main(String[] args) {
		// 3-2
		// numOfApples/sizeOfBucket + 1
		
		// 3-4
		int num1 = 356;
		int resuilt = num1 - (num1 % 100);
		
		// 3-6
		// -num
		
		// 3-8
		// 
		
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		char ch = 'A';
		ch = (char)(ch + 2);
		float f = (float)3/ 2;
		long l = 3000 * 3000 * 3000;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = d==f2;
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		
		// 3-10
		char ch1 = 'A';
		char lowerCase = ch>=65 && ch1 > 91? (char)(ch1+32):ch1;
		
	}
	
	
	
}
