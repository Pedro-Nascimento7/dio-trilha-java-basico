package Map;
/*
*Dados as seguintes informações sobre meus livros favoritos e seus autores,
* crie um dicionário e ordene este dicionário:
* exibindo (Nome Autor - Nome Livro);

Autor = Hawking, Stephen - Livro = nome: Uma breve História do Tempo, pagínas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Habito, pagínas: 488
Autor = Harari, Yuval Naah - Livro = nome: Lições para o século 21, pagínas: 432 */


import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livro> meusLivros = new HashMap<>(){{
           put("Hawking, Stephen", new Livro("Uma breve História do Tempo", 256));
           put("Duhigg, Charles", new Livro("O Poder do Habito", 408));
           put("Harari, Yuval Naah", new Livro("Lições para o século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Habito", 408));
            put("Harari, Yuval Naah", new Livro("Lições para o século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

    System.out.println("--\tOrdem alfábetica autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for(Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem alfábetica nome dos livros\t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
       meusLivros3.addAll(meusLivros.entrySet());
        System.out.println(meusLivros3);
        for(Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

 //       System.out.println("--\tOrdem número de páginas\t--"); //Pra você


    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas){
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livros = (Livro) o;
        return nome.equals(livros.nome) && paginas.equals(livros.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class  ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}


