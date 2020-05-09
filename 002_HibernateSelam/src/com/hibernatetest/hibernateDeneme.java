package com.hibernatetest;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mimaraslan.Personel;


public class hibernateDeneme {

	public static void main(String[] args) {

		//?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey
		/*
		<property name="hibernate.search.default.directory_provider">filesystem</property>
		<property name="hibernate.search.default.indexBase">target/indexes</property>
		<mapping class="org.hibernate.search.test.spatial.POI"/>
		*/
		//<property name="current_session_context_class">thread</property>

		Personel personel = new Personel();
		personel.setPersonelId(1);
		personel.setPersonelAdi("murat");
		personel.setPersonelSoyadiString("aslan");
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(personel);	
		session.getTransaction().commit();
	}

}
