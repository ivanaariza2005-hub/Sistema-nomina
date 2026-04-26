import java.util.Scanner;

public class Main{

public static void main(String[] args){

Scanner sc=
new Scanner(System.in);

Empleado empleado;

System.out.println(
"--- SISTEMA NOMINA ---"
);

System.out.println(
"1.Asalariado"
);

System.out.println(
"2.Por horas"
);

System.out.println(
"3.Comision"
);

System.out.println(
"4.Temporal"
);

int tipo=sc.nextInt();

switch(tipo){

case 1:

System.out.println("Nombre:");
String n1=sc.next();

System.out.println("Salario:");
double s1=sc.nextDouble();

if(s1<0){
System.out.println("Dato inválido");
return;
}

System.out.println(
"Años empresa:"
);

int a1=sc.nextInt();

empleado=
new EmpleadoAsalariado(
n1,s1,a1
);

break;


case 2:

System.out.println("Nombre:");
String n2=sc.next();

System.out.println("Horas:");
int horas=sc.nextInt();

if(horas<0){
System.out.println("Horas inválidas");
return;
}

System.out.println("Tarifa:");
double tarifa=sc.nextDouble();

System.out.println("Años:");
int a2=sc.nextInt();

empleado=
new EmpleadoPorHoras(
n2,
horas,
tarifa,
a2
);

break;


case 3:

System.out.println("Nombre:");
String n3=sc.next();

System.out.println(
"Salario base:"
);
double s3=sc.nextDouble();

System.out.println(
"Ventas:"
);

double ventas=
sc.nextDouble();

if(ventas<0){
System.out.println(
"Ventas inválidas"
);
return;
}

System.out.println(
"Comisión (0.05)"
);

double porc=
sc.nextDouble();

empleado=
new EmpleadoComision(
n3,s3,2,
ventas,
porc
);

break;


default:

System.out.println(
"Nombre:"
);

String n4=sc.next();

System.out.println(
"Salario:"
);

double s4=
sc.nextDouble();

empleado=
new EmpleadoTemporal(
n4,s4
);

}

System.out.println(
"Salario bruto: "+
empleado.calcularSalarioBruto()
);

System.out.println(
"Deducciones: "+
empleado.calcularDeducciones()
);

System.out.println(
"Salario neto: "+
empleado.calcularSalarioNeto()
);

}
}