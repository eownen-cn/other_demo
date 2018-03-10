package org.java.referenc;

public class Demo08 {
	public static void main(String args[]) {
		
		// 第一步，初始化所有数据
		// 创建一些家的对象
		Family f1 = new Family(1) ; // 外婆家
		Family f2 = new Family(2) ; // 自己家
		Family f3 = new Family(3) ; // 姐夫家
		Family f4 = new Family(4) ; // 幺姨家
		
		// 创建一些人员
		// 外婆家
		Person p01 = new Person(1001,"王章建") ;
		Person p02 = new Person(1002,"王华春") ;
		Person p03 = new Person(1003,"王华军") ;
		// 自己家
		Person p04 = new Person(1004,"龙清鸣") ;
		Person p05 = new Person(1005,"王章英") ;
		Person p06 = new Person(1006,"龙晗婧") ;
		Person p07 = new Person(1007,"龙永凌") ;
		// 姐夫家
		Person p08 = new Person(1008,"黄高五") ;
		Person p09 = new Person(1009,"黄高燕") ;
		Person p10 = new Person(1010,"龙晗婧") ;
		// 幺姨夫家
		Person p11 = new Person(1011,"郭伟") ;
		Person p12 = new Person(1012,"王章碧") ;
		Person p13 = new Person(1013,"郭嘉成") ;
		
		// 创建几栋楼房
		House h1 = new House(1,"北京") ;
		House h2 = new House(2,"上海") ;
		House h3 = new House(3,"广州") ;
		House h4 = new House(4,"成都") ;
		House h5 = new House(5,"深圳") ;
		House h6 = new House(6,"天津") ;
		House h7 = new House(7,"重庆") ;
		
		// 创建几个学校
		School s1 = new School(1,"北京大学") ;
		School s2 = new School(2,"清华大学") ;
		School s3 = new School(3,"四川大学") ;
		School s4 = new School(4,"西南科技大学") ;
		
		// 创建几个公司
		Company c1 = new Company(10001,"IBM") ;
		Company c2 = new Company(10002,"ORACLE") ;
		Company c3 = new Company(10003,"ALIBABA") ;
		Company c4 = new Company(10004,"TENCENT") ;
		Company c5 = new Company(10005,"GOOGLE") ;
		
		// 创建几个岗位
		Job j01 = new Job(100001,"Java高级架构师") ;
		Job j02 = new Job(100002,"Linux运维主管") ;
		Job j03 = new Job(100003,"前端项目经理") ;
		Job j04 = new Job(100004,"市场部经理") ;
		
		// 第二部，设置各自的对应关系
		
		// 设置家与人的关系
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
		
		// 设置房子与人的关系
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
		
		// 设置学校与人的关系
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
		
		// 设置公司与人的关系
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
		
		// 设置行业与人的关系
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
		
		// 设置行业与公司的关系
		c1.setJobs(new Job[]{j01,j02,j03,j04});
		c2.setJobs(new Job[]{j01,j02,j03,j04});
		c3.setJobs(new Job[]{j01,j02,j03,j04});
		c4.setJobs(new Job[]{j01,j02,j03,j04});
		c5.setJobs(new Job[]{j01,j02,j03,j04});
		
		// 第三部，测试数据
		
		// 根据任意一个人，找出其所有家人的信息
		Person[] persons = p07.getFamily().getPersons() ;
		for(int x = 0 ; x < persons.length ; x ++) {
			System.out.println(persons[x].getInfo());
		}
		// 根据任意一个人，找出其当家的人的信息
		System.out.println("当家的:\t" + p07.getFamily().getMaster().getInfo());
		// 根据学校，找出所有学生的家中当家人的名字
		Person[] persons1 = s1.getPersons() ;
		for(int x = 0 ; x < persons1.length ; x ++) {
			System.out.println("学生：" + persons1[x].getInfo());
			House[] houses = persons1[x].getHouse() ;
			for (int y = 0 ; y < houses.length ; y ++) {
				System.out.println("房子" + houses[y].getInfo());
			}
		}
		// 根据公司，找出职员家庭住址
		Person[] persons2 = c1.getPersons() ;
		for(int z = 0 ; z < persons2.length ; z ++) {
			System.out.println("公司信息：" + c1.getInfo());
			House[] houses = persons2[z].getFamily().getMaster().getHouse() ;
			for(int zz = 0 ; zz < houses.length ; zz ++) {
				System.out.println("\t职员住址：" + houses[zz].getInfo());
			}
			System.out.println();
		}
	}
}
class Person{
	private int pid ; // 成员编号
	private String pname ; // 成员姓名
	private Family family ; // 一个人属于一个家
	private House[] houses ; // 一个人可能有多个房子
	private School school ; // 一个人总有个最高学历的学校
	private Company company ; // 所在公司
	private Job job ; // 岗位|行业
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
		return "编号:" + this.pid + " | 姓名:" + this.pname;
	}
}
class Family{
	private int fid ; // 家庭编号
	private Person master ; // 当家的
	private Person[] persons ; // 家里的所有人
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
		return "编号:" + this.fid + " | 当家的:" + this.master ;
	}
}
class House{
	private int hid ;
	private String loc ; // 坐标
	private Person[] persons ; // 房子里面住的人
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
		return "房子编号:" + this.hid + " | 坐标:" + this.loc ;
	}
}
class School{
	private int sid ;
	private String name ;
	private Person[] persons ; // 学校里面的所有学生
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
		return "学校编号:" + this.sid +  " | 学校名称:" + this.name ;
	}
}
class Company{
	private int cid ;
	private String cname ; // 公司名称
	private Person[] persons ; // 公司里面的所有雇员
	private Job[] jobs ; // 公司里面的所有部门
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
		return "公司编号:" + this.cid + " | 公司名称:" + this.cname ;
	}
}
class Job{
	private int jid ;
	private String jname ; // 岗位名称
	private Person[] persons ; // 岗位下的所有雇员
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
		return "工作编号:" + this.jid + " | 岗位名称:" + this.jname ;
	}
}
