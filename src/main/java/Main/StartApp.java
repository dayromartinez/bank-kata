package Main;

import Account.Account;

public class StartApp {
    public static void main(String[] args) {

        Account account = new Account();

        account.deposit(1500, account.date("02/12/2021"));
        account.deposit(2300, account.date("15/12/2021"));
        account.withdraw(500, account.date("11/12/2021"));
        account.transfer(800, account.date("31/12/2021"));

        account.stateFiltrado("FECHA");
        account.stateFiltrado("dePÓsiTOS");
        account.stateFiltrado("retiros");
        account.stateGeneral();
    }
}
