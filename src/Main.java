import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Pessoa> pessoas = new HashSet<>();

        pessoas.add(new Pessoa("Pedro", 22));
        pessoas.add(new Pessoa("Maria", 23));
        pessoas.add(new Pessoa("João", 35));

        pessoas.add(new Pessoa("Pedro", 22));
        pessoas.add(new Pessoa("Pedro", 22));
        pessoas.add(new Pessoa("João", 35));
        pessoas.add(new Pessoa("Maria", 23));
        pessoas.add(new Pessoa("Maria", 23));

        System.out.println("Quantidade de pessoas: " + pessoas.size());
        System.out.println("Lista de pessoas:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.print("""
                \nExplicação:
                A estrutura HashSet não aceita duplicidade em seus dados, fazendo essa verificação através do método 'equals'.
                Porém o método 'equals' compara o endereço de memória que cada objeto referencia utilizando o hashcode, e não os atributos dos objetos.
                Por isso é necessário sobrescrever o método 'hashcode', para criar uma referência na memória Heap baseado nos dados,
                e também o método 'equals', para comparar as informações de cada objeto, eliminando assim, de forma correta, a duplicidade automaticamente""");
    }
}
