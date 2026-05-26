import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static Secretaria secretaria = new Secretaria();
    static RelatorioAcademico relatorio = new RelatorioAcademico();

    public static void main(String[] args){

        int opcao;

        do{

        System.out.println("==============================Bem-vindo ao Sistema Escolar==============================");
        System.out.println("1- Cadastrar Aluno\r\n" + //
                        "\r\n" + //
                        "2 -Cadastrar Professor/Coordenador\r\n" + //
                        "\r\n" + //
                        "3 -Lançar Notas de Aluno\r\n" + //
                        "\r\n" + //
                        "4 -Listar Comunidade Acadêmica\r\n" + //
                        "\r\n" + //
                        "5 - Exibir Estatísticas (Média Geral)\r\n" + //
                        "\r\n" + //
                        "6 - Acesso Administrativo\r\n" + //
                        "\r\n" + //
                        "7 - Sair");
        System.out.println();

        System.out.println("Selecione a opção que deseja: ");
        opcao = input.nextInt();
        input.nextLine();

        if (opcao == 1){
            CadastrarUmAluno();

        } else if (opcao == 2){
            System.out.println("Deseja cadastrar um Coordenador ou um Professor?  ");
            System.out.println("1 - Coordenador.");
            System.out.println("2 - Professor.");
            System.out.println("Selecione a opção que deseja");
            int escolha = input.nextInt();
            input.nextLine();
            
            System.out.println();
            if (escolha == 1){
                CadastrarUmCoordenador();
            } else if (escolha == 2){
                CadastrarUmProfessor();
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }

        } else if (opcao == 3){
            LancarNotaDeAluno();

        } else if (opcao == 4){
            listarComunidadeAcademica();


        } else if (opcao == 5){
            ExibirEstatisticas();

        } else if (opcao == 6){
            AcessoAdiministrativo();

        } else if (opcao == 7){
            break;

        } else {
            System.out.println("Opção inválida, Tente novamente.");
        }



        } while (opcao != 7);
       /*  System.out.println("==============================Bem-vindo ao Sistema Escolar==============================");
        System.out.println("1- Cadastrar Aluno\r\n" + //
                        "\r\n" + //
                        "2 -Cadastrar Professor/Coordenador\r\n" + //
                        "\r\n" + //
                        "3 -Lançar Notas de Aluno\r\n" + //
                        "\r\n" + //
                        "4 -Listar Comunidade Acadêmica\r\n" + //
                        "\r\n" + //
                        "5 - Exibir Estatísticas (Média Geral)\r\n" + //
                        "\r\n" + //
                        "6 - Acesso Administrativo\r\n" + //
                        "\r\n" + //
                        "7 - Sair");
        System.out.println(); */

/* 
    System.out.println("Selecione a opção que deseja: ");
    opcao = input.nextInt();
    input.nextLine();
*/
/* 
    while (opcao != 0){

        if (opcao == 1){
            CadastrarUmAluno();

        } else if (opcao == 2){
            System.out.println("Deseja cadastrar um Coordenador ou um Professor?  ");
            System.out.println("1 - Coordenador.");
            System.out.println("2 - Professor.");
            System.out.println("Selecione a opção que deseja");
            int escolha = input.nextInt();
            System.out.println();
            if (escolha == 1){
                CadastrarUmCoordenador();
            } else if (escolha == 2){
                CadastrarUmProfessor();
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }

        } else if (opcao == 3){
            LancarNotaDeAluno();

        } else if (opcao == 4){
            listarComunidadeAcademica();


        } else if (opcao == 5){
            ExibirEstatisticas();

        } else if (opcao == 6){
            AcessoAdiministrativo();

        } else if (opcao == 7){
            break;

        } else {
            System.out.println("Opção inválida, Tente novamente.");
        }
    }
    */
    }

    public static void CadastrarUmAluno(){

        System.out.println("Nome do aluno: ");
        String nome = input.nextLine();

        System.out.println("CPF: ");
        String cpf = input.nextLine();

        System.out.println("Email: ");
        String email = input.nextLine();

        System.out.println("Matricula: ");
        String matricula = input.nextLine();

        Aluno aluno = secretaria.cadastrarAluno(nome, cpf, email, matricula);
        relatorio.adicionarDados(aluno);
        System.out.println("Aluno Cadastrado com Sucesso.");

    }

    public static void CadastrarUmProfessor(){

        System.out.println("Nome do Professor: ");
        String nome = input.nextLine();

        System.out.println("CPF: ");
        String cpf = input.nextLine();

        System.out.println("Email: ");
        String email = input.nextLine();

        System.out.println("Siape: ");
        String siape = input.nextLine();

        System.out.println("Senha: ");
        String senha = input.nextLine();

        secretaria.cadastrarProfessor(nome, cpf, email, siape, senha);
        System.out.println("Professor Cadastrado com Sucesso.");

    }

    public static void CadastrarUmCoordenador(){

        System.out.println("Nome do Coordenador: ");
        String nome = input.nextLine();

        System.out.println("CPF: ");
        String cpf = input.nextLine();

        System.out.println("Email: ");
        String email = input.nextLine();

        System.out.println("Siape: ");
        String siape = input.nextLine();

        System.out.println("Senha: ");
        String senha = input.nextLine();

        secretaria.cadastrarCoordenador(nome, cpf, email, senha, siape);
        System.out.println("Coordenador Cadastrado com Sucesso.");
        
    }

    public static void LancarNotaDeAluno(){

        System.out.println("Bem-vindo ao sistema de lançamento de notas.");
        System.out.println("Qual o Nome, matricula ou ID do aluno para o cadastro de notas? ");
        String matricula = input.nextLine();

        Aluno aluno = secretaria.buscarAluno(matricula);

            if (aluno != null){
                System.out.println("Qual a matricula do Aluno? ");
                String matriculaNota = input.nextLine();
                System.out.println("Matéria: ");
                String materia = input.nextLine();
                System.out.println("Nota: ");
                double valorNota = input.nextDouble();
                input.nextLine();
                
                secretaria.lancarNota(matriculaNota, materia, valorNota);

            } else {
                System.out.println("Não foi possivel encontrar o Aluno.");
            }
        }
        public static void listarComunidadeAcademica(){

        secretaria.listarMembros();
    }

    public static void ExibirEstatisticas(){
        relatorio.calcularMediaGeral();
        relatorio.exibirMediaGeral();
    }

    public static void AcessoAdiministrativo(){
        System.out.println("Senha: ");
        String senha = input.nextLine();
        System.out.println("Siape: ");
        String siape = input.nextLine();

        secretaria.autenticarFuncionario(siape, senha);

    }

}

/* 
    public static void listarComunidadeAcademica(){

        secretaria.listarMembros();
    }

    public static void ExibirEstatisticas(){
        relatorio.calcularMediaGeral();
        relatorio.exibirMediaGeral();
    }

    public static void AcessoAdiministrativo(){
        System.out.println("Senha: ");
        String senha = input.nextLine();
        System.out.println("Siape: ");
        String siape = input.nextLine();

        secretaria.autenticarFuncionario(siape, senha);

    }
*/
