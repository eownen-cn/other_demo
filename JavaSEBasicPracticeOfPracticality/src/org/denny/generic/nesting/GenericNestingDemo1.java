package org.denny.generic.nesting;
/**
 * 泛型的嵌套基本案例
 * @author Administrator
 *
 * @param <K>
 * @param <V>
 */
class MyObject<K,V>{
	private K key ;
	private V value ;
	public MyObject(){}

	public MyObject(K key, V value) {
		this.setKey(key);
		this.setValue(value) ;
	}

	/**
	 * @return the key
	 */
	public K getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(K key) {
		this.key = key;
	}
	/**
	 * @return the value
	 */
	public V getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(V value) {
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyObject [key=" + key + ", value=" + value + "]";
	}
	
}

class Test<T>{
	private T info ;

	/**
	 * @return the info
	 */
	public T getInfo() {
		return info;
	}

	/**
	 * @param info the info to set
	 */
	public void setInfo(T info) {
		this.info = info;
	}

	public Test(T info) {
		this.info = info;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Test [info=" + info + "]";
	}
	
}

public class GenericNestingDemo1 {
	public static void main(String[] args) {
		Test<MyObject<String,Integer>> test = null ;
		MyObject<String,Integer> info = new MyObject<String, Integer>("龙永凌", 33); 
		test = new Test<MyObject<String,Integer>>(info) ;
		System.err.println(test) ;
	}
}
