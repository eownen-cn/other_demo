package org.denny.poacai;

import java.util.Date;

/**
 * 接口和抽象类的实用性
 * @author Administrator
 *
 */

/**
 * 设备需要的接口
 * @author Administrator
 *
 */
interface USB{
	void start() ;
	void stop() ;
}
/**
 * 设备的抽象类
 * @author Administrator
 *
 */
abstract class Device{
	public Device(){}
	public Device(String name,String manufacturer,Date date){
		this.setName(name);
		this.setManufacturer(manufacturer);
		this.setDate(date);
	}
	protected String name ;				// 设备名称
	protected String manufacturer ; 	// 生产商
	protected Date date ; 				// 生成日期
	abstract void printInfo() ; 		// 输出设备信息
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
}
/**
 * 扫描仪
 * @author Administrator
 *
 */
class Scanner extends Device implements USB {
	public Scanner(){}
	
	public Scanner(String name, String manufacturer, Date date) {
		this.setName(name);
		this.setManufacturer(manufacturer);
		this.setDate(date);
	}

	public void start() {
		System.err.println("扫描仪" + super.getName() + "开始工作。。。");
	}

	public void stop() {
		System.err.println("扫描仪" + super.getName() + "停止工作。。。");
	}

	@Override
	void printInfo() {
		System.err.println("设备名称:" + super.getName());
		System.err.println("生产商:" + super.getManufacturer());
		System.err.println("生产日期:" + super.getDate());
	}
	
}
class Printer extends Device implements USB {
	public Printer(){}
	
	public Printer(String name, String manufacturer, Date date) {
		this.setName(name);
		this.setManufacturer(manufacturer);
		this.setDate(date);
	}
	
	public void start() {
		System.err.println("打印机" + super.getName() + "开始工作。。。");
	}
	
	public void stop() {
		System.err.println("打印机" + super.getName() + "停止工作。。。");
	}
	
	@Override
	void printInfo() {
		System.err.println("设备名称:" + super.getName());
		System.err.println("生产商:" + super.getManufacturer());
		System.err.println("生产日期:" + super.getDate());
	}
	
}


public class ProcticallityOfAbstractClassAndInterfaces {
	public static void main(String[] args) {
		Device device1 = new Scanner("HP-M1136","惠普公司",new Date()) ;
		if(device1 instanceof Scanner){
			Scanner scan = (Scanner) device1 ;
			scan.printInfo();
			scan.start();
			scan.stop();
		}
		System.out.println("===================================================");
		Device device2 = new Printer("AK-47","永凌公司",new Date()) ;
		if(device2 instanceof Printer){
			Printer printer = (Printer) device2 ;
			printer.printInfo();
			printer.start();
			printer.stop();
		}
	}
}
