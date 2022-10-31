package _06_class_.practice01.p05;

public class Practice {
	public static void main(String[] args) {
		System.out.println("== 5 ==");
		Student s = new Student(" 홍길동 ",1,1,100,60,76);
		System.out.println(s.info());
		
	}
}


class Student {
	String name;
	int i;
	int j;
	int k;
	int l;
	int m;
	
	public Student(String name, int i, int j, int k, int l, int m) {
		this.name = name;
		this.i = i;
		this.j = j;
		this.k = k;
		this.l = l;
		this.m = m;
	}

	public String info() {
		return  name  +"," + i + "," + j + "," + k + "," + l + "," + m + "," + (k+l+m) + "," + (k+l+m)/3;
	}
	
}	