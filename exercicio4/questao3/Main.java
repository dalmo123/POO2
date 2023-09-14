package questao3;

public class Main {

	public static void main(String[] args) {
		
		
		//utiliza-se o proxy para controlar de certa forma um acesso a um objeto
		//um exemplo é o carregamento de imagens, podemos aplicar o proxy para intermediar o controle do objeto ImagemReal.
		//onde a instanciação e as chamadas para exibição da Imagem é feito dentro do proxy (display).
		//  _ _ _ _  	  _ _ _ _ _ _ _ 	  _ _ _ _ _ _
		// |		|	 |				|	 | 	         |
		// | Imagem	| -> | ImagemProxy  | -> |ImagemReal |
		// |_ _ _ _ |	 |_ _ _ _ _ _ _ |	 |_ _ _ _ _ _| 
		//
		
		Imagem img = new ImagemProxy("fotoPerfil.jpeg");
		
		
		//imagem será carregada e mostrada
		img.display();
		
		//imagem será apenas mostrada
		img.display();
		
	}
}
