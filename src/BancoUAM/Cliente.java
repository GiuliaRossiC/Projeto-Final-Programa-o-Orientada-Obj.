package BancoUAM;

/**
 * @author Carolina Cinque
 */
public class Cliente {
    //variaveis
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private Conta conta;
    
    //construtores
    public Cliente(){}
    public Cliente(String nome, String cpf, String endereco, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    //get sets
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    
    //metodos
    public String imprimir(){
        return "Cpf: "+cpf + 
                "\nNome: "+nome+
                "\nEndereço: " +endereco+
                "\nTelefone: " + telefone;
    }
    
}
