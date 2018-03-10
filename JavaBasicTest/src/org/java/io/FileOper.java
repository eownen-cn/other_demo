package org.java.io;

import java.io.File;

public class FileOper {
	static int count = 0 ;
	public static void main(String[] args) {
		print("I:\\") ;
		System.out.println("共：" + count + "个文件！");
	}
	public static void print(String dir) {
		File f = new File(dir) ;
		String[] path = null ;
		if ( f.isDirectory() ) {
			path = f.list() ;
			if(path != null) {
				for ( int i = 0 ; i < path.length ; i ++ ) {
					if (path[i] != null) {
						print(dir + "\\" + path[i]) ;
					}
				}
			}
		} else {
			System.out.println(dir);
			count ++ ;
		}
	}
}
