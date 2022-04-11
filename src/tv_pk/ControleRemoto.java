package tv_pk;

public class ControleRemoto {
	Televisao tv = new Televisao();
	
	public void aumentarVolume() {
	tv.setVolume(tv.getVolume()+1);
	consultarVolume();
	}
	public void diminuirVolume() {
		tv.setVolume(tv.getVolume()-1);
		consultarVolume();
	}
	public void consultarVolume() {
		System.out.println("O volume atual é: " + tv.getVolume());
	}
	
	public void aumentarCanal() {
	tv.setCanal(tv.getCanal()+1);
	consultarCanal();
	}
	public void diminuirCanal() {
		tv.setCanal(tv.getCanal()-1);
		consultarCanal();
	}
	public void consultarCanal() {
		System.out.println("O canal atual é: " + tv.getCanal());
	}
	public void trocarCanal(int canal) {
		tv.setCanal(canal);
		consultarCanal();
	}
}
