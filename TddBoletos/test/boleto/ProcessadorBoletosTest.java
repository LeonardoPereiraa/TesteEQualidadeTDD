package boleto;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import fatura.fatura;

public class ProcessadorBoletosTest {
	
	@Test
	public void construtor() {
		fatura fatura = new fatura("10/10/2000",2000,"Gabriel");
		ProcessadorBoletos processador = new ProcessadorBoletos(fatura);
		Assertions.assertEquals(fatura, processador.getFatura());
	}
}
