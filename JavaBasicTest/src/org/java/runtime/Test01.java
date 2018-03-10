package org.java.runtime;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime() ;
		try {
			Process p = r.exec("notepad") ;
			Thread.sleep(3000) ;
			p.destroy();
			Random rd = new Random() ;
			for(int a = 0 ; a < 10 ; a ++) {
				System.out.print(" | " + rd.nextInt(100));
			}
			int x = 10 ;
			do{
				System.out.println(new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒").format(new Date()));
				Thread.sleep(1000) ;
			}while(x -- > 0) ;
		} catch (InterruptedException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
