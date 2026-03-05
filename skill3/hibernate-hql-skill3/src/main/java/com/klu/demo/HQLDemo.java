package com.klu.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.klu.entity.Product;
import com.klu.loader.ProductDataLoader;
import com.klu.util.HibernateUtil;

public class HQLDemo {

    public static void main(String[] args) {

        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();

        ProductDataLoader.loadSampleProducts(session);

        System.out.println("Products Sorted by Price (Ascending)\n");

        List<Product> list1 = session.createQuery(
                "FROM Product p ORDER BY p.price ASC", Product.class).getResultList();

        for(Product p : list1) {
            System.out.println(p.getName()+" - Price: "+p.getPrice());
        }

        System.out.println("\nProducts Sorted by Price (Descending)\n");

        List<Product> list2 = session.createQuery(
                "FROM Product p ORDER BY p.price DESC", Product.class).getResultList();

        for(Product p : list2) {
            System.out.println(p.getName()+" - Price: "+p.getPrice());
        }

        System.out.println("\nProducts Sorted by Quantity\n");

        List<Product> list3 = session.createQuery(
                "FROM Product p ORDER BY p.quantity DESC", Product.class).getResultList();

        for(Product p : list3) {
            System.out.println(p.getName()+" - Quantity: "+p.getQuantity());
        }

        Long total = session.createQuery(
                "SELECT COUNT(p) FROM Product p", Long.class).getSingleResult();

        System.out.println("\nTotal Products: "+total);

        session.close();
        factory.close();
    }
}