package boleto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Boleto {
	 int codigo; 
	 Date data;
	 float valor;
	 
	 public Boleto(int codigo, String data, float valor) {
		 setCodigo(codigo);
		 setData(data);
		 setValor(valor);
	 }
	 
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	public String getData() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		return formato.format(data);
	}
	
	
	
	public void setData(String data) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.data = formato.parse(data);
		} catch (ParseException e) {
			try {
				this.data = formato.parse("01/01/0001");
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public float getValor() {
		return valor;
	}
	
	
	public void setValor(float valor) {
		this.valor = valor;
	}

}
