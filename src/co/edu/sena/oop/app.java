package co.edu.sena.oop;

import java.util.Scanner;

public class app {
    public static void main(String [] args){
        Scanner scr = new Scanner(System.in);
        double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;
        int Opcion;

        data data = new data();

        System.out.println(" Miscelanea ");
        System.out.println("------------------");
        System.out.println("Menú Principal");
        System.out.println("1. Operadores");
        System.out.println("2. Condicionales");
        System.out.println("3. Ciclos");
        System.out.println("99. Salir");
        System.out.println("Ingrese una Opción");
        Opcion = scr.nextInt();
        switch (Opcion){
            case 1: {
                //submenu Operadores
                System.out.println("Categoria Operadores");
                System.out.println("1. Calcular el área de un triángulo");
                System.out.println("2. Suma dos números");
                System.out.println("3. Número al cuadrado");
                System.out.println("4. Convertidor de euros a dólares");
                System.out.println("5. Area y perímetro de un cuadrado");
                System.out.println("6. Area y volúmen de un cilindro");
                System.out.println("7. Radio y Longuitud de una Circuferencia");
                System.out.println("8. Promedio de tres números");
                System.out.println("Digite una Opción");
                Opcion = scr.nextInt();
                switch (Opcion){
                    case 1:{
                        System.out.println("------------------");
                        System.out.println("1. Calcular el área de un triángulo");
                        System.out.println("Ingrese la base:");
                        numero1 =  scr.nextDouble();
                        System.out.println("Ingrese la altura:");
                        numero2 = scr.nextDouble();
                        System.out.println("El área del triangulo es: " + data.areaTriangulo(numero1, numero2));
                    };
                    break;
                    case 2:{
                        System.out.println("--------------");
                        System.out.println("2. Suma dos números");
                        System.out.println("Ingrese Primer Número");
                        numero1 =scr.nextDouble();
                        System.out.println("Ingrese Segundo Número");
                        numero2 =scr.nextDouble();
                        System.out.println("El resultado es: " + data.Sumadosnúmeros(numero1,numero2));
                    };
                    break;
                    case 3:{
                        System.out.println("------------");
                        System.out.println("3. Número al cuadrado");
                        System.out.println("Ingrese Número");
                        numero1 =scr.nextDouble();
                        System.out.println(" El número elevado al Cuadrado es: " + data.Númeroalcuadrado(numero1));
                        System.out.println("   ");
                    };
                    break;
                    case 4:{
                        System.out.println("--------------");
                        System.out.println("4. Convertidor de euros a dólares");
                        System.out.println("Valor euro");
                        numero1 =scr.nextDouble();
                        System.out.println("  ");
                        System.out.println("el valor es: " + data.Convertidordeeurosadólares(numero1)+ "USD.");
                    };
                    break;
                    case 5:{
                        System.out.println("--------------");
                        System.out.println("5. Area y perímetro de un cuadrado");
                        System.out.println("ingrese lado cuadrado en centimetros");
                        numero1 =scr.nextDouble();
                        System.out.println("  ");
                        System.out.println("el area del cuadrado es: " + data.Areadeuncuadrado(numero1)+ "cm2.");
                    };
                    break;
                    case 6:{
                        System.out.println("--------------");
                        System.out.println("6. Area y volúmen de un cilindro");
                        System.out.println("ingrese radio de cilindro en centimetros");
                        numero1 =scr.nextDouble();
                        System.out.println("ingrese la altura del cilindro en centimetro ");
                        System.out.println("  ");
                        System.out.println("el area del cilindro es: " + data.Areadeuncilindro(numero1, numero2)+ "cm2");
                        System.out.println("  ");
                        System.out.println("el area del cuadrado es: " + data.volumendeuncilindro(numero1, numero2)+ "cm2");
                    };
                    break;
                    case 7:{
                        System.out.println("--------------");
                        System.out.println("7. Radio y Longuitud de una Circuferencia");
                        System.out.println("ingrese lado en centimetro");
                        numero1 =scr.nextDouble();
                        System.out.println("  ");
                        System.out.println(" la longitud del circulo es: " + data.RadioyLonguituddeunaCircuferencia(numero1)+ "cm2.");
                        System.out.println("  ");
                        System.out.println("el area del circulo es: " + data.RadioyLonguituddeunaCircuferencia(numero1)+ "cm.");
                        System.out.println("  ");
                    };
                    break;
                    case 8:{
                        System.out.println("--------------");
                        System.out.println("8. Promedio de tres números");
                        System.out.println("ingrese Primer número");
                        numero1 =scr.nextDouble();
                        System.out.println("ingrese segundo número");
                        numero1 =scr.nextDouble();
                        System.out.println("ingrese tercer número");
                        numero1 =scr.nextDouble();
                        System.out.println("  ");
                        System.out.println("el promedio de los 3 números es: " +data.Promediodetresnúmeros(numero1, numero2, numero3));
                    };
                    break;
                    default: {
                        System.out.println("Opción no valida");
                    };
                    break;
                };
            };
            break;
            case 2:{
                //submenu Condicionales
                System.out.println("1. Positivo o Negativo");
                System.out.println("2. Mayor y Menor de dos números");
                System.out.println("3. Mayor y Menor de tres números");
                System.out.println("4. Suma y Resta de dos números");
                System.out.println("5. Cociente entre dos números");
                System.out.println("6. Suma, Resta o Multiplicación");
                System.out.println("7. Año Bisiesto");
                System.out.println("Digite una Opción");
            };
            break;
            case 3:{
                //submenu Ciclos
                System.out.println("1. Múltiplos de 3 entre el 1 y 100");
                System.out.println("2. Números impares entre 0 y 100");
                System.out.println("3. Números pares del 1 al 100");
                System.out.println("4. Cuadrados del 1 al 30");
                System.out.println("5. Suma de Cuadrados de los primeros 100 números");
                System.out.println("6. Secuencia Ascendente entre dos números");
                System.out.println("7. Suma de Números hasta que sea Cero");
                System.out.println("Digite una Opción");
            };
            break;
            case 99:{System.out.println("Salir");}; break;
            default: System.out.println("Opción no valida");
                break;
        };



    };
};
