package outubro._22_10;

import java.util.Scanner;
import org.fusesource.jansi.AnsiConsole;

// Superclasse

class Pessoa {
    String nome;
    int idade;
    public void lerDados(Scanner scanner){
        System.out.print("Digite o seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();
    }
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade );
    }
}

// Subclasse 1: Aluno

class Aluno extends Pessoa {
    String curso;
    double notaFinal;
    public void lerAluno(Scanner scanner){
        lerDados(scanner);

        System.out.print("Digite o curso: ");
        curso = scanner.nextLine();

        System.out.print("Digite a nota final: ");
        notaFinal = scanner.nextDouble();
        scanner.nextLine(); // Limpa buffer
    }
    public void exibirAluno(){
        exibirDados();
    System.out.println("Curso: " + curso);
    System.out.println("Nota final: " + notaFinal);
    }
}

// Subclasse 2: Professor
class Professor extends Pessoa{
    String disciplina;
    double salario;

    public void lerProfessor(Scanner scanner){
        lerDados(scanner);

        System.out.print("Digite a disciplina: ");
        disciplina = scanner.nextLine();

        System.out.print("Digite o salário: ");
        salario = scanner.nextDouble();
        scanner.nextLine(); // Limpar buffer
    }
    public void exibirProfessor() {
        exibirDados();
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Salario: " + salario);
    }
}

// Subclasse 3: Funcionario (com switch-case)
class Funcionario extends Pessoa{
    String setor;
    int turno; // 1 = manhã, 2 = tarde, 3 = noite

    public void lerFuncionario(Scanner scanner){
        lerDados(scanner);

        System.out.print("Digite o setor: ");
        setor = scanner.nextLine();

        System.out.println("Escolha o turno: ");
        System.out.println("1 - Manhã");
        System.out.println("2 - Tarde");
        System.out.println("3 - Noite");
        System.out.print("Opção: ");
        turno = scanner.nextInt();
        scanner.nextLine(); // Limpa Buffer
    }
    public void exibirFuncionario(){
        exibirDados();
        System.out.println("Setor: " + setor);
        System.out.print("Turno: ");
        switch (turno) {
            case 1:
                System.out.println("Manhã");
                break;
            case 2:
                System.out.println("Tarde");
                break;
            case 3:
                System.out.println("Noite");
                break;
            default:
                System.out.println("Turno Válido");
                break;
        }
    }
}

// Classe principal
public class ProgramaPrincipal{
    public static void Separador() {
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=");
    }
    public static void Cores(String[] args) {
        System.setProperty("jansi.passthrough", "true"); // para IntelliJ aceitar as sequências
        AnsiConsole.systemInstall();

        System.out.println("\u001B
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro do Aluno ===");
        Aluno aluno = new Aluno();
        aluno.lerAluno(scanner);
        Separador();
        aluno.exibirAluno();
        Separador();

        System.out.println("\n==== Cadastro do Professor ===");
        Professor professor = new Professor();
        professor.lerProfessor(scanner);
        Separador();
        professor.exibirProfessor();
        Separador();

        System.out.println("\n==== Cadastro de Funcionário ===");
        Funcionario funcionario = new Funcionario();
        funcionario.lerFuncionario(scanner);
        Separador();
        funcionario.exibirFuncionario();
        Separador();
        scanner.close();
    }
}