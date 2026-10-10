package InterfaceDemo;

public interface StudentOperation {

    void checkBook();
    void issueBook();
    void returnBook();
    void renewBook();
    void seeProfile();
    void updateProfile();
    void deleteProfile();
    void addProfile();
    void checkin();
    void checkout();

    default void someDefaultMethod(){
        System.out.println("This is the default method");
    }

    static void staticMethod(){
        System.out.println("inside the static method");
    }

    private void somePrivateMethod(){  // utility methods / helper methods
        System.out.println("Its private method");
    }

     default void anotherDefaultMethod(){
         somePrivateMethod();
    }
}
