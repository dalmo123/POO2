package questao3;

public class ImagemProxy implements Imagem {

	private String nomeImagem;
	private ImagemReal imagemReal;
	
	
	public  ImagemProxy(String nomeImagem) {
		this.nomeImagem = nomeImagem;
	}
	
	@Override
	public void display() {
		if(imagemReal == null)
			imagemReal = new ImagemReal(nomeImagem);
		
		imagemReal.display();
		
	}
	
	
	
	

}
