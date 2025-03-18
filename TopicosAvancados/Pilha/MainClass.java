package TopicosAvancados.Pilha;

public class MainClass {
    public static void main(String args[]) {
        Pilha p = new Pilha();

        // Adicionando elementos à pilha
        p.push(5);
        p.push(4);
        p.push(3);
        p.push(2);
        p.push(1);

        // Desempilhando e mostrando os elementos
        while (!p.isEmpty()) {
            int elemento = p.pop(); // Corrigi o nome da variável para "elemento"
            System.out.println("Desempilhei: " + elemento); // Corrigi a string para melhorar a leitura
        }
    }
}