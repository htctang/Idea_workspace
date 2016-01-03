package com.tang.test;

import com.opensymphony.xwork2.ActionSupport;
import com.test.data.HibernateUtil;
import com.test.data.Main;
import com.test.data.StudentEntity;
import com.test.data.StudentsEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Date;


/**
 * Created by 唐川htc on 2015/12/23.
 */
public class TestAction extends ActionSupport{
    public String test() throws Exception{
        System.out.println("Hello test");
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        StudentEntity student = new StudentEntity();
        student.setId(16);
        student.setName("dd");
        student.setSchool("dd");
        student.setSex("dd");
        try {
            session.save(student);
            tx.commit();
        }catch (Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            session.close();
        }
     /*   session.save(student);
        tx.commit();*/
        return "test_success";
    }
}
