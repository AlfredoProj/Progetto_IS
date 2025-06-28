package DTO;

import java.util.List;

public class DTOIngrediente {
    private List<String> lista_nomi;

    public DTOIngrediente(List<String> lista) {
        this.lista_nomi = lista;
    }

    public List<String> getLista(){
        return this.lista_nomi;
    }

}
