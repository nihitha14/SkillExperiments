package com.klu.loader;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.klu.entity.Product;

public class ProductDataLoader {

    public static void loadSampleProducts(Session session) {

        Transaction tx = session.beginTransaction();

        session.save(new Product("Pen","Blue pen",10.0,100));
        session.save(new Product("Notebook","200 pages",20.0,80));
        session.save(new Product("Mouse","Wireless mouse",30.0,50));
        session.save(new Product("Keyboard","Mechanical keyboard",50.0,40));
        session.save(new Product("Monitor","24 inch monitor",150.0,20));

        tx.commit();

        System.out.println("Sample products inserted successfully\n");
    }
}