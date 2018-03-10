package org.java.string;

public class StringDemo2 {
	public static void main(String[] args) {
		// �ַ���������һ���Ѿ�ʵ�������������󣬼���һ���ַ�����������ֱ��ʹ��String���е����п��÷���
		
		String myString = "azAZhello world !!!" ;
		System.out.println("�ַ������� ==>" + myString.length());
		
		/**
		 * �ҵ��ַ���������Ϊ6���ַ�
		 */
		handler(myString,"charAt",6,"ʹ��charAt()�ҵ��ַ���������Ϊ6���ַ�") ;
		
		/**
		 * �ַ���ת�ַ�����
		 */
		handler(myString,"toCharArray",null,"ʹ��toCharArray()�ַ���ת�ַ�����") ;
		
		/**
		 * ���������ַ���������λ�ӵ�Unicode��
		 */
		handler(myString,"codePointAt",8,"ʹ��codePointAt()�����ַ���������Ϊ7���ַ���Unicode����") ; // o��Unicode������111

		/**
		 * �����ַ���������Ϊ������һ���ַ���Unicode����
		 */
		handler(myString,"codePointBefore",9,"ʹ��codePointBefore()�����ַ���������Ϊ9��ǰһ���ַ���Unicode����") ; // o��Unicode������111

		/**
		 * �����ַ�����ָ����������Χ���ַ�����
		 * codePointCount���ȼ���ķ�ʽΪ��������һ���������������ڶ�������������������֮����ַ�����
		 */
		handler(myString,"codePointCount",0,19,"ʹ��codePointCount()�����ַ�����ָ����������Χ���ַ�����") ; // o��Unicode������111

		/**
		 * ͨ�����캯������ȡһ���ַ�����ĳһ��
		 * String(char[] chars,startIndex,subCount)
		 * chars �ַ�����
		 * startIndex ��ʼ����
		 * subCount ��ȡ�ĸ���
		 */
		handler(myString,"new String",4,15,"ͨ�����캯������ȡ�ַ������е�ĳһ����Ϊһ���ַ�������") ; 

		String math = "1122a33" ;
		if( isNumber(math) ) {
			System.out.println("����������ɣ�");
		} else {
			System.out.println("���ɷ�������ɣ�");
		}
		
		/**
		 * ��λ�Ƚ��ַ���������ַ���֮����ַ�Unicode����Ĵ�С
		 * src.compareTo(tar)
		 * src ԭ�ӷ���
		 * tar Ŀ���ַ���
		 */
		handler("a","compareTo","A","��λ�Ƚ��ַ���������ַ���֮����ַ�Unicode����Ĵ�С") ; 
		
		/**
		 * ʹ��contains()������ѯ�ַ������Ƿ����ָ��Ŀ������
		 * src.compareTo(tar)
		 * src ԭ�ӷ���
		 * tar Ŀ���ַ���
		 */
		handler("hello world","contains","w","ʹ��contains()����,��ѯ�ַ������Ƿ����ָ��Ŀ������") ; 
		handler("hello world","contains","x","ʹ��contains()����,��ѯ�ַ������Ƿ����ָ��Ŀ������") ; 

		/**
		 * ʹ��indexOf()������ѯ�ַ������Ƿ����ָ��Ŀ������
		 * src.indexOf(tar)
		 * src ԭ�ӷ���
		 * tar Ŀ���ַ���
		 */
		handler("hello world","indexOf","w","ʹ��indexOf()����,��ѯ�ַ������Ƿ����ָ��Ŀ������") ; 
		handler("hello world","indexOf","x","ʹ��indexOf()����,��ѯ�ַ������Ƿ����ָ��Ŀ������") ; 

		/**
		 * ʹ��lastIndexOf()������ѯ�ַ������Ƿ����ָ��Ŀ������
		 * src.lastIndexOf(tar)
		 * src ԭ�ӷ���
		 * tar Ŀ���ַ���
		 */
		handler("hello world","lastIndexOf","w","ʹ��lastIndexOf()����,��ѯ�ַ������Ƿ����ָ��Ŀ������") ; 
		handler("hello world","lastIndexOf","x","ʹ��lastIndexOf()����,��ѯ�ַ������Ƿ����ָ��Ŀ������") ; 

		/**
		 * ʹ��startsWith(preffix)������ѯ�ַ������Ƿ���Ŀ�����ݿ�ͷ
		 * src.startsWith(preffix)
		 * src ԭ�ӷ���
		 * preffix Ŀ���ַ���
		 */
		handler("hello world","startsWith","hello","ʹ��startsWith(preffix)������ѯ�ַ������Ƿ���Ŀ�����ݿ�ͷ") ; 
		handler("hello world","startsWith","world","ʹ��startsWith(preffix)������ѯ�ַ������Ƿ���Ŀ�����ݿ�ͷ") ; 

		/**
		 * ʹ��endsWith(suffix)������ѯ�ַ������Ƿ���Ŀ�����ݽ�β
		 * src.endsWith(suffix)
		 * src ԭ�ӷ���
		 * preffix Ŀ���ַ���
		 */
		handler("hello world","endsWith","hello","ʹ��endsWith(suffix)������ѯ�ַ������Ƿ���Ŀ�����ݽ�β") ; 
		handler("hello world","endsWith","world","ʹ��endsWith(suffix)������ѯ�ַ������Ƿ���Ŀ�����ݽ�β") ; 
		
		/**
		 * ʹ��isEmpty()�����ж�һ���ַ����Ƿ�Ϊ���ַ�������src.length()Ϊ0��
		 * src.isEmpty()
		 * src ԭ�ӷ���
		 */
		handler("hello world","isEmpty","hello","ʹ��isEmpty()�����ж�һ���ַ����Ƿ�Ϊ���ַ���") ; 
		handler("","isEmpty","world","ʹ��isEmpty()�����ж�һ���ַ����Ƿ�Ϊ���ַ���") ; 
		
		/**
		 * ʹ��substring()�������ַ����н�ȡ���ɸ����ڵ��ַ���Ϊ�µ��ַ�������,����������һ������
		 * ��һ�����������������ʾ�Ӹ��±������ȡ����
		 * ��������������һ����ʾ��ȡ����ʼλ�ã��ڶ�����ʾ��ȡ�Ľ���λ��
		 */
		handler("hello world","substring",0,5,"ʹ��substring()������ȡһ���������ִ�") ; 
		handler("hello world","substring",6,"ʹ��substring()������ȡһ���������ִ�") ; 

		/**
		 * ʹ��replace()����������ָ��Ŀ���ַ������滻�����ַ�����ƥ�䵽ԭ�ӷ����е��ַ�
		 * ��һ��������������ʽ
		 * �ڶ����������µ��ַ���
		 */
		handler("hello world","replaceAll","l","i","ʹ��replaceAll()�滻ƥ�䵽ԭ�ӷ����е�����ƥ����") ; 
		handler("hello world","replaceFirst","l","i","ʹ��replaceFirst()�滻ƥ�䵽ԭ�ӷ����е��׸�ƥ����") ; 
		
		/**
		 * ʹ��split(param1)����param1���ԭ�ַ���
		 * ��һ��������������ʽ(���ｫ���ʽ�ַ��������ڷָ���)
		 * ��������������һ����������������ʽ���ڶ���������ʾ��ֺ�ĸ�������
		 */
		handler("hello world nihao eownen","split"," ","ʹ��split(param1)����param1���ԭ�ַ����������������") ; 
		handler("hello world nihao eownen","split"," ",2,"ʹ��split(param1��param2)����param1���ԭ�ַ���������ֺ�ĸ���������2") ; 
	}
	/**
	 * param1 : ԭʼ�ַ���
	 * param2 : ��ԭʼ�ַ��������ķ���
	 * param3 : ��ԭʼ�ַ������������Ĳ����б�,����Ϊ��Object[]
	 * param4 : �����÷���������
	 * @param objs
	 */
	public static void handler (Object ... objs) {
		char result ;
		String src = (String) objs[0] ; // ԭʼ�ַ�������
		String methodName = (String) objs[1] ; // ������
		int len = objs.length-3 ;
		Object parameters[] = new Object[len] ;
		for (int a = 0 ; a < len ; a ++) {
			parameters[a] = objs[a+2] ;
		}
		String desc = (String) objs[len+2] ; // ��������
		if (null != objs[1]) { // ����в�
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
					System.out.println("�ȽϽ��ֵ��" + c + src + "����" + parameters[0]);
				} else if (c == 0) {
					System.out.println("�ȽϽ��ֵ��" + c + src + "����" + parameters[0]);
				} else {
					System.out.println("�ȽϽ��ֵ��" + c + src + "С��" + parameters[0]);
				}
			} else if ( methodName == "contains" ) {
				String tar = (String) parameters[0] ;
				boolean c = src.contains(tar) ;
				printSeparator(desc);
				System.out.println(src + "��" + (!c ? "������ " : "����") + tar );
			} else if ( methodName == "indexOf" ) {
				String tar = (String) parameters[0] ;
				boolean c = src.indexOf(tar) != -1 ;
				printSeparator(desc);
				System.out.println(src + "��" + (!c ? "������ " : "����") + tar );
			} else if ( methodName == "lastIndexOf" ) {
				String tar = (String) parameters[0] ;
				boolean c = src.lastIndexOf(tar) != -1 ;
				printSeparator(desc);
				System.out.println(src + "��" + (!c ? "������ " : "����") + tar );
			} else if ( methodName == "startsWith" ) {
				String tar = (String) parameters[0] ;
				boolean c = src.startsWith(tar);
				printSeparator(desc);
				System.out.println(src + (!c ? "����" : "��") + "��" + tar + "��ͷ" );
			} else if ( methodName == "endsWith" ) {
				String tar = (String) parameters[0] ;
				boolean c = src.endsWith(tar);
				printSeparator(desc);
				System.out.println(src + (!c ? "����" : "��") + "��" + tar + "��β" );
			} else if ( methodName == "isEmpty" ) {
				boolean c = src.isEmpty();
				printSeparator(desc);
				System.out.println("�ַ���\"" + src + "\"" + (!c ? "����" : "��") + "�յ�" );
			} else if ( methodName == "substring" ) {
				String c = "" ;
				if (parameters.length < 2) {
					c = src.substring((int)parameters[0]);
				} else {
					c = src.substring((int)parameters[0],(int)parameters[1]);
				}
				printSeparator(desc);
				System.out.println("���ַ���\"" + src + "\"�н�ȡ������Ϊ:" + c );
			} else if ( methodName.indexOf("replace") != -1 ) {
				String c = "" ;
				if (parameters.length < 2) {
					return ;
				} else {
					if ( methodName == "replaceAll" ) {
						c = src.replaceAll((String)parameters[0],(String)parameters[1]);
						printSeparator(desc);
						System.out.println("�ַ���\"" + src + "\"���滻����:" + c );
					} else if ( methodName == "replaceFirst" ) {
						c = src.replaceFirst((String)parameters[0],(String)parameters[1]);
						printSeparator(desc);
						System.out.println("�ַ���\"" + src + "\"���滻����:" + c );
					}
				}
			} else if ( methodName == "split" ) {
				String c[] = null ;
				if( parameters.length < 2 ) {
					c = src.split((String)parameters[0]) ;
					printSeparator(desc);
					System.out.println("�ַ���\"" + src + "\"����ֺ�:");
					for ( int a = 0 ; a < c.length ; a++ ) {
						System.out.println(c[a]);
					}
				} else {
					c = src.split((String)parameters[0],(int)parameters[1]) ;
					printSeparator(desc);
					System.out.println("�ַ���\"" + src + "\"����ֺ�:");
					for ( int a = 0 ; a < c.length ; a++ ) {
						System.out.println(c[a]);
					}
				}
			}
		} else {
			System.out.println("ò��ʲô����Ҳû��~~~~~~~~~~~");
		}
	}
	/**
	 * ��ӡһ������
	 * @param desc
	 */
	public static void printSeparator(String desc) {
		System.out.print("\n" + desc + " : ");
	}
	
	/**
	 * �ж�һ���ַ����Ƿ����������
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
