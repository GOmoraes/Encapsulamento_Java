package pessoa_pk;
  
import java.util.*;  


public class Pessoa {

	private String nome;
	private Date data;
	private float altura;
	private int idade;

	
	public String setNome(String nome) {
		return this.nome = nome;
	}
	public String getNome() {
		return nome;
	}

	
	public Date setData (int year, int month, int day){
		Date d = new Date();
		Calendar cal = new GregorianCalendar();

		cal.setTime(d);
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH, day);
		return this.data = cal.getTime();
	}
	
	public String getData() {
		Calendar cal = new GregorianCalendar();

		cal.setTime(data);
		String nascimento =String.valueOf( cal.get(Calendar.DAY_OF_MONTH))+"/" + String.valueOf( cal.get(Calendar.MONTH))+"/" +String.valueOf( cal.get(Calendar.YEAR));
			return nascimento;

	}
	
	public void setAltura (float altura) {
		this.altura = altura;
	}
	
	public float getAltura () {
		return altura;
	}
	
	public String toString() { 
	    return "Name: '" + this.getNome() + "', Altura: '" + this.getAltura() + "', Idade: '" + this.getIdade() + "'";
	} 
	

	public int getIdade() {
		int idade = this.idade;
		if (this.idade <= 0) {

		Date dataAtual = new Date();

		Calendar calAtual = new GregorianCalendar();
		Calendar calNascimento = new GregorianCalendar();
		
		calAtual.setTime(dataAtual);
		calNascimento.setTime(data);
		boolean fezAniversario= true;
		if (calAtual.get(Calendar.MONTH) < calNascimento.get(Calendar.MONTH)) {
			fezAniversario = false;	
		} else if ((calAtual.get(Calendar.MONTH) == calNascimento.get(Calendar.MONTH)) && (calAtual.get(Calendar.DAY_OF_MONTH ) < calNascimento.get(Calendar.DAY_OF_MONTH ))) {
			fezAniversario = false;
		} else {fezAniversario = true;}
 			idade = calAtual.get(Calendar.YEAR) - calNascimento.get(Calendar.YEAR);
 			
 			if (!fezAniversario) {
 				idade = idade - 1;
 			}
		}
		
	return this.idade = idade;
	
	}
	
		
	public int setIdade(int idade) {
		return this.idade = idade;
	}
	
}
