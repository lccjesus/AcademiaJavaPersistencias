package entidade;

import java.io.Serializable;

import util.Data;

// extends : estou importando as eranças da minha classe Serviço ( classe principal)
public class ManutencaoSuspencao extends Servico implements Serializable {
   
    private static final long serialVersionUID = 1L;

	public enum Modelo{original, paralelo};
     
    private Modelo modelo;
    private int tempo_servico;
    
    
    public ManutencaoSuspencao(int numero, String mecanico, Data data, int tempo_servico, Modelo modelo){
        super(numero, mecanico, data);
        this.tempo_servico = tempo_servico;
        this.modelo = modelo;
    }
    
    public Modelo getModelo(){
       return modelo;
    }

    public int getTempo_servico(){
        return tempo_servico;
    }
    
    @Override
    public String toString(){
        String dados_suspensao = " Ordem de serviço: " + " N°: " + numero + " Mecanico: " +
            mecanico + " Data: " + data + " Tempo de Serviço:  " + tempo_servico + " horas" + 
            " Modelo : " + modelo;
     return dados_suspensao + "\n";
    }
}
