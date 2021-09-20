package hib;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientHDao {

    
    public static void insert(Client client) {
        Session session = SessionUtil.getSession();
        Transaction tx = session.beginTransaction();
        addClient(session, client);
        tx.commit();
        session.close();
    }
    
    public static void addClient(Session session, Client client) {
        ClientH clientH = new ClientH();
        clientH.setId(client.getId());
        clientH.setName(client.getName());
        clientH.setAge(client.getAge());
        session.save(clientH);
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
