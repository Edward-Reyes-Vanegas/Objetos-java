import java.util.Random;
public class Main {
    public static void main(String[] args)
    {

        long aleatorio;
        String nombre;
        long saldo;
        double retiro;
        double deposito;

        aleatorio=(long)(Math.random()*10000000+1);
        //Creacion de Objeto Cuenta
        Cuenta cuenta1=new Cuenta(500000, "Edward", aleatorio);

        //creando cuenta mateo
        aleatorio=(long)(Math.random()*10000000+1);
        Cuenta cuentaMateo=new Cuenta(5000000, "Mateo", aleatorio);

        //creando cuenta juan
        aleatorio=(long)(Math.random()*10000000+1);
        Cuenta cuentaJuan=new Cuenta(1000000, "Juan", aleatorio);

        //creando banco
        Banco banco=new Banco();

        //Se Muestra el objeto Creado
        System.out.println(cuenta1.toString());

        //Asigno valores a variables
        saldo=200000;
        nombre="Jineth Cano";
        aleatorio=(long)(Math.random()*10000000+1);

        //Cambiando datos de cuenta1
        cuenta1.setIngresos(saldo, nombre, aleatorio);

        System.out.println("\n");
        System.out.println(cuenta1.toString());

        //hacer retiro de la cuenta
        retiro=40000;
        cuenta1.setRetiro(retiro);

        //mostrando saldo despues de retiro
        System.out.println("\n");
        System.out.println(cuenta1.getSaldoCuenta());

        //agregando cuentas a banco
        banco.agregarCuenta(cuentaMateo);
        banco.agregarCuenta(cuentaJuan);

        //haciendo transferencia de una cuenta a otra
        deposito=4000000;
        banco.transferir(cuentaMateo, cuentaJuan, deposito);


    }
}