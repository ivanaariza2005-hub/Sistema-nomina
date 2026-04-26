class EmpleadoTemporal
extends Empleado{

    public EmpleadoTemporal(
        String nombre,
        double salarioBase){

        super(
            nombre,
            salarioBase,
            0
        );
    }

    @Override
    public double calcularSalarioBruto(){
        return salarioBase;
    }

}