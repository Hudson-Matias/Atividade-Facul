import java.sql.SQLOutput;

public class Pessoa {
    private String nome;
    private int idade;
    private String nascimento;

    public Pessoa(String nome, int idade, String nascimento) {
        this.nome = nome;
        this.idade = idade;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void status(){
        System.out.println("============= APRESENTAÇÃO =============");
        System.out.println("Seu nome é: " + getNome());
        System.out.println("Você tem " + getIdade() + " anos");
        System.out.println("Você faz aniversário em " + getNascimento());
        System.out.println("========================================");
    }

    public void dirigir(){
        if (getIdade() >= 18){
            System.out.println("Você pode tirar CNH!");
        } else {
            System.out.println("Você não pode tirar CNH!");
        }
    }
}
