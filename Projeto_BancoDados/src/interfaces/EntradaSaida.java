package interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import controle.Oficina;
import entidade.Cliente;
import entidade.ManutencaoOleo;
import entidade.ManutencaoPneu;
import entidade.ManutencaoSuspencao;
import entidade.ManutencaoSuspencao.Modelo;
import entidade.OrdemServico;
import entidade.Servico;
import util.Data;

public class EntradaSaida {

	public static void mostrarMenu(){
        int selecionar = 0;
        Scanner ler = new Scanner(System.in);
        while (selecionar != 8){
            System.out.println("\nEntre com a op��o do Menu de 1 a 8: \n");
            System.out.println("|1|- CADASTRAR CLIENTE \n"
                             + "|2|- CADASTRAR SERVI�O \n"
                             + "|3|- CADASTRAR ORDEM SERVI�O \n"
                             + "|4|- IMPRIMIR CLIENTES \n"
                             + "|5|- IMPRIMIR SERVI�OS \n"
                             + "|6|- IMPRIMIR ORDENS DE SERVI�OS \n"
                             + "|7|- FILTRAR E IMPRIMIR ORDENS DE SERVI�O \n"
                             + "|8|- SAIR ");
            selecionar = ler.nextInt();
        
            switch(selecionar){
                case 1: {
                    System.out.println(" ENTRANDO NO CADASTRO DE CLIENTE... ");
                        loopLeituraClientes();
                        //1imprimirCliente("",Cliente.getClientes());
                    break;
                }
                case 2: {
                    System.out.println("ENTRANDO NO CADASTRO DE SERVIÇO...");
                    loopLeituraServicos();
                    break;
                }
                 case 3: {
                    System.out.println("ENTRANDO NO CADASTRO DE ORDEM DE SERVIÇO...");
                    loopLeituraOrdemServicos();
                    break;
                }
                 case 4: {
                    System.out.println("IMPRIMINDO CLIENTES CADASTRADOS...");
                    imprimirCliente("",Cliente.getClientes());
                    break;
                }
                 case 5: {
                    System.out.println("IMPRIMINDO SERVIÇOS CADASTRADOS...");
                    imprimirServico("", Servico.getServicos());
                    break;
                }
                 case 6: {
                    System.out.println("IMPRIMINDO ORDENS DE SERVIÇOS...");
                    imprimirOrdemServico("",OrdemServico.getOrdemServico());
                    break;
                }
                 case 7: {
                    System.out.println("FILTRANDO ORDENS DE SERVIÇO...");
                    System.out.println("\n\nESCOLHA DOS VALORES DO FILTRO:\n");
                    imprimirOrdemServico("", selecionarOrdemServicos());
                          
                    //imprimirOrdemServiço("",OrdemServiço.getOrdemServiço());
                           
                    break;
                }            
                 case 8: {
                    System.out.println("VOCE SAIU, VOLTE MAIS VEZES!");
                    break;
                } 

                 default:
                  System.out.println("Op��o Inv�lida");                  
            }
        }ler.close();
    }

	// FUNÇÃO LOOP CLIENTES
	public static void loopLeituraClientes() {
		System.out.println();
		boolean continuar = true;
		if (!continuar) {
			return;
		}
		System.out.println("\n -- Leitura de dados dos Clientes ---");
		while (continuar) {
			Cliente informadoCliente = lerCliente();
			if (informadoCliente != null) {
				Cliente.addCliente(informadoCliente);
				System.out.println("\nCliente Cadastrado : \n");
				System.out.println(informadoCliente);
			} else {
				System.out.println(" # Erro na leitura do Cliente\n");
			}
			continuar = lerBoolean("se quer continuar");
			if (!continuar) {
				break;
			}
		}
	}

	// FUNÇÃO LOOP SERVIÇOS
	public static void loopLeituraServicos() {
		System.out.println();
		boolean continuar = true;
		if (!continuar) {
			return;
		}
		System.out.println("\n -- Leitura de dados de Serviços ---");
		while (continuar) {
			Servico informadoServico = lerServico();
			if (informadoServico != null) {
				Servico.addServico(informadoServico);
				System.out.println("\nServico Cadastrado : \n");
				System.out.println(informadoServico);
			} else {
				System.out.println(" # Erro na leitura do Serviço\n");
			}
			continuar = lerBoolean("se quer continuar");
			if (!continuar) {
				break;
			}
		}
	}

	// FUNÇÃO PARA O LOOP DE ORDEM DE SERVIÇOS
	public static void loopLeituraOrdemServicos() {
		System.out.println();
		boolean continuar = true;
		if (!continuar) {
			return;
		}
		System.out.println("\n -- Leitura de dados de Ordens de Serviços ---");
		while (continuar) {
			OrdemServico informadoOrdemServico = lerOrdemServico();
			if (informadoOrdemServico != null) {
				OrdemServico.addOrdemServico(informadoOrdemServico);
				System.out.println("\n Ordem de Servico Cadastrada : \n");
				System.out.println(informadoOrdemServico);
			} else {
				System.out.println(" # Erro na leitura da Ordem de Serviço\n");
			}
			continuar = lerBoolean("se quer continuar");
			if (!continuar) {
				break;
			}
		}
	}

	// FUNÇÃO PARA LER OS DADOS DO CLIENTE
	private static Cliente lerCliente() {
		String nome = lerString("Nome do Cliente");
		if (nome == null) {
			return null;
		}

		String cpf = lerString("Cpf do Cliente");
		if (cpf == null) {
			return null;
		}
		char sexo = lerChar("Informe o Sexo do Cliente");
		if (sexo == 'X') {
			return null;
		}
		return new Cliente(nome, cpf, sexo);
	}

	// FUNÇÃO PARA LER OS SERVIÇOS
	private static Servico lerServico() {
		int numero = lerInteiroPositivo(" \nInforme o Número do serviço");
		if (numero == -1) {
			return null;
		}
		String mecanico = lerString("Informe o Nome do mec�nico");
		if (mecanico == null) {

			return null;
		}
		Data data = lerData("Data do servi�o");
		if (data == null) {
			return null;
		}
		String tipo_servico = lerString("Tipo de Serviço de manutenção [P: Pneus" + " - S: Suspensao - O: Oleo]");
		if (tipo_servico == null) {
			return null;
		}
		if (tipo_servico.equals("P")) {
			boolean novo = lerBoolean("se o Pneu e novo :"); // criar BOOleano

			int tamanho_aro = lerInteiroPositivo("Tamanho do Aro");
			if (tamanho_aro == -1) {
				return null;
			}
			return new ManutencaoPneu(numero, mecanico, data, novo, tamanho_aro);
		}
		if (tipo_servico.equals("S")) {
			Modelo modelo = lerModelo();
			if (modelo == null) {
				return null;
			}
			int tempo_servico = lerInteiroPositivo("Tempo de serviço");
			if (tempo_servico == -1) {
				return null;
			}
			return new ManutencaoSuspencao(numero, mecanico, data, tempo_servico, modelo);
		}
		if (tipo_servico.equals("O")) {
			String marca = lerString("Marca do Óleo");
			if (marca == null) {
				return null;
			}
			int quantidade = lerInteiroPositivo("Quantidade de óleos");
			if (quantidade == -1) {
				return null;
			}
			return new ManutencaoOleo(numero, mecanico, data, marca, quantidade);
		}
		return null;
	}

	// FUNÇÃO PARA O LER ORDEM DE SERVIÇOS
	public static OrdemServico lerOrdemServico() {
		String cpf = lerString("o cpf do cliente da Ordem de servico");
		if (cpf == null || Cliente.getClientes().get(cpf) == null) {
			return null;
		}

		int numero = lerInteiroPositivo("Numero do Servi�o");
		if (numero == -1 || Servico.getServicos().get(numero) == null) {
			return null;
		}

		return new OrdemServico(Cliente.getClientes().get(cpf), Servico.getServicos().get(numero));
	}

	// FUNÇÃO PARA LER STRING
	private static String lerString(String dado) {
		BufferedReader entradaBufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String string = "";
		System.out.print(" - Informe " + dado + " : ");
		try {
			string = entradaBufferedReader.readLine();
			if (string.isEmpty()) {
				return null;
			}
		} catch (IOException excecao) {
			System.out.println("\n # Erro na leitura de: " + dado);
			return null;
		}
		return string;
	}

	// FUNÇÃO PARA LER INTEIRO
	private static int lerInteiroPositivo(String dado) {
		String inteiro_positivo_string = lerString(dado);
		if (inteiro_positivo_string == null) {
			return -1;
		}
		int inteiro_positivo = 0;
		try {
			inteiro_positivo = Integer.valueOf(inteiro_positivo_string).intValue();
		} catch (NumberFormatException excecao) {
			System.out.println("\n # Erro na conversão para inteiro de: " + dado);
			return -1;
		}
		return inteiro_positivo;
	}

	// FUNÇÃO PARA LER BOOLEANO
	private static boolean lerBoolean(String dado) {
		String string_lido = lerString(dado + " [S: sim -  N: não]");
		if (string_lido == null) {
			return false;
		}
		if (string_lido.equals("S")) {
			return true;
		}
		return false;
	}

	// FUNÇÃO PARA LER CARACTERES
	private static char lerChar(String dado) {
		String string_lido = lerString(dado);
		if ((string_lido == null) || (string_lido.length() != 1)) {
			return 'X';
		}
		return string_lido.charAt(0);
	}

	// FUNÇÃO PARA LER A DATA
	private static Data lerData(String dado) {
		String data_string = lerString(dado + " [dd/mm/aaaa]");
		if (data_string == null) {
			return null;
		}
		return Data.toData(data_string);
	}

	private static Modelo lerModelo() {
		String modelo = lerString("Modelo de Suspenção [O: Original - P: Paralelo]");
		if (modelo == null) {
			return null;
		}
		if (modelo.equals("O")) {
			return Modelo.original;
		} else if (modelo.equals("P")) {
			return Modelo.paralelo;
		} else {
			return null;
		}
	}

	public static ArrayList<OrdemServico> selecionarOrdemServicos() {
		System.out.println();
		if (!lerBoolean("se deseja filtrar as Ordens de Serviços")) {
			return new ArrayList<OrdemServico>();
		}
		System.out.println("\n -- Leitura de filtros de Sele��o de Ordem de Servi�os --");
		String string_inicial_mecanico = lerString("Inicial do mecanico");
		Modelo modelo = lerModelo(); // filtro da Suspenção
		String marca = lerString("Marca do �leo"); // filtro do Óleo
		int tamanho_aro = lerInteiroPositivo("Tamanho do Aro"); // filtro do Pneu
		char sexo = lerChar(" sexo [M: Mascilino  - F: Feminino]"); // filtro do Cliente
		Data menorData = lerData("Data minima do Serv�o"); // Filtro do serviço
		System.out.println("\n Filtro de Sele��o" + "\n - String inicial do mec�nico : " + string_inicial_mecanico
				+ "\n - Modelo da Suspenção : " + modelo + "\n - Marca do Óleo : " + marca + "\n - Tamanho do Aro : "
				+ tamanho_aro + "\n - Menor data do Servico: " + menorData + "\n ");
		return Oficina.filtrarOrdemServico(string_inicial_mecanico, modelo, marca, tamanho_aro, sexo, menorData);
	}

	// FUNÇÃO PARA IMPRIMIR MINHAS ORDENS DE SERVIÇO
	public static void imprimirOrdemServico(String cabecalho, ArrayList<OrdemServico> listaOrdemServico) {
		System.out.println(cabecalho);
		for (OrdemServico itemOrdemServico : listaOrdemServico) {
			System.out.println("\n" + itemOrdemServico.getServico().getNumero() + " - " + itemOrdemServico.toString());
		}
		System.out.println();
	}

	// FUNÇÃO PARA IMPRIMIR OS SERVIÇO
	public static void imprimirServico(String cabecalho, HashMap<Integer, Servico> listaServico) {
		System.out.println(cabecalho);
		System.out.println("Lista de Serviços\n" + Servico.getServicos());
	}

	// FUNÇÃO PARA IMPRIMIR OS CLIENTES
	public static void imprimirCliente(String cabecalho, HashMap<String, Cliente> listaCliente) {
		System.out.println(cabecalho);
		System.out.println(" Lista de Clientes\n" + Cliente.getClientes());
	}

}
