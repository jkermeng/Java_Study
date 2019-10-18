public class employee
{
	String name;
	 int age;
	 int moneny;
	 String work;

	public employee(String name){
	this.name = name;}

	public void print(int age , int moneny,String work){
	System.out.println("姓名:" + name + "，年龄：" + age + "，薪水：" + moneny + "，工作：" + work );
	}
}