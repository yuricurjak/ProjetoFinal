
package ProjetoFinal;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Professor extends Funcionario {
    
    private ArrayList<Escola> escolas;
    private ArrayList<Disciplina> disciplinas;
    
    public Professor(String nome, String dataadm, double salario, String endereco, String telefone){
        super(nome, dataadm, salario, endereco, telefone);
        this.disciplinas = new ArrayList<>();
        this.escolas = new ArrayList<>();
    }
    /**
     * @return the escola
     */
    public ArrayList<Escola> getEscola() {
        return escolas;
    }

    /**
     * @param escola the escola to set
     */
    public void setEscola(ArrayList<Escola> escola) {
        this.escolas = escola;
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
    public void addEscola( Escola escola ) {
	escolas.add( escola );
    }
    public void removeEscola(Escola escola){
        escolas.remove(escola);
    }
    public void showEscolas() {
		for(int i=0; i < escolas.size(); i++)
			System.out.println(escolas.get(i).getNome());         
    }
    
    public void addDisciplina( Disciplina disciplina ) {
	disciplinas.add( disciplina );
    }
    public void removeDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }
    public void showDisciplinas() {
		for(int i=0; i < disciplinas.size(); i++)
			System.out.println(disciplinas.get(i).getNome());         
    }
    
    
}