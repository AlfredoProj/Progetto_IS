package Controller;

//Alfredo
import DTO.DTOIngrediente;
import Entity.Magazzino;

import java.util.ArrayList;
import java.util.List;

public class ControllerReport {

    public DTOIngrediente generaReport() {
        /*
        Pezzotto per testare interfaccia
        List<String> ingredienti = new ArrayList<>();
        ingredienti.add("Pomodoro");
        ingredienti.add("Mozzarella");
        ingredienti.add("Basilico");
        ingredienti.add("Olio d'oliva");
        ingredienti.add("Sale");

        // Crea e restituisce il DTO
        return new DTOIngrediente(ingredienti);*/

        Magazzino magazzino= Magazzino.getInstance();
        DTOIngrediente dto= magazzino.GeneraReport();
        return dto;
    }

}