package di_p.model;

import java.util.List;

public class Phone {

	Camera fc, bc;
	Display dd;
	String name;
	List<Game> games;
	public Camera getFc() {
		return fc;
	}
	public void setFc(Camera fc) {
		this.fc = fc;
	}
	public Camera getBc() {
		return bc;
	}
	public void setBc(Camera bc) {
		this.bc = bc;
	}
	public Display getDd() {
		return dd;
	}
	public void setDd(Display dd) {
		this.dd = dd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
	
	public List<Game> getGames() {
		return games;
	}
	public void setGames(List<Game> games) {
		this.games = games;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", fc=" + fc + ", bc=" + bc + ", dd=" + dd + ", games=" + games + "]";
	}
	
	
	
	
}

class Game{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Game [name=" + name + ", age=" + age + "]";
	}
	
}

class Camera {
	String type;
	int pixel;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPixel() {
		return pixel;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	@Override
	public String toString() {
		return "Camera [type=" + type + ", pixel=" + pixel + "]";
	}
	
	
}

class Display{
	int size, cnt;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "Display [size=" + size + ", cnt=" + cnt + "]";
	}
	
}