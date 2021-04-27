package com.wolken.wolkenapp;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.wolkenapp.bean.MallsBean;
import com.wolken.wolkenapp.bean.ShopsBean;

public class MallsUtil {
	public static void main(String[] args) {
		
		Logger logger=Logger.getLogger("MallsUtil");
		logger.info("***************main method************");
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("context.spring.xml");
		MallsBean bean = applicationContext.getBean(MallsBean.class);
		logger.info(" **************mall beans**************");
		logger.info(bean);
		logger.info(bean.getMallName()+" "+bean.getMallLocation());
		//System.out.println(bean);
		//System.out.println(bean.getMallName()+" "+bean.getMallLocation());
		ShopsBean bean1 = applicationContext.getBean(ShopsBean.class);
		logger.info("**************shopbeans*************");
		logger.info(bean1);
		logger.info(bean1.getShopname()+" "+bean1.getShopType());
		//System.out.println(bean1);
		//System.out.println(bean1.getShopname()+" "+bean1.getShopType());
			
	}

}
