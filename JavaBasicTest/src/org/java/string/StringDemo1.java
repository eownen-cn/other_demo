package org.java.string;
/**
 * �ܽ᣺
 * 1���ַ����ıȽϷ��������
 * 		�ڽ��з���ǰ�������������㣺1���κ��ַ������������������ͣ�2���ַ������ǲ��ɸı��
 * 		��Ҳ���Ǳ����Ǻ���ַ���������ԭ�е��ַ�������һ������ջ�ڴ���ָ���䶼���������ռ��������ڻ��գ�
 * 
 * 		һ���ǵ�ֵַ�ıȽϣ����ǳ��淸��İ�����������Ҫʹ��==���Ƚ������ַ�������
 * 		����һ����Ȼ���ַ�����ֵַ�ıȽϣ�ֻ�����ڶ����ַ�������(String str = "abc";"abc"��Ϊ����)��ʱ��
 * 		�����ַ����ǲ��ɸı�ģ�������Ƚϵ�ʱ��ʹ����������ı�������һ���µı�����ʵ����Ȼ�ǱȽϵ�ͬһ���ڴ�ĵ�ֵַ��
 * 		��Ȼ��ֵַ��ͬ����ôʣ�µľ�ֻ�ܱȽ�����ʵ�����ˣ����ʱ��==��equals()��û���κ������
 * 		���˵��Ϊ�˱��գ���ôȫ��ʹ��equals()�����ɣ�ֻ��Ϊ��Ӧ�����Ի����ԣ��������ط��������ַ�����Ƚϵ�ʱ������⡣
 * @author Ewonen-PC
 *
 */
public class StringDemo1 {
	public static void main(String[] args) {
		// �ַ����ķ�����Ƚϣ�һ�� ���Գ���
		stringEquals1() ;
		// �ַ����ķ�����Ƚϣ����� ���Գ���
		stringEquals2() ;
		// �ַ�������Ƚ�
		stringEquals3() ;
		// �ַ����ֶ����
		StringEquals4() ;
	}
	public static void stringEquals1(){

		// ����String�������������ͣ�Ϊ�����֣��ȿ�����ͨ�������͵ıȽ�
		int x = 10 ;
		int y = 10 ;
		System.out.println(x == y) ; // true ����覴�
		
		// ���ַ����У�ͬ������ʹ��==���бȽϣ����и������Ǿ�����ȽϵĲ��������ַ��������ݣ��������������ڵĵ�ֵַ
		// ���������֤,�ַ����ȽϷ���һ��
		System.out.println("�ַ����ȽϷ���һ") ;
		String stra = "hello" ; // �¿��ٵ��ڴ�ռ�
		String strb = new String("hello") ; // �¿��ٵ��ڴ�ռ�
		String strc = strb ;
		System.out.println(stra == strb) ; // false
		System.out.println(stra == strc) ; // false
		System.out.println(strb == strc) ; // true
	}
	public static void stringEquals2(){

		// ���ַ����У�ͬ������ʹ��==���бȽϣ����и������Ǿ�����ȽϵĲ��������ַ��������ݣ��������������ڵĵ�ֵַ
		// ���������֤,�ַ����ȽϷ�������
		System.out.println("�ַ����ȽϷ�����") ;
		String stra = "hello" ;
		String strb = new String("hello") ;
		String strc = strb ; // ��ֵַ�Ĵ���
		String strd = "hello" ; // �¿��ٵ��ڴ�ռ䣿 ����Ϊ��ʹ��newʱ��ͬ�����ַ�������("hello")ֻռͬһ���ڴ�ռ䣬�ٶ�ͬ�������ݶ���ֻ�Ǹ��Ƕ���	
		String stre = strd ; // ��������Ĺ��ɣ�����Ҳֻ����ʱ���Ƶ�ͬһ����ڴ���ջ�еĵ�ֵַ
		System.out.println(stra == strb) ; // false
		System.out.println(stra == strc) ; // false
		System.out.println(strb == strc) ; // true
		System.out.println(stra == strd) ; // true
		System.out.println(stra == stre) ; // true
	}
	public static void stringEquals3(){
		// �ַ�����Java�еĵ���ȷ�ȽϷ�����string.equals()������ĳЩ���ԣ���Javascript��===����,��Ƚϵ���ʽ��ֱ���������ù�ϵ�Ƚ���ʵ�������ݡ�
		// ���⣬��javascirpt��===���������κ�����֮��ıȽϣ���������ֻ�����ߵ��ڴ��ַ�Լ�������ȫ��Ȳų�������equals()������ר������Java���ַ����Ƚϵġ�
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
	 * ȫ���ַ�������ظ���
	 * �ַ����ֶ����Stringʵ��.intern()
	 */
	public static void StringEquals4(){
		String str1 = "hello" ; // ����������һ���ַ�������أ��ص�����Ϊ"hello",�˺�һ����ͬ�����ַ����������ɵ���"hello",��ô�����ٿ����µ��ڴ�ռ�
		String _str1 = "hello" ; // ���Ｔʹ���µ��ַ�����������Java��JVM�ײ�����У����ڳ�����"hello",�������ﲻ�����µ��ڴ�ռ䣬�Զ����._str1����str1
		String str2 = new String("hello") ; // ����������һ���µ��ַ����ڴ�ռ䣬��ֵַָ��"hello"�ַ������ڵĶ��ڴ��
		String str3 = str2.intern() ; // ����һ��str2��ֵַָ������ݣ���������뵽ȫ�ֶ���أ�ע�����ﲢ����ı�ԭ��str2�ĵ�ֵַ
		System.out.println("�Զ����:" + (str1 == _str1)) ; // true  // �Զ���أ�ջ�ڴ��һ��_str,���ڴ治�����µ��ڴ�ռ䣬���str1��_str1ָ��Ķ��ڴ�һ��
		System.out.println("����û���κι�ϵ���ڴ�ռ�:" + (str1 == str2)) ; // false //����û���κι�ϵ���ڴ�ռ�
		System.out.println("�ֶ���غ�ָ��ͬһ�����ڴ�ռ�:" + (str1 == str3)) ; // true
		System.out.println("���ж����ֵַ�Ƚ϶��������ֵַ:" + (_str1 == str2)) ; // false // һ���ַ���������е��ַ��������һ���������ַ����������ǵĵ�ֵַ��Զ���������
		
		// ��֤�Զ����
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
		 * �Զ�����ܽ᣺
		 * 		���ַ���������У�ֻҪ�ַ���������ͬ��JVM�ǲ��Ὺ���µ��ڴ�ռ�� 
		 * 		�������ַ��������Ƚϵ�ʱ��ֻҪ�ַ���������ͬ��ô�������ʼ��ֻ���ڶ�����б���һ�����ڴ�ռ�����Ÿ��ַ�����
		 * 		����Ҫע����ǣ�����һ��Ҫ���׼�ʹһ��ԭ�ַ��������˸ı䣬ʵ�������ڶ���������һ���ڴ�ռ�����������ַ�����
		 * 		����ַ��������滻��ԭ(����/��ֵַ)���ù�ϵ��Ҳ�������µ�(��ֵַ)������ָ�򣬿������Ϊԭ�ӷ����ĸ��������˸ı䣬���
		 *  	��������ջ�ڴ���û�жԶ��ڴ��еĸ��ַ������κε�ַ�����ã����ַ����ڶ��ڴ���ռ�õĿռ佫�����ڱ���������(GC)
		 *  	�����ܽ᣺�ַ���������Ŀ�����������Ӧ�ó���ļ�Ҫҵ���߼���ͬʱ�����Ҫ�������ܣ��ַ�����ƴ�����޸��Ż���������Ϊ��Ҫ�ġ�
		 */
		
	}
}
