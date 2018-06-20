package ProjetoFinal;




public class Administrativo extends Funcionario {
    private Setor setor;
    
    public Administrativo(String nome, String dataadm, double salario, String endereco, String telefone, Setor setor){
        super(nome, dataadm, salario, endereco, telefone); 
        this.setor = setor;
    }

    /**
     * @return the setor
     */
    public Setor getSetor() {
        return setor;
    }

    /**
     * @param setor the setor to set
     */
    public void setSetor(Setor setor) {
        this.setor = setor;
    }

  
    
    
}
