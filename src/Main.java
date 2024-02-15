//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un LinkedList con elementi e stamparlo in console.
//Aggiungere un elemento al primo posto della lista e uno all'ultimo
//Stampare la collezione aggiornata

import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        // Creazione di una LinkedList di frutta
        LinkedList<Fruit> fruitList = new LinkedList<>();

        // Aggiungere alcuni elementi alla lista
        fruitList.add(new Fruit("Mela"));
        fruitList.add(new Fruit("Banana"));
        fruitList.add(new Fruit("Arancia"));
        fruitList.add(new Fruit("Fragola"));
        fruitList.add(new Fruit("Anguria"));

        // Stampare la collezione iniziale
        System.out.println("Collezione iniziale:");
        printFruitList(fruitList);

        // Aggiungere un elemento al primo posto della lista
        fruitList.addFirst(new Fruit("Limone"));

        // Aggiungere un elemento all'ultimo posto della lista
        fruitList.addLast(new Fruit("Pera"));

        // Stampare la collezione aggiornata
        System.out.println("\nCollezione aggiornata:");
        printFruitList(fruitList);
    }

    // Metodo per stampare la lista di frutta
    public static void printFruitList(LinkedList<Fruit> fruitList) {
        for (Fruit fruit : fruitList) {
            System.out.println("Frutta: " + fruit.getName());
        }
    }
}