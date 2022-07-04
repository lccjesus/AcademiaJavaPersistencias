package controle; //pacote

import static interfaces.EntradaSaida.mostrarMenu;

import java.util.ArrayList;
import java.util.HashMap;

// importando pacotes e classes

import entidade.Cliente;
import entidade.ManutencaoOleo;
import entidade.ManutencaoPneu;
import entidade.ManutencaoSuspencao;
import entidade.ManutencaoSuspencao.Modelo;
import entidade.OrdemServico;
import entidade.Servico;
import util.Data;
import util.PersistenciaArquivo;

public class Oficina { // classe principal

	private static final String arquivo = "Oficina.bds";

	public static void main(String[] args) { // main principal
		recuperarSistema();
		mostrarMenu();
		salvarSistema();
	}

	// função para Filtrar ORDEM DE SERVIÇOS
	public static ArrayList<OrdemServico> filtrarOrdemServico(String string_inicial_mecanico, Modelo modelo,
			String marca, int tamanho_aro, char sexo, Data menorData) {
		ArrayList<OrdemServico> selecionados_servicos = new ArrayList(); // lista completa
		char sexofiltro = Character.toUpperCase(sexo);
		for (OrdemServico item : OrdemServico.listaOrdemServico) { // iniciando variavel itemServico
			if (string_inicial_mecanico != null // startsWith verifica se a variavel comeca com('');
					&& !item.getServico().getMecanico().startsWith(string_inicial_mecanico)) {
				continue;
			}

			if (menorData != null && item.getServico().getData().compareTo(menorData) < 0) {

				continue;
			}

			if (sexofiltro != 'X' && item.getCliente().getSexo() != sexofiltro) {
				continue;
			}

			// condicional para verificar as subclasses, se nao for do tipo pneu, verifica
			// se e do tipo suspencao,
			// se nao for suspençao entao e do tipo oleo
			if (item.getServico() instanceof ManutencaoPneu) {
				ManutencaoPneu itemModelo = (ManutencaoPneu) item.getServico();
				if (tamanho_aro != -1 && tamanho_aro != itemModelo.getTamanho_aro()) {
					continue;
				}

			} else if (item.getServico() instanceof ManutencaoSuspencao) { // instanceof serve para comparar se e do
																			// tipo classe ou nao
				ManutencaoSuspencao itemModelo = (ManutencaoSuspensao) item.getServico(); // duvida
				if (modelo != null && modelo != itemModelo.getModelo()) {
					continue;
				}

			} else {
				ManutencaoOleo itemModelo = (ManutencaoOleo) item.getServico();
				if (marca != null && !marca.equals(itemModelo.getMarca())) {
					continue;
				}
			}
			// adiciona o objeto no arraylist do filtro caso seja compativel com os valores
			// escolhidos

			selecionados_servicos.add(item);
		}

		return selecionados_servicos;
	}

	// FUNÇÃO PARA SALVAR APLICAÇÃO ORDEMSERVIÇO
	public static void salvarSistema() {
		ArrayList<OrdemServico> aplicListaObject = new ArrayList<OrdemServico>();
		aplicListaObject.add(OrdemServico.getOrdemServico());
		aplicListaObject.add(Servico.getServicos());
		aplicListaObject.add(Cliente.getClientes());
		PersistenciaArquivo.salvar(aplicListaObject, arquivo);
	}

	// FUNÇÃO PARA RECUPERAR SISTEMA
	@SuppressWarnings("unchecked")
	public static void recuperarSistema() {
		@SuppressWarnings("rawtypes")
		ArrayList aplicListaObject =  (ArrayList) PersistenciaArquivo.recuperar(arquivo);
		if (aplicListaObject != null) {
			OrdemServico.setOrdemServico((ArrayList<OrdemServico>) aplicListaObject.get(0));
			Servico.setServicos((HashMap<Integer, Servico>) aplicListaObject.get(1));
			Cliente.setClientes((HashMap<String, Cliente>) aplicListaObject.get(2));
		}
	}

}
