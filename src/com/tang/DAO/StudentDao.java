package com.tang.DAO;

import com.test.data.Main;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by 唐川htc on 2015/12/26.
 */
public class StudentDao {
    public void save(){
        Session session = Main.getSession();
        Transaction tx = session.beginTransaction();

    }
}
