import java.util.Arrays;
public class quickSort
{
    public quickSort(int n)
    {
        int[] qs = datos.leer(n);
        
        long st = System.nanoTime();        
        this.quickSort (qs,0,n-1);        
        long et = System.nanoTime();
        
        //System.out.println(Arrays.toString(qs));
        System.out.println(n + " Registros ordenados con Quick Sort en " + (et-st)/1e9 + " s\n");
        datos.saveResult("Algoritmo: QuickSort  | Registros: " + n + " | Tiempo: " + (et-st)/1e9);
    }

    public static void quickSort(int vec[], int inicio, int fin){
        
        if(inicio>=fin) return;
        int pivote=vec[inicio];
        int elemIzq=inicio+1;
        int elemDer=fin;
        while(elemIzq<=elemDer){
                while(elemIzq<=fin && vec[elemIzq]<pivote){
                        elemIzq++;
                }
                while(elemDer>inicio && vec[elemDer]>=pivote){
                        elemDer--;
                }
                if(elemIzq<elemDer){
                        int temp=vec[elemIzq];
                        vec[elemIzq]=vec[elemDer];
                        vec[elemDer]=temp;
                }
        }
        
        if(elemDer>inicio){
                int temp=vec[inicio];
                vec[inicio]=vec[elemDer];
                vec[elemDer]=temp;
        }
        quickSort(vec, inicio, elemDer-1);
        quickSort(vec, elemDer+1, fin);
        }
}
