public class Coordenador extends Professor{

    private static int contadorCoordenador = 1;
    
    private int idCoordenador;

    public Coordenador(String nome, String cpf, String email, String senha, String siape){

        super(nome, cpf, email, senha, siape);

        this.idCoordenador = contadorCoordenador++;

    }

}
