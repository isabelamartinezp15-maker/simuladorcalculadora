package com.example.simuladorcalculadora.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public int sumar(int a, int b) {
        return a + b;
    }

    public double calcularPromedio(int[] numeros) {
        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }
        return (double) suma / numeros.length;
    }
}
