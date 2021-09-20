
package hib;


public class Main {
    
    
    public static void main(String[] args) {
        System.out.println(ClientHDao.getAll());
        System.out.println(ClientHDao.findByName("Zoli"));
    }
         
}
