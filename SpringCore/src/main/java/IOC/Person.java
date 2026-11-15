package IOC;


import java.util.List;
import java.util.Set;

public class Person {

    String name;
    String email;
    int age;
    String aadharCard;
    List<String> documentList;
    Set<String> subjects;

    Address address;

    Student student;


    Person(Address address){
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting the name");
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("Setting the email");
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setting the age");
        this.age = age;
    }

    public String getAadharCard() {
        return aadharCard;
    }

    public void setAadharCard(String aadharCard) {
        this.aadharCard = aadharCard;
    }

    public List<String> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List<String> documentList) {
        this.documentList = documentList;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void initMethod(){
        System.out.println("Bean is just Created, so calling the init method");
    }

    public void destroyMethod(){
        System.out.println("Bean is about to deatroy, so calling the destroy method for cleanup task");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", aadharCard='" + aadharCard + '\'' +
                ", documentList=" + documentList +
                ", subjects=" + subjects +
                ", address=" + address +
                '}';
    }
}
