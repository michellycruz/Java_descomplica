package pacotao;

public class Produto {
	
	private int codigo;
	private String nome;
	private int estoque;
	private double valorUnitario;
	
	public Produto(int codigo, String nome) {
		
		this.codigo = codigo;
		this.nome = nome;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEstoque() {
		return estoque;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	//metodos
	
	public void incluirEstoque(int quantidade) {
		estoque = estoque + quantidade;
	}
	
	public void retirarEstoque(int quantidade) {
		
	}
	
	
	
	
};










