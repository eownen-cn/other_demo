package org.java.string;
/**
 * 总结：
 * 1、字符串的比较分两种情况
 * 		在进行分析前，首先明白两点：1）任何字符串都是引用数据类型；2）字符串都是不可改变的
 * 		（也就是被覆盖后的字符串变量，原有的字符串内容一旦不被栈内存所指向，其都将被垃圾收集器不定期回收）
 * 
 * 		一种是地址值的比较，这是常规犯错的案例，尽量不要使用==来比较两个字符串变量
 * 		另外一种仍然是字符串地址值的比较，只不过在都是字符串常量(String str = "abc";"abc"即为常量)的时候，
 * 		由于字符串是不可改变的，所以其比较的时候即使将这个常量的变量赋给一个新的变量，实质仍然是比较的同一块内存的地址值，
 * 		既然地址值相同，那么剩下的就只能比较其真实数据了，这个时候==和equals()是没有任何区别的
 * 		如果说，为了保险，那么全都使用equals()方法吧，只是为了应付考试或面试，这里着重分析了下字符串相比较的时候的问题。
 * @author Ewonen-PC
 *
 */
public class StringDemo1 {
	public static void main(String[] args) {
		// 字符串的非正规比较（一） 面试常见
		stringEquals1() ;
		// 字符串的非正规比较（二） 面试常见
		stringEquals2() ;
		// 字符串正规比较
		stringEquals3() ;
		// 字符串手动入池
		StringEquals4() ;
	}
	public static void stringEquals1(){

		// 由于String是引用数据类型，为了区分，先看看普通数据类型的比较
		int x = 10 ;
		int y = 10 ;
		System.out.println(x == y) ; // true 毫无瑕疵
		
		// 在字符串中，同样可以使用==进行比较，但有个梗，那就是其比较的不是真正字符串的内容，而是其内容所在的地址值
		// 下面代码验证,字符串比较范例一：
		System.out.println("字符串比较范例一") ;
		String stra = "hello" ; // 新开辟的内存空间
		String strb = new String("hello") ; // 新开辟的内存空间
		String strc = strb ;
		System.out.println(stra == strb) ; // false
		System.out.println(stra == strc) ; // false
		System.out.println(strb == strc) ; // true
	}
	public static void stringEquals2(){

		// 在字符串中，同样可以使用==进行比较，但有个梗，那就是其比较的不是真正字符串的内容，而是其内容所在的地址值
		// 下面代码验证,字符串比较范例二：
		System.out.println("字符串比较范例二") ;
		String stra = "hello" ;
		String strb = new String("hello") ;
		String strc = strb ; // 地址值的传递
		String strd = "hello" ; // 新开辟的内存空间？ 错，因为不使用new时，同样的字符串内容("hello")只占同一块内存空间，再多同样的内容都将只是覆盖而已	
		String stre = strd ; // 根据上面的规律，这里也只不过时复制的同一块堆内存在栈中的地址值
		System.out.println(stra == strb) ; // false
		System.out.println(stra == strc) ; // false
		System.out.println(strb == strc) ; // true
		System.out.println(stra == strd) ; // true
		System.out.println(stra == stre) ; // true
	}
	public static void stringEquals3(){
		// 字符串在Java中的的正确比较方法，string.equals()类似于某些语言，如Javascript的===符号,其比较的形式是直接跳过引用关系比较真实数据内容。
		// 另外，在javascirpt中===可以用于任何数据之间的比较，规则：有且只有两者的内存地址以及内容完全相等才成立。而equals()方法是专门用于Java的字符串比较的。
		String sa = "hello" ;
		String sb = sa ;
		String ssa = new String("hello") ;
		String ssb = ssa ;
		System.out.println(sa.equals(sb)) ; 	// true
		System.out.println(sa.equals(ssa)) ; 	// true
		System.out.println(sb.equals(ssb)) ; 	// true
		System.out.println(ssa.equals(ssb)) ; 	// true
		System.out.println(sa.equals(ssb)) ; 	// true
		
	}
	/**
	 * 全局字符串对象池概念
	 * 字符串手动入池String实例.intern()
	 */
	public static void StringEquals4(){
		String str1 = "hello" ; // 这句代码生成一个字符串对象池，池的内容为"hello",此后一旦有同样的字符串常量生成等于"hello",那么将不再开辟新的内存空间
		String _str1 = "hello" ; // 这里即使是新的字符串常量，在Java的JVM底层分析中，由于池中有"hello",所以这里不开辟新的内存空间，自动入池._str1就是str1
		String str2 = new String("hello") ; // 无条件开辟一个新的字符串内存空间，地址值指向"hello"字符串所在的堆内存块
		String str3 = str2.intern() ; // 复制一份str2地址值指向的内容，而后将其加入到全局对象池，注意这里并不会改变原有str2的地址值
		System.out.println("自动入池:" + (str1 == _str1)) ; // true  // 自动入池，栈内存多一个_str,堆内存不开辟新的内存空间，因此str1和_str1指向的堆内存一致
		System.out.println("两个没有任何关系的内存空间:" + (str1 == str2)) ; // false //两个没有任何关系的内存空间
		System.out.println("手动入池后指向同一个堆内存空间:" + (str1 == str3)) ; // true
		System.out.println("池中对象地址值比较独立对象地址值:" + (_str1 == str2)) ; // false // 一个字符串对象池中的字符串对象和一个独立的字符串对象，他们的地址值永远不可能相等
		
		// 验证自动入池
		_str1 = "hello world !!!" ;
		System.out.println(str1) ;
		System.out.println(_str1) ;
		_str1 = "hello" ;
		System.out.println(_str1 == str1) ; // true
		String __str1 = "hell" ;
		System.out.println(__str1 == str1) ; // false
		String ___str1 = "hello" ;
		System.out.println(str1 == ___str1) ; // true // 
		/**
		 * 自动入池总结：
		 * 		在字符串对象池中，只要字符串内容相同，JVM是不会开辟新的内存空间的 
		 * 		即：在字符串常量比较的时候，只要字符串内容相同那么虚拟机就始终只会在对象池中保留一个堆内存空间来存放该字符串。
		 * 		但需要注意的是，我们一定要明白即使一旦原字符串发生了改变，实际上是在堆中新增了一块内存空间来描述这个字符串，
		 * 		这个字符串可以替换掉原(变量/地址值)引用关系，也可以用新的(地址值)变量来指向，可以理解为原子符串的副本发生了改变，因此
		 *  	到最后如果栈内存中没有对堆内存中的该字符串做任何地址的引用，该字符串在堆内存中占用的空间将不定期被垃圾回收(GC)
		 *  	最后的总结：字符串是最常见的开发，在满足应用程序的既要业务逻辑的同时，如果要考虑性能，字符串的拼接与修改优化方面是尤为重要的。
		 */
		
	}
}
