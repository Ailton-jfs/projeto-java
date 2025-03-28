package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    // Atributos Triângulo
    // Isso é um atributo
    public double base, altura, lado2, lado3, area, perimetro;

    /**
     * Instancia o Objeto Scanner
     */
    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo(){
        System.out.println("/***********************/");
        System.out.println("/*  Cadastro Triângulo */");
        System.out.println("/***********************/");
        System.out.println("/*Informe a base:      */");
        base = scanner.nextDouble();
        System.out.println("Informe o lado2: ");
        lado2 = scanner.nextDouble();
        System.out.println("Informe o lado3: ");
        lado3 = scanner.nextDouble();
        System.out.println("Informe a altura: ");
        altura = scanner.nextDouble();
        System.out.println("/***********************/");

        return true;
    }


    public void exibirTriangulo() {
        System.out.println("/**  Exibir Triângulo  **/");
        System.out.println("A base é: " + base);
        System.out.println("A altura é: " + altura);
        System.out.println("O lado 2 é: " + lado2);
        System.out.println("O lado 3 é: " + lado3);
        System.out.println("A area é: " + area);
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/*************************/");
    }

    public void calcularArea() {
        System.out.println("/*  Calculando Area  */");
        area = (base * altura) /2;
        System.out.println("A area é: " + area);

    }

    public void calcularPerimetro() {
        System.out.println("/*  Calculando Perimetro  */");
        perimetro = base + lado2 + lado3;
        System.out.println("O perimetro é: " + perimetro);

    }

    /** Definir Tipo de Triangulo */

    /** Equilatero - Escaleno - Isosceles */

    public void definirTipo () {
        System.out.println("/****************************/");
        System.out.println("/* Definindo Tipo Triângulo */");
        System.out.println("/****************************/");

        if (base == lado2 && base == lado3) {
            System.out.println("Esse triângulo é um Equilátero ...");

        } else if (base != lado2 && base != lado3 && lado2 != lado3) {
            System.out.println("Esse triângulo é um Escaleno ...");

        } else {
            System.out.println("Esse triângulo é Isosceles ...");

        }
    }
// Math.pow calcula o lado ao quadrado
    public void trianguloRetangulo () {
        System.out.println("/*****************************/");
        System.out.println("/Definindo Triângulo Retângulo/");
        System.out.println("/*****************************/");

        if ((Math.pow(base, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2))  ||
                (Math.pow(lado2, 2) + Math.pow(lado3, 2) == Math.pow(base, 2)) ||
                (Math.pow(lado3, 2) + Math.pow(base, 2) == Math.pow(lado2, 2))) {
            System.out.println("Esse é Triângulo Retângulo ...");
        } else {
            System.out.println("Esse não é um Triângulo Retângulo ...");
        }
    }
//Math.sqrt calcula a raiz
    public void triangulo345 () {
        System.out.println("/*****************************/");
        System.out.println("/  Definindo Triângulo 3 4 5  /");
        System.out.println("/*****************************/");

        if ((Math.sqrt(Math.pow(base, 2) + Math.pow(lado2, 2)) == Math.pow(lado3, 2)) ||
                (Math.sqrt(Math.pow(lado2, 2) + Math.pow(lado3, 2)) == Math.pow(base, 2)) ||
                (Math.sqrt(Math.pow(lado3, 2) + Math.pow(base, 2)) == Math.pow(lado2, 2))) {
            System.out.println("Esse é Triângulo 3 4 5 ...");
        }  else {
            System.out.println("Esse não é um Triângulo 3 4 5 ...");
        }
    }


}

