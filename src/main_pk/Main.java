package main_pk;
import agenda_pk.Agenda;
import tv_pk.ControleRemoto;
import pessoa_pk.Pessoa;


public class Main {

	public static void main(String[] args) {
		//Ex: 1
		Pessoa lucas = new Pessoa ();
		lucas.setNome("Lucas Toledo Alves");
		lucas.setAltura(78);
		lucas.setData(1999, 10, 28);
		System.out.println(lucas.toString()+ "\n");
		
		//Ex: 2
		Agenda agenda = new Agenda();
		agenda.armazenaPessoa("Rodrigo", 28, 170);
		agenda.armazenaPessoa("Kaio", 30,190);
		agenda.armazenaPessoa("Carla", 30, 160);
		agenda.imprimeAgenda();
		agenda.removePessoa("Carla");
		agenda.imprimeAgenda();
		System.out.println(agenda.buscaPessoa("Kaio"));
		agenda.imprimePessoa(1);
		
		//Ex: 3
		ControleRemoto controle = new ControleRemoto();
		controle.consultarCanal();
		controle.consultarVolume();
		controle.aumentarCanal();
		controle.diminuirCanal();
		controle.aumentarVolume();
		controle.diminuirVolume();
		controle.trocarCanal(250);

	}
}
