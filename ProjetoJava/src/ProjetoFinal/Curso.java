
package ProjetoFinal;


public class Curso {


	private int id;
	private String nome;
	private Escola escola;
	static int idcount;
//Passar os metodos pelo construtor

	public Curso(String nome) {
            this.nome = nome;
            this.id = idcount++;
	}
	
	public Escola getEscola() {
            return escola;
	}

	public void setEscola(Escola escola) {
            this.escola = escola;
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


}
