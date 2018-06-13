
package ProjetoFinal;

import java.util.ArrayList;

public class BancoDados {
    
    private static ArrayList<Escola> escolas = new ArrayList();
    private static ArrayList<Curso> cursos = new ArrayList();
    private static ArrayList<Disciplina> disciplinas = new ArrayList();
    private static ArrayList<Turma> turmas = new ArrayList();
    private static ArrayList<Professor> professores = new ArrayList();
    private static ArrayList<Administrativo> administrativos = new ArrayList();
    private static ArrayList<Setor> setores = new ArrayList();
    private static ArrayList<Aluno> alunos = new ArrayList();

    //metodos de escola
    
    public static void addEscola( Escola escola ) {
	escolas.add( escola );
    }
    public static void removeEscola(Escola escola){
        escolas.remove(escola);
    }
    public static void showEscola() {
		for(int i=0; i < escolas.size(); i++)
			System.out.println(escolas.get(i).getNome());         
    }
      public static void showId() {
		for(int i=0; i < escolas.size(); i++)
			System.out.println(escolas.get(i).getId());
	}
    //metodos de curso  
    public static void addCurso( Curso curso ) {
	cursos.add( curso );
    }
    public static void removeCurso(Curso curso){
        cursos.remove(curso);
    }
    public static void showCurso() {    
		for(int i=0; i < cursos.size(); i++)
			System.out.println(cursos.get(i).getNome());   
    }
      public static void showIdCurso() {
		for(int i=0; i < cursos.size(); i++)
			System.out.println(cursos.get(i).getId());      
	}            
    //metodos de disciplina  
    public static void addDisciplina( Disciplina disciplina ) {
	disciplinas.add( disciplina );
    }
    public static void removeDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }
    public static void showDisciplina() {
		for(int i=0; i < disciplinas.size(); i++)
			System.out.println(disciplinas.get(i).getNome());   
    }
    public static void showIdDisciplina() {
		for(int i=0; i < disciplinas.size(); i++)
			System.out.println(disciplinas.get(i).getId());      
	}
    public static void addProfessor( Professor professor ) {
	professores.add( professor );
    }
    public static void removeProfessor(Professor professor){
        professores.remove(professor);
    }
    public static void showProfessor() {
		for(int i=0; i < professores.size(); i++)
			System.out.println(professores.get(i).getNome()+" "+ 
                                professores.get(i).getDataadm()+" "+ professores.get(i).getSalario()
                                +" "+  professores.get(i).getEndereço()+" "+ professores.get(i).getTelefone());
      }
//Adicionar
    
    //Remover
    //Buscar
    //Exibirtodos

    }
