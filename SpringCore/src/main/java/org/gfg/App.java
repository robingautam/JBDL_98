package org.gfg;


public class App 
{
    public static void main( String[] args )
    {
//        Mobile mobile = new Mobile();
//        mobile.makeCall();

        AccountService accountService = new AccountService();
        accountService.createAccount();
    }
}
