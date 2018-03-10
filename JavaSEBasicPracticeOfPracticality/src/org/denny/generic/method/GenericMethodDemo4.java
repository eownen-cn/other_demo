package org.denny.generic.method;
/**
 * 使用可变参数的特性结合泛型，接收多个同类型的参数，返回泛型数组
 * @author Administrator
 *
 */
public class GenericMethodDemo4 {
	public static void main(String[] args) {
		int i[] = {1,2,3,4,5,6} ;
		char j[] = {'a','b','c','d','e','f','w','c','n'} ;
		for(int a=0;a<((i.length)>j.length ? i.length : j.length);a++){
			if(a!=0 && a!=((i.length)>j.length ? i.length : j.length)){
				System.err.print("、");
			}
			if(a < ((i.length)<j.length ? i.length : j.length)){
				System.err.print(i[a]) ;
			}
			System.err.print(j[a]) ;
		}
	}
	@SafeVarargs
	public static <T> T[] add(T...arg){
		return arg ;
	}
}
