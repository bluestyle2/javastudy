package basic;

public class MemberDTO {

	private String id;
	private String pw;
	private String name;
	

	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}

	

	public MemberDTO(String id, String pw,String name) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

}
