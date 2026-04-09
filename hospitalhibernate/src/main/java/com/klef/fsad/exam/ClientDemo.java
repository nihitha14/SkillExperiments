package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Date;

public class ClientDemo
{
public static void main(String[] args)
{
SessionFactory sf = new Configuration().configure().buildSessionFactory();
Session s = sf.openSession();

s.beginTransaction();

// Insert record
Hospital h = new Hospital();
h.setName("Apollo Hospital");
h.setDescription("Multi speciality");
h.setDate(new Date());
h.setStatus("Active");

s.save(h);

s.getTransaction().commit();

System.out.println("Record Inserted");

// View record
Hospital h1 = s.get(Hospital.class,1);
System.out.println("Hospital Name: "+h1.getName());

s.close();
sf.close();
}
}