import java.util.Scanner;

class Ejercicio12 {
    public static void main(String[] args) {
        int horas, salariobruto, salario;
        double salarioneto, retencionfuente;
        Scanner leerporteclado = new Scanner(System.in);
        
        salario = 5000;
        System.out.println("Ingrese el numero de horas que trabajo ");
        horas = leerporteclado.nextInt();
        salariobruto = horas*salario;
        retencionfuente = (0.125)*salariobruto;
        salarioneto = salariobruto - retencionfuente;
        System.out.println("El salario bruto del trabajador es " + salariobruto);
        
        System.out.println("La retencion de la fuente del trabajador es " + retencionfuente);
        
         System.out.println("El salario neto del trabajador es " + salarioneto);
        
    }
}