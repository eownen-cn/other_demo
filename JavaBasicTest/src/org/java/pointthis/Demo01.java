package org.java.pointthis;
class A{
	private B b ;
	public A() {
		System.out.println("ʵ����A����޲ι��죡");
		this.b = new B(this) ;
		this.b.get();
	}
	public void print(String data) {
		System.out.println(data) ;
	}
}
class B{
	private String data ;
	public B() {
		System.out.println("ʵ����B����޲ι��죡") ;
	} ;
	public B(String data){
		this() ;
		this.data = data ;
		System.out.println("ʵ����B�࣬�����б�Ϊ:��String data�����вι��죡���Ѱ�B���е����Ը�ֵ") ;
	}
	private A a ;
	public B(A a) {
		this("Hello world !!!") ;
		System.out.println("ʵ����B�࣬�����б�Ϊ:��A a�����вι��죡") ;
		if ( a instanceof A && null != a) {
			this.a = a ;
		} else {
			return ;
		}
	}
	public void get(){
		System.out.println("����A���print����");
		this.a.print(this.data) ;
	}
}
/***
 * this �ؼ���
 * �ܽ᣺Ŀǰ������this�����������ʹ��
 * 1����һ���������ʹ��this�����������Ի򷽷���ʱ��this������ǵ�ǰ��
 *   ��ʹ��this�������Ե�ʱ��this����ǰ���е�Ψһ��ʶ��
 * 2���ڶ����������ʹ��this��Ϊ���ô��ݵ�ʱ��this����ǰ���û����Ķ���(����ǰ����������)
 * @author Ewonen-PC
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		new A() ;
	}
}
