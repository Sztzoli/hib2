
package hib;


public class Main {
    
    
    public static void main(String[] args) {
 //       System.out.println(ClientHDao.getAll());
   //     System.out.println(ClientHDao.findByName("Zoli"));
        ClientH client = new ClientH();
        client.setId("101");
        client.setName("test101");
        client.setAge(101);
        
        ClientHDao.insert(client);
        
        AddressH addressH1 = new AddressH();
        addressH1.setId("1001");
        addressH1.setClientH(client);
        addressH1.setAddressName("testaddress1");
        
        AddressH addressH2 = new AddressH();
        addressH2.setId("1002");
        addressH2.setClientH(client);
        addressH2.setAddressName("testaddress2");
        
        AddresHDao.insert(addressH1);
        AddresHDao.insert(addressH2);

        System.out.println(ClientHDao.findByIdWithAdrdess(client.getId()));

        ClientHDaoBase.deleteAll(client);
        
    }
         
}
