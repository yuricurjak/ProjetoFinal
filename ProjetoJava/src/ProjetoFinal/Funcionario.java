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
public class Funcionario extends Pessoa {

    private String dataadm;
    private double salario;

    public Funcionario(String nome, String dataadm, double salario, String endereco, String telefone) {
        /** atribuir os parametros **/
        
        //chamando o construtor do pai (Pessoa)
        super(nome, endereco, telefone);
    }
    
    
    /**
     * @return the dataadm
     */
    public String getDataadm() {
        return dataadm;
    }

    /**
     * @param dataadm the dataadm to set
     */
    public void setDataadm(String dataadm) {
        this.dataadm = dataadm;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
   
}
