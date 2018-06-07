
package ProjetoFinal;


public class Escola {
    private int id;
    private String nome;
    static int idcount;
	
	
	
	public Escola(String nome) {
		this.nome = nome;
		this.id = idcount++;
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


	public static int getIdcount() {
			return idcount;
	}


	public static void setIdcount(int idcount) {
		Escola.idcount = idcount;
	}
    
}
