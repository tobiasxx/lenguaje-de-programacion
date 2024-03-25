
package trabajo2;
import java.util.Scanner;
public class Trabajo2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int temp;
        String md;
        String temperatura=" ";
        System.out.println("Ingrese momento del dia. (amanecer, tarde, noche)");
             md = sc.nextLine();
       
            System.out.println("Ingrese la temperatura");
             temp = sc.nextInt();
     
        switch(md){
            case "amanecer": 
                if (temp<15){
                    temperatura="muy buena";
                }
                if (temp>=15 && temp<=25){
                    temperatura="normal";
                }
                if (temp>25){
                    temperatura="peligrosa";
                }
                System.out.println("la temperatura es: "+temperatura+",para el momento del dia ingresado: "+md);
                break;
            case "tarde":
                if (temp<20){
                    temperatura="muy buena";
                }
                if (temp>=20 && temp<=30){
                    temperatura="normal";
                }
                if (temp>30){
                    temperatura="peligrosa";
                }
                System.out.println("la temperatura es: "+temperatura+",para el momento del dia ingresado: "+md);
                break;
            case "noche": 
                if (temp<10){
                    temperatura="muy buena";
                }
                if (temp>=10 && temp<=20){
                    temperatura="normal";
                }
                if (temp>20){
                    temperatura="peligrosa";
                }
                System.out.println("la temperatura es: "+temperatura+",para el momento del dia ingresado: "+md);
                break;
            default: System.out.println("Error,ingrese un momento del dia");;   
        }
       // System.out.println("la temperatura es: "+temperatura+",para el momento del dia ingresado: "+md);
       // System.out.println("la temperatura es"+temperatura);

    
}
}
