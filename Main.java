/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro Henrique
 */
public class Main {
    public static void main(String[] args) {
        // Cria um aluno
        Aluno a1 = new Aluno("Pedro", 1, 2);
        
        // Cria uma atividade formativa
        Formativa at1 = new Formativa("Atividade de Matemática", 75);
        
        // O aluno realiza a atividade
        at1.realizarAtividade(a1);
        
        a1.isAprovado();
        
        // Exibe os créditos e o número de atividades concluídas pelo aluno
        System.out.println("Creditos atuais: " + a1.getCreditoAtual());
        System.out.println("Atividades concluidas: " + a1.getAtividadeAtual());
        System.out.println(a1.isAprovado());
                
    }
}
