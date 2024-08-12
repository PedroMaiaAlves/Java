/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tratararquivo;

/**
 *
 * @author 1515716
 */

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TratarArquivo {

    public static void main(String[] args) {
        String path = ".\\src\\main\\java\\com\\mycompany\\tratararquivo\\arq2.txt";
        try{
            OutputStream os = new FileOutputStream(path);
            Writer wr = new OutputStreamWriter(os);
            BufferedWriter br = new BufferedWriter(wr);
            br.write("Escrevendo o primeiro arquivo em Java");
            br.newLine();
            br.newLine();
            br.write("Outra linha");
            br.newLine();
            br.newLine();
            br.write("Novo texto");
            br.close();
        } catch (Exception e) {
            System.out.println("Alo de errado não está certo!");
        }
    }
}
