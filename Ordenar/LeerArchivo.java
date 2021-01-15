package Ordenar;
import java.io.BufferedReader;
    import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class LeerArchivo {
        public static  void main(String args[]){

     LeerArchivo intancia =new LeerArchivo();
     intancia.Ordenar();
        }
     public void Ordenar(){
     List  listaordenada=new ArrayList();
    
     String[]palabraDeArchivo=null;
      String[]palabraDeOriginales=null;
      ArrayList  < Integer> comparador;
       comparador= new ArrayList<>();
     int a[]={9,2,6,1,5,10,0,1};
     
              File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("C:\\Users\\BIENVENIDOS\\Desktop");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
      
         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null){
            palabraDeArchivo=linea.split(" ");
            
         }
        
          
          System.out.println("********************texto de archivo desordenadas*******************");
       for(int i=0;i<palabraDeArchivo.length;i++){
             System.out.println(palabraDeArchivo[i]); 
         }
       
       
        
        int aux;
        for(int i=0;i<a.length-1;i++){
       
            for( int j=0;j<a.length-i-1;j++){
            
               if(a[j]>a[j+1]){
                   
   
                    aux = a[j];
                a[j]=a[j+1];
               a[j+1]=aux;
               }
               }   
            }
          for(int i=0;i<a.length-1;i++){
          
              System.out.println(" Arreglo es "+a[i]);
          }
        System.out.println(comparador);
      }catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
     }
     
}
