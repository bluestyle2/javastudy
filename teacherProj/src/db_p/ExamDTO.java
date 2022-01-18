package db_p;

public class ExamDTO {

	String title, sid;
	
	int kor, eng, mat;

	public ExamDTO() {
		// TODO Auto-generated constructor stub
	}
		
	public ExamDTO(String title, String sid, int kor, int eng, int mat) {

		this.title = title;
		this.sid = sid;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	@Override
	public String toString() {
		return title + "\t" + sid + "\t"+ kor +  "\t" + eng +  "\t" + mat;
	}
	
	
	
}
