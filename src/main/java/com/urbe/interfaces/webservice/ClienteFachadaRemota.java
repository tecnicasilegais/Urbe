package com.urbe.interfaces.webservice;

import com.urbe.casos_de_uso.servicos.ServicosPassageiro;
import com.urbe.entidades.TOViagem;
import com.urbe.entidades.Viagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/urbe")
public class ClienteFachadaRemota
{
	private ServicosPassageiro servicosPassageiro;

	@Autowired
	public ClienteFachadaRemota(ServicosPassageiro servicosPassageiro)
	{
		this.servicosPassageiro = servicosPassageiro;
	}

	@GetMapping("/solicitarviagem")
	public TOViagem dadosViagem(@RequestParam String cpf,
	                            @RequestParam String bOrig,
	                            @RequestParam String bDest,
	                            @RequestParam String formaPgto,
	                            @RequestParam String catVeiculo)
	{

		Viagem viagem = servicosPassageiro.criarViagem(cpf, bOrig, bDest, formaPgto, catVeiculo);
		TOViagem toViagem = new TOViagem();
		toViagem.custoCorrida(viagem.custo());
		toViagem.marcaModelo(viagem.motorista().veiculo().marca() +
				                     viagem.motorista().veiculo().cor());
		toViagem.nomeMotorista(viagem.motorista().nome());
		toViagem.placaVeiculo(viagem.motorista().veiculo().placa());
		return toViagem;
	}

	@GetMapping("/avaliarmotorista")
	public Boolean dadosViagem(@RequestParam String cpfMotorista,
	                           @RequestParam int avaliacaoMotorista)
	{
		return servicosPassageiro.avaliarMotorista(cpfMotorista, avaliacaoMotorista);
	}
}