package TopicosAvancados.Fila;

public class Fila {
    private int[] dados;
    private int inicio = 0;
    private int fim = 0;
    private int qtde = 0;

    public Fila() {
        dados = new int[10];
    }

    public void add(int i) {
        if (qtde == dados.length) {
            throw new FilaException("Fila cheia");
        } 
        dados[fim] = i;
        fim++;
        if (fim >= dados.length) {
            fim = 0;
        }
        qtde++;
    }

    public int remove() {
        if (qtde == 0) {
            throw new FilaException("Fila vazia");
        }
        int aux = dados[inicio];
        inicio++;
        if (inicio >= dados.length) {
            inicio = 0;
        }
        qtde--;
        return aux;
    }
}