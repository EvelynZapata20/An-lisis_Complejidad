import java.util.ArrayList;
import java.util.Collections;

public class main{
    
    public static void crearArchivo (int c) {
        
        ArrayList<Integer> arreglo = new ArrayList<>();
        //int cantidad = 1000;
        
        for (int i = 1; i <= c; i++) {
            arreglo.add(i);
        }
        Collections.shuffle(arreglo);
        datos arr = new datos(arreglo);
        System.out.print("¡Arreglo con " + c + " de números creado correctamente!");
    }
    
    /*public static void bubbleSort (int c)
    {
        bubbleSort cant = new bubbleSort(c);
        
    }
    
    public static void quickSort (int c)
    {
        quickSort cant = new quickSort(c);
    }*/
    
    public static void ordenar (int c)
    {
        quickSort cant = new quickSort(c);
        bubbleSort can = new bubbleSort(c);
    }
}
