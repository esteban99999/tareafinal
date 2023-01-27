/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Carrera;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author esteb
 */
public class CarreraServiceImpl implements CarreraService{

       public static List<Carrera> carreraList=new ArrayList<>();

public CarreraServiceImpl(){


}
    @Override
    public void crear(Carrera carrera) {
        this.carreraList.add(carrera);
        this.almacenarArchivo(carrera, "C:/Netbeans1/carrera.dat");
    
    }
    

    @Override
    public List<Carrera> listar() {
        return this.carreraList;
    }


       @Override
    public Carrera buscaCodigo(int codigo) {
        Carrera retorno = null;
        for (Carrera carrera : this.carreraList) {
            if (codigo == carrera.getCodigo()) {
                retorno = carrera;
                break;

            }
        }
        return retorno;
    }
    @Override
    public void modificar(Carrera carrera, int codigo) {
        int indice = -1;
        for (Carrera universidades : this.carreraList) {
            indice++;
            if (codigo == universidades.getCodigo()) {
                this.carreraList.set(indice, carrera);

            }

        }
    }

    @Override
    public void eliminar(int codigo) {
        int indice = -1;
        for (Carrera carreras : this.carreraList) {
            indice++;
            if (codigo == carreras.getCodigo()) {
                this.carreraList.remove(indice);

            }

        }

    }
@Override
    public List<Carrera> recuperarArchivo(String ruta) {
        List<Carrera> carreraList = new ArrayList<Carrera>();

        ObjectInputStream entrada = null;
        try {
            FileInputStream fis = new FileInputStream(new File(ruta));
            while (fis.available() > 0) {
                entrada = new ObjectInputStream(fis);
                Carrera carrera = (Carrera) entrada.readObject();
                carreraList.add(carrera);

            }
            entrada.close();

        } catch (Exception ex) {
            try {
                entrada.close();
            } catch (IOException ex1) {
                Logger.getLogger(CarreraServiceImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        return carreraList;

    }

    @Override
    public void almacenarArchivo(Carrera carrera, String ruta) {
        ObjectOutputStream salida = null;

        try {
            salida = new ObjectOutputStream(new FileOutputStream(ruta, true));
            salida.writeObject(carrera);
            salida.close();

        } catch (Exception ex) {

            Logger.getLogger(CarreraServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Actualizar() {
        File Borrarfile = new File("C:/Netbeans1/carrera.dat");
        Borrarfile.delete();

        for (int i = 0; i < carreraList.size(); i++) {
            this.almacenarArchivo(carreraList.get(i), "C:/Netbeans1/carrera.dat");

        }

    }

    public void setCarreraList(List<Carrera> carreralist) {
        CarreraServiceImpl.carreraList = carreralist;
    } 
}
