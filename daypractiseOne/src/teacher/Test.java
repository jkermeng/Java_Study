package teacher;

import teacher.Teacher.watcher;

public class Test {
	public static void main(String[] args) {
		ITeaching it = new Teacher("Java��ʦ","Java����");
		it.openApplication();
		it.teachTec();
		it.endTalk();
		it.introduce();
		watcher watcher = new Teacher().new watcher();
		watcher.judge();
		System.out.println("-+-+--+-++-+-+-");
		ITeaching nit = new Teacher(".NET��ʦ",".NET����");
		nit.openApplication();
		nit.teachTec();
		nit.endTalk();
		nit.introduce();
	}
}
