package basic;

public class StudyjoinDTO {
	
	String id, pw,name, birth, tel, say1, say2, say3;

	public StudyjoinDTO(String id, String pw, String name, String birth, String tel, String say1, String say2, String say3) {
		super();
		this.id = id;
		this.pw = pw;
		this.birth = birth;
		this.tel = tel;
		this.say1 = say1;
		this.say2 = say2;
		this.say3 = say3;
	}
	
	public StudyjoinDTO(String id, String pw, String name, String birth, String tel, String say3) {
		super();
		this.id = id;
		this.pw = pw;
		this.birth = birth;
		this.tel = tel;		
		this.say3 = say3;
	}
	
   public StudyjoinDTO(String id, String pw) {
	      this.id = id;
	      this.pw = pw;

   }
   public StudyjoinDTO(String id) {
	      this.id = id;
	      this.pw = pw;

}
	public StudyjoinDTO() {
	// TODO Auto-generated constructor stub
}

	public boolean loginChk(String id, String pw) {
		
		return this.id.equals(id) && this.pw.equals(pw);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getSay1() {
		return say1;
	}

	public void setSay1(String say1) {
		this.say1 = say1;
	}

	public String getSay2() {
		return say2;
	}

	public void setSay2(String say2) {
		this.say2 = say2;
	}

	public String getSay3() {
		return say3;
	}

	public void setSay3(String say3) {
		this.say3 = say3;
	}

    public String toString() {
        return name + ", " + id + ", " + pw + ", " + birth + ", "+ tel + "," + say1 + ", " + say2 + ", " + say3;

	}
	
	



	
}
