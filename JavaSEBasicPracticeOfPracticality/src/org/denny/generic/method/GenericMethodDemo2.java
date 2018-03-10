package org.denny.generic.method;
/**
 * 在方法中指定泛型的上限和下限
 * public static <T extends Number> Demo2<T> fun(T obj){}
 * 在以上方法，可以根据传入的参数，实例化并返回一个泛型类的实例。
 * 方法的返回值分前/后两部分.
 * 前者: <T extends/super Number> 表示设置该泛型方法返回值的上限或下限
 * 后者: Demo2<T> 表示设置该泛型方法的返回值是在一个泛型类的上下文中决定的，即
 * 前者的上下限，可以自由定制，但也必须承载于Demo2<T>中的T,否者不能通过编译。
 * 
 * @author Administrator
 *
 */
class Demo2<T extends Object>{
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
public class GenericMethodDemo2 {
	public static void main(String[] args) {
		Demo2<Integer> d = fun(3000) ;
		System.err.println(d) ;
		d.beforeDestroy();
	}
	public static <T extends Number> Demo2<T> fun(T obj){
		Demo2<T> object = new Demo2<T>() ;
		object.setObj(obj);	
		return object ;
	}
}
