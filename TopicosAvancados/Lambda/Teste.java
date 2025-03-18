package TopicosAvancados.Lambda;

import java.util.Set;
import java.util.TreeSet;

public class Teste {
    public static void main(String[] args) {
        Set<Pessoa> tree = new TreeSet<>(
            (p1, p2) -> p1.getNome().compareTo(p2.getNome()));

        Pessoa p1 = new Pessoa("123", "Ana");
        Pessoa p2 = new Pessoa("145", "Joao");
        Pessoa p3 = new Pessoa("123", "Pedro");
        Pessoa p4 = new Pessoa("223", "Isabel");
        Pessoa p5 = new Pessoa("244", "Lucas");
        Pessoa p6 = new Pessoa("244", "Mario");
        Pessoa p7 = new Pessoa("255", "Alex");
        Pessoa p8 = new Pessoa("256", "Alex");
        Pessoa p9 = new Pessoa("355", "Glaucio");
        tree.add(p9);
        tree.add(p8);
        tree.add(p7);
        tree.add(p6);
        tree.add(p5);
        tree.add(p4);
        tree.add(p3);
        tree.add(p2);
        tree.add(p1);
        for (Pessoa p : tree) {
            System.out.println(p);
        }
    }
}
