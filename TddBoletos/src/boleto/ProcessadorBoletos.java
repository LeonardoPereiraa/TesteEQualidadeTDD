package boleto;

import java.util.ArrayList;
import java.util.List;

import fatura.fatura;

public class ProcessadorBoletos {
	
	List<Boleto> Boletos = new ArrayList<Boleto>();
	fatura fatura ;
	
	public ProcessadorBoletos(fatura fatura) {
		setFatura(fatura);
	}
	public void addBoletos(Boleto boleto) {
		getBoletos().add(boleto);
	}
	
	public boolean faturaPaga() {
		int numeroBoletos = getBoletos().size(); 
		if(numeroBoletos==0) {
			return false;
		}
		float ValorTotal=0;	
		for (int i=0; i<numeroBoletos; i++) {
			ValorTotal = ValorTotal + getBoletos().get(i).getValor();
		    }
		return ValorTotal >= getFatura().getValor() ;
	}
	
	
	public fatura getFatura() {
		return fatura;
	}
	
	public void setFatura(fatura fatura) {
		this.fatura = fatura;
	}
	
	public List<Boleto> getBoletos() {
		return Boletos;
	}
	
}
