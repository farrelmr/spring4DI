package com.glenware.spring4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunMe {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"springCyclingBeans.xml");

		Cyclist roadCyclist = (Cyclist) context.getBean("roadCyclist");
		System.out.println(roadCyclist.getCyclingSong());
		roadCyclist.getBicycle().wotYouRiding();

		Cyclist offroadCyclist = (Cyclist) context.getBean("offroadCyclist");
		System.out.println(offroadCyclist.getCyclingSong());
		offroadCyclist.getBicycle().wotYouRiding();
	}
}
