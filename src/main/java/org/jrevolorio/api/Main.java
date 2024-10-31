package org.jrevolorio.api;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LocalDate fechaActual = LocalDate.now();

        System.out.println("Bienvenido!");

        System.out.println("Ingresa tu edad: ");

        int edad = sc.nextInt();

        int fechaMaquina = fechaActual.getYear();

        int calculo = fechaMaquina - edad;

        System.out.println("Tu año de nacimiento es: " + calculo);

    }
}