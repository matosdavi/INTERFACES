import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Produto sabao = new Produto("Sabão Líquido", "Omo", 29.3);
        Produto arroz = new Produto("Arroz 5kg", "Namorado", 19.3);
        Produto feijao = new Produto("Feijão 1kg", "Kicaldo", 7.9);
        Produto macarrao = new Produto("Macarrão 1kg", "Adria", 14.9);

        List<Produto> meuCarrinho = new ArrayList<>();

        meuCarrinho.add(feijao);
        meuCarrinho.add(arroz);
        meuCarrinho.add(sabao);
        meuCarrinho.add(macarrao);

        System.out.println("Lista Desordenada:");
        for (Produto listaOrd : meuCarrinho){
            System.out.println(listaOrd);
        }

        Collections.sort(meuCarrinho);

        System.out.println("\nLista Ordenada:");
        for (Produto listaOrd : meuCarrinho) {
            System.out.println(listaOrd);
        }
    }
}