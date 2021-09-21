package hib;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class ClientHDao {

    
    public static void insert(ClientH client) {
        try (Session session = SessionUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            session.save(client);
            tx.commit();
        }
    }    
    
    public static void delete(ClientH client) {           
          try (Session session = SessionUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            session.delete(client);            
            tx.commit();
        }
    }
 
    
    public static List<ClientH> getAll(){
        List<ClientH> employees;
        try (Session session = SessionUtil.getSession()) {
            Query query = session.createQuery("from ClientH");
            employees = (List<ClientH>) query.list();
        }
    return employees;
    }
    
    public static ClientH findByName(String name) {
        ClientH client;
        try (Session session = SessionUtil.getSession()) {
            Query query = session.createQuery("from ClientH c where c.name = :name")
                    .setParameter("name", name);
            client = (ClientH) query.uniqueResult();
        }
         return client;
    }
    
}
