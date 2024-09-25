/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro Henrique
 */
public class Formativa extends AtividadeC {
    private static final int CARGAHORARIA;
    
    static{
            CARGAHORARIA = 30;
    }
    
    public Formativa(String descricao, int horaRealizada){
        super(descricao, CARGAHORARIA, horaRealizada);
    }
    public void realizarAtividade(Aluno aluno) {
        double credito = calcularCredito(CARGAHORARIA, getHoraRealizada()); 
        aluno.adicionarCredito(credito);
        aluno.completarAtividade(); 
    }
}
