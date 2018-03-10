package org.denny.generic;
/**
 *通用泛型的案例
 * @author Administrator
 *
 * @param <T>
 */
class Info<T>{
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
		return this.var.toString();
	}
	
}
public class GenericDemo1 {
	public static void main(String[] args) {
		Info<String> info = new Info<String>() ;
		info.setVar("龙永凌");
		fun(info) ;
	}
	public static void fun(Info<?> info){
		System.err.println("内容: " + info);
	}
}
