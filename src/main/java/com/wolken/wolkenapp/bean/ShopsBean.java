package com.wolken.wolkenapp.bean;

import org.apache.log4j.Logger;

import lombok.Getter;


@Getter

public class ShopsBean {
	Logger logger=Logger.getLogger("ShopsBean");
	
	private String shopname;
	private String shopType;
	
	
	public ShopsBean(String shopname, String shopType) {
		//super();
		this.shopname = shopname;
		this.shopType = shopType;
	}
	
	public void shops() {
		logger.info("*************shop details****************");
		//System.out.println("shops details");
	}
}
