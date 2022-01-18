package anno_p.model;

import org.springframework.beans.factory.annotation.Autowired;

/*커피 - 이름(필수), 가격(필수), 원두(auto, 필수), 부속(auto)(시럽, 우유, 카라멜,초코렛.....)*/
public class Coffee {
String name, wondu;
int price;
@Autowired
Busoc bb;
public String getName() {
	return name;
}
@Autowired
public void setName(String name) {
	this.name = name;
}
public String getWondu() {
	return wondu;
}
@Autowired(required=false)
public void setWondu(String wondu) {
	this.wondu = wondu;
}
public int getPrice() {
	return price;
}
@Autowired
public void setPrice(int price) {
	this.price = price;
}
public Busoc getBb() {
	return bb;
}
public void setBb(Busoc bb) {
	this.bb = bb;
}
@Override
public String toString() {
	return "Coffee [name=" + name + ", wondu=" + wondu + ", price=" + price + ", bb=" + bb + "]";
}
	

}
class Busoc{
	String sirup, milk, choco, caramel, etc;

	public String getSirup() {
		return sirup;
	}

	public void setSirup(String sirup) {
		this.sirup = sirup;
	}

	public String getMilk() {
		return milk;
	}

	public void setMilk(String milk) {
		this.milk = milk;
	}

	public String getChoco() {
		return choco;
	}

	public void setChoco(String choco) {
		this.choco = choco;
	}

	public String getCaramel() {
		return caramel;
	}

	public void setCaramel(String caramel) {
		this.caramel = caramel;
	}

	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}

	@Override
	public String toString() {
		return "Busoc [sirup=" + sirup + ", milk=" + milk + ", choco=" + choco + ", caramel=" + caramel + ", etc=" + etc
				+ "]";
	}


	
}