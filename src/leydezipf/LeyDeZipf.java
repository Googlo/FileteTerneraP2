/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leydezipf;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author nicolasgarciamunoz
 */

public class LeyDeZipf {

    /**
     * @param args the command line arguments
     */
    ArrayList <File> listaFicheros = new ArrayList<File>();
    
    private void addFiles (File file) {
        if (!file.exists()){
            System.out.println(file + "no existe.");
        }
        else if (file.isDirectory()){
            for (File f : file.listFiles()){
                listaFicheros.add(f);
            }
        }
        else{
            listaFicheros.add(file);
        }
        for (int i = 0; i<listaFicheros.size(); i++){
            System.out.println(listaFicheros.get(i));
        }
    }
    public static void main(String[] args) {
        File teTernera = new File ("/Users/nicolasgarciamunoz/Downloads");
        LeyDeZipf nuevo = new LeyDeZipf();
        nuevo.addFiles(teTernera);
    }
    
}
