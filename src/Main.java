import java.util.*;
public class Main {
    public static void main(String[] args)
    {

        long aleatorio;
        double saldo;
        String nombre;
        double retiro;

        aleatorio=(long)(Math.random()*10000000+1);
        //Creacion de Objeto Cuenta
        Cuenta cuenta1=new Cuenta(500000, "Edward", aleatorio);

        //Se Muestra el objeto Creado
        System.out.println("este es el saldo en la cuenta   "+cuenta1.saldoDeCuenta);
        System.out.println("este es el nombre del titular de la cuenta   "+cuenta1.nombreDelTitular);
        System.out.println("este es Numero de Cuenta   "+cuenta1.numeroDeCuenta);

        //Asigno valores a variables
        saldo=200000;
        nombre="Jineth Cano";
        aleatorio=(long)(Math.random()*10000000+1);

        //Cambiando datos de cuenta1
        cuenta1.setIngresos(saldo, nombre, aleatorio);

        System.out.println("\n");
        System.out.println("este es el saldo en la cuenta   "+cuenta1.saldoDeCuenta);
        System.out.println("este es el nombre del titular de la cuenta   "+cuenta1.nombreDelTitular);
        System.out.println("este es Numero de Cuenta   "+cuenta1.numeroDeCuenta);

        //hacer retiro de la cuenta
        retiro=40000;
        cuenta1.setRetiro(retiro);
        saldo=cuenta1.getSaldoCuenta();

        System.out.println("\n");
        if(saldo>0)
        {
            System.out.println("este es el nuevo saldo en la cuenta   "+saldo);
        }else
        {
            System.out.println("\n");
            System.out.println("FONDOS INSUFICIENTES");

        }


    }
}