package com.example.simuladorcalculadora.runner;

import com.example.simuladorcalculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ArranqueRunner implements CommandLineRunner {

    @Autowired
    private CalculadoraService calculadoraService;

    @Value("${calculadora.mensaje}")
    private String mensaje;

    @Override
    public void run(String... args) throws Exception {
        int resultadoSuma = calculadoraService.sumar(5, 10);
        double promedio = calculadoraService.calcularPromedio(new int[]{4, 8, 15, 16, 23, 42});

        System.out.println("===== " + mensaje + " =====");
        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Promedio calculado: " + promedio);
    }
}