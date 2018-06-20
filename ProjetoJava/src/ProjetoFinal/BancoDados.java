
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
    public static Escola buscaEscola(String nome){
        for(int i=0; i < escolas.size(); i++) {
                Escola escola = escolas.get(i);
                if( escola.getNome().equals(nome) ) {
                        return escola;
                }
        }
        return null;
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
	cursos.add(curso);
    }
    public static void removeCurso(Curso curso){
        cursos.remove(curso);
    }
    
    public static Curso buscaCurso(String nome){
        for(int i=0; i < cursos.size(); i++) {
                Curso curso = cursos.get(i);
                if( curso.getNome().equals(nome) ) {
                        return curso;
                }
        }

        return null;
    }
    public static void AlterarEscola(String nome, String novo){
        for(int i=0; i < escolas.size(); i++) {
                Escola escola = escolas.get(i);
                if( escolas.get(i).getNome().equals(nome) ) {
                   escolas.get(i).setNome(novo);
                }
        }
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
    public static Disciplina buscaDisciplina(String nome){
        for(int i=0; i < disciplinas.size(); i++) {
                Disciplina disciplina = disciplinas.get(i);  
                if( disciplina.getNome().equals(nome) ) {
                        return disciplina;
                }
        }

        return null;
    }
    public static void showDisciplina() {
		for(int i=0; i < disciplinas.size(); i++){
                    System.out.print("Disciplina:"+" ");
                    System.out.println(disciplinas.get(i).getNome());
                    for(int j=0; j < disciplinas.get(i).getCursos().size(); j++){
                        System.out.print("Curso:"+" ");
			System.out.println(disciplinas.get(i).getCursos().get(j).getNome());

    }}}
    public static void showIdDisciplina() {
		for(int i=0; i < disciplinas.size(); i++)
			System.out.println(disciplinas.get(i).getId());      
	}
    public static void AlterarDisciplina(String nome, String novo){
        for(int i=0; i < disciplinas.size(); i++) {
                Disciplina disciplina = disciplinas.get(i);
                if( disciplinas.get(i).getNome().equals(nome) ) {
                   disciplinas.get(i).setNome(novo);
                }
        }
    }
    //metodos de professor
    public static void addProfessor( Professor professor ) {
	professores.add( professor );
    }
    public static void removeProfessor(Professor professor){
        professores.remove(professor);
    }
    public static Professor buscaProfessor(String nome){
        for(int i=0; i < professores.size(); i++) {
                Professor professor = professores.get(i);
                if( professor.getNome().equals(nome) ) {
                        return professor;
                }
        }
        return null;
    }
    public static void showProfessor() {
		for(int i=0; i < professores.size(); i++){
                    System.out.println("Professor:"+" ");
                    System.out.println(professores.get(i).getNome()+" "+ 
                    professores.get(i).getDataadm()+" "+ professores.get(i).getSalario()
                    +" "+  professores.get(i).getEndereço()+" "+ professores.get(i).getTelefone());
                    for(int j=0; j < professores.get(i).getEscola().size(); j++){
                        System.out.print("Escola:"+" ");
                        System.out.println(professores.get(i).getEscola().get(j).getNome());
                    }
                        for(int k=0; k < professores.get(i).getDisciplinas().size(); k++){
                        System.out.print("Disciplina:"+" ");
                        System.out.println(professores.get(i).getDisciplinas().get(k).getNome());
                        }
                }}
    public static void AlterarProfessor(String nome, String novo){
        for(int i=0; i < professores.size(); i++) {
                Professor professor = professores.get(i);
                if( professores.get(i).getNome().equals(nome) ) {
                   professores.get(i).setNome(novo);
                }
        }
    }
    
    //metodos de setor
    public static void addSetor( Setor setor ) {
	setores.add( setor );
    }
    public static void removeSetor(Setor setor){
        setores.remove(setor);
    }
    public static Setor buscaSetor(String nome){
        for(int i=0; i < setores.size(); i++) {
                Setor setor = setores.get(i);
                if( setor.getNome().equals(nome) ) {
                        return setor;
                }
        }
        return null;
    }
    public static void showSetor() {
		for(int i=0; i < setores.size(); i++)
			System.out.println(setores.get(i).getNome());         
    }
     public static void AlterarSetor(String nome, String novo){
        for(int i=0; i < setores.size(); i++) {
                Setor setor = setores.get(i);
                if( setores.get(i).getNome().equals(nome) ) {
                   setores.get(i).setNome(novo);
                }
        }
    }
    //metodos de funcionario administrativo
    public static void addAdministrativo( Administrativo administrativo ) {
	administrativos.add( administrativo );
    }
    public static void removeAdministrativo(Administrativo administrativo){
        administrativos.remove( administrativo );
    }
    public static Administrativo buscaAdministrativo(String nome){
        for(int i=0; i < administrativos.size(); i++) {
                Administrativo administrativo = administrativos.get(i);
                if( administrativo.getNome().equals(nome) ) {
                        return administrativo;
                }
        }
        return null;
    }
    public static void showAdministrativo() {
		for(int i=0; i < administrativos.size(); i++){
			System.out.println(administrativos.get(i).getNome()+" "+ 
                                administrativos.get(i).getDataadm()+" "+ administrativos.get(i).getSalario()
                                +" "+  administrativos.get(i).getEndereço()+" "+ administrativos.get(i).getTelefone()
                                +" "+ administrativos.get(i).getSetor().getNome());
      }}
    public static void AlterarAdministrativo(String nome, String novo){
        for(int i=0; i < administrativos.size(); i++) {
                Administrativo administrativo = administrativos.get(i);
                if( administrativos.get(i).getNome().equals(nome) ) {
                   administrativos.get(i).setNome(novo);
                }
        }
    }
    
    //metodos de aluno
    public static void addAluno( Aluno aluno ) {
	alunos.add( aluno );
    }
    public static void removeAluno(Aluno aluno){
        alunos.remove( aluno );
    }
    public static Aluno buscaAluno(String nome){
        for(int i=0; i < alunos.size(); i++) {
                Aluno aluno = alunos.get(i);
                if( aluno.getNome().equals(nome) ) {
                        return aluno;
                }
        }
        return null;
    }
    public static void showAluno() {
		for(int i=0; i < alunos.size(); i++){
			System.out.println(alunos.get(i).getNome()+" "+ 
                        alunos.get(i).getEndereço()+" "+ alunos.get(i).getTelefone()+" "+ 
                        alunos.get(i).getCurso().getNome());
                        for(int j=0; j < alunos.get(i).getDisciplinas().size(); j++){
                            System.out.print("Disciplinas:"+" ");
                            System.out.println(alunos.get(i).getDisciplinas().get(j).getNome());
                        }}}
     public static void AlterarAluno(String nome, String novo){
        for(int i=0; i < alunos.size(); i++) {
                Aluno aluno = alunos.get(i);
                if( alunos.get(i).getNome().equals(nome) ) {
                   alunos.get(i).setNome(novo);
                }
        }
    }
    //metodos de turma
    public static void addTurma( Turma turma ) {
	turmas.add( turma );
    }
    public static void removeTurma(Turma turma){
        turmas.remove( turma );
    }
    
    public static void showTurma() {
		for(int i=0; i < turmas.size(); i++){
			System.out.println("Codigo: "+turmas.get(i).getId()+" Disciplina: "+turmas.get(i).getDisciplina().getNome()+
                        " Professor: "+turmas.get(i).getProfessor().getNome());
                        for(int j=0; j < turmas.get(i).getAlunos().size(); j++ ){
                            System.out.print("Aluno:"+" ");
                            System.out.println(turmas.get(i).getAlunos().get(j).getNome());
                        }
                        }}                    
}

     
