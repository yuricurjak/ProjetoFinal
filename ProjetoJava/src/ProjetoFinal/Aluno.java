package ProjetoFinal;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    
    private Curso curso;
    private ArrayList <Disciplina> disciplinas; 
    
    public Aluno(String nome, String endereco, String telefone, Curso curso) {
        super(nome, endereco, telefone);
        this.curso = curso;
        this.disciplinas = new ArrayList<>();
}

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList <Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList <Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
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