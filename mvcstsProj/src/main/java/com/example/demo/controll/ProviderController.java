package com.example.demo.controll;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.di.PathGallProvider;
import com.example.demo.di.PathService;
import com.example.demo.model.PathGallDTO;

@Controller
@RequestMapping("/pathGall/{cate}/{service}/{pid}")	//RequestURI로 끊어가지고 옴
public class ProviderController {

	@Resource
	PathGallProvider provider;
	
	@ModelAttribute("menu")	//해당 컨트롤러에서 모두 사용할수 있다.
	ArrayList<String> mm2(@PathVariable String cate) {	//@PathVariable String cate 에서 입력받은 값이 다를때마다 바뀜
		
		
		System.out.println("mm2:"+cate);
		
		HashMap<String, ArrayList<String>>res = new HashMap<>();
		res.put("info",new ArrayList<String>());
		res.put("gall",new ArrayList<String>());
		res.put("center",new ArrayList<String>());
		
		res.get("info").add("인사말");
		res.get("info").add("연혁");
		res.get("info").add("오시는길");
		
		res.get("gall").add("봄");
		res.get("gall").add("여름");
		res.get("gall").add("가을");
		res.get("gall").add("겨울");
		
		res.get("center").add("공지사항");
		res.get("center").add("질문및답변");
		
		
		return res.get(cate);	//cate : 해당하는 값이 들어가면(gall) 해당 값에 add된것들을(봄,여름,가을,겨울) 출력한다
	}
	
	@ModelAttribute("mainData")	//
	Object mainData(PathGallDTO dto, @PathVariable String service) {
		
		PathService ps = provider.getContext().getBean(service, PathService.class); //인터페이스로 받아오는작업
		System.out.println("인터페이스 받은값:"+ps);
		return ps.execute(dto);
	}
	
	@RequestMapping()	//RequestDispatcher
	String view() {
		
		return "pathGallView";	// java mvc의 forwarding : template
	}
}
