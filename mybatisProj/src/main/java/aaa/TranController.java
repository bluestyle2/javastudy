package aaa;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.GenMapper;
import aaa.tran.di.GenService;

@Controller
@RequestMapping("/tran")
public class TranController {

	@Resource
	GenService gs;
	
	@RequestMapping("/list")
	String list(Model mm) {
		
		mm.addAttribute("mainData", gs.list());
		return "tran/list";
	}
	
	@RequestMapping("/genInsert")
	String genInsert(Model mm) {
		gs.genInsert();
		mm.addAttribute("msg", "genInsert 입력");
		
		return "tran/alert";
	}
	@RequestMapping("/genInsert2")
	String genInsert2(Model mm) {
		gs.genInsert2();
		mm.addAttribute("msg", "genInsert2 입력");
		
		return "tran/alert";
	}
	
	@RequestMapping("/genInsert3")
	String genInsert3(Model mm) {
		gs.genInsert3();
		mm.addAttribute("msg", "genInsert3 입력");
		
		return "tran/alert";
	}
}
