package TopicosAvancados.ListaDuplamenteEncadeada;

public class No {
    private int valor;
    private No anterior;
    private No proximo;
 
    public No(int valor) {
     this.valor = valor;
    }
 
    public No(No anterior, int valor) {
       this(valor);
       this.anterior = anterior;
    }
 
    public void setAnterior(No anterior) {
       this.anterior = anterior;
    }
 
    public void setProximo(No proximo) {
     this.proximo = proximo;
    }
 
    public int getValor() {
     return this.valor;
    }
 
    public No getProximo() {
     return this.proximo;
    }
 
    public No getAnterior() {
       return this.anterior;
    }
 
    public boolean temProximo() {
     return this.proximo != null;
    }
 }
 