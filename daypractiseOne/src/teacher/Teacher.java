package teacher;

public  class Teacher implements ITeaching {
	private String tName;
	private String tcRoom;

	@Override
	public void openApplication() {
		if(tName.equals("Java教师")){
			System.out.println("打开Eclipse");
		}else{
			System.out.println("打开Visual studio 2005");
		}
	
	}

	@Override
	public void teachTec() {
		System.out.println("知识点讲解");

	}

	@Override
	public void endTalk() {
		System.out.println("总结提问");

	}

	@Override
	public void introduce() {
		System.out.println(this.gettName()+"自我介绍");
	}

	public String gettName() {
		return tName;
	}

	public String getTcRoom() {
		return tcRoom;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public void setTcRoom(String tcRoom) {
		this.tcRoom = tcRoom;
	}

	public Teacher(String tName, String tcRoom) {
		super();
		this.tName = tName;
		this.tcRoom = tcRoom;
	}

	public Teacher() {
		super();
	}
  class watcher {
		
		public void judge(){
			System.out.println("sss");
			System.out.println("good");

		}
	}
}

