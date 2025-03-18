package TopicosAvancados.ListaDuplamenteEncadeada;

public class Lista {
    private No head;
    private No tail;

    public void add(int i) {
        if (head == null) {
            head = new No(i);
            tail = head;
        } else {
            No no = head;
            while (no.temProximo()) {
                no = no.getProximo();
            }
            no.setProximo(new No(no, i));
            tail = no.getProximo();
        }
    }

    public void print() {
        No no = head;
        while (no != null) {
            System.out.println(no.getValor());
            no = no.getProximo();
        }
    }

    public void printReverse() {
        No no = tail;
        while (no != null) {
            System.out.println(no.getValor());
            no = no.getAnterior();
        }
    }
}
