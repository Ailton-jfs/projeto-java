package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void executarMenu() {

        boolean exit = false;

        while (!exit) {

            System.out.println("/************************/");
            System.out.println("/*      Geometria       */");
            System.out.println("/************************/");
            System.out.println("/* 1 - Circulo          */");
            System.out.println("/* 2 - Retângulo        */ ");
            System.out.println("/* 3 - Triângulo        */");
            System.out.println("/* 4 - Sair             */");
            System.out.println("/************************/");
            System.out.print("Informe a opção desejada:");

            int optionUser = scanner.nextInt();

            switch (optionUser) {
                case 1:

                    boolean exitCirculo = false;

                    boolean validaCadastro = false;
                    Circulo circulo = new Circulo();

                    while (!exitCirculo) {

                        System.out.println("/**************************/");
                        System.out.println("/*        Circulo         */");
                        System.out.println("/**************************/");
                        System.out.println("/* 1 - Cadastrar Circulo  */");
                        System.out.println("/* 2 - Calcular Area      */");
                        System.out.println("/* 3 - Calcular Perimetro */");
                        System.out.println("*/ 4 - Sair               */");
                        System.out.println("/**************************/");

                        System.out.print("Escolha uma opção: ");

                        int optionCirculo = scanner.nextInt();


                        switch (optionCirculo) {
                            case 1:
                                System.out.println("Cadastrando Circulo...");
                                validaCadastro = circulo.cadastrarCirculo();
                                break;
                            case 2:
                                if (validaCadastro) {
                                    System.out.println("Calculando Área");
                                    circulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Circulo..");
                                }
                                break;
                            case 3:
                                if (validaCadastro) {
                                    System.out.println("Calculando Perimetro...");
                                    circulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Circulo..");
                                }
                                break;
                            case 4:
                                System.out.println("Voltando para Menu...");
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("Opção Inválida...");
                        }

                    }
                    break;
                case 2:
                    boolean exitRetangulo = false;
                    boolean validaRetangulo = false;

                    // Esse comando cria um objeto
                    Retangulo retangulo = new Retangulo();

                    while (!exitRetangulo) {
                        System.out.println("/***************************/");
                        System.out.println("/*        Retângulo        */");
                        System.out.println("/***************************/");
                        System.out.println("/* 1 - Cadastrar Retângulo */");
                        System.out.println("/* 2 - Calcular Area       */");
                        System.out.println("/* 3 - Calcular Perimetro  */");
                        System.out.println("/* 4 - Definir Quadrado    */");
                        System.out.println("*/ 5 - Sair                */");
                        System.out.println("/***************************/");

                        System.out.print("Escolha uma opção: ");

                        int optionRetangulo = scanner.nextInt();

                        switch (optionRetangulo) {
                            case 1:
                                System.out.println("Cadastrando um Retângulo:...");
                                validaRetangulo = retangulo.cadastrarRetangulo();
                                break;
                            case 2:
                                if (validaRetangulo) {
                                    System.out.println("Calculando Área");
                                    retangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Retangulo..");
                                }
                                break;
                            case 3:
                                if (validaRetangulo) {
                                    System.out.println("Calculando Perimetro...");
                                    retangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Retângulo..");
                                }
                                break;
                            case 4:
                                System.out.println("/** Definindo Quadrado **/");
                                if (validaRetangulo) {
                                    retangulo.validarQuadrado();
                                }
                                break;
                            case 5:
                                System.out.println("Saindo ....");
                                exit = true;
                                break;
                            default:
                                System.out.println("Opção Inválida...");
                        }
                    }
                    break;
                case 3:
                    boolean exitTriangulo = false;
                    boolean validaTriangulo = false;

                    // Esse comando cria um objeto
                    Triangulo triangulo = new Triangulo();

                    while (!exitTriangulo) {
                        System.out.println("/******************************/");
                        System.out.println("/*          Triângulo         */");
                        System.out.println("/******************************/");
                        System.out.println("/* 1 - Cadastrar Triângulo    */");
                        System.out.println("/* 2 - Calcular Area          */");
                        System.out.println("/* 3 - Calcular Perimetro     */");
                        System.out.println("/* 4 - Tipo de Triângulo      */");
                        System.out.println("/* 5 - Triângulo Retângulo    */");
                        System.out.println("/* 6 - Triângulo 3 4 5        */");
                        System.out.println("*/ 7 - Sair                   */");
                        System.out.println("/******************************/");

                        System.out.print("Escolha uma opção: ");

                        int optionTriangulo = scanner.nextInt();

                        switch (optionTriangulo) {
                            case 1:
                                System.out.println("Cadastrando um Triângulo:...");
                                validaTriangulo = triangulo.cadastrarTriangulo();
                                break;
                            case 2:
                                if (validaTriangulo) {
                                    System.out.println("Calculando Área");
                                    triangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Triângulo..");
                                }
                                break;
                            case 3:
                                if (validaTriangulo) {
                                    System.out.println("Calculando Perimetro...");
                                    triangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Triângulo..");
                                }
                                break;
                            case 4:
                                if (validaTriangulo) {
                                    System.out.println("Verificando tipo de Triângulo...");
                                    triangulo.definirTipo();
                                } else {
                                    System.out.println("Cadastre um Triângulo..");
                                }
                                break;
                            case 5:
                                if (validaTriangulo) {
                                    System.out.println("Verificando se é um Triângulo Retângulo...");
                                    triangulo.trianguloRetangulo();
                                } else {
                                    System.out.println("Cadastre um Triângulo..");
                                }
                                break;
                            case 6:
                                if (validaTriangulo) {
                                    System.out.println("Verificando se é um Triângulo 3 4 5...");
                                    triangulo.triangulo345();
                                } else {
                                    System.out.println("Cadastre um Triângulo..");
                                }
                                break;
                            case 7:
                                System.out.println("Saindo ....");
                                exit = true;
                                break;
                            default:
                                System.out.println("Opção Inválida...");
                        }
                    }

            }
        }

    }
}

//            if (optionUser == 1) {
//                System.out.println("Escolheu 1");
//
//            } else if (optionUser == 2) {
//                System.out.println("Escolheu 2");
//
//            } else if (optionUser == 3) {
//                System.out.println("Escolheu 3");
//
//            } else if (optionUser == 4) {
//                System.out.println("Escolheu 4");
//                exit = true;
//
//            } else {
//                System.out.println("Opção Inválida...");

