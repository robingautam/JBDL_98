package Encapsulation;

public class Student {

   private String name;
   private String email;
   private int age;


   public void  setName(String name){
       this.name = name;
    }

    public void setEmail(String email){
       this.email = email;
    }

    public void setAge(int age){
       if (age<0){
           return;
       }
       this.age = age; // to control unnecessary data modification we use encapsulation
    }

    public String getName(){
       return this.name;
    }

    public String getEmail(){
       return this.email;
    }

    public int getAge(){
       return this.age;
    }
}
