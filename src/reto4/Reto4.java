package reto4;
import java.util.Scanner;
public class Reto4 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese la sucesion de caracteres");
        String word=teclado.next();
        System.out.println((int)word.charAt(0)-48);
        for (int i=0;i<word.length();i+=2){
            for (int j=0;j<((int)word.charAt(i)-48);j++){
                System.out.print(word.charAt(i+1));
            }
        }
        
    }
    
}
