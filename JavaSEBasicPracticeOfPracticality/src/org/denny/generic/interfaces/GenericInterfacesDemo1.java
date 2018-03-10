package org.denny.generic.interfaces;
interface Info<T>{
	public T getObject() ;
}
class InfoImpl<T> implements Info<T>{
	private T obj ;
	@Override
	public T getObject() {
		// TODO Auto-generated method stub
		return obj;
	}
	public InfoImpl(T obj) {
		this.obj = obj;
	}
	/**
	 * @return the obj
	 */
	public T getObj() {
		return obj;
	}
	/**
	 * @param obj the obj to set
	 */
	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
public class GenericInterfacesDemo1 {
	public static void main(String[] args) {
		Info<String> info = null ;
		info = new InfoImpl<String>("¡˙”¿¡Ë") ;
		System.err.println("ƒ⁄»›:" + info.getObject()) ;
	}
}
