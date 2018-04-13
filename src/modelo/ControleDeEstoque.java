package modelo;

/**
 *
 * @author charles
 */
public class ControleDeEstoque {

	private String nome;
	private Integer quantidade;
	private Float valor;
	private Float valorTotal;
	
	public ControleDeEstoque (String name, int quant, float valor) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
		this.valorTotal = valor * quantidade;
	}
	
	public String toString() {
		return "Nome: " + nome + "; Quantidade: " + quantidade + "; Preço: "
				+ valor + "; Valor total: " + valorTotal;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
		this.valorTotal = quantidade*valor;
	}
	public Float getValor() {
		return valor*quantidade;
	}
	public void setValor(Float valor) {
		this.valor = valor;
		this.valorTotal = quantidade*valor;
	}
	public Float getvalorTotal() {
		return valorTotal;
	}	
}

