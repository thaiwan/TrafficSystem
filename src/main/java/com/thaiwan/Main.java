package com.thaiwan;

import com.thaiwan.domain.Bus;
import com.thaiwan.domain.Passenger;
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
        Passenger passenger = new Passenger();
        session.save(bus);
        session.getTransaction().commit();
    }
}
