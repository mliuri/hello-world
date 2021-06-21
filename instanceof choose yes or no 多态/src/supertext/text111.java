package supertext;
import java.lang.Math;

/*4/10日代码*/


public  class text111{
	public static void main(String[] args) {
//		partnet.csh();/*静态方法能不用实例化就能直接访问*/
		
		partnet t = new partnet();
		/*在这里要体现构造方法中参数传递*/
		
//		t.csh();/*要以静态类型访问静态方法*/
		child v = new child(t);
		
		partnet o = new child1hao();
		/*System.out.println(oi);oi不会被初始化，结论是不会*/
		/*测试多态所属关系*/
		if(o instanceof child1hao) {
			System.out.println("属于child");}
			else {
				System.out.println("属于父类");
			}
		v.text();
		
		}
		
	}


class partnet{
	/*这串代码在子类初始化的时候一定会输出*/
	partnet(){
		System.out.println("会和对象一起初始化");
		
	}
	/*目的：用super使这段初始化*/
	partnet(partnet v){
		System.out.println("含参数的初始化");
	}
	/*会加载的只有静态代码块，和构造函数，方法不会被初始化，可以用super调用使方法初始化*/
	static {
		System.out.println("会加载静态代码块");
	}
	/*测试static方法的在对象被定义时*/
	public static void csh() {
		System.out.println("static在父类中被初始化");
	}
	
	public void text(){
		System.out.println("这是父类");
	}
}

class child extends partnet{
	child(partnet t){
		/*super不仅可以使父类中变量初始化【super。变量名】，也能让父类方法中的变量初始化【super。方法名】，*/
		/*帮助之类初始化父类的成员和方法，因此可以使用父类地址中的变量*/
		/*这句使得父类中得第二个初始化代码得以执行，去掉得化会将第一段初始化代码在执行一次*/
		/*初始化父类super（）*/
		super(t);
		/*在不改变原代码的情况下，调用父类中的变量*/
		
		
	}
	/*测试static方法在对象被定义时的初始化，结论是不会被执行*/
	public static void csh() {
		System.out.println("static在子类中被初始化");
		int oi;
		oi = 10;
		
	}
	/*覆盖方法之前要加Override*/
	@Override
	public void text(){
		
		System.out.println("这是子类");
		/*测试super调用方法*/
		super.text();
	}
}




class child1hao extends partnet{
	
}