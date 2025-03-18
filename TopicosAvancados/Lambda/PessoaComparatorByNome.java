package TopicosAvancados.Lambda;

import java.util.Comparator;

public class PessoaComparatorByNome implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
