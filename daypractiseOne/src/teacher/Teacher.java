package teacher;

public  class Teacher implements ITeaching {
	private String tName;
	private String tcRoom;

	@Override
	public void openApplication() {
		if(tName.equals("Java��ʦ")){
			System.out.println("��Eclipse");
		}else{
			System.out.println("��Visual studio 2005");
		}
	
	}

	@Override
	public void teachTec() {
		System.out.println("֪ʶ�㽲��");

	}

	@Override
	public void endTalk() {
		System.out.println("�ܽ�����");

	}

	@Override
	public void introduce() {
		System.out.println(this.gettName()+"���ҽ���");
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

