class EmpleadoAsalariado
extends Empleado{

public EmpleadoAsalariado(
String nombre,
double salarioBase,
int aniosEmpresa){

super(
nombre,
salarioBase,
aniosEmpresa
);

}

@Override
public double calcularSalarioBruto(){

double total=
salarioBase+1000000;

if(aniosEmpresa>5){
total+=
salarioBase*0.10;
}

return total;

}

}