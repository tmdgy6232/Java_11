package com.biz.exec.exec;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exec_03 {
	public static void main(String[] args) {

		LinkedList<String> strList = new LinkedList<String>();

		strList.add("Korea");
		strList.add("대한민국");
		strList.add("우리나라");

		view(strList);
	}

	public static void view(LinkedList<String> strList) {
		for (String s : strList) {
			System.out.println(s);
		}

	}
}
