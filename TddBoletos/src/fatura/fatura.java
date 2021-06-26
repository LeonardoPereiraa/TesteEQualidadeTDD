package fatura;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class fatura {
	Date data ;
	float valor ;
	String cliente;
	public fatura(String  data, float valor, String cliente) {
		setData(data);
		setValor(valor);
		setCliente(cliente);
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
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
}
