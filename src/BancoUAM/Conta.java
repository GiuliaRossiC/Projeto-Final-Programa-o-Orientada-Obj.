package BancoUAM;

/**
 * @author Carolina Cinque
 */
public class Conta {
    //variaveis
    private int numero;
    private double saldo;
    private Cliente cliente;
    private ContaEspecial contaEspecial;
    
    // construtor
    public Conta(){}
    public Conta(int numero){
        this.numero = numero;
        this.saldo = 0;
    }
     //get set
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
     public Cliente getCliente() {
        if (cliente == null) cliente = new Cliente();
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public ContaEspecial getContaEspecial() {
        if (contaEspecial == null) contaEspecial = new ContaEspecial();
        return contaEspecial;
    }
    public void setContaEspecial(ContaEspecial contaEspecial) {
        this.contaEspecial = contaEspecial;
    }
    
    //metodos
    public String imprimir(){
       String resultado = " ";
       
       if(contaEspecial == null){
           resultado ="Nome: "+cliente.getNome()+
               "\nCpf: " +cliente.getCpf()+
               "\nNúmero: "+numero+
               "\nSaldo: "+saldo;
       }else{
           resultado ="Nome: "+cliente.getNome()+
               "\nCpf: " +cliente.getCpf()+
               "\nNúmero: "+numero+
               "\nSaldo: "+saldo+
               "\nLimite: "+contaEspecial.getLimite();
       }
       return resultado;
    }
    
    public void depositar(double quantia){
        saldo = saldo + quantia;
    }
    
    public boolean sacar(double quantia){
        if(quantia > saldo){
          //se a quantia for maior que o saldo disponivel ñ consegue sacar
            return false;
        }else{
            //se for menor consegue sacar
            saldo = saldo-quantia;
        }
        return true;
    }
    
}
