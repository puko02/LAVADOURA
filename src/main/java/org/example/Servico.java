
public abstract class Servico {

	private double preco;
	
	private String descricao;
	


	public Servico() {
	
	}

	public Servico(double preco, String descricao) {

		this.preco = preco;
		this.descricao = descricao;
	
	}
	
	public double getPreco(){
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public String setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
