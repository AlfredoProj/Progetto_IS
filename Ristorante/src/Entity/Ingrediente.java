package Entity;



public class Ingrediente {
    private String nome;
    private int quantita_soglia;

    public Ingrediente(String nome, int quantita_soglia) {
        this.nome = nome;
        this.quantita_soglia = quantita_soglia;
    }
    public boolean verificaQuantitaReport(int quantitaScorta) {
        return quantitaScorta >= quantita_soglia;
    }

    public String getNome(){
        return this.nome;
    }
}