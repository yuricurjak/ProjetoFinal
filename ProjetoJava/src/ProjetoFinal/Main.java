
package ProjetoFinal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
		
		//INSTANCIANDO OBJETOS 
                //criando escolas
		Escola e1 = new Escola("T1");
		Escola e2 = new Escola("Saude");
		//Criando cursos	
		Curso c1 = new Curso("SI");
		Curso c2 = new Curso("REDES");
		Curso c3 = new Curso("ENFERMAGEM");
                //-----------------
                c1.setEscola(e1);
                c2.setEscola(e1);
                c3.setEscola(e2);
		//Criando disciplinas 
		Disciplina d1 = new Disciplina("Algoritmo");
		Disciplina d2 = new Disciplina("POO");
                Disciplina d3 = new Disciplina("Anatomia");
                //-------------------
                d1.addCurso(c1);
                d1.addCurso(c2);
                d2.addCurso(c1);
                d3.addCurso(c3);
                //Criando professores
                Professor p1 = new Professor("Ricardo");
                Professor p2 = new Professor("Luis");
                Professor p3 = new Professor("Paulo");
                //------------------
                p1.addDisciplinas(d1);
                p1.setEndereço("Rua A");
                p1.setTelefone("759999-9999");
                p1.setDataadm("01/02/2014");
                p1.setSalario(6000.00);
                p1.setEscola(e1);
                p2.addDisciplinas(d2);
                p2.setEndereço("Rua b");
                p2.setTelefone("758888-8888");
                p2.setDataadm("01/05/2018");
                p2.setSalario(8000.00);
                p2.setEscola(e1);
                p3.addDisciplinas(d3);
                p3.setEndereço("Rua c");
                p3.setTelefone("757777-7777");
                p3.setDataadm("04/06/2015");
                p3.setSalario(9000.00);
                p3.setEscola(e2);
                
                //Criando Aluno
                Aluno a1 = new Aluno("João");
                Aluno a2 = new Aluno("Maria");
                Aluno a3 = new Aluno("Gabriel");
                //----------------
                a1.addDisciplinas(d1);
                a1.addDisciplinas(d2);
                a1.setEndereço("Rua AAAAAAA");
                a1.setTelefone("755555-5555");
                a1.setCurso(c1);
                a2.addDisciplinas(d1);
                a2.setEndereço("Rua BBBBBBB");
                a2.setTelefone("754444-4444");
                a2.setCurso(c2);
                a3.addDisciplinas(d3);
                a3.setEndereço("Rua CCCCCCC");
                a3.setTelefone("753333-3333");
                a3.setCurso(c3);
                //Criando turma
                Turma t1 = new Turma();
                Turma t2 = new Turma();
                //-----------
                t1.addDisciplinas(d1);
                t1.addDisciplinas(d2);
                t1.addProfessores(p1);
                t1.addProfessores(p2);
                t1.addAluno(a1);
                t2.addDisciplinas(d3);
                t2.addProfessores(p3);
                t2.addAluno(a3);
                //Criando Setores
                Setor s1 = new Setor("FINANCEIRO");
                Setor s2 = new Setor("RH");
                Setor s3 = new Setor("AUXILIAR ADM");
                //Criando funcionarios administrativo
                Administrativo adm1 = new Administrativo("Matheus");
                Administrativo adm2 = new Administrativo("Felipe");
		//------------
                adm1.setEndereço("Rua 1000");
                adm1.setTelefone("7530003000");
                adm1.setDataadm("25/10/2005");
                adm1.setSalario(6000);
                adm1.setSetor(s1);
                adm2.setEndereço("Rua 2000");
                adm2.setTelefone("7530303030");
                adm2.setDataadm("10/11/2009");
                adm2.setSalario(5000);
                adm2.setSetor(s2);
                //-------------------------------------------
                
		
		
		
		
		
		
		
	}

}

    

