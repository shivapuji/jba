package jay.java.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/jay")
	public String sayHello(Model model) {
		model.addAttribute("name", "jay123");
		return "hello";
	}

}
