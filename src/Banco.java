public class Banco
{
    private Cuenta[] cuentas;
    private int contadorCuentas;

    public Banco()
    {

        this.cuentas = new Cuenta[2];
    }
    public void agregarCuenta(Cuenta cuenta)
    {
        if(contadorCuentas <= 1)
        {
            this.cuentas[contadorCuentas] = cuenta;
            this.contadorCuentas++;
        } else
        {
            System.out.println("No se pueden agregar mas Cuentas");
        }
    }

    public void transferir(Cuenta cuentaMateo, Cuenta cuentaJuan, double cantidad)
    {
        if(cuentaMateo.getSaldoCuenta()>cantidad)
        {
            cuentaMateo.setRetiro(cantidad);
            cuentaJuan.setDeposito(cantidad);
            System.out.println("\n");
            System.out.println("EL DINERO DISPONIBLE ES MATEO ES "+cuentas[0].getSaldoCuenta());
            System.out.println("EL DINERO DISPONIBLE ES JUAN ES "+cuentas[1].getSaldoCuenta());

        }else
        {
            System.out.println("\n");
            System.out.println("NO HAY FONDOS SUFICIENTES PARA REALIZAR LA TRANSFERENCIA");
        }

    }


}
