package qintess.academiajava.aplicacao;

import java.util.Collection;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.viewmodels.EventosConvidadosVM;
import qintess.academiajava.repositorio.Repositorio;

public class AppEventoConvidados {
	public static void main(String[] args) {
		try {
			
			Collection<EventosConvidadosVM> lista = Repositorio.getEventoConvidadosDao().listar();
			for (EventosConvidadosVM item : lista) {
				System.out.println("Nome: " + item.getNome());
				System.out.println("Email: " + item.getEmail());
				System.out.println("Evento: " + item.getEvento());
				System.out.println("-".repeat(45));
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}
		
		
	}

}
