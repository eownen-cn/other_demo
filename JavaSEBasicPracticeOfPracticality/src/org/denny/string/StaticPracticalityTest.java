package org.denny.string;

/**
 * �˰������ܽ�:
 * 	static�ؼ������ε������Կ��Ա���ֱ�ӵ��ã�
 *  static�ؼ����޵ķ����в����Ե��÷�static���ε����Ի򷽷���
 *  ��֮��static������κζ��󣬶�������������Ĺ��췽��ִ�С�
 * @author Administrator
 *
 */


// ʹ�û�����ʵ�������Եķ�ʽ,��static�޹�
class People{
	private String name ;
	public People(){}
	public People(String name){
		setName(name) ;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "People [name=" + name + "]";
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
// ��ͨ����static����������ֱ�ӵ��þ�̬��(static)���εĳ�Ա����
// ���ң���static���κ�����ԣ���������ʵ����֮ǰ���и�ֵ
class People2{
	static String name ;
	public People2(){
		System.err.println("���췽����ִ�У�") ;
	}
	public People2(String name){
		People2.name = name ;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "People [name=" + name + "]";
	}

	
}


public class StaticPracticalityTest {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		People2.name = "������1" ;
		String before = People2.name ;
		System.err.println("BeforeConstructor:::" + before);
		People2 people2 = new People2() ;
		people2.name = "������2" ;
		System.err.println("AfterConstructor:::" + people2.getName());
	}
}
