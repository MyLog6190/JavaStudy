package _06_class_.practice01.p20;

public class Practice {
	/*
	(1) shuffle 메서드를 작성하시오 .
	*/
	public static void main(String[] args){
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

	private static int[] shuffle(int[] original) {
		int result[] = new int [original.length];
		for(int i = 0; i < result.length; i++) {
			int ran = (int) Math.floor( (Math.random() * 9) + 1 );
			result[i] = ran;
			for(int j = 0; j < i; j++) {
				if(result[j] == ran) {
					i--;
				}
			}
		}
		
		return result;
	}
}
