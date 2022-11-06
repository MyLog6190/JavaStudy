package _11_collections.practice.p02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Practice {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		// 중복 제거
		HashSet set = new HashSet(list);
		
		// 오름차순 정렬
		TreeSet tset = new TreeSet(set);
		
		// 스택
		Stack stack = new Stack();
		stack.addAll(tset);
		
		while(!stack.empty())
			System.out.println(stack.pop());
	}
}
