package com.biz.exec.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exec_04 {

	public static void main(String[] args) {

		
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for(int i =0; i<50; i++) {
			int intR = rnd.nextInt(50)+1;
			intList.add(intR);
		}
		
		int myInt = 25;
		int size = intList.size();
		for(int i =0; i<size; i++) {
			if(intList.get(i) == myInt || 
					intList.get(i) == myInt + 3) {
				size--;
				intList.remove(i);
			}
		}
		size = intList.size();
		System.out.println("리스트의 개수 : " + size);
		for(int i =0; i<size; i++) {
			System.out.print(intList.get(i));
			if((i+1)%5 == 0) System.out.println();
			else System.out.print(", ");
		}
		
		
	}

}
