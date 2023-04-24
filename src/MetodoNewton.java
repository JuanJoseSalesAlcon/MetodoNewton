
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class MetodoNewton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iteracion = 0;
        
        System.out.println("Ingrese el punto A de desde donde desea evaluar la raiz: ");
        double Pn = sc.nextDouble();
        
        System.out.println("Ingrese el numero de iteraciones: ");
        double It = sc.nextInt();
        
        System.out.println("------FUNCION--------");
        System.out.println("Ingrese el valor del primer termino ");
        double a = sc.nextDouble();
        System.out.println("Ingrese el valor de su exponente (si no tiene ingrese 1)");
        double ae = sc.nextDouble();
        System.out.println("Ingrese el valor del segundo termino (si no tiene ingrese 0)");
        double b = sc.nextDouble();
        System.out.println("Ingrese el valor de su exponente (si no tiene ingrese 1)");
        double be = sc.nextDouble();
        System.out.println("Ingrese el valor del tercer termino (si no tiene ingrese 0)");
        double c = sc.nextDouble();
        System.out.println("Ingrese el valor de su exponente (si no tiene ingrese 1)");
        double ce = sc.nextDouble();
        System.out.println("Ingrese el valor del termino independiente (si no tiene ingrese 0)");
        double d = sc.nextDouble();
        
        System.out.println("------FUNCION DERIVADA--------");
        System.out.println("Ingrese el valor del primer termino ");
        double aD = sc.nextDouble();
        System.out.println("Ingrese el valor de su exponente (si no tiene ingrese 1)");
        double aDe = sc.nextDouble();
        System.out.println("Ingrese el valor del segundo termino (si no tiene ingrese 0)");
        double bD = sc.nextDouble();
        System.out.println("Ingrese el valor de su exponente (si no tiene ingrese 1)");
        double bDe = sc.nextDouble();
        System.out.println("Ingrese el valor del tercer termino (si no tiene ingrese 0)");
        double cD = sc.nextDouble();
        System.out.println("Ingrese el valor de su exponente (si no tiene ingrese 1)");
        double cDe = sc.nextDouble();
        System.out.println("Ingrese el valor del termino independiente (si no tiene ingrese 0)");
        double dD = sc.nextDouble();
        
        double fPn = 0, fDPn = 0, C = 0, fC = 0, Error = 9999;
        double XmAnterior = 0;
        
        
        while(iteracion <= It){
            
            fPn = a * (Math.pow(Pn, ae)) + b * (Math.pow(Pn, be)) + c * (Math.pow(Pn, ce)) + d;
            fDPn = aD * (Math.pow(Pn, aDe)) + bD * (Math.pow(Pn, bDe)) + cD * (Math.pow(Pn, cDe)) + dD;
            
            Error = Math.abs((Pn - XmAnterior));
            
            System.out.println("Iteracion: " + iteracion +
                    "\t\tP[n]: " + Pn + "\t\tf(P[n]): " + fPn + "\t\tf'(P[n]): " + fDPn + "\t\tError: " + Error);
            
            XmAnterior = Pn;
            Pn = Pn - (fPn/fDPn);

            iteracion++;
        }
    }
    
}
