package ��Ģ�������;

public class ��� {
	private int ù��°��, �ι�°��;
	private int ���Ѱ�, ����, ���Ѱ�, ��������;
	private float ������;
	
	public void set������(int ù��°��, int �ι�°��){
		this.ù��°�� = ù��°��;
		this.�ι�°�� = �ι�°��;
	}
	
	public int �μ����ϱ�(){
		���Ѱ� = ù��°�� + �ι�°��;
		return ���Ѱ�;
	}
	
	public int �μ�����(){
		���� = ù��°�� - �ι�°��;
		return ����;
	}
	
	public int �μ����ϱ�(){
		���Ѱ� = ù��°�� * �ι�°��;
		return ���Ѱ�;
	}
	
	public float �μ�������(){
		������ = (float)ù��°�� / (float)�ι�°��;
		return ������;
	}
	
	public int ���������ϱ�(){
		�������� = ù��°�� % �ι�°��;
		return ��������;
	}
}
