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
    // colocar tipo curso
    private Curso curso;
    private ArrayList<Disciplina> disciplinas;
    
    public Aluno(String nome){
    this.nome = nome;
    this.disciplinas = new ArrayList<>();
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
    
     public void addDisciplinas( Disciplina disciplina ) {
		
		this.disciplinas.add( disciplina );
    }
   
}
