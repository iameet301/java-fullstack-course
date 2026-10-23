package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		int a=list.get(0);
		System.out.println(a);
		
		list.add(0,0);
		System.out.println(list);
		
		list.set(0,10);
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		int size=list.size();
		System.out.println(size);
		
		Collections.sort(list);
		System.out.println(list);
		
		
		for(int x:list) {
			System.out.print(x);
		}
	}

}
