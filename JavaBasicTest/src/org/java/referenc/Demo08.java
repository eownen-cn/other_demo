package org.java.referenc;

public class Demo08 {
	public static void main(String args[]) {
		
		// ��һ������ʼ����������
		// ����һЩ�ҵĶ���
		Family f1 = new Family(1) ; // ���ż�
		Family f2 = new Family(2) ; // �Լ���
		Family f3 = new Family(3) ; // ����
		Family f4 = new Family(4) ; // ���̼�
		
		// ����һЩ��Ա
		// ���ż�
		Person p01 = new Person(1001,"���½�") ;
		Person p02 = new Person(1002,"������") ;
		Person p03 = new Person(1003,"������") ;
		// �Լ���
		Person p04 = new Person(1004,"������") ;
		Person p05 = new Person(1005,"����Ӣ") ;
		Person p06 = new Person(1006,"�����") ;
		Person p07 = new Person(1007,"������") ;
		// ����
		Person p08 = new Person(1008,"�Ƹ���") ;
		Person p09 = new Person(1009,"�Ƹ���") ;
		Person p10 = new Person(1010,"�����") ;
		// ���̷��
		Person p11 = new Person(1011,"��ΰ") ;
		Person p12 = new Person(1012,"���±�") ;
		Person p13 = new Person(1013,"���γ�") ;
		
		// ��������¥��
		House h1 = new House(1,"����") ;
		House h2 = new House(2,"�Ϻ�") ;
		House h3 = new House(3,"����") ;
		House h4 = new House(4,"�ɶ�") ;
		House h5 = new House(5,"����") ;
		House h6 = new House(6,"���") ;
		House h7 = new House(7,"����") ;
		
		// ��������ѧУ
		School s1 = new School(1,"������ѧ") ;
		School s2 = new School(2,"�廪��ѧ") ;
		School s3 = new School(3,"�Ĵ���ѧ") ;
		School s4 = new School(4,"���ϿƼ���ѧ") ;
		
		// ����������˾
		Company c1 = new Company(10001,"IBM") ;
		Company c2 = new Company(10002,"ORACLE") ;
		Company c3 = new Company(10003,"ALIBABA") ;
		Company c4 = new Company(10004,"TENCENT") ;
		Company c5 = new Company(10005,"GOOGLE") ;
		
		// ����������λ
		Job j01 = new Job(100001,"Java�߼��ܹ�ʦ") ;
		Job j02 = new Job(100002,"Linux��ά����") ;
		Job j03 = new Job(100003,"ǰ����Ŀ����") ;
		Job j04 = new Job(100004,"�г�������") ;
		
		// �ڶ��������ø��ԵĶ�Ӧ��ϵ
		
		// ���ü����˵Ĺ�ϵ
		f1.setMaster(p01); 
		f1.setPersons(new Person[]{p01,p02,p03});
		f2.setMaster(p04) ;
		f2.setPersons(new Person[]{p04,p05,p06,p07});
		f3.setMaster(p08);
		f3.setPersons(new Person[]{p08,p09,p10});
		f4.setMaster(p11);
		f4.setPersons(new Person[]{p11,p12,p13});
		p01.setFamily(f1);
		p02.setFamily(f1);
		p03.setFamily(f1);
		p04.setFamily(f2);
		p05.setFamily(f2);
		p06.setFamily(f2);
		p07.setFamily(f2);
		p08.setFamily(f3);
		p09.setFamily(f3);
		p10.setFamily(f3);
		p11.setFamily(f4);
		p12.setFamily(f4);
		p13.setFamily(f4);
		
		// ���÷������˵Ĺ�ϵ
		h1.setPerson(new Person[]{p11,p12,p13});
		h2.setPerson(new Person[]{p08,p09,p10});
		h3.setPerson(new Person[]{p04,p05,p06,p07});
		h4.setPerson(new Person[]{p01,p02,p03});
		p01.setHouse(new House[]{h4,h5});
		p02.setHouse(new House[]{h4});
		p03.setHouse(new House[]{h4});
		p04.setHouse(new House[]{h3});
		p05.setHouse(new House[]{h3});
		p06.setHouse(new House[]{h3,h6});
		p07.setHouse(new House[]{h3});
		p08.setHouse(new House[]{h2});
		p09.setHouse(new House[]{h2});
		p10.setHouse(new House[]{h2});
		p11.setHouse(new House[]{h1,h7});
		p12.setHouse(new House[]{h1});
		p13.setHouse(new House[]{h1});
		
		// ����ѧУ���˵Ĺ�ϵ
		s1.setPersons(new Person[]{p01,p02,p03}) ;
		s2.setPersons(new Person[]{p04,p05,p06}) ;
		s3.setPersons(new Person[]{p07,p08,p09,p10}) ;
		s4.setPersons(new Person[]{p11,p12,p13}) ;
		p01.setSchool(s1);
		p02.setSchool(s1);
		p03.setSchool(s1);
		p04.setSchool(s2);
		p05.setSchool(s2);
		p06.setSchool(s2);
		p07.setSchool(s3);
		p08.setSchool(s3);
		p09.setSchool(s3);
		p10.setSchool(s3);
		p11.setSchool(s4);
		p12.setSchool(s4);
		p13.setSchool(s4);
		
		// ���ù�˾���˵Ĺ�ϵ
		c1.setPersons(new Person[]{p01,p02,p03,p04});
		c2.setPersons(new Person[]{p05,p06,p07});
		c3.setPersons(new Person[]{p08,p09,p10});
		c4.setPersons(new Person[]{p11,p12});
		c5.setPersons(new Person[]{p13});
		p01.setCompany(c1);
		p02.setCompany(c1);
		p03.setCompany(c1);
		p04.setCompany(c1);
		p05.setCompany(c2);
		p06.setCompany(c2);
		p07.setCompany(c2);
		p08.setCompany(c3);
		p09.setCompany(c3);
		p10.setCompany(c3);
		p11.setCompany(c4);
		p12.setCompany(c4);
		p13.setCompany(c5);
		
		// ������ҵ���˵Ĺ�ϵ
		j01.setPersons(new Person[]{p01,p02,p03});
		j02.setPersons(new Person[]{p04,p05,p06});
		j03.setPersons(new Person[]{p07,p08,p09});
		j04.setPersons(new Person[]{p10,p11});
		p01.setJob(j01);
		p02.setJob(j01);
		p03.setJob(j01);
		p04.setJob(j02);
		p05.setJob(j02);
		p06.setJob(j02);
		p07.setJob(j03);
		p08.setJob(j03);
		p09.setJob(j03);
		p10.setJob(j04);
		p11.setJob(j04);
		
		// ������ҵ�빫˾�Ĺ�ϵ
		c1.setJobs(new Job[]{j01,j02,j03,j04});
		c2.setJobs(new Job[]{j01,j02,j03,j04});
		c3.setJobs(new Job[]{j01,j02,j03,j04});
		c4.setJobs(new Job[]{j01,j02,j03,j04});
		c5.setJobs(new Job[]{j01,j02,j03,j04});
		
		// ����������������
		
		// ��������һ���ˣ��ҳ������м��˵���Ϣ
		Person[] persons = p07.getFamily().getPersons() ;
		for(int x = 0 ; x < persons.length ; x ++) {
			System.out.println(persons[x].getInfo());
		}
		// ��������һ���ˣ��ҳ��䵱�ҵ��˵���Ϣ
		System.out.println("���ҵ�:\t" + p07.getFamily().getMaster().getInfo());
		// ����ѧУ���ҳ�����ѧ���ļ��е����˵�����
		Person[] persons1 = s1.getPersons() ;
		for(int x = 0 ; x < persons1.length ; x ++) {
			System.out.println("ѧ����" + persons1[x].getInfo());
			House[] houses = persons1[x].getHouse() ;
			for (int y = 0 ; y < houses.length ; y ++) {
				System.out.println("����" + houses[y].getInfo());
			}
		}
		// ���ݹ�˾���ҳ�ְԱ��ͥסַ
		Person[] persons2 = c1.getPersons() ;
		for(int z = 0 ; z < persons2.length ; z ++) {
			System.out.println("��˾��Ϣ��" + c1.getInfo());
			House[] houses = persons2[z].getFamily().getMaster().getHouse() ;
			for(int zz = 0 ; zz < houses.length ; zz ++) {
				System.out.println("\tְԱסַ��" + houses[zz].getInfo());
			}
			System.out.println();
		}
	}
}
class Person{
	private int pid ; // ��Ա���
	private String pname ; // ��Ա����
	private Family family ; // һ��������һ����
	private House[] houses ; // һ���˿����ж������
	private School school ; // һ�������и����ѧ����ѧУ
	private Company company ; // ���ڹ�˾
	private Job job ; // ��λ|��ҵ
	public Person(int pid, String pname) {
		this.pid = pid ;
		this.pname = pname ;
	}
	public void setFamily(Family family){
		this.family = family ;
	}
	public Family getFamily(){
		return this.family ;
	}
	public void setHouse(House[] houses){
		this.houses = houses ;
	}
	public House[] getHouse(){
		return this.houses ;
	}
	public void setSchool(School school){
		this.school = school ;
	}
	public School getSchool(){
		return this.school ;
	}
	public void setCompany(Company company){
		this.company = company ;
	}
	public Company getCompany(){
		return this.company ;
	}
	public void setJob(Job job){
		this.job = job ;
	}
	public Job getJob(){
		return this.job ;
	}
	public String getInfo(){
		return "���:" + this.pid + " | ����:" + this.pname;
	}
}
class Family{
	private int fid ; // ��ͥ���
	private Person master ; // ���ҵ�
	private Person[] persons ; // �����������
	public Family(int fid){
		this.fid = fid ;
	}
	public void setMaster(Person master){
		this.master = master ;
	}
	public Person getMaster(){
		return this.master ;
	}
	public void setPersons(Person[] persons){
		this.persons = persons ;
	}
	public Person[] getPersons(){
		return this.persons ;
	}
	public String getInfo(){
		return "���:" + this.fid + " | ���ҵ�:" + this.master ;
	}
}
class House{
	private int hid ;
	private String loc ; // ����
	private Person[] persons ; // ��������ס����
	public House(int hid , String loc){
		this.hid = hid ;
		this.loc = loc ;
	}
	public void setPerson(Person[] persons){
		this.persons = persons ;
	}
	public Person[] getPersons(){
		return this.persons;
	}
	public String getInfo() {
		return "���ӱ��:" + this.hid + " | ����:" + this.loc ;
	}
}
class School{
	private int sid ;
	private String name ;
	private Person[] persons ; // ѧУ���������ѧ��
	public School(int sid , String name ){
		this.sid = sid ;
		this.name = name ;
	}
	public void setPersons(Person[] persons){
		this.persons = persons ;
	}
	public Person[] getPersons(){
		return this.persons ;
	}
	public String getInfo() {
		return "ѧУ���:" + this.sid +  " | ѧУ����:" + this.name ;
	}
}
class Company{
	private int cid ;
	private String cname ; // ��˾����
	private Person[] persons ; // ��˾��������й�Ա
	private Job[] jobs ; // ��˾��������в���
	public Company(int cid , String cname){
		this.cid = cid ;
		this.cname = cname ;
	}
	public void setPersons(Person[] persons){
		this.persons = persons ;
	}
	public Person[] getPersons(){
		return this.persons ;
	}
	public void setJobs(Job[] jobs){
		this.jobs = jobs ;
	}
	public Job[] getJobs(){
		return this.jobs ;
	}
	public String getInfo() {
		return "��˾���:" + this.cid + " | ��˾����:" + this.cname ;
	}
}
class Job{
	private int jid ;
	private String jname ; // ��λ����
	private Person[] persons ; // ��λ�µ����й�Ա
	public Job(int jid,String jname){
		this.jid = jid ;
		this.jname = jname ;
	}
	public void setPersons(Person[] persons){
		this.persons = persons ;
	}
	public Person[] getPersons(){
		return this.persons ;
	}
	public String getInfo() {
		return "�������:" + this.jid + " | ��λ����:" + this.jname ;
	}
}
