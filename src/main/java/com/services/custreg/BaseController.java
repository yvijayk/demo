package com.services.custreg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	@GetMapping("test")
	public String test() {
		return "welcome";
	}
}
