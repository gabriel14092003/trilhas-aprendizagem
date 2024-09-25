import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do aluno:");
        int idade = scanner.nextInt();

        System.out.println("Digite o peso do aluno (em kg):");
        double peso = scanner.nextDouble();

        System.out.println("Digite a altura do aluno (em metros):");
        double altura = scanner.nextDouble();


        Aluno aluno = new Aluno(nome, idade, peso, altura);


        aluno.exibirInformacoes();

        scanner.close();
    }
}
