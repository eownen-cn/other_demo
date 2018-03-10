package org.denny.generic.method;
/**
 * 使用泛型规定传入多个参数时的统一类型。
 * @author Administrator
 *
 */
class Demo3<T extends Object>{
	private T obj ;

	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	public String toString() {
		return "数据信息:" + this.obj + "\n" + "当前对象的类型是:" + this.getClass().getName() ;
	}
	public void beforeDestroy(){
		System.err.println("判断传入的对象是否是Demo2类型:" + (this.obj instanceof Demo2));
		System.err.println("判断传入的对象是否是Integer类型:" + (this.obj instanceof Integer));
		System.err.println("判断传入的对象是否是org.denny.generic.method.Demo2类型:" + (this.obj instanceof org.denny.generic.method.Demo2));
	}
}
public class GenericMethodDemo3 {
	public static void main(String[] args) {
		Demo3<String> d1 = new Demo3<String>() ;
		Demo3<String> d2 = new Demo3<String>() ;
		d1.setObj("您好，");
		d2.setObj("龙永凌");	
		add(d1,d2) ;
	}
	public static <T> void add(Demo3<T> obj1 , Demo3<T> obj2){
		System.err.println(obj1.getObj() + " " + obj2.getObj()) ;
	}
}
