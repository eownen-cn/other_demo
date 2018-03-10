package org.java.string;

public class StringDemo2 {
	public static void main(String[] args) {
		// 字符串常量是一个已经实例化后匿名对象，即：一个字符串常量可以直接使用String类中的所有可用方法
		
		String myString = "azAZhello world !!!" ;
		System.out.println("字符串长度 ==>" + myString.length());
		
		/**
		 * 找到字符串中索引为6的字符
		 */
		handler(myString,"charAt",6,"使用charAt()找到字符串中索引为6的字符") ;
		
		/**
		 * 字符串转字符数组
		 */
		handler(myString,"toCharArray",null,"使用toCharArray()字符串转字符数组") ;
		
		/**
		 * 返回所在字符串中索引位子的Unicode码
		 */
		handler(myString,"codePointAt",8,"使用codePointAt()查找字符串中索引为7的字符的Unicode编码") ; // o的Unicode编码是111

		/**
		 * 返回字符串中索引为参数减一的字符的Unicode编码
		 */
		handler(myString,"codePointBefore",9,"使用codePointBefore()查找字符串中索引为9的前一个字符的Unicode编码") ; // o的Unicode编码是111

		/**
		 * 返回字符串中指定的索引范围的字符长度
		 * codePointCount长度计算的方式为：包含第一个参数，不包含第二个参数，其两个参数之间的字符个数
		 */
		handler(myString,"codePointCount",0,19,"使用codePointCount()返回字符串中指定的索引范围的字符长度") ; // o的Unicode编码是111

		/**
		 * 通过构造函数，截取一个字符串的某一段
		 * String(char[] chars,startIndex,subCount)
		 * chars 字符数组
		 * startIndex 开始索引
		 * subCount 截取的个数
		 */
		handler(myString,"new String",4,15,"通过构造函数，截取字符数组中的某一段作为一个字符串返回") ; 

		String math = "1122a33" ;
		if( isNumber(math) ) {
			System.out.println("是由数字组成！");
		} else {
			System.out.println("是由非数字组成！");
		}
		
		/**
		 * 按位比较字符串与参数字符串之间的字符Unicode编码的大小
		 * src.compareTo(tar)
		 * src 原子符串
		 * tar 目标字符串
		 */
		handler("a","compareTo","A","按位比较字符串与参数字符串之间的字符Unicode编码的大小") ; 
		
		/**
		 * 使用contains()方法查询字符串中是否包含指定目标内容
		 * src.compareTo(tar)
		 * src 原子符串
		 * tar 目标字符串
		 */
		handler("hello world","contains","w","使用contains()方法,查询字符串中是否包含指定目标内容") ; 
		handler("hello world","contains","x","使用contains()方法,查询字符串中是否包含指定目标内容") ; 

		/**
		 * 使用indexOf()方法查询字符串中是否包含指定目标内容
		 * src.indexOf(tar)
		 * src 原子符串
		 * tar 目标字符串
		 */
		handler("hello world","indexOf","w","使用indexOf()方法,查询字符串中是否包含指定目标内容") ; 
		handler("hello world","indexOf","x","使用indexOf()方法,查询字符串中是否包含指定目标内容") ; 

		/**
		 * 使用lastIndexOf()方法查询字符串中是否包含指定目标内容
		 * src.lastIndexOf(tar)
		 * src 原子符串
		 * tar 目标字符串
		 */
		handler("hello world","lastIndexOf","w","使用lastIndexOf()方法,查询字符串中是否包含指定目标内容") ; 
		handler("hello world","lastIndexOf","x","使用lastIndexOf()方法,查询字符串中是否包含指定目标内容") ; 

		/**
		 * 使用startsWith(preffix)方法查询字符串中是否以目标内容开头
		 * src.startsWith(preffix)
		 * src 原子符串
		 * preffix 目标字符串
		 */
		handler("hello world","startsWith","hello","使用startsWith(preffix)方法查询字符串中是否以目标内容开头") ; 
		handler("hello world","startsWith","world","使用startsWith(preffix)方法查询字符串中是否以目标内容开头") ; 

		/**
		 * 使用endsWith(suffix)方法查询字符串中是否以目标内容结尾
		 * src.endsWith(suffix)
		 * src 原子符串
		 * preffix 目标字符串
		 */
		handler("hello world","endsWith","hello","使用endsWith(suffix)方法查询字符串中是否以目标内容结尾") ; 
		handler("hello world","endsWith","world","使用endsWith(suffix)方法查询字符串中是否以目标内容结尾") ; 
		
		/**
		 * 使用isEmpty()方法判断一个字符串是否为空字符串（即src.length()为0）
		 * src.isEmpty()
		 * src 原子符串
		 */
		handler("hello world","isEmpty","hello","使用isEmpty()方法判断一个字符串是否为空字符串") ; 
		handler("","isEmpty","world","使用isEmpty()方法判断一个字符串是否为空字符串") ; 
		
		/**
		 * 使用substring()方法从字符串中截取若干个相邻的字符作为新的字符串返回,必须至少有一个参数
		 * 有一个参数：这个参数表示从该下标往后截取所有
		 * 有两个参数：第一个表示截取的起始位置，第二个表示截取的结束位置
		 */
		handler("hello world","substring",0,5,"使用substring()方法截取一个连续的字串") ; 
		handler("hello world","substring",6,"使用substring()方法截取一个连续的字串") ; 

		/**
		 * 使用replace()方法，根据指定目标字符串，替换正则字符串所匹配到原子符串中的字符
		 * 第一个参数：正则表达式
		 * 第二个参数：新的字符串
		 */
		handler("hello world","replaceAll","l","i","使用replaceAll()替换匹配到原子符串中的所有匹配项") ; 
		handler("hello world","replaceFirst","l","i","使用replaceFirst()替换匹配到原子符串中的首个匹配项") ; 
		
		/**
		 * 使用split(param1)根据param1拆分原字符串
		 * 有一个参数：正则表达式(这里将表达式字符串仅用于分隔符)
		 * 有两个参数：第一个参数还是正则表达式，第二个参数表示拆分后的个数限制
		 */
		handler("hello world nihao eownen","split"," ","使用split(param1)根据param1拆分原字符串，不做拆分限制") ; 
		handler("hello world nihao eownen","split"," ",2,"使用split(param1，param2)根据param1拆分原字符串，但拆分后的个数限制在2") ; 
	}
	/**
	 * param1 : 原始字符串
	 * param2 : 对原始字符串操作的方法
	 * param3 : 对原始字符串操作方法的参数列表,类型为：Object[]
	 * param4 : 描述该方法的作用
	 * @param objs
	 */
	public static void handler (Object ... objs) {
		char result ;
		String src = (String) objs[0] ; // 原始字符串对象
		String methodName = (String) objs[1] ; // 方法名
		int len = objs.length-3 ;
		Object parameters[] = new Object[len] ;
		for (int a = 0 ; a < len ; a ++) {
			parameters[a] = objs[a+2] ;
		}
		String desc = (String) objs[len+2] ; // 方法描述
		if (null != objs[1]) { // 如果有参
			if ( methodName == "charAt" ) {
				result = src.charAt((int)parameters[0]) ;
				printSeparator(desc) ;
				System.out.println(result) ;
			} else if ( methodName == "toCharArray" ) {
				char strs[] = src.toCharArray() ;
				printSeparator(desc) ;
				for(int a = 0 ; a < strs.length ; a ++) {
					System.out.print(strs[a] + " ");
				}
			} else if ( methodName == "codePointAt" ) {
				int c = src.codePointAt((int)parameters[0]) ;
				printSeparator(desc);
				System.out.println(c);
			} else if ( methodName == "codePointBefore" ) {
				int c = src.codePointBefore((int)parameters[0]) ;
				printSeparator(desc);
				System.out.println(c);
			} else if ( methodName == "codePointCount" ) {
				int c = src.codePointCount((int)parameters[0],(int)parameters[1]) ;
				printSeparator(desc);
				System.out.println(c);
			} else if ( methodName == "new String" ) {
				String c = new String(src.toCharArray(),(int)parameters[0],(int)parameters[1]) ;
				printSeparator(desc);
				System.out.println(c);
			} else if ( methodName == "compareTo" ) {
				int c = src.compareTo((String) parameters[0]) ;
				printSeparator(desc);
				if ( c > 0 ) {
					System.out.println("比较结果值：" + c + src + "大于" + parameters[0]);
				} else if (c == 0) {
					System.out.println("比较结果值：" + c + src + "等于" + parameters[0]);
				} else {
					System.out.println("比较结果值：" + c + src + "小于" + parameters[0]);
				}
			} else if ( methodName == "contains" ) {
				String tar = (String) parameters[0] ;
				boolean c = src.contains(tar) ;
				printSeparator(desc);
				System.out.println(src + "中" + (!c ? "不包含 " : "包含") + tar );
			} else if ( methodName == "indexOf" ) {
				String tar = (String) parameters[0] ;
				boolean c = src.indexOf(tar) != -1 ;
				printSeparator(desc);
				System.out.println(src + "中" + (!c ? "不包含 " : "包含") + tar );
			} else if ( methodName == "lastIndexOf" ) {
				String tar = (String) parameters[0] ;
				boolean c = src.lastIndexOf(tar) != -1 ;
				printSeparator(desc);
				System.out.println(src + "中" + (!c ? "不包含 " : "包含") + tar );
			} else if ( methodName == "startsWith" ) {
				String tar = (String) parameters[0] ;
				boolean c = src.startsWith(tar);
				printSeparator(desc);
				System.out.println(src + (!c ? "不是" : "是") + "以" + tar + "开头" );
			} else if ( methodName == "endsWith" ) {
				String tar = (String) parameters[0] ;
				boolean c = src.endsWith(tar);
				printSeparator(desc);
				System.out.println(src + (!c ? "不是" : "是") + "以" + tar + "结尾" );
			} else if ( methodName == "isEmpty" ) {
				boolean c = src.isEmpty();
				printSeparator(desc);
				System.out.println("字符串\"" + src + "\"" + (!c ? "不是" : "是") + "空的" );
			} else if ( methodName == "substring" ) {
				String c = "" ;
				if (parameters.length < 2) {
					c = src.substring((int)parameters[0]);
				} else {
					c = src.substring((int)parameters[0],(int)parameters[1]);
				}
				printSeparator(desc);
				System.out.println("从字符串\"" + src + "\"中截取的内容为:" + c );
			} else if ( methodName.indexOf("replace") != -1 ) {
				String c = "" ;
				if (parameters.length < 2) {
					return ;
				} else {
					if ( methodName == "replaceAll" ) {
						c = src.replaceAll((String)parameters[0],(String)parameters[1]);
						printSeparator(desc);
						System.out.println("字符串\"" + src + "\"被替换后是:" + c );
					} else if ( methodName == "replaceFirst" ) {
						c = src.replaceFirst((String)parameters[0],(String)parameters[1]);
						printSeparator(desc);
						System.out.println("字符串\"" + src + "\"被替换后是:" + c );
					}
				}
			} else if ( methodName == "split" ) {
				String c[] = null ;
				if( parameters.length < 2 ) {
					c = src.split((String)parameters[0]) ;
					printSeparator(desc);
					System.out.println("字符串\"" + src + "\"被拆分后:");
					for ( int a = 0 ; a < c.length ; a++ ) {
						System.out.println(c[a]);
					}
				} else {
					c = src.split((String)parameters[0],(int)parameters[1]) ;
					printSeparator(desc);
					System.out.println("字符串\"" + src + "\"被拆分后:");
					for ( int a = 0 ; a < c.length ; a++ ) {
						System.out.println(c[a]);
					}
				}
			}
		} else {
			System.out.println("貌似什么操作也没有~~~~~~~~~~~");
		}
	}
	/**
	 * 打印一个换行
	 * @param desc
	 */
	public static void printSeparator(String desc) {
		System.out.print("\n" + desc + " : ");
	}
	
	/**
	 * 判断一个字符串是否由数字组成
	 * @param str
	 * @return
	 */
	public static boolean isNumber(String str) {
		if ( null == str ) {
			return false;
		} else {
			char c [] = str.toCharArray() ;
			for( int x = 0 ; x < c.length ; x ++ ) {
				if(c[x] < '0' || c[x] > '9') {
					return false ;
				}
			}
			return true ;
		}
	}
	
	
	
}
