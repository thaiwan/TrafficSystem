package com.thaiwan;

import com.thaiwan.entities.Bus;
import com.thaiwan.managers.HibernateManager;
import org.hibernate.Session;

/**
 * Created by Tanya on 19.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        new Main().testHibernate();
    }

    public void testHibernate() {
        Session session = HibernateManager.getInstance().getSession();
        session.beginTransaction();
        Bus bus = new Bus(15);
        System.out.println("begin saving + bus - " + bus);
        session.save(bus);
        session.getTransaction().commit();
    }
}
