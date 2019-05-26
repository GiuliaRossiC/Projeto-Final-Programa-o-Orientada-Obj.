package BancoUAM;

import java.util.ArrayList;
/**
 *
 * @author Carolina Cinque
 */
public class GerenciaContas {
    private static ArrayList <Conta> listaContas = new ArrayList();
    
    public static void Cadastrar(Conta conta){
        listaContas.add(conta);
    }
    
    public static String listar(){
        String saida="";
        if(listaContas.isEmpty()){
            saida = "Nenhuma conta cadastrada!";
        }
        else{
            for(Conta conta: listaContas){
                saida = saida + conta.imprimir()+"\n\n";
            }
        }
        return saida;
    }
    
    public static Conta buscarConta(int numero){        
        for(Conta conta: listaContas){
            if(conta.getNumero() == numero){
                return conta; //encontrou a Conta com o numero informado
            }
        }
        return null; //nao encontrou a Conta com o numero informado
    }
}
