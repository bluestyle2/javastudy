package basic;

public class MemDTO{
	
	String mid;
	String mname;
	String mpw, jumin ,	tel  ,	school  ,	company  ,	nationality , kind ;
	
	public MemDTO() {
		// TODO Auto-generated constructor stub
	}

	public MemDTO(String mid, String mname, String mpw) {//회원가입용
		this.mid = mid;
		this.mname = mname;
		this.mpw = mpw;
	}

	public MemDTO(String mid, String mpw) {//로그인용
		this.mid = mid;
		this.mpw = mpw;
	}
	
	

	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
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

	public String getMpw() {
		return mpw;
	}

	public void setMpw(String mpw) {
		this.mpw = mpw;
	}

	@Override
	public String toString() {
		return "MemDTO [mid=" + mid + ", mname=" + mname + ", mpw=" + mpw + ", jumin=" + jumin + ", tel=" + tel
				+ ", school=" + school + ", company=" + company + ", nationality=" + nationality + ", kind=" + kind
				+ "]";
	}

	
}