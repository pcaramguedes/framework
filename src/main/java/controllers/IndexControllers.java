package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class IndexControllers {

	@RequestMapping("/")
	@ResponseBody
	public String inicio() {
		return "";
	}
	
	
}
