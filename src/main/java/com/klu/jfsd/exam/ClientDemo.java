package com.klu.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Device d = new Device();
		d.setId(1);
		d.setBrand("Samsung");
		d.setModel("S23");
		d.setPrice(160000.00);
		s.save(d);
		
		Smartphone sp = new Smartphone();
		sp.setId(2);
		sp.setBrand("Smasung");
		sp.setModel("S23");
		sp.setPrice(16000.00);
		sp.setOs("Android");
		sp.setCameraResolution("100mpx");
		s.save(sp);
		
		Tablet tb = new Tablet();
		tb.setId(3);
		tb.setBrand("Apple");
		tb.setModel("Tablet");
		tb.setPrice(100000.00);
		tb.setScreenSize(100);
		tb.setBatteryLife(24);
		s.save(tb);
		
		t.commit();
		s.close();
		sf.close();
	}
}
