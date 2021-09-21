/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hib;

/**
 *
 * @author BeneZ
 */
public class ClientHDaoBase extends ClientHDao{
    
    public static void deleteAll(ClientH clientH) {
        ClientH db= ClientHDao.findByIdWithAdrdess(clientH.getId());
        db.getAddress().forEach((addres) -> {
            AddresHDao.delete(addres);
        });
        ClientHDao.delete(clientH);
    }
    
}
