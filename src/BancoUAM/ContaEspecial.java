package BancoUAM;

/**
 * @author Carolina Cinque
 */
public class ContaEspecial {
//variaveis
private double limite;
private Conta conta;

//construtores
public ContaEspecial(){}
public ContaEspecial(int numero){
    this.conta = new Conta(numero);
}

//get set
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

//metodos
public String imprimir(){
    return "Limite: " +limite;
}

public boolean sacar(double quantia){
    double saldo = conta.getSaldo();
    
    if(quantia > (limite+saldo)){
        return false;
    }else{
        conta.setSaldo(saldo-quantia);
    }
    return true;
}

}
