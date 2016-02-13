package 사칙연산계산기;

public class 출력 {
	private int 더한값, 뺀값, 곱한값, 나머지값;
	private float 나눈값;
	
	public void set값설정(int 더한값, int 뺀값, int 곱한값, float 나눈값, int 나머지값){
		this.더한값 = 더한값;
		this.뺀값 = 뺀값;
		this.곱한값 = 곱한값;
		this.나눈값 = 나눈값;
		this.나머지값 = 나머지값;
	}
	
	public void 사칙연산한값을출력하기(){
		System.out.println("더한값은 "+더한값+"입니다.");
		System.out.println("뺀값은 "+뺀값+"입니다.");
		System.out.println("곱한값은 "+곱한값+"입니다.");
		System.out.println("나눈값은 "+나눈값+"입니다.");
		System.out.println("나머지값은 "+나머지값+"입니다.");
	}
}
