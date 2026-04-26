class EmpleadoComision
extends Empleado{

    private double ventas;
    private double porcentaje;

    public EmpleadoComision(
        String nombre,
        double salarioBase,
        int aniosEmpresa,
        double ventas,
        double porcentaje){

        super(
            nombre,
            salarioBase,
            aniosEmpresa
        );

        this.ventas=ventas;
        this.porcentaje=porcentaje;
    }

    @Override
    public double calcularSalarioBruto(){

        if(ventas<0){
            return 0;
        }

        double comision=
        ventas*porcentaje;

        double bono=0;

        if(ventas>20000000){
            bono=ventas*0.03;
        }

        return salarioBase
               +comision
               +bono
               +1000000;
    }

}