import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListaNomes {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();

        listaNomes.add("Maria");
        listaNomes.add("Joao");
        listaNomes.add("Pedro");
        listaNomes.add("Antonio");
        listaNomes.add("Maria");
        listaNomes.add("Roberto");

        listaNomes.removeIf(nome -> nome.equals("Maria"));
        System.out.println(listaNomes);

        listaNomes.removeIf(nome -> nome.contains("r"));
        System.out.println(listaNomes);
        




    }
}
