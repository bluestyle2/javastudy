package anno_p.model.ddd;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import lombok.Data;


@Component("hsm")
@Data
public class Masuri {

	String pname = "하성민";
	
	@Resource
	Weapon wp;
	
	
}

@Component
@Data
class Weapon{
	
	String kind = "마술봉";
	int power = 100;
}

@Component("wp")
class MachineGun extends Weapon{
	
	public MachineGun() {
		kind = "머신건";
		power = 300;
	}
}

@Component("wp2")
class Capu extends Weapon{
	
	public Capu() {
		kind = "카푸치노";
		power = 5000;
	}
}