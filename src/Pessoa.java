import java.util.Objects;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa( String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }

    @Override
    public String toString() {
        return "nome= " + nome + ", idade= " + idade;
    }
}
