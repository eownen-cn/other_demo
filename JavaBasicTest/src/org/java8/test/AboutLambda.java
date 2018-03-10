package org.java8.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * Lambda表达式的总结：
 * 1、Lambda表达式是为当只使用一个实例类的唯一方法时提供的便捷操作。
 * 2、它的好处是在理解其简化原则后，使用起来不仅减少了冗余代码规避了性能消耗。
 * 3、更好的读懂代码，这是最直观的好处，毕竟上来就知道方法能干什么,有什么参数(参数列表),看到返回值,还有什么不知道的。
 * 结果表明，直接输入整数也是可以的，因为compareTo()方法的返回值就是int型。由此得来小于0为升序，大于等于0为降序
 * 4、让我理解了，Collections.sort() ;其实并不难
 * 5、List<?> lis = Arrays.asList("first blood","double kill","triple kill","quadra kill","penta kill") ;
 * 6、lis要正确排序的话，就容易多了，如此就好：Collections.sort( (a,b) -> 0 ) ; 
 * @author Ewonen-PC
 *
 */
public class AboutLambda {
	static List<String> names = Arrays.asList("beter", "anna", "cike", "denia");
	public static void main(String[] args) {
		demo01() ;
		System.out.println();
		demo02() ;
		System.out.println();
		demo03() ;
		System.out.println();
		demo04() ;
		System.out.println();
		demo05() ;
		System.out.println();
		demo06() ;
	}
	/**
	 * java8之前的经典版
	 */
	public static void demo01() {
		Collections.sort(names,new Comparator<String>() {
		    @Override
		    public int compare(String a, String b) { 
		        return a.compareTo(b) ; // 小.compareTo(大) 升序，反之则降序
		    }
		});
		print(names) ;
	}
	/**
	 * demo01的升级版,引入了Lambda表达式 "(参数列表)->{函数体或直接的返回值}" ;
	 */
	public static void demo02() {
		Collections.sort(names, (String a, String b) -> {
		    return b.compareTo(a);
		});
		print(names) ;
	}
	
	/**
	 * demo02的升级版
	 */
	public static void demo03() {
		Collections.sort(names, (String a, String b) -> a.compareTo(b));
		print(names) ;
	}

	/**
	 * demo03的升级版
	 */
	public static void demo04() {
		Collections.sort(names, (a,b) -> b.compareTo(a));
		print(names) ;
	}

	/**
	 * demo04的无节操版
	 */
	public static void demo05() {
		names = Arrays.asList("c","b","a","d","e") ;
		Collections.sort(names, (a,b) -> -1); 
		print(names);
	}
	
	/**
	 * demo05的吐槽版
	 * 搞这么多的德莫，都是排序 ，来个乱序吧
	 */
	public static void demo06() {
		List<?> nums = Arrays.asList("1","2","3","4","5","6") ;
		Collections.sort(nums, (a,b) -> Math.random() > 0.5 ? -1 : 1);  
		print(nums) ;
	}
	
	public static void print(List<?> list) {
		for ( Object s : list ) {
			System.out.print(s + "、");
		}
	}
}
