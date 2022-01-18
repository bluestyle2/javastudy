package aaa.model;

import java.util.Date;

import lombok.Data;

@Data
public class BoardDTO {

	String service, title, pname, pw, content, upfile, kind, sch;
	
	Date reg_date;
	Object ooId, ooGid;
	int id, gid, lev, seq, cnt;
	
	public BoardDTO(){
		
	}

	public void setOoId(Long ooId) {
		this.ooId = ooId;
		//id = Integer.parseInt(ooId+"");
		id = ooId.intValue();
	}
	public void setOoGid(Long ooGid) {
		this.ooGid = ooGid;
		//gid = Integer.parseInt(ooGid+"");
		gid = ooGid.intValue();
	}
	
	public BoardDTO(String title, String pname, String pw, String content) {
		super();
		this.title = title;
		this.pname = pname;
		this.pw = pw;
		this.content = content;
	}

	public BoardDTO(int id, int gid, String title, String pname, String pw, String content) {
		super();
		this.id = id;
		this.gid = gid;
		this.title = title;
		this.pname = pname;
		this.pw = pw;
		this.content = content;
	}
	
	
	
}
