package org.java.nio;

import java.nio.IntBuffer;

public class Test01 {
	public static void main(String[] args) {
		/*IntBuffer buf = IntBuffer.allocate(10);	// 开辟10个大小的缓冲区
		System.out.print("1、写入数据之前的position、limit和capacity：") ;
		System.out.println("position = " + buf.position() + "，limit = "
				+ buf.limit() + "，capacity = " + buf.capacity());
		int temp[] = { 5, 7, 9 };			// 定义整型数组
		buf.put(3);				// 向缓冲区写入数据
		buf.put(temp);				// 向缓冲区写入一组数据
		System.out.print("2、写入数据之后的position、limit和capacity：") ;
		System.out.println("position = " + buf.position() + "，limit = "
				+ buf.limit() + "，capacity = " + buf.capacity());
		buf.flip();				// 重设缓冲区
		System.out.print("3、准备输出数据时的position、limit和capacity：") ;
		System.out.println("position = " + buf.position() + "，limit = "
				+ buf.limit() + "，capacity = " + buf.capacity());
		System.out.print("缓冲区中的内容：") ;
		while (buf.hasRemaining()) {			// 只要缓冲区有内容则输出
			int x = buf.get();			// 取出当前内容
			System.out.print(x + "、");		// 输出内容
		}				
		buf.reset() ; // 重设缓冲区之后
		System.out.print("2、写入数据之后的position、limit和capacity：") ;
		System.out.println("position = " + buf.position() + "，limit = "
				+ buf.limit() + "，capacity = " + buf.capacity());*/
//		buf.flip();	
		test1() ;
	}
	
	public static void test1() {
		IntBuffer buf = IntBuffer.allocate(10);	// 开辟10个大小的缓冲区
		IntBuffer sub = null ;		// 定义缓冲区对象
		for (int i = 0; i < 10; i++) {
			buf.put(2 * i + 1);		// 加入10个奇数
		}
		buf.position(2) ;			// 主缓冲区指针设置在第3个元素
		buf.limit(6) ;			// 主缓冲区limit为6
		while (buf.hasRemaining()) {
			System.out.print( buf.get() + "、");
		}
		sub = buf.slice() ;			// 开辟子缓冲区
		for (int i = 0; i < sub.capacity(); i++) {
			int temp = sub.get(i) ;	// 根据下标取得元素
			sub.put(temp - 1);		// 修改子缓冲区内容
		}
		buf.flip() ; 			// 重设缓冲区
//		System.out.println("limit:" + buf.limit());
//		System.out.println("position:" + buf.position());
		buf.limit(buf.capacity()) ;		// 设置limit
		buf.position(4) ;
		System.out.print("主缓冲区中的内容：") ;
		while (buf.hasRemaining()) {		// 只要缓冲区有内容则输出
			int x = buf.get();		// 取出当前内容
			System.out.print(x + "、");	// 输出内容
		}

	}

}
