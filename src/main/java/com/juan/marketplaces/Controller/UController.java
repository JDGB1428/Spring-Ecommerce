package com.juan.marketplaces.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class UController {
	
	@GetMapping("/")
	public String index() {
		return "Pagina de inicio";
	}

}
