import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.*;
import java.util.*;


public class datos
{
    
    public datos (ArrayList<Integer> a)
    {
        this.storage(a);
    }
    
    public void storage(ArrayList<Integer> arreglo)
    {
        File f = new File("Datos.txt");
        FileWriter writer = null;
        PrintWriter pw = null;
        //ACA CREO EL ARCHIVO SINO EXISTE
        if (!f.exists()) {
            try{
                f.createNewFile();
            }catch(IOException exception){
                System.err.println("Error creating the file");
            }
        }
        try{
            writer = new FileWriter("Datos.txt",false);
            pw = new PrintWriter(writer);
            for (int num:arreglo) 
            {
                pw.println(num);
            }
        }catch(IOException exception){
                System.err.println("Error opening the file");
        }finally {
           try {
               //ACA CIERRO EL ARCHIVO
           if (null != writer)
              writer.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    
    public static void saveResult(String cadena)
    {
        File f = new File("Resultados.txt");
        FileWriter writer = null;
        PrintWriter pw = null;
        //ACA CREO EL ARCHIVO SINO EXISTE
        if (!f.exists()) {
            try{
                f.createNewFile();
            }catch(IOException exception){
                System.err.println("Error creating the file");
            }
        }
        try{
            writer = new FileWriter("Resultados.txt",true);
            pw = new PrintWriter(writer);
            pw.println(cadena);
        }
        catch(IOException exception){
                System.err.println("Error opening the file");
        }finally {
           try {
               //ACA CIERRO EL ARCHIVO
           if (null != writer)
              writer.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    
     public static int[] leer(int n)
   {
       File file;
       FileReader fr;
       BufferedReader br;
       int[] arreglo = new int[n]; 
       //ArrayList<Integer> arreglo = new ArrayList<>();
       try
       {
           file = new File("Datos.txt");
           fr = new FileReader(file);
           br = new BufferedReader(fr);
           //int line;
                     
           for (int i = 0; i<n; i++)
           {
               //line=br.readLine();
               //arreglo.add(Integer.parseInt(br.readLine()));
               arreglo[i] = Integer.parseInt(br.readLine());
           }
       }
       
       catch (Exception e)
       {
           System.out.println("Error leyendo el archivo Datos.txt");
       }
       return arreglo;
    }
    
}
