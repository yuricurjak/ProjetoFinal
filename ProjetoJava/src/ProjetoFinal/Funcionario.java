package ProjetoFinal;


public class Funcionario extends Pessoa {

    private String dataadm;
    private double salario;

    public Funcionario(String nome, String dataadm, double salario, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.dataadm = dataadm;
        this.salario = salario;
    }
    
    
    /**
     * @return the dataadm
     */
    public String getDataadm() {
        return dataadm;
    }

    /**
     * @param dataadm the dataadm to set
     */
    public void setDataadm(String dataadm) {
        this.dataadm = dataadm;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
   
}
