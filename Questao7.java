
import java.util.Locale;
import java.util.Scanner;


public class Questao7 {
    public static void main(String[] args) {
        Locale.setDefault (Locale.US);
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Informe seu salário: ");
        double salarioInicial = sc.nextDouble();
        
        if(salarioInicial < 500){
            double aumento = 30 * salarioInicial / 100;
            double salarioFinal = salarioInicial + aumento;
            
            System.out.println("Salário reajustado: " +salarioFinal);
        
        }else{
            System.out.println("Você não tem direito à reajustação do salário :(");
        }
        
        sc.close();
    }
    
}
