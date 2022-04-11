package agenda_pk;

import java.util.ArrayList;

import pessoa_pk.Pessoa;

public class Agenda {
	ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>(10);
	public void armazenaPessoa (String nome, int idade, float altura) {
	Pessoa pessoa = new Pessoa();
	pessoa.setNome(nome);
	pessoa.setAltura(altura);
	pessoa.setIdade(idade);
	
	listaPessoa.add(pessoa);
	}
	public void removePessoa(String nome) {
		for (int i = 0; i < listaPessoa.size(); i++) {
			Pessoa pessoa = listaPessoa.get(i);
			if (pessoa.getNome().equals(nome)) {
				listaPessoa.remove(i);
			}
		}
	}
	public int buscaPessoa(String nome) {
		int numero = 0;
		for (int i = 0; i < listaPessoa.size(); i++) {
			Pessoa pessoa = listaPessoa.get(i);
			if (pessoa.getNome().equals(nome)) {
				numero = i+1;
			}
		}
		return numero;
	}
	public void imprimeAgenda(){
		String impressao = new String();
		impressao = "Agenda: \n";
		for (int i = 0; i < listaPessoa.size(); i++) {
			Pessoa pessoa = listaPessoa.get(i);
			impressao = impressao + pessoa.toString()+ "\n";
		}
		System.out.println(impressao);
	}
	public void imprimePessoa(int index) {
		System.out.println(listaPessoa.get(index-1).toString());
	}
}