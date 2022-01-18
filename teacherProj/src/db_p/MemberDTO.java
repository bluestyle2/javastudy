package db_p;

public class MemberDTO {
	String mid, mname, tel, hobby;

	public MemberDTO(String mid, String mname, String tel, String hobby) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.tel = tel;
		this.hobby = hobby;
	}
	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "MemberDTO [mid=" + mid + ", mname=" + mname + ", tel=" + tel + ", hobby=" + hobby + "]";
	}
	
	
}