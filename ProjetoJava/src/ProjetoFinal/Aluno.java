/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoFinal;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Aluno extends Pessoa{
    
    private Curso curso;
    private Disciplina disciplinas;
    
    public Aluno(String nome, String endereco, String telefone) {
        /** atribuir os parametros **/
        
        //chamando o construtor do pai (Pessoa)
        super(nome, endereco, telefone);
}

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    /**
     * @return the disciplinas
     */
    public Disciplina getDisciplinas() {
        return disciplinas;
    }

    /**
     * @param disciplinas the disciplinas to set
     */
    public void setDisciplinas(Disciplina disciplinas) {
        this.disciplinas = disciplinas;
    }
}