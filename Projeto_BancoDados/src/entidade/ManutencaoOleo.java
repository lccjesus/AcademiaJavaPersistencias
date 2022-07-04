package entidade;

import java.io.Serializable;

import util.Data;
                            //EXTENDS
public class ManutencaoOleo extends Servico implements Serializable{
    
    private static final long serialVersionUID = 1L;
	private String marca;
    private int quantidade;
    //private enum Tipo_Óleo{motor, câmbio, freio};
    
    public ManutencaoOleo(int numero, String mecanico, Data data, String marca, int quantidade){
        super(numero, mecanico, data);        //SUPER
        this.marca = marca;
        this.quantidade = quantidade;
    }
    
    public String getMarca(){
        return marca;
    }
    public int getQuantidade(){
        return quantidade;
    }
    
    @Override
    public String toString () {
        String dados_oleo = " Ordem de serviço " + "  N°: " + numero + " Mecanico : " + mecanico 
                + " Data: " + data +" Marca do óleo : " + marca + " Quantidade : " + quantidade;
        return dados_oleo + "\n";
    }
    
}
