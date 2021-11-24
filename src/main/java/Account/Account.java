package Account;

import java.lang.reflect.Array;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;
import Account.Statement;

public class Account {

    private HashMap<String, Integer> registros = new HashMap<>();


    public void deposit(int amount, String date) {
        registros.put(date(date), amount);
    }

    public void withdraw(int amount, String date){
        registros.put(date(date), -amount);
    }

    public String date(String fecha){
        return fecha;
    }

    public void transfer(int amount, String date){
        registros.put(date(date), -amount);
    }

    public void stateGeneral(){
        Statement.printStatements(registros);
    }

    public void stateFiltrado(String parametroFiltro){
        Statement.filtroEstadosCuenta(parametroFiltro, registros);
    }
}
