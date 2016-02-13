package 사칙연산계산기;

public class 계산 {
	private int 첫번째수, 두번째수;
	private int 더한값, 뺀값, 곱한값, 나머지값;
	private float 나눈값;
	
	public void set값설정(int 첫번째수, int 두번째수){
		this.첫번째수 = 첫번째수;
		this.두번째수 = 두번째수;
	}
	
	public int 두수더하기(){
		더한값 = 첫번째수 + 두번째수;
		return 더한값;
	}
	
	public int 두수빼기(){
		뺀값 = 첫번째수 - 두번째수;
		return 뺀값;
	}
	
	public int 두수곱하기(){
		곱한값 = 첫번째수 * 두번째수;
		return 곱한값;
	}
	
	public float 두수나누기(){
		나눈값 = (float)첫번째수 / (float)두번째수;
		return 나눈값;
	}
	
	public int 나머지구하기(){
		나머지값 = 첫번째수 % 두번째수;
		return 나머지값;
	}
}
