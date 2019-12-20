package com.ykuee.test.strapconfig;

import java.security.Provider.Service;
public class UseStrapService {

	StrapService service;
	
	public void setStrapService(StrapService service) {
		this.service = service;
	}
	
	public String doService(String str) {
		return service.doService(str);
	}
}
