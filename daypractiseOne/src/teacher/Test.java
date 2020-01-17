package teacher;

import teacher.Teacher.watcher;

public class Test {
	public static void main(String[] args) {
		ITeaching it = new Teacher("Java教师","Java教室");
		it.openApplication();
		it.teachTec();
		it.endTalk();
		it.introduce();
		watcher watcher = new Teacher().new watcher();
		watcher.judge();
		System.out.println("-+-+--+-++-+-+-");
		ITeaching nit = new Teacher(".NET教师",".NET教室");
		nit.openApplication();
		nit.teachTec();
		nit.endTalk();
		nit.introduce();
	}
}
