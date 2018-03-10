package org.java.string;

import java.util.Date;
import java.util.Locale;

public class StringDemo4 {
	public static void main(String[] args) {
		
		String str = "Hello world !!!" ;
		
		// copyValueOf() 三个参数的
		String str1 = String.copyValueOf(str.toCharArray(),0,5) ;
		String str2 = String.copyValueOf(str.toCharArray(),5,10) ;
		System.out.println(str1 + str2);
		
		// copyValueOf() 一个参数的
		String str3 = String.copyValueOf(str.toCharArray()) ;
		System.out.println(str3);
		
		// valueOf() 测试布尔
		boolean bl = 'a' > 'b' ;
		System.out.println(bl);
		System.out.println(String.valueOf(bl).getClass().getName());
		
		// valueOf() 测试字符
		char c = 'x' ; // 120
		System.out.println(c);
		System.out.println(String.valueOf(c).getClass().getName());
		System.out.println(Integer.valueOf(c).getClass().getName());
		
		// valueOf() 测试整形
		int x = 10 ;
		System.out.println(x);
		System.out.println(String.valueOf(x).getClass().getName());
		
		// valueOf() 测试长整形
		long y = 10 ;
		System.out.println(y);
		System.out.println(String.valueOf(y).getClass().getName());
		
		// valueOf() 测试单精度浮点型
		float f = 1.1f ;
		System.out.println(f);
		System.out.println(String.valueOf(f).getClass().getName());
		
		// valueOf() 测试双精度浮点型
		double d = 1.1 ;
		System.out.println(d);
		System.out.println(String.valueOf(d).getClass().getName());
		
		String stra = "hello" ;
		String strb = "world" ;
		String strc = stra + strb ;
		String strd = stra.concat(strb).intern() ;
		System.out.println(strc== strd); 
		System.out.println(strc.intern() == (stra.concat(strb)));
		System.out.println(strc.intern() == strd.intern());
		
		String test1 = "今天是阳历  ==> %tD %tT" ;
		Date date1 = new Date() ;
		String r1 = String.format(test1,date1,date1)  ;
		System.out.println(r1);

		String r2 = String.format("本地月份简称：%tb%n",date1) ;
		System.out.println(r2);
		String r3 = String.format("本地月份全称：%tB%n",date1) ;
		System.out.println(r3);
		
		// 英文月份简称
		System.out.println(String.format(Locale.US,"英文月份简称：%tb%n",date1));
		// 英文月份全称
		System.out.println(String.format(Locale.US, "英文月份全称:%tB%n" , date1));

		// 英文星期简称
		System.out.println(String.format(Locale.US, "英文星期简称:%ta%n",date1));
		// 英文星期全称
		System.out.println(String.format(Locale.US, "英文星期全称:%tA%n",date1));
		// 本地星期简称
		System.out.printf(String.format("本地星期简称:%tA", date1));
		// 年的后两位数字
		System.out.println(String.format("年的后两位数字:%ty", date1));
		// 一年中的天数
		System.out.println(String.format("一年中的天数:%tj", date1));
		// 两位数字的月份
		System.out.println(String.format("两位数字的月份:%tm", date1));
		// 两位数字的日
		System.out.println(String.format("两位数字的日:%td", date1));
		// 月份的日
		System.out.println(String.format("月份的日:%te", date1));
		
		
		
		
		
		
		
		
		
		
	}
}
