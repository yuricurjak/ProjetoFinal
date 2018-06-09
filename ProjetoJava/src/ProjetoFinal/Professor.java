
package ProjetoFinal;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Professor extends Funcionario {
    
    private ArrayList<Escola> escola;
    private ArrayList<Disciplina> disciplinas;
    
    public Professor(String nome, String dataadm, double salario, String endereco, String telefone){
        super(nome, dataadm, salario, endereco, telefone);
        this.disciplinas = new ArrayList<>();
        this.escola = new ArrayList<>();
    }
    /**
     * @return the escola
     */
    public ArrayList<Escola> getEscola() {
        return escola;
    }

    /**
     * @param escola the escola to set
     */
    public void setEscola(ArrayList<Escola> escola) {
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