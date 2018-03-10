package org.java.string;
/**
 * a-b A-Z
 * 97-122
 * 65-90
 * @author Ewonen-PC
 *
 */
public class StringDemo3 {
	public static void main(String[] args) {
		String sayHi = "hello world" ;
		byte []result1 = toUpperCase(sayHi) ;
		String result2 = new String(result1,6,5) ;
		String all = new String(result1) ;
		System.out.println(all);
		System.out.println(result2);
		
		byte []result3 = toLowerCase(all) ;
		System.out.println(new String(result3));
		theSplitClassicDemo() ;
		lianjiefu() ;
	}
	/**
	 * �ַ���ת�ɴ�д
	 * @param str
	 * @return
	 */
	public static byte[] toUpperCase(String str) {
		byte[] cs = str.getBytes();
		for ( int x = 0 ; x < cs.length ; x ++ ) {
			cs[x] -= 32 ;
		}
		return cs ;
	}

	/**
	 * �ַ���ת��Сд
	 * @param str
	 * @return
	 */
	public static byte[] toLowerCase(String str) {
		byte[] cs = str.getBytes();
		for ( int x = 0 ; x < cs.length ; x ++ ) {
			cs[x] += 32 ;
		}
		return cs ;
	}
	
	public static void theSplitClassicDemo() {
		String s = "����:18|����:20|����:30" ;
		String rs[] = s.split("\\|") ;
		for (int x = 0 ; x < rs.length ; x ++) {
			String temp [] = rs[x].split(":") ;
			System.out.println("����:" + temp[0] + ",����:" + temp[1]);
		}
	}
	
	public static void lianjiefu(){
		String stra = "hello " ;
		String strd = "hello world" ;
		
		String strb = stra + "world" ;
		System.out.println(stra == strd) ;
		strb.intern();
		System.out.println(strb == strd) ;
		
		String strc = stra.concat("world") ;
		System.out.println(stra == strd) ;
		System.out.println(strb == strc) ;
	}
	
}
