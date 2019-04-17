/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atualizadorneuron;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
/**
 *
 * @author prixmacbookpro
 */
public class AtualizadorNeuron extends Verificador{

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    if (consegueConectar("https://prix.tech/")) {
            System.out.println("conseguiu conectar");
            Verificador verificador = new Verificador();
            verificador.download("", "", "", 1);
    } else {
            System.out.println("nao conseguiu conectar");
    }
}

public static boolean consegueConectar(String address) {
    try {
            URL url = new URL(address);
            URLConnection connection = url.openConnection();
            connection.connect();
            return true;
    } catch (IOException e) {
            e.printStackTrace();
            return false;
    }
}   

}
