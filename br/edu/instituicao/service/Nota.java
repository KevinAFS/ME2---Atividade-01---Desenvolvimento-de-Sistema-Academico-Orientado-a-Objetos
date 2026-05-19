public class Nota {

    private String materia;
    private double valor; 

    public Nota(String materia, double valor){

        this.materia = materia;
        this.valor = valor;

    }

    public String getMateria(){
        return materia;
    }

    public double getValor(){
        return valor;
    }

}
