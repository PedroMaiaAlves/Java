/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro Henrique
 */
public class AtividadeC {
    private String descricao;
    private static final int CREDITO;
    private int cargaHoraria;
    private int horaRealizada;
    
    
    static{
        CREDITO = 1;
    }
    
    public AtividadeC(String descricao, int cargaHoraria, int horaRealizada){
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.horaRealizada = horaRealizada;
    }
    
    public double calcularCredito(int cargaHoraria, int horaRealizada){
        return ((double)horaRealizada/cargaHoraria) * CREDITO;
    }
    
    public int getHoraRealizada(){
        return horaRealizada;
    }
}
