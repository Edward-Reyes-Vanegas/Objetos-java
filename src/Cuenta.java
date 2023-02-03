public class Cuenta {
    private double saldoDeCuenta;
     private String nombreDelTitular;
     private long numeroDeCuenta;

    public Cuenta(double saldoDeCuenta, String nombreDelTitular, long numeroDeCuenta)
    {
        this.saldoDeCuenta=saldoDeCuenta;
        this.nombreDelTitular=nombreDelTitular;
        this.numeroDeCuenta=numeroDeCuenta;

    }

    public void setIngresos(double saldo, String nombre, long numeroCuenta)
    {
        this.saldoDeCuenta=saldo;
        this.nombreDelTitular=nombre;
        this.numeroDeCuenta=numeroCuenta;

    }

    public void setRetiro(double retiro)

    {
        if(this.saldoDeCuenta>retiro)
        {
            this.saldoDeCuenta=this.saldoDeCuenta-retiro;

        }else
        {
            System.out.println("\n");
            System.out.println("FONDOS INSUFICIENTES");

        }

    }

    public void setDeposito(double deposito)
    {
        this.saldoDeCuenta=this.saldoDeCuenta+deposito;

    }

    public double getSaldoCuenta()

    {
        return saldoDeCuenta;
    }

    @Override
    public String toString()
    {
        return  "  Este es el Saldo De la Cuenta  " + saldoDeCuenta + "  El Nombre del Titular es  " + nombreDelTitular + "  El Numero de la Cuenta es:  " + numeroDeCuenta;
    }
}
