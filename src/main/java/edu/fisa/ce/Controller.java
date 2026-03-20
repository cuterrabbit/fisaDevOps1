package edu.fisa.ce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Controller {
	
	@GetMapping("ce1")
	public String getData() {
		System.out.println("요청 및 응답 .....");
		System.out.println("두바퀴로 가는 자동차");
		return "성공";
	}

}
