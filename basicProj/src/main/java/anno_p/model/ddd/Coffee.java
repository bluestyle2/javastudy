package anno_p.model.ddd;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cof")
@Data
public class Coffee {
	
	@Resource
	Americano ame;
	
}

@Component
@Data
class Americano {
	String wondu = "과테말라 엘 소코로";
	int water=300; 
	int price=4000;
}

@Component("cof2")
@Data
class Capuchino{
	String wondu = "콜롬비아 블루마운틴";
	int water=150; 
	int price=5000;
}

@Component("cof3")
@Data
class Latte{
	String wondu = "에티오피아 예가체프";
	int water=200;
	int price=4500;
}