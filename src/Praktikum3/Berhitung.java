package Praktikum3;

import java.util.*;

public class Berhitung {

	public static void main(String[] args) { 
		Scanner Scan = new Scanner(System.in);
		String hitung = Scan.nextLine();
		String readString[] = hitung.split("\\s+");
		
//		String hitung1;
//if(readString[] == hitung.split("\\s+")) {
//	//jika kalimat rapat dan tidak ada spasi maka tampilkan error message
//}
		int A = Integer.parseInt(readString[0]);
		int B = Integer.parseInt(readString[2]);
		int hasil;

	if(1 <= A && B <= 1000){
		    if(readString[1].equals("+")){
		    	hasil = A + B;
		        System.out.println(hasil);
		    }else if(readString[1].equals("-")){
		    	hasil = A - B;
		        System.out.println(hasil);        
		    }else if(readString[1].equals("/")){
		    	hasil = A/B;
		        System.out.println(hasil);        
		    }else if(readString[1].equals("*")){
		    	hasil = A*B;
		        System.out.println(hasil);        
		    }else if(readString[1].equals("%")){
		    	hasil = A%B;
//		    	System.out.println(A + readString[1] + B + " = " + hasil);
		    	System.out.println(hasil);
		    }
		}else{
		    ;System.out.print("tidak ditemukan operator yang dimaksudkan");
		}
	}
}


