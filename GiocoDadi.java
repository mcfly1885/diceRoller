package giocodadi;
import java.util.Scanner;


public class GiocoDadi {
    
    public static void main(String[] args) {
            
      int somma = 0;
      int nDadi =0;
      int faces = 0;
      boolean flag = false;  
      Scanner reader = new Scanner(System.in);
      
/*Inserimento Numero Dadi------------------------------------------*/
    System.out.print("Quanti Dadi vuoi lanciare? > ");
    while(!flag){
        try{
            nDadi = reader.nextInt();
            while(nDadi<=0 || nDadi>30){
                System.out.println("Numero di Dadi non valido ");
                System.out.print("Quanti Dadi vuoi lanciare? > ");
                nDadi = reader.nextInt();
            }
            flag = true;
        }
        catch(Exception e){
            System.out.println("Il Valore inseito è errato");
            System.out.print("Quanti Dadi vuoi lanciare? > ");
            reader.next();//clear reader
        }
    } 
/*Fine-Inserimento-Numero-Dadi-----------------------------------*/
/*Inserimento Numero-Facce---------------------------------------*/

      flag = false;
      System.out.print("Numero facce "+nDadi+"d");
      while(!flag){
        try{
        faces = reader.nextInt();
         while(faces!=3 && faces!=4 && faces!=6 && faces!=8 && faces!=10 && faces!=12 && faces!=20 && faces!=100){
            System.out.println("Numero di Facce non valido ");
            System.out.println("puoi lanciare: Nd3 Nd4 Nd6 Nd8 Nd10 Nd12 Nd20 Nd100 ");
            System.out.print("Numero facce "+nDadi+"d");
            faces = reader.nextInt();
        }
         flag = true;
        }catch(Exception e){
          System.out.println("Il Valore inserito è errato");
          System.out.print("Numero facce "+nDadi+"d");
          reader.next();//clear reader
        }
      }
       
 /*Fine-Inserimento-Numero-Facce---------------------------------------*/
  
       
       System.out.println();

 /*Creazione--Oggetti-e-Lancio-Dadi------------------------------------*/ 
 
            Dado dadi[] = new Dado[nDadi];
            int[] getRes = new int[nDadi];
            
         for(int i =0; i<nDadi;i++){
             dadi[i] = new Dado();
             dadi[i].setFaces(faces);
             getRes[i]= dadi[i].lanciaDado();
             System.out.println(i+1+"d"+faces+"--> "+getRes[i]);
             somma = getRes[i]+somma;
           
         }
         
      System.out.print("\nRisulato: "+somma);
/*----------------------------------------------------------------------*/
         reader.close();
    }//end main
}//end class 