package com.aluracursos.Main;

import java.io.IOException;
import java.util.Scanner;
import com.aluracursos.GenerarArchivos.GeneradorDeHistorial;
import com.aluracursos.Moneda.Calculadora;
import com.aluracursos.Moneda.Movimientos;

public class ConversorApp {
    public static void main(String[] args) {
        String menu = """
                \n\n*****************************************************
                Sea bienvenido/a al Conversor de Monedas! =D
                
                1) Dólar => Peso argentino
                2) Peso argentino => Dólar
                3) Dólar => Real brasileño
                4) Real brasileño => Dólar
                5) Dólar => Peso colombiano
                6) Peso colombiano => Dólar
                7) Dólar => Peso Mexicano
                8) Peso Mexicano => Dólar
                9) Peso argentino => Peso Mexicano
                10) Peso Mexicano => Peso argentino
                11) Real brasileño => Peso Mexicano
                12) Peso Mexicano => Real brasileño
                13) Salir
                Elija una opción valida: 
                *****************************************************
                """;

        Scanner scanner = new Scanner(System.in);
        int opc;
        Calculadora calculadora = new Calculadora();
        GeneradorDeHistorial registro = new GeneradorDeHistorial();
        boolean band = false;

        do{

            try{
                System.out.println(menu);
                opc = scanner.nextInt();
                if(opc==13){
                    break;
                }

                if(opc>=1 && opc<=12){
                    System.out.println("\nIngresa el valor que deseas convertir: ");
                    double cantidad = scanner.nextDouble();

                    Movimientos item = new Movimientos();
                    calculadora.Evaluar(opc,cantidad,item);
                    registro.historial(item,band);

                }
                else{
                    System.out.println("\nIngresaste una opción inválida, porfavor vuelve a intentarlo.");
                }

            }catch (RuntimeException e){
                System.out.println("\nOh no, algo salió mal. ¡Procura introducir números válidos en la entrada! \nFinalizando la ejecucion...");
                break;
            }catch (Error e){
                System.out.println("\nParece que algo salió extremadamente mal. \nLamentamos el incoveniente, vuelve a ejecutar el programa porfavor...");
                break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }while (true);

        System.out.printf("\n\nGracias por usar los servicios del Conversor de Monedas.\n\n¡Vuelve pronto!");

    }
}