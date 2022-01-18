package model;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class BoardDTO {

	Integer id, cnt, gid, lev, seq;
	String title, pname, pw, content, upfile;
	Date reg_date;
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, pname, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoardDTO other = (BoardDTO) obj;
		return Objects.equals(id, other.id) && Objects.equals(pname, other.pname) && Objects.equals(title, other.title);
	}

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCnt() {
		return cnt;
	}

	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public Integer getLev() {
		return lev;
	}

	public void setLev(Integer lev) {
		this.lev = lev;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getContent() {
		return content;
	}
	
	public String getContentBr() {
		return content.replaceAll("\n", "<br>");
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUpfile() {
		
		if(upfile==null || upfile.trim().equals("")) {
			upfile = null;
		}
		return upfile;
	}

	public void setUpfile(String upfile) {
		this.upfile = upfile;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	
	public String getReg_dateStr() {
		
		if(reg_date== null)
			return "";
		
		return sdf.format(reg_date);
	}

	public void setReg_dateStr(String reg_date) {
		//데이터가 정상인것만 파싱을 해라
		if(reg_date!=null && !reg_date.trim().equals("")) {			
		
			try {
				this.reg_date = sdf.parse(reg_date);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	@Override
	public String toString() {
		return "BoardDTO [id=" + id + ", cnt=" + cnt + ", gid=" + gid + ", lev=" + lev + ", seq=" + seq + ", title="
				+ title + ", pname=" + pname + ", pw=" + pw + ", content=" + content + ", upfile=" + upfile
				+ ", reg_date=" + reg_date + "]";
	}

		
}
