package org.denny.generic.nesting.practicality;
/**
 * ����һ����׼�ӿ�Info
 * ����ʵ���˸ýӿڵ��κ����඼��ʾһ����
 * @author Administrator
 *
 */
interface Info {
	
}

class Contact implements Info{
	private String address ;
	private String telphone ;
	private String zipcode ;
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the telphone
	 */
	public String getTelphone() {
		return telphone;
	}
	/**
	 * @param telphone the telphone to set
	 */
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}
	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Contact(String address, String telphone, String zipcode) {
		super();
		this.address = address;
		this.telphone = telphone;
		this.zipcode = zipcode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "��ϵ��ʽ:\n\t-��ַ:" + address + "\n\t-�绰:" + telphone
				+ "\n\t-��������:" + zipcode ;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
}
class Introduction implements Info{
	private String name ;
	private String sex ;
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
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Introduction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Introduction(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	public String toString(){
		return "�û�����:\n" + "\t-����:" + this.getName()
				+ "\n\t-�Ա�:" + this.getSex();
	}
}
class Person<T extends Info>{
	private T info ;

	public Person(T info) {
		this.info = info ;
	}

	/**
	 * @return the info
	 */
	public T getInfo() {
		return info;
	}

	/**
	 * @param info the info to set
	 */
	public void setInfo(T info) {
		this.info = info;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.info.toString(); 		//���ø����toString()
	}
	
}

public class PracticalityDemo1 {
	public static void main(String[] args) {
		Person<Introduction> intro = new Person<Introduction>(new Introduction("������","��")) ;
		System.err.println(intro) ;
		
		Person<Contact> per = new Person<Contact>(new Contact("�����������","01067899876","100088")) ;
		System.err.println(per) ;
	}
}
