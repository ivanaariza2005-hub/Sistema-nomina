class EmpleadoPorHoras
extends Empleado{

    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoPorHoras(
        String nombre,
        int horasTrabajadas,
        double tarifaHora,
        int aniosEmpresa){

        super(
            nombre,
            0,
            aniosEmpresa
        );

        this.horasTrabajadas=
        horasTrabajadas;

        this.tarifaHora=
        tarifaHora;
    }

    @Override
    public double calcularSalarioBruto(){

        if(horasTrabajadas<0){
            return 0;
        }

        double salario;

        if(horasTrabajadas<=40){

            salario=
            horasTrabajadas*
            tarifaHora;

        }else{

            salario=
            (40*tarifaHora)+
            (
             (horasTrabajadas-40)
             *(tarifaHora*1.5)
            );
        }

        return salario;
    }

    // fondo ahorro 2%
    @Override
    public double calcularDeducciones(){

        double deduccion=
        calcularSalarioBruto()*0.09;

        if(aniosEmpresa>1){
            deduccion +=
            calcularSalarioBruto()*0.02;
        }

        return deduccion;
    }

}