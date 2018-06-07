
package ProjetoFinal;

import java.util.ArrayList;


public class Disciplina {
    private int id;
	private String nome;
	private ArrayList<Curso> cursos;
	static int idcount;
	
	public Disciplina(String nome) {
		this.nome = nome;
		this.id = idcount++;
		
		this.cursos =  new ArrayList<>();
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
	//--------------------------------------------------------//
	public void addCurso( Curso curso ) {
		
		this.cursos.add( curso );
	
	}
	
	//Visualizar cursos//
	public void showCursos() {
		for(int i=0; i < cursos.size(); i++)
			System.out.println(cursos.get(i).getNome() );
	}

    
}
