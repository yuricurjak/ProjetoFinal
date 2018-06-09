
package ProjetoFinal;

import java.util.ArrayList;

public class Turma {
    
    private int id;
    //atributo unico
    private Disciplina disciplina;
     //atributo unico
    private Professor professor;
    
    private ArrayList<Aluno> alunos;
    private static int idcount;
    
    public Turma(){
    this.id = idcount++;
    this.alunos =  new ArrayList<>();
    }

    
    public void addAluno( Aluno aluno ) {
		this.alunos.add( aluno );
	}

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the disciplina
     */
    public Disciplina getDisciplina() {
        return disciplina;
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    /**
     * @return the professor
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    /**
     * @return the alunos
     */
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    
    
    
    
}
