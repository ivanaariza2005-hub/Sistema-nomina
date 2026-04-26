abstract class Empleado {

protected String nombre;
protected double salarioBase;
protected int aniosEmpresa;

public Empleado(
String nombre,
double salarioBase,
int aniosEmpresa){

this.nombre=nombre;
this.salarioBase=salarioBase;
this.aniosEmpresa=aniosEmpresa;

}

public abstract double calcularSalarioBruto();

public double calcularDeducciones(){

return calcularSalarioBruto()*0.09;

}

public double calcularSalarioNeto(){

return
calcularSalarioBruto()
-
calcularDeducciones();

}

}