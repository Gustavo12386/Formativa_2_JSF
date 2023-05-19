package transação;

public class Dadoscliente {
    private int id;
    private String data;
    private String tipo_transacao;
    private String tipo_conta_cliente;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getTipo_transacao() {
		return tipo_transacao;
	}
	public void setTipo_transacao(String tipo_transacao) {
		this.tipo_transacao = tipo_transacao;
	}
	public String getTipo_conta_cliente() {
		return tipo_conta_cliente;
	}
	public void setTipo_conta_cliente(String tipo_conta_cliente) {
		this.tipo_conta_cliente = tipo_conta_cliente;
	}
    
    
}
