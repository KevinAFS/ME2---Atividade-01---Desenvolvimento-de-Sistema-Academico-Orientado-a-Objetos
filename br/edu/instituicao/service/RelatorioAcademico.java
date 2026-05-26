import java.util.ArrayList;

public class RelatorioAcademico {

    private ArrayList<Avaliavel> dados;

    public RelatorioAcademico(){

        dados = new ArrayList<>();
    }

    public void adicionarDados(Avaliavel objeto){
        dados.add(objeto);
    }

    public double calcularMediaGeral(){

        double soma = 0;

        for (Avaliavel a : dados) {
            soma += a.getMediaFinal();
        }
        if (dados.isEmpty()) {
            return 0;
        }
        return soma / dados.size();
    }

    public void exibirMediaGeral(){
        System.out.println("Média Geral da instituição: " + calcularMediaGeral());
    }


}
