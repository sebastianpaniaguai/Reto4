package reto4;
import java.util.Scanner;
public class Reto4 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese la sucesion de caracteres");
        String word=teclado.nextLine();
        /*for (int i=0;i<word.length();i+=2){
            for (int j=0;j<((int)word.charAt(i)-48);j++){
                System.out.print(word.charAt(i+1));
            }
        }*/
        System.out.println("");
        if (word.compareTo("Stivi es lindo?")==0){
            System.out.println("Stivi es muy lindo");
        }
    }
    
}
