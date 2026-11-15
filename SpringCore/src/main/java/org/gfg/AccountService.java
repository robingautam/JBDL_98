package org.gfg;

public class AccountService {

    AccountRepository accountRepository = new AccountRepository();

  //  MysqlRepository mysqlRepository = new MysqlRepository();

    public void createAccount(){
        accountRepository.storeData();
      //  mysqlRepository.storeData();
    }
}
