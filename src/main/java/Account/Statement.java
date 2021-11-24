package Account;

import java.util.*;

public class Statement {
    public static void filtroEstadosCuenta(String parametroFiltro, HashMap<String, Integer> registros){
        switch (parametroFiltro.toLowerCase()) {
            case "fecha": {
                List sortedKeys= new ArrayList(registros.keySet());
                Collections.sort(sortedKeys);
                sortedKeys.forEach((fecha) -> System.out.println("Fechas de movimientos: "+fecha));
                break;
            }
            case "depósitos": {
                registros.forEach((k,v) ->{
                    if(v > 0) System.out.println("Depósitos: $"+v+" pesos.");
                });
                break;
            }
            case "retiros": {
                registros.forEach((k,v) ->{
                    if(v < 0) System.out.println("Retiros: -$"+(v*-1)+" pesos.");
                });
                break;
            }
        }
    }

    public static void printStatements(HashMap<String, Integer> registros) {

        List sortedKeys= new ArrayList(registros.keySet());
        Collections.sort(sortedKeys);
        int balance = 0;

        for (int i = 0; i < sortedKeys.size(); i++) {
            for (Map.Entry<String, Integer> entry : registros.entrySet()) {
                if(sortedKeys.get(i) == entry.getKey()){
                    System.out.println("   Fecha      Depósitos      Retiros/Transferencias      Balance   ");
                    if(entry.getValue() < 0){
                        balance += entry.getValue();
                        System.out.println(""+sortedKeys.get(i)+"                            "+(entry.getValue()*-1)+"                  "+balance);
                        break;
                    }
                    balance += entry.getValue();
                    System.out.println(""+sortedKeys.get(i)+"       "+entry.getValue()+"                                      "+balance);
                }
            }
        }
    }
}