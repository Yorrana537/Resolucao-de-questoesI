
import java.util.Locale;
import java.util.Scanner;


public class ProblemaLanchonete {
    public static void main(String[] args) {
        Locale.setDefault (Locale.US);
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Código do produto comprado: ");
        int codigo = sc.nextInt();
        
        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();
        
        if(codigo == 1){
            double preco1 = quantidade * 5.00;
            System.out.println("Valor a ser pago : R$" +String.format("%.2f",preco1));
     
        } else if(codigo == 2){
            double preco2 = quantidade * 3.50;
            System.out.println("Valor a ser pago : R$" +String.format("%.2f",preco2));
     
        }else if(codigo == 3){
            double preco3 = quantidade * 4.80;
            System.out.println("Valor a ser pago : R$" +String.format("%.2f",preco3));
        
        }else if(codigo == 4){
            double preco4 = quantidade * 8.90;
            System.out.println("Valor a ser pago : R$" +String.format("%.2f",preco4));
        
        }else if(codigo == 5){
            double preco5 = quantidade * 7.32;
            System.out.println("Valor a ser pago : R$" +String.format("%.2f",preco5));
        
        }else{
            System.out.println("Código inválido!!!");
        }
        
        
        
        sc.close();
    }
    
}
