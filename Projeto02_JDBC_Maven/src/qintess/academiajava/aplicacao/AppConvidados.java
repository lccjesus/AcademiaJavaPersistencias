package qintess.academiajava.aplicacao;

import java.util.Collection;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.entidades.Convidado;
import qintess.academiajava.classes.entidades.Evento;
import qintess.academiajava.repositorio.Repositorio;

public class AppConvidados {
	public static void main(String[] args) {
		incluirConvidado();
		listarConvidados();
		
		
	}
	private static void incluirConvidado() {
		try {
			//Solicitando dados para o convidado
			String nome = JOptionPane.showInputDialog("Nome do Convidado: ");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do convidado: "));
			String email = JOptionPane.showInputDialog("Digita o email:");
			
			Collection<Evento> eventos = Repositorio.getEventosDao().listar();
			Evento evento = (Evento) JOptionPane.showInputDialog(
					null, 
					"Selecione um evento", 
					"Eventos", 
					JOptionPane.INFORMATION_MESSAGE,
					null,
					eventos.toArray(),
					null);
			//Instancia da classe convidado
			Convidado convidado= new Convidado();
			convidado.setNome(nome);
			convidado.setIdade(idade);
			convidado.setEmail(email);
			convidado.setEvento(evento);
			
			Repositorio.getConvidadosDao().incluir(convidado);
			JOptionPane.showMessageDialog(null, "Convidado incluído com sucesso!!!");
	
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}
	}
	private static void listarConvidados() {
		try {
			Collection<Convidado> convidados = Repositorio.getConvidadosDao().listar();
			
			for (Convidado convidado : convidados) {
				System.out.println("Nome: " + convidado.getNome());
				System.out.println("Idade: " + convidado.getIdade());
				System.out.println("Email: " + convidado.getEmail());
				System.out.println("Inscrito no evento: " + convidado.getEvento().getDescricacao());
				System.out.println("-".repeat(30));
				
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}
	}
}



