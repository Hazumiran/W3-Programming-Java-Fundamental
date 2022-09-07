package Praktikum3;

import java.util.*;

public class InputOutput1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
		String s = input.nextLine();
		if (s.length() < 1 || s.length() > 400000) {
			System.out.print("Inputan diluar batasan");
		} else {
			String[] token = s.split(" |\\!|\\,|\\?|\\_|\\'|\\@",0);
			int n = token.length;
			System.out.println(n);
			for(int index = 0; index < n;index += 1) {
				System.out.println(token[index]);
			}
			break;
		}
	}

}
}
