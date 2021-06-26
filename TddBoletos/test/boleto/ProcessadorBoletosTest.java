package boleto;





import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fatura.fatura;

public class ProcessadorBoletosTest {
	private fatura fatura;
	
	@BeforeEach
	public  void inicializador() {
		fatura = new fatura("10/10/2000",2000,"Gabriel");
	}
	
	@Test
	public void construtor() {
		ProcessadorBoletos processador = new ProcessadorBoletos(fatura);
		Assertions.assertEquals(fatura, processador.getFatura());
	}
	
	@Test
	public void addBoleto() {
		ProcessadorBoletos processador = new ProcessadorBoletos(fatura);
		Boleto boleto = new Boleto(1,"10/11/1999",30);
		processador.addBoletos(boleto);
		Assertions.assertEquals(1, processador.getBoletos().size());
	}
	
	@Test
	public void faturaPagaParaValoresIguaisSemBoleto() {
		ProcessadorBoletos processador = new ProcessadorBoletos(fatura);
		Assertions.assertEquals(false, processador.faturaPaga());
	}
	@Test
	public void faturaPagaParaValoresIguaisComUmBoleto() {
		ProcessadorBoletos processador = new ProcessadorBoletos(fatura);
		Boleto boleto = new Boleto(1,"10/11/1999",2000);
		processador.addBoletos(boleto);
		Assertions.assertEquals(true, processador.faturaPaga());
	}
	
	
}
