package lang_p;

class SingleRestRoom{
	
	String name;
	
	static private SingleRestRoom me;
	
	private SingleRestRoom() {
		System.out.println("화장실 생성");
	}
	
	static SingleRestRoom getInstance() {
		
		if(me==null)
			me = new SingleRestRoom();
		
		return me;
		
	}
	
}

class SingleVisitor{
	
	SingleRestRoom srr = SingleRestRoom.getInstance();
	
	String name;
	
	public SingleVisitor(String name) {
		
		this.name = name;
	}
	
	void goRestRoom() {
		
		System.out.println(name+" 화장실 가고 싶어요");
		String ttt= null;
		if(srr.name==null) {
		srr.name = name;
		ttt = name + "화장실 입장";
		}else {
			ttt = "입장 불가("+srr.name+")";
		}
		System.out.println(ttt);
	}	
	
	void outRestRoom() {
		String ttout = null;
		
		if(srr.name=="현빈" || srr.name == "원빈" || srr.name == "투빈" || srr.name == "장희빈") {
			
		ttout = name + "화장실 나감";
		srr.name = name;
		srr.name = null;
		}
		System.out.println(ttout);
}
	
}


public class SingleRestRoomMain {

	public static void main(String[] args) {
		SingleVisitor [] vv = {
				new SingleVisitor("현빈"),
				new SingleVisitor("원빈"),
				new SingleVisitor("투빈"),
				new SingleVisitor("장희빈"),
		};
		
		vv[0].goRestRoom();
		vv[1].goRestRoom();
		vv[0].outRestRoom();
		vv[2].goRestRoom();
		vv[2].outRestRoom();
		vv[3].goRestRoom();
		vv[0].goRestRoom();
		vv[3].outRestRoom();
		vv[0].goRestRoom();
		vv[0].outRestRoom();
		
	}

}
