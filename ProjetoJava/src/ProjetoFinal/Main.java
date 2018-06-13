
package ProjetoFinal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
		
		//***INSTANCIANDO OBJETOS 
                //**criando escolas              
  		Escola e1 = new Escola("TI");
		Escola e2 = new Escola("Saude");
                //*adicionando escolas ao banco
                BancoDados.addEscola(e1); 
                BancoDados.addEscola(e2);
                //*Exibindo escolas
                BancoDados.showEscola();
                //*removendo escolas                
                BancoDados.removeEscola(e1);
                BancoDados.showEscola();
                //**criando cursos
                Curso c1 = new Curso("Engenharia",e1);
                Curso c2 = new Curso("Enfermagem", e2);
                Curso c3 = new Curso("Medicina",e2);
                Curso c4 = new Curso("Sistemas", e1);
                //*adicionando cursos ao banco
                BancoDados.addCurso(c1); 
                BancoDados.addCurso(c2);
                BancoDados.addCurso(c3);
                //*Exibindo curso
                BancoDados.showCurso();
                //*removendo curso                
                BancoDados.removeCurso(c1);
                BancoDados.showCurso();
                //criando disciplina
                Disciplina d1 = new Disciplina("POO");
                //adcionando cursos a disciplina
                d1.addCursoLista(c1);
                d1.addCursoLista(c4);
                BancoDados.addDisciplina(d1);
                System.out.println("lista de cursos de poo");
                BancoDados.showDisciplina();
                d1.showListaDisciplinaCurso();
                Disciplina d2 = new Disciplina("Politica");
                d2.addCursoLista(c1);
                d2.addCursoLista(c2);
                //d2.addCursoLista(c3);
                //d2.addCursoLista(c4);
         
                System.out.println("lista de cursos de politica");
                
                //d2.showListaDisciplinaCurso();
                //* removendo curso da disciplina d2.removeListaDisciplinaCurso(c1);
                
                // professor falta as arraylist igual de disciplina
                
                Professor p1 = new Professor("Luis","25/05/18",6000, "Rua A, Bairro SIM", "759999-9999");
                Professor p2 = new Professor("Ricardo","10/05/18",6000, "Rua B, Bairro Feira x", "758888-9999");
                p1.addListaDisciplinasProfessor(d1);
                p1.addListaDisciplinasProfessor(d2);
                //Atributos que são passados pelo construtor estão sendo exibidos pelo BancoDados
                BancoDados.addProfessor(p1);
                BancoDados.showProfessor();
                p1.showListaDisciplinaCurso();
                p1.addEscolaLista(e1);
                p1.removeListaDisciplinaCurso(d2);
                p1.showListaDisciplinaCurso();
                //BancoDados.addProfessor(p2);
                //Exibindo Professores
                //removendo professores                
                
                BancoDados.showProfessor();

                
                // adicionar turma
                
                //*Exibindo disciplina
                //BancoDados.showDisciplina();
                //*removendo disciplina                
                //BancoDados.removeDisciplina(d1);
                //BancoDados.showDisciplina();  
                
                
                
	}

}

    

