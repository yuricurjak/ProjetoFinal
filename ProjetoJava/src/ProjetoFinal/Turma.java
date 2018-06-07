
package ProjetoFinal;

import java.util.ArrayList;

public class Turma {
    
    private int id;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos;
    private static int idcount;
    
    public Turma(){
    this.id = idcount++;
    this.disciplinas =  new ArrayList<>();
    this.professores =  new ArrayList<>();
    this.alunos =  new ArrayList<>();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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

    /**
     * @return the professores
     */
    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    /**
     * @param professores the professores to set
     */
    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
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

    /**
     * @return the idcount
     */
    public static int getIdcount() {
        return idcount;
    }

    /**
     * @param aIdcount the idcount to set
     */
    public static void setIdcount(int aIdcount) {
        idcount = aIdcount;
    }
    
    public void addDisciplinas( Disciplina disciplina ) {
		
		this.disciplinas.add( disciplina );
    }
    public void addProfessores( Professor professor ) {
		
		this.professores.add( professor );
    }
    public void addAluno( Aluno aluno ) {
		
		this.alunos.add( aluno );
    }
    
    
    
    
    
}
