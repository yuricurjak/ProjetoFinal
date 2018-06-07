
package ProjetoFinal;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Professor extends Funcionario {
    
    private Escola escola;
    private ArrayList<Disciplina> disciplinas;
    
    public Professor(String nome){
    this.nome = nome;
    this.disciplinas = new ArrayList<>();
    }
    /**
     * @return the escola
     */
    public Escola getEscola() {
        return escola;
    }

    /**
     * @param escola the escola to set
     */
    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    /**
     * @return the disciplinas
     */
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    /**
     * @param disciplinas the disciplinas to set
     */
    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    public void addDisciplinas( Disciplina disciplina ) {
		
		this.disciplinas.add( disciplina );
    }
    
}