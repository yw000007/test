package main;

import java.util.Scanner;

import cls.insertCls;
import cls.deleteCls;
import cls.updateCls;
import cls.searchCls;
import cls.printCls;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		insertCls isCls = new insertCls();
		deleteCls delCls = new deleteCls();
		updateCls upCls = new updateCls();
		searchCls scCls = new searchCls();
		printCls prCls = new printCls();

		boolean b = true;

		while (b) {
			System.out.println("1. 등록 : ");
			System.out.println("2. 삭제 : ");
			System.out.println("3. 수정 : ");
			System.out.println("4. 검색 : ");
			System.out.println("5. 출력 : ");
			System.out.println("6. 종료 : ");
			System.out.print("==================== > ");

			int k = scan.nextInt();

			switch (k) {
			case 1: //insert
				isCls.insert();
				break;

				
			case 2: //delete
				delCls.delete();
				break;

			case 3: //update
				upCls.update();
				break;

			case 4: //search
				scCls.search();
				break;
				
			case 5: //print
				prCls.print();
                break;

			case 6: //end!!
				System.out.println("프로그램 종료을 종료합니다.");
				b = false;
				break;
			}
		}
	}

}
