package com.buaa.example;

import java.io.*;
public class ValueOfChar {
	public static void main(String args[]) {
		char ch = ' ';
		System.out.print("������һ���ַ�:");
		try {
			ch=(char)System.in.read();
			
		} catch (IOException e) {
			System.out.println("�ַ�"+ch+"��ASCIIֵΪ:"+(int)ch);
		}
	}
}
