import java.util.ArrayList;

public class Main {

    public static void addItem(ArrayList<String> list, String item) {
        list.add(item);
        System.out.println(item + " foi adicionado à lista.");
    }

    public static void readItens(ArrayList<String> list) {
        System.out.println("Itens na lista:");
        for (String item : list) {
            System.out.println(item);
        }
    }

    public static void updateItem(ArrayList<String> list, int index, String novoItem) {
        if (index >= 0 && index < list.size()) {
            String antigoItem = list.set(index, novoItem);
            System.out.println(antigoItem + " foi atualizado para " + novoItem);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void removeItem(ArrayList<String> list, int index) {
        if (index >= 0 && index < list.size()) {
            String removedItem = list.remove(index);
            System.out.println(removedItem + " foi removido da lista.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        addItem(myList, "Maçã");
        addItem(myList, "Banana");
        addItem(myList, "Laranja");

        readItens(myList);

        updateItem(myList, 1, "Manga");

        readItens(myList);

        removeItem(myList, 0);

        readItens(myList);
    }
}