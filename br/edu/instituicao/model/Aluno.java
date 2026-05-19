
import java.util.ArrayList;
import java.util.List;

/* 
import br.edu.instituicao.interfaces.Avaliavel;
import br.edu.instituicao.service.Nota;
*/

public class Aluno extends Pessoa implements Avaliavel{

    private static int contadorAlunos = 1;

    private int idAlunos;
    private String matricula;
    private List<Nota> notas;

    public Aluno(String nome, String cpf, String email, String matricula){
        super(nome, cpf, email);

        this.idAlunos = contadorAlunos++;
        this.matricula = matricula;
        this.notas = new ArrayList<>();

        }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public List<Nota> getNotas(){
        return notas;
    }

    public int getIdAluno(){
        return idAlunos;
    }



    @Override
    public double getMediaFinal(){

        double soma = 0;

        for (Nota nota: notas) {
            soma += nota.getValor();

        }
        if (notas.isEmpty()) return 0;

        else return soma / notas.size();

    }
}


