package org.denny.generic;
/**
 *泛型上限的设置:TypeName<? extends ClassType> 
 * @author Administrator
 *
 * @param <T>
 */
class Info2<T>{
	T var ;

	/**
	 * @return the var
	 */
	public T getVar() {
		return var;
	}

	/**
	 * @param var the var to set
	 */
	public void setVar(T var) {
		this.var = var;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.var.toString() ;
	}
	
}
public class GenericDemo2 {
	public static void main(String[] args) {
		Info2<Integer> info2 = new Info2<Integer>() ;
		info2.setVar(123);
		fun2(info2) ;
	}
	public static void fun2(Info2<? extends Number> info2){
		System.err.println("内容: " + info2);
	}
}
