package com.aluracursos.GenerarArchivos;
import com.aluracursos.Moneda.Movimientos;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeHistorial {


    public void historial(Movimientos movimientos,boolean band) throws IOException {
        Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
        FileWriter documento = new FileWriter("Historial.txt",true);
        if(band==true){
            documento.write(",");
        }
        documento.write(gson.toJson(movimientos));
        documento.close();
    }

}
