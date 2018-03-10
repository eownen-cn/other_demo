package org.denny.poacai;

import java.util.Date;

/**
 * �ӿںͳ������ʵ����
 * @author Administrator
 *
 */

/**
 * �豸��Ҫ�Ľӿ�
 * @author Administrator
 *
 */
interface USB{
	void start() ;
	void stop() ;
}
/**
 * �豸�ĳ�����
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
	protected String name ;				// �豸����
	protected String manufacturer ; 	// ������
	protected Date date ; 				// ��������
	abstract void printInfo() ; 		// ����豸��Ϣ
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
 * ɨ����
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
		System.err.println("ɨ����" + super.getName() + "��ʼ����������");
	}

	public void stop() {
		System.err.println("ɨ����" + super.getName() + "ֹͣ����������");
	}

	@Override
	void printInfo() {
		System.err.println("�豸����:" + super.getName());
		System.err.println("������:" + super.getManufacturer());
		System.err.println("��������:" + super.getDate());
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
		System.err.println("��ӡ��" + super.getName() + "��ʼ����������");
	}
	
	public void stop() {
		System.err.println("��ӡ��" + super.getName() + "ֹͣ����������");
	}
	
	@Override
	void printInfo() {
		System.err.println("�豸����:" + super.getName());
		System.err.println("������:" + super.getManufacturer());
		System.err.println("��������:" + super.getDate());
	}
	
}


public class ProcticallityOfAbstractClassAndInterfaces {
	public static void main(String[] args) {
		Device device1 = new Scanner("HP-M1136","���չ�˾",new Date()) ;
		if(device1 instanceof Scanner){
			Scanner scan = (Scanner) device1 ;
			scan.printInfo();
			scan.start();
			scan.stop();
		}
		System.out.println("===================================================");
		Device device2 = new Printer("AK-47","���蹫˾",new Date()) ;
		if(device2 instanceof Printer){
			Printer printer = (Printer) device2 ;
			printer.printInfo();
			printer.start();
			printer.stop();
		}
	}
}
