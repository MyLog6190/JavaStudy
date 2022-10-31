package _06_class_.practice01.p23;

public class Practice {
	public static int max(int[] arr) {
		if(arr == null || arr.length == 0) {
			return -9999;
		}
		
		for(int i = 0; i< 1; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr[0];
	}
	
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println(" 최대값 :"+max(data));
		System.out.println(" 최대값 :"+max(null));
		System.out.println(" 최대값 :"+max(new int[]{})); // 크기가 0 인 배열
	}
}
