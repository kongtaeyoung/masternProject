package com.mastern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mastern.service.MainServicelmpl;
import com.mastern.vo.MainVo;

@RestController
public class MainController {

	@Autowired
	private MainServicelmpl mainServicelmpl;
	
	@GetMapping("/getTest")
	public MainVo getTest() {
		MainVo mainVo = null;
		try {
			mainVo = mainServicelmpl.getTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mainVo;
	}

}
