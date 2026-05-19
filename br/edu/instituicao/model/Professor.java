public class Professor extends Pessoa implements Autenticavel{

    private static int contadorProfessores = 1;

    private int idProfessor;
    private String senha;
    private String siape;

    public Professor(String nome, String cpf, String email, String senha, String siape){

        super(nome, cpf, email);

        this.idProfessor = contadorProfessores++;
        this.senha = senha;
        this.siape = siape;

    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getSiape(){
        return siape;
    }

    public void setSiape(String siape){
        this.siape = siape;
    }

    public int getIdProfessor(){
        return idProfessor;
    }

    @Override
    public boolean login(String senha){
        
        return this.senha.equals(senha);
    }

}   
