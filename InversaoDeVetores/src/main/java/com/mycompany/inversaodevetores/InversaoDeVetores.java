/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inversaodevetores;
import java.util.Scanner;

/**
 *
 * @author 1515716
 */
public class InversaoDeVetores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma sequência de caracteres:");
        String input = scanner.nextLine(); 
        
        char[] caracteres = input.toCharArray();
        char[] resultado = new char[caracteres.length];
        int fimIndex = caracteres.length - 1;
        int iniIndex = caracteres.length -1;
        int resultadoIndex = 0; 
        
        while (iniIndex >= 0) {
            
            if (caracteres[iniIndex] == ' ' || iniIndex == 0) {
                int palavraStart = iniIndex == 0 ? iniIndex : iniIndex + 1;
                
                for (int i = palavraStart; i <= fimIndex; i++) {
                    resultado[resultadoIndex++] = caracteres[i];
                }
                if (iniIndex > 0) {
                    resultado[resultadoIndex++] = ' ';
                }
                fimIndex = iniIndex - 1;
            }
            iniIndex--;
        }
       
        System.out.println("Palavras invertidas:");
        System.out.println(new String(resultado).trim());
        
        scanner.close();
    }
}