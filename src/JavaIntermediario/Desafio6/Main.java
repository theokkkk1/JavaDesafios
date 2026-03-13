package JavaIntermediario.Desafio6;

import java.util.LinkedList;

public class Main {
    static void main(String[] args) {

        LinkedList<Ninjas> linkedList = new LinkedList<Ninjas>();

        linkedList.add(new Ninjas("Naruto Uzumaki", 17, "Vila da Folha"));
        linkedList.add(new Ninjas("Sasuke Uchiha", 17, "Vila da Folha"));
        linkedList.add(new Ninjas("Gaara", 18, "Vila da Areia"));
        linkedList.add(new Ninjas("Killer Bee", 36, "Vila da Nuvem"));
        linkedList.add(new Ninjas("Mei Terumi", 31, "Vila da Névoa"));
        linkedList.add(new Ninjas("Onoki", 79, "Vila da Pedra"));
        linkedList.add(new Ninjas("Shikamaru Nara", 19, "Vila da Folha"));

        System.out.println(linkedList);
        System.out.println("--------------------------7 ninjas iniciais---------------------------------");

        linkedList.remove(0);

        linkedList.push(new Ninjas("Minato Namikaze", 24, "Vila da Folha"));
        System.out.println("LinkedList depois de remover o indice 0 e adicionar o minato no topo "+linkedList);
        System.out.println("Elemento selecionado foi "+ linkedList.get(3));









    }
}
