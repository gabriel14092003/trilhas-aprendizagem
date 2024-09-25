public class Aluno {
    private String nome;
    private int idade;
    private double peso;
    private double altura;


    public Aluno(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }


    public boolean isMenorDeIdade() {
        return idade < 18;
    }


    public double calcularIMC() {
        return peso / (altura * altura);
    }


    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Menor de idade: " + (isMenorDeIdade() ? "Sim" : "Não"));
        System.out.printf("IMC: %.2f\n", calcularIMC());
    }
}
