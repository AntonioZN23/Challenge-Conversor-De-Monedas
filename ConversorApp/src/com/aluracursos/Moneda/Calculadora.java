package com.aluracursos.Moneda;

import com.aluracursos.API.ConsultaMoneda;

import java.time.LocalDate;
import java.time.LocalTime;

public class Calculadora {

    private double conversion;

    public double getConversion() {
        return conversion;
    }

    public void calcularCambio(double cantidad, String abreviatura1, String abreviatura2, Movimientos obj){
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();
        Moneda moneda = consultaMoneda.buscaMoneda(abreviatura1);

        System.out.printf("\nActualmente el factor de cambio de 1 %s a %s es de: %.3f",abreviatura1, abreviatura2, moneda.conversion_rates().get(abreviatura2));

        this.conversion = cantidad * moneda.conversion_rates().get(abreviatura2);

        System.out.printf("\nEl valor %.2f [%s] corresponde al valor final de =>>> %.2f [%s]",cantidad,abreviatura1,this.conversion,abreviatura2);

        obj.setFecha(String.valueOf(LocalDate.now()));
        obj.setHora(String.valueOf(LocalTime.now()));
        obj.setMonedaACambiar(abreviatura1);
        obj.setMonedaCambiada(abreviatura2);
        obj.setTasaDeCambio(moneda.conversion_rates().get(abreviatura2));
    }

    public void Evaluar(int variable, double valor, Movimientos item){
        switch (variable){
            case 1: calcularCambio(valor,"USD","ARS",item);
                break;
            case 2: calcularCambio(valor,"ARS","USD",item);
                break;
            case 3: calcularCambio(valor,"USD","BRL",item);
                break;
            case 4: calcularCambio(valor,"BRL","USD",item);
                break;
            case 5: calcularCambio(valor,"USD","COP",item);
                break;
            case 6: calcularCambio(valor,"COP","USD",item);
                break;
            case 7: calcularCambio(valor,"USD","MXN",item);
                break;
            case 8: calcularCambio(valor,"MXN","USD",item);
                break;
            case 9: calcularCambio(valor,"ARS","MXN",item);
                break;
            case 10: calcularCambio(valor,"MXN","ARS",item);
                break;
            case 11: calcularCambio(valor,"BRL","MXN",item);
                break;
            case 12: calcularCambio(valor,"MXN","BRL",item);
                break;
        }
    }

}
