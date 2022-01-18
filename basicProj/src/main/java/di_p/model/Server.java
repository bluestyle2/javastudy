package di_p.model;

public class Server {
	
	String name;
	Bonche bb;
	Monitor mm1, mm2;
	KeyBoard kk;
	Mouse ms;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Bonche getBb() {
		return bb;
	}
	public void setBb(Bonche bb) {
		this.bb = bb;
	}
	public Monitor getMm1() {
		return mm1;
	}
	public void setMm1(Monitor mm1) {
		this.mm1 = mm1;
	}
	public Monitor getMm2() {
		return mm2;
	}
	public void setMm2(Monitor mm2) {
		this.mm2 = mm2;
	}
	public KeyBoard getKk() {
		return kk;
	}
	public void setKk(KeyBoard kk) {
		this.kk = kk;
	}
	public Mouse getMs() {
		return ms;
	}
	public void setMs(Mouse ms) {
		this.ms = ms;
	}
	@Override
	public String toString() {
		return "Server [name=" + name + ", bb=" + bb + ", mm1=" + mm1 + ", mm2=" + mm2 + ", kk=" + kk + ", ms=" + ms
				+ "]";
	}
	
	
}

class DeskTop{
	String name;
	BoncheChild bb2;
	Monitor mm;
	KeyBoardChild kk;
	MouseChild ms2;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Bonche getBb2() {
		return bb2;
	}
	public void setBb2(BoncheChild bb) {
		this.bb2 = bb;
	}
	public Monitor getMm() {
		return mm;
	}
	public void setMm(Monitor mm) {
		this.mm = mm;
	}
	public KeyBoard getKk() {
		return kk;
	}
	public void setKk(KeyBoardChild kk) {
		this.kk = kk;
	}
	public Mouse getMs2() {
		return ms2;
	}
	public void setMs2(MouseChild ms) {
		this.ms2 = ms;
	}
	@Override
	public String toString() {
		return "DeskTop [name=" + name + ", bb2=" + bb2 + ", mm=" + mm + ", kk=" + kk + ", ms2=" + ms2 + "]";
	}
	
	
}

class Notebook{
	String name;
	Bonche bb1;	
	Mouse ms3;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Bonche getBb1() {
		return bb1;
	}
	public void setBb1(Bonche bb1) {
		this.bb1 = bb1;
	}
	public Mouse getMs3() {
		return ms3;
	}
	public void setMs3(Mouse ms3) {
		this.ms3 = ms3;
	}
	@Override
	public String toString() {
		return "Notebook [name=" + name + ", bb=" + bb1 + ", ms3=" + ms3 + "]";
	}
	
	
}

class Tablet{
	String name;
	BoncheChild bb;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Bonche getBb() {
		return bb;
	}
	public void setBb(BoncheChild bb) {
		this.bb = bb;
	}
	@Override
	public String toString() {
		return "Tablet [name=" + name + ", bb=" + bb + "]";
	}
	
	
}

class Bonche{
	String cpu, hdd;
	int ram;
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Bonche [cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + "]";
	}
		
}

class BoncheChild extends Bonche{
	
}

class Monitor{
	String kind;
	int size;
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Monitor [kind=" + kind + ", size=" + size + "]";
	}
	
}

class KeyBoard{
	String type;
	int price;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "KeyBoard [type=" + type + ", price=" + price + "]";
	}
	
}

class KeyBoardChild extends KeyBoard{
	
}
class Mouse{
	String type;
	boolean wireless;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isWireless() {
		return wireless;
	}
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	@Override
	public String toString() {
		return "Mouse [type=" + type + ", wireless=" + wireless + "]";
	}
	
	
}

class MouseChild extends Mouse{}