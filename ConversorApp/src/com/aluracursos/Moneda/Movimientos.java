package com.aluracursos.Moneda;

public class Movimientos{

    private String fecha;
    private String hora;
    private String monedaACambiar;
    private String monedaCambiada;
    private double tasaDeCambio;

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setMonedaACambiar(String monedaACambiar) {
        this.monedaACambiar = monedaACambiar;
    }

    public void setMonedaCambiada(String monedaCambiada) {
        this.monedaCambiada = monedaCambiada;
    }

    public void setTasaDeCambio(double tasaDeCambio) {
        this.tasaDeCambio = tasaDeCambio;
    }
}
