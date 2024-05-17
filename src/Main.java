import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");

        Set<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");

        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(5);

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");

        for (String item : hashSet) {
            System.out.println(item);
        }
        for (String item : treeSet) {
            System.out.println(item);
        }
//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        System.out.println("Size: " + hashSet.size());
        System.out.println("Is empty: " + hashSet.isEmpty());

        System.out.println("Contains 'A': " + treeSet.contains("A"));
        System.out.println("Contains 'C': " + treeSet.contains("C"));

        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Set<String> anotherSet = new HashSet<>();
        anotherSet.add("Three");
        anotherSet.add("Four");

        arrayList.addAll(anotherSet);

        for (String element : arrayList) {
            System.out.println(element);
        }
        /*  Implementaciones principales:
            HashSet: Basado en una tabla hash, no garantiza el orden.
            LinkedHashSet: Mantiene el orden de inserción.
            TreeSet: Basado en un árbol rojo-negro, ordena los elementos.*/


        /*Queue:

                Características: Ordena los elementos en base a FIFO (First-In-First-Out).
                Implementaciones principales:
                LinkedList: También implementa Queue.
                PriorityQueue: Ordena los elementos basándose en su orden natural o un comparador.*/


        /*Map:

            Características: Almacena pares clave-valor, no permite claves duplicadas.
            Implementaciones principales:
            HashMap: Basado en una tabla hash, no garantiza el orden.
            LinkedHashMap: Mantiene el orden de inserción.
            TreeMap: Basado en un árbol rojo-negro, ordena las claves.*/

        imprime();

        Integer i;
        Integer j = 0;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                i = scanner.nextInt();
                if(i==2){
                    break;
                } else if (i==1) {
                    throw new IllegalStateException("Invalid");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    static void imprime() throws Exception {
        throw new Exception("esto es una runtime exception");
    }
}