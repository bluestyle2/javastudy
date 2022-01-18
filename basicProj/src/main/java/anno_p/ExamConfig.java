package anno_p;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import anno_p.model.Stud;

@ComponentScan("anno_p.model")
public class ExamConfig {

	@Bean
	Stud st1() {
		Stud res = new Stud("오병철",77,78,72);
		return res;
	}
	@Bean
	Stud st2() {
		Stud res = new Stud("육병철",57,58,52);
		return res;
	}
	@Bean
	Stud st3() {
		Stud res = new Stud("칠병철",97,98,92);
		return res;
	}
	@Bean
	Stud st4() {
		Stud res = new Stud("팔병철",77,78,72);
		return res;
	}
	
	@Bean
	Stud st5() {
		Stud res = new Stud("구병철",57,58,52);
		return res;
	}
}
