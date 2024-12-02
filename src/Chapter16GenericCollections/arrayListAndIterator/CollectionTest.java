package Chapter16GenericCollections.arrayListAndIterator;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        //add elements in colors array to list
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<String>();

        for( String color : colors )
            list.add(color); // ads color to end of list

        // add elements in removeColors array to removeList
        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<String>(Arrays.asList(removeColors));

        //for( String color : removeColors )
          //  removeList.add(color);

        // output list contents
        System.out.println("ArrayList: ");

        for( int count = 0; count < list.size(); count++ )
            System.out.printf("%s ", list.get(count));

        removeColors( list, removeList );

        //output list contents
        System.out.printf("%n%nArrayList after calling removeColors:%n");

        for( String color : list )
            System.out.printf("%s ", color);
    }

    public static void removeColors(Collection collection1, Collection collection2) {
        //Si una colección es modificada por uno de sus métodos después de que se crea un iterador para esa colección, el iterador se vuelve inválido inmediatamente: cualquier operación realizada con el tor de itera falla inmediatamente y lanza una ConcurrentModificationException. Por esta razón, se dice que los iteradores "fallan rápido". Los iteradores a prueba de errores ayudan a garantizar que una colección modificable no sea manipulada por dos o más subprocesos al mismo tiempo, lo que podría dañar la colección. En el Capítulo 23, Simultaneidad, aprenderá sobre las colecciones simultáneas (paquete java.util.concurrent) que se pueden manipular de forma segura mediante varios subprocesos simultáneos.
        Iterator<String> iterator = collection1.iterator();
//para eliminar un elemento de una arrayList, ewn caso de que quiera eliminar varios objetos, entonces debo tener otro array list con los objectos a eliminar, luego, debo poner como iterator la colección a la que le debo borrar los objetos, luego de esto, lo ponemos en un while y usamos iterator.hasNext(), esto nos verifica que si hayan valores en el siguiente indice, luego, debemos usar un if y llamamos al segundo array y usamos coleccionConElementosABorrar.contains( iterator.next() ), esto nos dará un booleano y en caso de que sea true, usamos iterator.remove() para borrar ese objeto del arrayList, esto noseliminará el objeto del arrayList principal, ya que se le pasa la referencia al iterator y modifica el original

       // collection1.add("RED"); esto no se puede hacer, para eso se debe usar concurrency, eso lo veremos en el capitulo 23
        while(iterator.hasNext()) {
            if( collection2.contains( iterator.next() ) )
                iterator.remove(); //734
        }
    }
}
