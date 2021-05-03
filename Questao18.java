
import java.util.Locale;
import java.util.Scanner;

public class Questao18 {
        public static void main(String[] args) {
       Locale.setDefault(Locale.US); 
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Informe sua idade: ");
       int idade = sc.nextInt();
       
       if(idade >= 18 ){
           System.out.println("Maior de idade!!!");
       }else{
           System.out.println("Menor de idade!!!");
       }
       
       sc.close();
    }
    
}
