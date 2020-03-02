package Controller;

//import Model.Course;

import Model.Student;
import Model.Teacher;
import com.fasterxml.classmate.AnnotationConfiguration;
import org.hibernate.SessionFactory;


import javax.jms.Session;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentController {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Entities");

    public static void main(String[] args) {
        insert();
    }
    public static void insert(){

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Student student = new Student();
        Teacher t = new Teacher();
        student.setName("T");
        student.setEmail("Tia@gmail.com");
        //t.setTeacherId(1);
        t.setEmail("Shania0824@gmail");
        t.setName("shania Wang");

        //student.setId(2);


        student.setTeacher(t);
        em.persist(student);
        //em.persist(t);
        em.flush();
        em.getTransaction().commit();
        em.close();
    }

    public void update() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Student student = new Student();
        student.setId(1);
        student.setName("Tiancheng");
        student.setEmail("Tiancheng@gmail.com");
        //student.setTeacherId(1);
        em.persist(student);
        em.flush();
        em.getTransaction().commit();
        em.close();
    }
}
