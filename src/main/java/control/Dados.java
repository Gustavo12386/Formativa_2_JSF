package control;

import javax.faces.bean.ManagedBean;
import transação.Dadoscliente;

@ManagedBean
public class Dados {
   Dadoscliente d = new Dadoscliente();
   
   public Dados() {
	   // construtor padrão
   }
   public String getCodigo() {
	   return String.valueOf(d.getId());
   }
   public void setCodigo(String codigo) {
	   d.setId(Integer.parseInt(codigo));
   }
   public String getData() {
	   return d.getData();
   }
   public void setData(String data) {
	   d.setData(data);
   }
   public String getTipo_transacao() {
	   return d.getTipo_transacao();
   }
   public void setTipo_transacao(String tipo_transacao) {
	   d.setTipo_transacao(tipo_transacao);
   }
   public String getTipo_conta_cliente() {
	   return d.getTipo_conta_cliente();
   }
   public void setTipo_conta_cliente(String tipo_conta_cliente) {
	  d.setTipo_conta_cliente(tipo_conta_cliente);
   }
}
