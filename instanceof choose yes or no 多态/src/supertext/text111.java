package supertext;
import java.lang.Math;

/*4/10�մ���*/


public  class text111{
	public static void main(String[] args) {
//		partnet.csh();/*��̬�����ܲ���ʵ��������ֱ�ӷ���*/
		
		partnet t = new partnet();
		/*������Ҫ���ֹ��췽���в�������*/
		
//		t.csh();/*Ҫ�Ծ�̬���ͷ��ʾ�̬����*/
		child v = new child(t);
		
		partnet o = new child1hao();
		/*System.out.println(oi);oi���ᱻ��ʼ���������ǲ���*/
		/*���Զ�̬������ϵ*/
		if(o instanceof child1hao) {
			System.out.println("����child");}
			else {
				System.out.println("���ڸ���");
			}
		v.text();
		
		}
		
	}


class partnet{
	/*�⴮�����������ʼ����ʱ��һ�������*/
	partnet(){
		System.out.println("��Ͷ���һ���ʼ��");
		
	}
	/*Ŀ�ģ���superʹ��γ�ʼ��*/
	partnet(partnet v){
		System.out.println("�������ĳ�ʼ��");
	}
	/*����ص�ֻ�о�̬����飬�͹��캯�����������ᱻ��ʼ����������super����ʹ������ʼ��*/
	static {
		System.out.println("����ؾ�̬�����");
	}
	/*����static�������ڶ��󱻶���ʱ*/
	public static void csh() {
		System.out.println("static�ڸ����б���ʼ��");
	}
	
	public void text(){
		System.out.println("���Ǹ���");
	}
}

class child extends partnet{
	child(partnet t){
		/*super��������ʹ�����б�����ʼ����super������������Ҳ���ø��෽���еı�����ʼ����super������������*/
		/*����֮���ʼ������ĳ�Ա�ͷ�������˿���ʹ�ø����ַ�еı���*/
		/*���ʹ�ø����еõڶ�����ʼ���������ִ�У�ȥ���û��Ὣ��һ�γ�ʼ��������ִ��һ��*/
		/*��ʼ������super����*/
		super(t);
		/*�ڲ��ı�ԭ���������£����ø����еı���*/
		
		
	}
	/*����static�����ڶ��󱻶���ʱ�ĳ�ʼ���������ǲ��ᱻִ��*/
	public static void csh() {
		System.out.println("static�������б���ʼ��");
		int oi;
		oi = 10;
		
	}
	/*���Ƿ���֮ǰҪ��Override*/
	@Override
	public void text(){
		
		System.out.println("��������");
		/*����super���÷���*/
		super.text();
	}
}




class child1hao extends partnet{
	
}