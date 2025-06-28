package Entity;

import DTO.DTOIngrediente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Magazzino {
    //attributi
    private Map<Ingrediente,Integer> scorta;
    private static Magazzino istance=null;

    //costruttore
    private Magazzino(){
        scorta=new HashMap<>();

        //da sostituire con metodo DAO
        //pezzotto: creazione ingredienti da restituire
        Ingrediente pomodoro = new Ingrediente("Pomodoro", 10);
        Ingrediente mozzarella = new Ingrediente("Mozzarella", 5);
        Ingrediente basilico = new Ingrediente("Basilico", 3);
        Ingrediente sale = new Ingrediente("Sale", 2);

        scorta.put(sale, 6);
        scorta.put(pomodoro, 4);
        scorta.put(mozzarella, 2);
        scorta.put(basilico, 1);
    }

    public static Magazzino getInstance(){
        if(istance==null){
            istance=new Magazzino();
        }
        return istance;
    }

    public Map<Ingrediente,Integer> getScorta() {
        return scorta;
    }

    public DTOIngrediente GeneraReport() {
        List<String> lista=new ArrayList<>();

        for (Ingrediente entry_ingrediente :scorta.keySet()){
            int value=scorta.get(entry_ingrediente);
            if(!entry_ingrediente.verificaQuantitaReport(value)){
                lista.add(entry_ingrediente.getNome());
            }
        }

        DTOIngrediente DTO=new DTOIngrediente(lista);
        return DTO;
    }
}
