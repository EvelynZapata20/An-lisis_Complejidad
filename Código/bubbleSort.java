import java.util.Arrays;


public class bubbleSort
{
    
    public bubbleSort(int n)
    {
        int[] bs = datos.leer(n);
        
        long startTime = System.nanoTime();        
        this.bubble (bs);        
        long endTime = System.nanoTime();
        
        //System.out.println(Arrays.toString(bs));
        System.out.println(n + " Registros ordenados con Bubble Sort en: " + (endTime-startTime)/1e9 + " s\n");
        datos.saveResult("Algoritmo: BubbleSort | Registros: " + n + " | Tiempo: " + (endTime-startTime)/1e9);
    }

    public static void bubble (int vec[])
    {
        int n = vec.length;
        
        for (int i=0; i<=n-1;i++){
            for (int j=0; j<n-i-1;j++){
                if(vec[j]>vec[j+1]){
                    int temp = vec[j];
                    vec[j] = vec[j+1];
                    vec[j+1] = temp;
                }
            }
        }
       
    }
}