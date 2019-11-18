package com.urbe.interfaces.webservice;

import com.urbe.casos_de_uso.servicos.ServicosPassageiro;
import com.urbe.entidades.TOViagem;
import com.urbe.entidades.Viagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class ClienteFachadaRemota
{
	private ServicosPassageiro servicosPassageiro;

	@Autowired
	public ClienteFachadaRemota(ServicosPassageiro servicosPassageiro)
	{
		this.servicosPassageiro = servicosPassageiro;
	}

	@GetMapping("/solicitacaoviagem")
	public TOViagem getDadosViagem(@RequestParam String cpf,
	                               @RequestParam String bOrig,
	                               @RequestParam String bDest,
	                               @RequestParam String formaPgto,
	                               @RequestParam String catVeiculo)
	{
		Viagem viagem = servicosPassageiro.criarViagem(cpf, bOrig, bDest, formaPgto, catVeiculo);
		TOViagem toViagem = new TOViagem();
		toViagem.setCustoCorrida(viagem.getCusto());
		toViagem.setMarcaModelo(viagem.getMotorista().getVeiculo().getMarca() +
				viagem.getMotorista().getVeiculo().getCor());
		toViagem.setNomeMotorista(viagem.getMotorista().getNome());
		toViagem.setPlacaVeiculo(viagem.getMotorista().getVeiculo().getPlaca());
		return toViagem;
	}

	public Boolean getDadosViagem(@RequestParam String cpfMotorista,
	                              @RequestParam int avaliacaoMotorista){
		return servicosPassageiro.avaliarMotorista(cpfMotorista, avaliacaoMotorista);
	}
}