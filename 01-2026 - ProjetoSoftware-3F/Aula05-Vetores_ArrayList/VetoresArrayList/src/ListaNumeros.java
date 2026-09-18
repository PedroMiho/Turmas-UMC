import java.util.ArrayList;

public class ListaNumeros {

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        //Adiocionar valores no ArrayList
        listaNumeros.add(10);
        listaNumeros.add(20);
        listaNumeros.add(30);
        listaNumeros.add(40);
        listaNumeros.add(50);
        listaNumeros.add(60);
        listaNumeros.add(70);
        listaNumeros.add(80);
        listaNumeros.add(90);
        listaNumeros.add(100);

        //Adicionar valores em uma posicao desejada
        listaNumeros.add(0,90);
        listaNumeros.add(1,80);
        System.out.println(listaNumeros);

        //Verificar o tamanho da lista (size())
        System.out.println("O tamanho da lista é igual a " + listaNumeros.size());

        //Acessar um valor (get())
        System.out.println("A segunda posição tem o valor " + listaNumeros.get(1));

        //Alterar um valor (set( posicao, valor ))
        listaNumeros.set(1, 100);
        System.out.println(listaNumeros);

        //Encontar a posição de um elemento
        System.out.println("O valor 20 está na posição " + listaNumeros.indexOf(20));

        //Remover um elemento (remove(posicao))
        listaNumeros.remove(5); // Removendo a partir da posição
        listaNumeros.remove(listaNumeros.indexOf(20)); // Removendo a partir do valor

        //Funções Anonima
        System.out.println("Lista antes da remoção");
        System.out.println(listaNumeros);

//        listaNumeros.removeIf(numero -> numero < 70);

        for(int i = listaNumeros.size()-1; i >= 0; i--){
            if(listaNumeros.get(i) < 70){
                listaNumeros.remove(i);
            }
        }

        System.out.println("Lista após a remoção");
        System.out.println(listaNumeros);

        //Percorrer o Array
        for(Integer numero : listaNumeros) {
            System.out.println(numero);
        }

    }

}
