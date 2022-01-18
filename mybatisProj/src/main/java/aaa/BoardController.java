package aaa;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.di.BoardService;
import aaa.di.MyProvider;
import aaa.model.BoardDTO;


@Controller
@RequestMapping("/board/{service}")
public class BoardController {

	@Resource
	MyProvider provider;
	
	@ModelAttribute("mainData")	
	Object mainData(BoardDTO dto) {
		BoardService bs = provider.getContext().getBean(dto.getService(), BoardService.class);
		System.out.println("메인데이터가 뭐여"+dto);
		return bs.execute(dto);
	}
	
	
	@RequestMapping()
	String view(BoardDTO dto) {
		System.out.println("뷰들어갑니다");
		return "template";
	}
}
