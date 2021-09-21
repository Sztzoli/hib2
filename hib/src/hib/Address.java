package hib;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Address {
    
    @Id
    @Column(name = "Id_AD")
    protected String id;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ClientFk", 
            referencedColumnName = "Id",
            foreignKey = @ForeignKey(name = "FK_KEY"),
            nullable = false)
    protected ClientH clientH;
    
    @Column(name = "Address_name")
    protected String addressName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClientH getClientH() {
        return clientH;
    }

    public void setClientH(ClientH clientH) {
        this.clientH = clientH;
    } 

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" + "id=" + id + ", addressName=" + addressName + '}';
    }
    
    
}
