package TopicosAvancados.TabelaHash;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("123");
        Pessoa p2 = new Pessoa("145");
        Pessoa p3 = new Pessoa("123");
        Pessoa p4 = new Pessoa("223");
        Pessoa p5 = new Pessoa("244");
        Pessoa p6 = new Pessoa("244");
        Pessoa p7 = new Pessoa("255");
        Pessoa p8 = new Pessoa("355");
        TabelaHash tabela = new TabelaHash();
        tabela.adicionar(p1);
        tabela.adicionar(p2);
        tabela.adicionar(p3);
        tabela.adicionar(p4);
        tabela.adicionar(p5);
        tabela.adicionar(p6);
        tabela.adicionar(p7);
        tabela.adicionar(p8);
        tabela.imprime();
    }
}
