package TopicosAvancados.TabelaHash;

public class No {
    private Pessoa pessoa;
    private No proximo;
    
    public No(Pessoa pessoa) {
     this.pessoa = pessoa;
    }
 
    public void setProximo(No proximo) {
     this.proximo = proximo;
    }
 
    public void setValor(Pessoa p) {
       this.pessoa = p;
    }
 
    public Pessoa getValor() {
     return this.pessoa;
    }
 
    public No getProximo() {
     return this.proximo;
    }
 
    public boolean temProximo() {
     return this.proximo != null;
    }
 }