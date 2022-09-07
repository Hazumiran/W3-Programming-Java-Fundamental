package Praktikum3;

import java.util.*;
import java.math.*;


public class BigNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan A : ");
        BigInteger a = new BigInteger(scan.nextLine());
        System.out.print("Masukkan B : ");
        BigInteger b = new BigInteger(scan.nextLine());
        BigInteger  tambah = a.subtract(b);
        BigInteger kali = a.multiply(b);        
        System.out.println(tambah+"\n"+kali);

	}

}
