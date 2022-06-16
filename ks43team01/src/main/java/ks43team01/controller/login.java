package ks43team01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  ////URL 맵핑테스트용임, -한진-
public class login {
	
	@GetMapping("/default")
	
	public String login() {
	
		return "adminpage/layout/default";
	}

	


@GetMapping("1323")

	public String test() {

		return "userpage/fragments/layout/userdefault.html";
	}

}
