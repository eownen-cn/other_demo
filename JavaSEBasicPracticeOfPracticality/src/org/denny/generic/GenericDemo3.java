package org.denny.generic;
/**
 * 泛型下限的设置:TypeName<? super Type> 
 * @author Administrator
 *
 * @param <T>
 */
class Info3<T>{
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
public class GenericDemo3 {
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Info2<Comparable> info2 = new Info2<Comparable>() ;
		info2.setVar('X');
		fun2(info2) ;
	}
	public static void fun2(Info2<? super Character> info2){
		System.err.println("内容: " + info2);
	}
}
