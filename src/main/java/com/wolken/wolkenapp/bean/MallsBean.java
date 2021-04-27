package com.wolken.wolkenapp.bean;

import org.apache.log4j.Logger;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MallsBean {
	Logger logger=Logger.getLogger("MallsBean");
	
	private String mallName;
	private String mallLocation;
	private ShopsBean shopsBean;
	
	
	public void malls() {
		logger.info("***************mall deatils***************");
		System.out.println("malls details");
	}
	
	

}
