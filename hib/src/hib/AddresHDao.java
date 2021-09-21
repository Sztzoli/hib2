
package hib;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class AddresHDao {
    
    
        public static void insert(AddressH address) {
        try (Session session = SessionUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            session.save(address);
            tx.commit();
        }
    }    
    
    public static void delete(AddressH address) {
          try (Session session = SessionUtil.getSession()) {
            Transaction tx = session.beginTransaction();            
            session.remove(address);
            tx.commit();
        }
    }    
 
}
