public class Cuenta {
    double saldoDeCuenta;
     String nombreDelTitular;
     long numeroDeCuenta;

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
        this.saldoDeCuenta=this.saldoDeCuenta-retiro;
    }

    public double getSaldoCuenta()
    {
        return saldoDeCuenta;
    }

}
