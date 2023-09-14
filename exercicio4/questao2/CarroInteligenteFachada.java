package questao2;

public class CarroInteligenteFachada implements CarroAlgoritmo {

	private CintoSeguranca cintoSeguranca;
	private Farol farol;
	private Motor motor;
	private Porta porta;
	private Radio radio;

	public CarroInteligenteFachada(CintoSeguranca cintoSeguranca, Farol farol, Motor motor, Porta porta, Radio radio) {
		this.cintoSeguranca = cintoSeguranca;
		this.farol = farol;
		this.motor = motor;
		this.porta = porta;
		this.radio = radio;
	}

	@Override
	public void dirigir(String estacao) {
		motor.ligar();
		porta.trancar();
		cintoSeguranca.travar();
		farol.acender();
		radio.ligar();
		radio.sintonizar(estacao);

	}

	@Override
	public void finalizarCorrida() {
		motor.desligar();
		porta.destrancar();
		cintoSeguranca.destravar();
		farol.apagar();
		radio.desligar();
	}

}
