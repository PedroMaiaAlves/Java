/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro Henrique
 */
public class Aluno {
    private String nome;
    private int numeroMatricula;
    private int codigoCurso;
    private double creditoAtual;
    private int atividadeAtual;
    private static final int MINCREDITO;
    private static final int MINATIVIDADE;
    
    
    static{
        MINCREDITO = 4;
        MINATIVIDADE = 2;
    }
    
    public Aluno(String nome, int numeroMatricula, int codigoCurso){
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.codigoCurso = codigoCurso;
        this.creditoAtual = 0;
        this.atividadeAtual = 0;
    }
    
    public void adicionarCredito(double credito) {
        this.creditoAtual += credito; 
    }
    
    public void completarAtividade() {
        this.atividadeAtual += 1; 
    }
    
    public double getCreditoAtual() {
        return this.creditoAtual;
    }
  
    public int getAtividadeAtual() {
        return this.atividadeAtual;
    }
    
        public boolean isAprovado(){
        return this.creditoAtual>=MINCREDITO && atividadeAtual>=MINATIVIDADE;
        }
}
