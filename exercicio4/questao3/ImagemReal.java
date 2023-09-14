package questao3;

public class ImagemReal implements Imagem {

	private String nomeImagem;
	
	
	public ImagemReal(String nomeImagem) {
		this.nomeImagem = nomeImagem;
		carregaImagem();
	}
	
	
	@Override
	public void display() {
		System.out.println("Exibindo imagem: " + nomeImagem);
	}
	
	
	public void carregaImagem() {
		System.out.println("Carregando imagem: " + nomeImagem);
	}

}
