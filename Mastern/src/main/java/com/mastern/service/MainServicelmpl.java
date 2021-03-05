package com.mastern.service;

import com.mastern.vo.MainVo;

public class MainServicelmpl implements MainService {

	@Override
	public MainVo getTest() throws Exception {
		MainVo mainVo = new MainVo();
		mainVo.setId("338");
		return mainVo;
	}
	

}
