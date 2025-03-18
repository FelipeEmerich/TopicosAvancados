package TopicosAvancados.TabelaHash;

public class TabelaHash {
    private Lista[] listas = new Lista[10];

    public TabelaHash() {
        for (int i = 0; i< listas.length; i++) {
            listas[i] = new Lista();
        }
    }

    public void adicionar(Pessoa p) {
        int hash = p.hashCode();
        listas[hash].add(p);
    }

    public void imprime() {
        for (int i = 0; i< listas.length; i++) {
            System.out.println("Posição " + i);
            listas[i].print();
        }
    }
}
