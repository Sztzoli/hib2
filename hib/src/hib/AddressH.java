
package hib;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Address")
@Table(name = "address")
public class AddressH extends Address implements Serializable{
    
}
