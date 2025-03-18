package TopicosAvancados.TabelaHash;

public class Lista {
    private No raiz;

    public void add(Pessoa p) {
        if (raiz == null) {
            raiz = new No(p);
        } else {
            No no = raiz;
            while (true) {
                if (no.getValor().equals(p)) {
                    no.setValor(p);
                    break;
                } else if (no.temProximo()) {
                    no = no.getProximo();
                } else {
                    no.setProximo(new No(p));
                    break;
                }
            }
        }
    }

    public void print() {
        No no = raiz;
        while (no != null) {
            System.out.println(no.getValor());
            no = no.getProximo();
        }
    }
}