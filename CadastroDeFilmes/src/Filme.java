import java.util.ArrayList;
import java.util.List;

public class Filme {

	private String nome;
	private double duracao;

	private List<Categoria> categorias = new ArrayList<Categoria>(); // Lista de Filmes ****

	// *************************************
	
	
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Filme [nome=").append(nome).append(", duracao=").append(duracao).append(", categorias=")
				.append(categorias).append("]");
		return builder.toString();
	}

}
