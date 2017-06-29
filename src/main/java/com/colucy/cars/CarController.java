package com.colucy.cars;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {
	
	@Resource
	private MakeRepo makeRepo;
	@Resource
	private ModelRepo modelRepo;
	
	
	@RequestMapping("/makes")
	public String fetchMakes(Model model){
		model.addAttribute("makes", makeRepo.findAll());
		return "makeList";
	
	}
}
