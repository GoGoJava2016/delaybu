package 사칙연산계산기;

import java.util.Scanner;

public class 입력 {
	private int 첫번째수, 두번째수;
	private Scanner scan;
	
	public 입력(){
		scan = new Scanner(System.in);
	}
	
	public void 두수입력받기(){
		첫번째수 = scan.nextInt();
		두번째수 = scan.nextInt();		
	};
	
	public int get첫번째수() { return 첫번째수; };
	public int get두번째수() { return 두번째수; };
}
