/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Universidad;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author esteb
 */
public class UniversidadServiceImpl implements UniversidadService {

    private static List<Universidad> universidadList = new ArrayList<>();

    @Override
    public void crear(Universidad universidad) {
        this.universidadList.add(universidad);
        System.out.print(universidadList);
        this.almacenarArchivo(universidad, "C:/Netbeans1/universidad.dat");
    
    }

    @Override
    public List<Universidad> listar() {
        System.out.print(universidadList);
        return this.universidadList;
    }

    @Override
    public Universidad UniversidadCodigo(int codigo) {
        Universidad retorno = null;
        for (Universidad universidad : this.universidadList) {
            if (codigo == universidad.getCodigo()) {
                retorno = universidad;
                break;

            }
        }
        return retorno;
    }

    @Override
    public void modificar(Universidad universidad, int codigo) {

        int indice = -1;
        for (Universidad universidades : this.universidadList) {
            indice++;
            if (codigo == universidades.getCodigo()) {
                this.universidadList.set(indice, universidad);

            }

        }
    }

    @Override
    public void eliminar(int codigo) {
        int indice = -1;
        for (Universidad universidades : this.universidadList) {
            indice++;
            if (codigo == universidades.getCodigo()) {
                this.universidadList.remove(indice);

            }

        }
        
    }
 @Override
    public List<Universidad> recuperarArchivo(String ruta) {
    /* ArrayList universidadlist = new ArrayList<Universidad>();
        DataInputStream entrada = null;
        try {
            entrada = new DataInputStream(new FileInputStream(ruta));
            while (true) {
                int codigo=entrada.readInt();
                String nombre = entrada.readUTF();
                int periodo = entrada.readInt();
                int yearFundacion = entrada.readInt();
                int numFacultades = entrada.readInt();

                entrada.close();
     
                Universidad universidad = new Universidad(codigo,nombre, periodo,yearFundacion,numFacultades);
                System.out.print(universidad.getCodigo());
                universidadlist.add(universidad);
            }
        } catch (IOException e) {
            try {
                entrada.close();
            } catch (IOException ex) {
                Logger.getLogger(UniversidadServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return universidadlist;    */
     List<Universidad> universidadList = new ArrayList<Universidad>();

        ObjectInputStream entrada = null;
        try {
            FileInputStream fis = new FileInputStream(new File(ruta));
            while (fis.available() > 0) {
                entrada = new ObjectInputStream(fis);
                Universidad universidad = (Universidad) entrada.readObject();
                universidadList.add(universidad);

            }
            entrada.close();

        } catch (Exception ex) {
            try {
                entrada.close();
            } catch (IOException ex1) {
                Logger.getLogger(UniversidadServiceImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        return universidadList;}
    
    

    @Override
    public void almacenarArchivo(Universidad universidad, String ruta) {
     DataOutputStream salida = null;

        try {
            salida = new DataOutputStream(new FileOutputStream(ruta, true));
            salida.writeUTF(universidad.getNombre());
            salida.writeInt(universidad.getCodigo());
            salida.writeInt(universidad.getNumFacultades());
            salida.writeInt(universidad.getPeriodo());
            salida.writeInt(universidad.getYearFundacion());


           

        } catch (IOException ex) {
            Logger.getLogger(UniversidadServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
    
    }
      public   void setUniversidadList(List<Universidad> universidadList) {
        UniversidadServiceImpl.universidadList= universidadList;
    }
      public void Actualizar() {
          File Borrarfile= new File("C:/Netbeans1/universidad.dat");
        Borrarfile.delete();
        
        
        for(int i=0;i<universidadList.size();i++){
        this.almacenarArchivo(universidadList.get(i),"C:/Netbeans1/universidad.dat");
        }
}
}
