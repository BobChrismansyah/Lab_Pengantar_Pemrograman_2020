import java.util.Scanner;
import java.io.*;
class Tp8No2 {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner sc = new Scanner (System.in);
      FileWriter fWrite = null;
      PrintWriter printw = null;
      FileReader file = null;
      BufferedReader reader = null;

      try {
         String satu = sc.next();                                             
         String kedua = sc.next();                                           
         sc.close();
         file = new FileReader(String.format("%s.txt",satu));
         reader = new BufferedReader(file);
         fWrite = new FileWriter(String.format("%s.txt", kedua));
         printw = new PrintWriter(fWrite);

         String s;      
         int max = 0;   
         while ((s = reader.readLine()) != null){
            max = s.length() > max ? s.length() : max;                   

         }
         file = new FileReader(String.format("%s.txt",satu));
         reader = new BufferedReader(file);

         String cek;
         while ((cek = reader.readLine()) != null) {
            printw.write(String.format("%"+max+"s\n", cek));
         }

      } catch (IOException ioe){
         System.out.println("Gagal");
      } finally {
         try {
            if (fWrite != null){
               System.out.println("Berhasil");
               fWrite.close();
            } 
            if (file != null){
               file.close();
            }
         } catch (IOException ioe){
               System.out.println(ioe.getMessage());
         }
      }
   }
}