
package hib;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Client {
    
    @Id
    @Column(name = "Id")
    private String id;
    
    @Column(name = "Name")
    private String name;
    
    @Column(name = "Age")
    private int age;

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

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }
    
    
}
