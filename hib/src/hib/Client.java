
package hib;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@MappedSuperclass
public class Client {
    
    @Id
    @Column(name = "Id")
    protected String id;
    
    @Column(name = "Name")
    protected String name;
    
    @Column(name = "Age")
    protected int age;
    
    @OneToMany(fetch = FetchType.EAGER ,mappedBy = "clientH", orphanRemoval = true)     
    protected List<AddressH> address = new ArrayList<>();
               

    public Client() {
    }
    
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<AddressH> getAddress() {
        return address;
    }

    public void setAddress(List<AddressH> address) {
        this.address = address;
    }
    
    

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + '}';
    }

   
    
    
}
