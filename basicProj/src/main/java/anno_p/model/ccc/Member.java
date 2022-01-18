package anno_p.model.ccc;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Member {

	String pname = "오병철";
	
	int age = 27;
	
	@Resource
	HomeTown ht;
	
}
@Component
@Data
class HomeTown{
	String title = "부산", flower="개나리";
	
	
}