package org.denny.generic.method;
/**
 * 传递什么类型，则返回什么类型。
 * 方法中间加入业务逻辑
 * @author Administrator
 *
 */
class Demo{
	public <T>T fun(T t){
		// 业务逻辑
		return t ;
	}
}
public class GenericMethodDemo1 {
	public static void main(String[] args) {
		Demo d = new Demo() ;
		System.err.println(d.fun("龙永凌")) ;
		Demo d2 = new Demo() ;
		System.err.println(d2.fun(123)) ;
	}
}
