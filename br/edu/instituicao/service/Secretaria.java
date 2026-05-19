import java.util.ArrayList;
import br.edu.instituicao.model.*;

public class Secretaria {

    private ArrayList<Pessoa> totalmembros = new ArrayList<>();

    //public Secretaria(){
       // totalmembros = new ArrayList<>();
    //}

    public void cadastrarAluno (String nome, String cpf, String email, String matricula){

        Aluno aluno = new Aluno(nome, cpf, email, matricula);
        totalmembros.add(aluno);
    }

    public void cadastrarProfessor(String nome, String cpf, String email, String siape, String senha){

        Professor professor = new Professor(nome, cpf, email, senha, siape);
        totalmembros.add(professor);
    }

    public void cadastrarCoordenador(String nome, String cpf, String email, String siape, String senha){

        Coordenador coordenador = new Coordenador(nome, cpf, email, senha, siape);
        totalmembros.add(coordenador);
    }

    public void listarMembros(){

        for (Pessoa p : totalmembros){

            if (p instanceof Aluno){

                Aluno aluno = (Aluno) p;

                System.out.println ("Aluno:");
                System.out.println ("ID Aluno: " + aluno.getIdAluno());
                System.out.println ("Matricula: " + aluno.getMatricula());
                System.out.println ("Nome: " + aluno.getNome());
                System.out.println ("CPF: " + aluno.getCpf());
                System.out.println ("Email: " + aluno.getEmail());
                System.out.println ();

            } else if (p instanceof Professor){

                Professor professor = (Professor) p;

                System.out.println ("Professor: ");
                System.out.println ("ID: " + professor.getIdProfessor());
                System.out.println ("Nome: " + professor.getNome());
                System.out.println ("CPF: " + professor.getCpf());
                System.out.println ("Email: " + professor.getEmail());
                System.out.println ();
            }
        }
    }

    public Aluno buscarAluno(String identificador) {

        for (Pessoa p : totalmembros) {
            if (p instanceof Aluno a) {
                if (a.getMatricula().equals(identificador) || a.getNome().equalsIgnoreCase(identificador)) {
                    return a;
                }
            }
        }
        return null;
    }



/* 
    public Aluno buscarAluno(String matricula) {
        for (Pessoa p : totalmembros){
            if (p instanceof Aluno){
                Aluno aluno = (Aluno) p;

                if(aluno.getMatricula().equals(matricula)){
                    return aluno;
                }
            }

        }
        return null;
    }
*/

/*
    public void lancarNota(String matricula, String materia, double valorNota){

        Aluno aluno = buscarAluno(matricula);

        if (aluno != null) {
            Nota nota = new Nota(materia, valorNota);

            aluno.getNotas().add(nota);

            System.out.println("A nota foi adicionada com sucesso!");
        } else {

            System.out.println("Aluno não encontrado");
        }
    }
*/

public void lancarNota(String id, String materia, double valor){
        Aluno aluno = buscarAluno(id);
        if (aluno != null){
            aluno.getNotas().add(new Nota(materia, valor));
        }
    }

public boolean autenticarFuncionario(String siape, String senha){
        for (Pessoa p : totalmembros){
            if (p instanceof Professor prof){
                if (prof.getSiape().equals(siape)){
                    return prof.login(senha);
                }
            }
        }
        return false;
    }


/* 
    public boolean autenticarFuncionario(String siape, String Senha){
        for (Pessoa p: totalmembros){
            if (p instanceof Professor){

                Professor professor = (Professor) p;

                if (professor.getSiape().equals(siape)){
                    return professor.login(Senha);
                }
            }
        }
        return false;
}
*/
}

/* 
    public boolean autenticarFuncionario(String siape, String Senha){
        for (Pessoa p: totalmembros){
            if (p instanceof Professor){

                Professor professor = (Professor) p;

                if (professor.getSiape().equals(siape)){
                    return professor.login(Senha);
                }
            }
        }
        return false;
}
*/
