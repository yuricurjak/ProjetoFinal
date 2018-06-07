/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoFinal;

/**
 *
 * @author aluno
 */
public class Administrativo extends Funcionario {
    private Setor setor;
    
    public Administrativo(String nome){
        this.nome = nome;
    }

    /**
     * @return the setor
     */
    public Setor getSetor() {
        return setor;
    }

    /**
     * @param setor the setor to set
     */
    public void setSetor(Setor setor) {
        this.setor = setor;
    }

  
    
    
}
