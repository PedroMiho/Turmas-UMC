import java.util.ArrayList;
import java.util.List;

public class ListaArray {
    public static void main(String[] args) {


        List <String> listaNomes = new ArrayList<>();


        //Adicionar itens na lista
        listaNomes.add("Maria");
        listaNomes.add("Joao");
        listaNomes.add("Luiz");

        //Adicionar itens em uma posição desejada
        listaNomes.add(0, "Breno");
        System.out.println(listaNomes);


        //Exibindo um item da lista
        System.out.println("O primeiro nome é do " + listaNomes.get(0));

        //Remover itens de acordo com a posição
        listaNomes.remove(1);

        //Remover de acordo com o valor do item
        listaNomes.remove("Joao");

        for (String nome : listaNomes ) {
            System.out.println(nome);
        }

    }
}
