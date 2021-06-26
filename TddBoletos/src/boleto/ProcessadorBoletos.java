package boleto;

import java.util.ArrayList;
import java.util.List;

import fatura.fatura;

public class ProcessadorBoletos {
	
	List<Boleto> Boletos = new ArrayList<Boleto>();
	fatura fatura ;
	
	public ProcessadorBoletos(fatura fatura) {
		
	}
	
	public fatura getFatura() {
		return fatura;
	}
	
	public void setFatura(fatura fatura) {
		this.fatura = fatura;
	}
	
}
