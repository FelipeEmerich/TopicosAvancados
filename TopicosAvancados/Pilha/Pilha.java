package TopicosAvancados.Pilha;

public class Pilha {

    int[] elementos; // Array para armazenar os elementos da pilha
    int topo;        // Índice do topo da pilha
    int capacidade;   // Capacidade do array

    public Pilha() {
        capacidade = 10; // Inicialmente, definimos uma capacidade padrão
        elementos = new int[capacidade];
        topo = -1;
    }
    
    public void push(int e) {
        // Se a pilha estiver cheia, duplicamos a capacidade do array
        if (topo == capacidade - 1) {
            capacidade *= 2;  // Dobra a capacidade
            int[] novosElementos = new int[capacidade];
            // Copia os elementos antigos para o novo array
            for (int i = 0; i <= topo; i++) {
                novosElementos[i] = elementos[i];
            }
            elementos = novosElementos; // Atualiza o array de elementos
        }

        topo++;
        elementos[topo] = e; // Adiciona o elemento no topo
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia!");
        }

        int e = elementos[topo];
        topo--;
        return e;
    }

    public boolean isEmpty() {
        return (topo == -1); // A pilha está vazia se o topo for -1
    }

    public boolean isFull() {
        // A pilha não ficará "cheia" porque o array pode expandir dinamicamente
        return false;
    }

    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia!");
        }
        return elementos[topo];
    }
}
