package ��Ģ�������;

import java.util.Scanner;

public class �Է� {
	private int ù��°��, �ι�°��;
	private Scanner scan;
	
	public �Է�(){
		scan = new Scanner(System.in);
	}
	
	public void �μ��Է¹ޱ�(){
		ù��°�� = scan.nextInt();
		�ι�°�� = scan.nextInt();		
	};
	
	public int getù��°��() { return ù��°��; };
	public int get�ι�°��() { return �ι�°��; };
}
