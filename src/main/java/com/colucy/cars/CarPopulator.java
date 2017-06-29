package com.colucy.cars;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CarPopulator implements CommandLineRunner {

	@Resource
	private MakeRepo makeRepo;
	@Resource
	private ModelRepo modelRepo;
	
	
	
	
	@Override
	public void run(String... args) throws Exception {
	
	Make ford = new Make("Ford");
	Make chevy = new Make("Chevy");
	Make honda = new Make("Honda");
	
	makeRepo.save(ford);
	makeRepo.save(chevy);
	makeRepo.save(honda);
		
	}

}
