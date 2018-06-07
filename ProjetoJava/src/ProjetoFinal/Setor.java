
package ProjetoFinal;


public class Setor {

    private int id;
    private String nome;
    static int idcount;
    
    
    public Setor(String nome){
        this.nome = nome;
        this.id = idcount++;
        
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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
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
    

    
}
