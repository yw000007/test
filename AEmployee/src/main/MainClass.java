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

		insertCls ic = new insertCls();
		deleteCls dc = new deleteCls();
		updateCls uc = new updateCls();
		searchCls sc = new searchCls();
		printCls pc = new printCls();

		boolean run = true;

		while (run) {
			System.out.println("1. 등록 : ");
			System.out.println("2. 삭제 : ");
			System.out.println("3. 수정 : ");
			System.out.println("4. 검색 : ");
			System.out.println("5. 출력 : ");
			System.out.println("6. 종료 : ");
			System.out.print("==================== > ");

			int key = scan.nextInt();

			switch (key) {
			case 1: // 등록
				ic.insert();
				break;

				
			case 2: // 삭제
				dc.delete();
				break;

			case 3: // 수정
				uc.update();
				break;

			case 4: // 검색
				sc.search();
				break;
				
			case 5: // 출력
                pc.print();
                break;

			case 6: // 종료
				System.out.println("프로그램 종료");
				run = false;
				break;
			}
		}
	}

}
