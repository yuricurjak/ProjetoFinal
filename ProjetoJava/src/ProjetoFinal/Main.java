
package ProjetoFinal;


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
                System.out.println("Escolas Cadastradas");
                BancoDados.showEscola();
                //Alterando escolas
                BancoDados.AlterarEscola("Saude","Juridica");
                System.out.println("TESTANDO SE A ESCOLA FOI ALTERADA");
                BancoDados.showEscola();
                BancoDados.AlterarEscola("Juridica","Saude");
                //os outros metodos de alterar as outras classes estão presentes também no Banco
                //*removendo escolas                
                BancoDados.removeEscola(e2);
                System.out.println("TESTANDO SE A ESCOLA FOI REMOVIDA");
                BancoDados.showEscola();
                BancoDados.addEscola(e2);
                
                //criando cursos
                Curso c1 = new Curso("Engenharia",BancoDados.buscaEscola("TI"));
                Curso c2 = new Curso("Enfermagem",BancoDados.buscaEscola("Saude"));
                Curso c3 = new Curso("Medicina",BancoDados.buscaEscola("Saude"));
                Curso c4 = new Curso("Sistemas",BancoDados.buscaEscola("TI"));
                //adicionando cursos ao banco
                BancoDados.addCurso(c1); 
                BancoDados.addCurso(c2);
                BancoDados.addCurso(c3);
                BancoDados.addCurso(c4);
                //*Exibindo curso
                System.out.println("EXIBINDO CURSOS");
                BancoDados.showCurso();

               
                //criando disciplina
                Disciplina d1 = new Disciplina("POO");
                //adicionando cursos a disciplina
                d1.addCursoLista(BancoDados.buscaCurso("Engenharia"));
                d1.addCursoLista(BancoDados.buscaCurso("Sistemas"));
                //Adicionando ao banco a disciplina
                BancoDados.addDisciplina(d1);
                //exibindo...
                System.out.println("EXIBINDO AS DISCIPLINAS E SEUS RESPECTIVOS CURSOS");
                BancoDados.showDisciplina();
                //criando disciplina
                Disciplina d2 = new Disciplina("Anatomia");
                //adicionando cursos a disciplina
                d2.addCursoLista(BancoDados.buscaCurso("Enfermagem"));
                d2.addCursoLista(BancoDados.buscaCurso("Medicina"));
                //Adicionando ao banco a disciplina
                BancoDados.addDisciplina(d2);
                //exibindo...
                System.out.println("EXIBINDO AS DISCIPLINAS E SEUS RESPECTIVOS CURSOS");
                BancoDados.showDisciplina();
                
                //criando professor
                Professor p1 = new Professor("Luis","25/05/18",6000, "Rua A, Bairro SIM", "759999-9999");
                //adicionando a Escola e disciplina q ele faz parte
                p1.addEscola(BancoDados.buscaEscola("TI"));
                p1.addEscola(BancoDados.buscaEscola("Saude"));
                p1.addDisciplina(BancoDados.buscaDisciplina("POO"));
                p1.addDisciplina(BancoDados.buscaDisciplina("Anatomia"));
                //adicionando ao banco o professor
                BancoDados.addProfessor(p1);
                //exibindo...
                System.out.println("EXIBINDO OS PROFESSORES E SUAS RESPECTIVAS DISCIPLINAS E ESCOLAS");
                BancoDados.showProfessor();
                
                
                //criando Setores
                Setor s1 = new Setor("Financeiro");
                Setor s2 = new Setor("RH");
                Setor s3 = new Setor("Manutenção");
                Setor s4 = new Setor("Gerencia");
                //adicionando setores ao banco
                BancoDados.addSetor(s1);
                BancoDados.addSetor(s2);
                BancoDados.addSetor(s3);
                BancoDados.addSetor(s4);
                //Exibindo...
                System.out.println("EXIBINDO SETORES");
                BancoDados.showSetor();
 
                
                //criando funcionario administrativo
                Administrativo adm1 = new Administrativo("João", "20/06/1980", 2000, "Rua B, Bairro: Tomba", "758888-8888", BancoDados.buscaSetor("Manutenção"));
                BancoDados.addAdministrativo(adm1);
                //exibindo...
                System.out.println("LISTA DE ADMINISTRATIVO");
                BancoDados.showAdministrativo();
                
                
                //criando alunos
                
                Aluno a1 = new Aluno("Matheus", "Rua C", "757777-7777", BancoDados.buscaCurso("Sistemas"));
                //Adicionando as materias que ele pega
                a1.addDisciplina(BancoDados.buscaDisciplina("POO"));
                a1.addDisciplina(BancoDados.buscaDisciplina("Anatomia"));
                Aluno a2 = new Aluno("Felipe", "Rua D", "759999-7777", BancoDados.buscaCurso("Medicina"));
                a2.addDisciplina(BancoDados.buscaDisciplina("POO"));
                a2.addDisciplina(BancoDados.buscaDisciplina("Anatomia"));
                //Adicionando ao banco
                BancoDados.addAluno(a1);
                BancoDados.addAluno(a2);
                //exibindo...
                System.out.println("LISTA DE ALUNOS");
                BancoDados.showAluno();
                
                //criando turmas
                Turma t1 = new Turma(BancoDados.buscaDisciplina("POO"), BancoDados.buscaProfessor("Luis"));
                t1.addAlunoLista(BancoDados.buscaAluno("Matheus"));
                t1.addAlunoLista(BancoDados.buscaAluno("Felipe"));
                BancoDados.addTurma(t1);
                //exibindo...
                System.out.println("LISTA DE TURMAS");
                BancoDados.showTurma();
	}

}

    

