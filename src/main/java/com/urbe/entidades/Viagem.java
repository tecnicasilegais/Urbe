package com.urbe.entidades;

import java.time.LocalDateTime;

import com.urbe.entidades.geometria.Reta;
import com.urbe.entidades.geometria.Ponto;

public class Viagem
{
	private int id;
	private Cidade cidade;
	private LocalDateTime dataHora;
	private Bairro origem;
	private Bairro destino;
	private Motorista motorista;
	private Passageiro passageiro;
	private double custo;

	/**
	 * Construtor para uma nova viagem
	 * @param id numero identificador da viagem
	 * @param cidade cidade onde a viagem ocorre
	 * @param origem bairro de origem da viagem
	 * @param destino bairro de destino da viagem
	 * @param motorista motorista responsável pela viagem
	 * @param passageiro passageiro da viagem
	 * @param custo custo atribuido pela viagem
	 * @return Instância de Viagem preenchida
	 */
	public static Viagem novaViagem(int id,Cidade cidade,Bairro origem, Bairro destino,Motorista motorista,Passageiro passageiro, double custo){
        return new Viagem(id,LocalDateTime.now(),cidade,origem,destino,motorista,passageiro,custo);
    }

    public static Viagem viagemExistente(int id, LocalDateTime dataHora, Cidade cidade, Bairro origem, Bairro destino, Motorista motorista, Passageiro passageiro, double custo){
        return new Viagem(id,dataHora,cidade,origem,destino,motorista,passageiro,custo);
	}
	
	private Viagem(int id, LocalDateTime dataHora, Cidade cidade, Bairro origem, Bairro destino, Motorista motorista, Passageiro passageiro, double custo)
	{
		this.id = id;
		this.dataHora = dataHora;
		this.cidade = cidade;
		this.origem = origem;
		this.destino = destino;
		this.motorista = motorista;
		this.passageiro = passageiro;
		this.custo = custo;
	}

	// region Getters/Setters

	/**
	 * Retorna o ID da viagem
	 * @return int contendo o ID
	 */
	public int id()
	{
		return id;
	}

	/**
	 * Retorna data e hora da viagem
	 * @return LocalDateTime contendo data e hora 
	 */
	public LocalDateTime horario()
	{
		return dataHora;
	}

	/**
	 * Retorna a cidade onde a viagem ocorre
	 * @return Cidade 
	 */
	public Cidade cidade() {return cidade;}

	/**
	 * Retorna o bairro origem da viagem
	 * @return Bairro origem
	 */
	public Bairro origem()
	{
		return origem;
	}

	/**
	 * Retorna o bairro destino da viagem
	 * @return Bairro destino
	 */
	public Bairro destino()
	{
		return destino;
	}

	/**
	 * Retorna o motorista da viagem
	 * @return Motorista
	 */
	public Motorista motorista()
	{
		return motorista;
	}

	/**
	 * Retorna o passageiro da viagem
	 * @return Passageiro
	 */
	public Passageiro passageiro()
	{
		return passageiro;
	}

	/**
	 * Retorna o custo da viagem
	 * @return double contendo custo
	 */
	public double custo()
	{
		return custo;
	}

	/**
	 * Retorna a rota da viagem
	 * @return Reta apontando do centro do ponto de partida ao centro do ponto de destino
	 */
	public Reta rota()
	{
		Ponto ini = origem.limites().pontoCentral();
		Ponto fim = destino.limites().pontoCentral();
		return new Reta(ini, fim);
	}
	
	//endregion
    @Override
    public String toString() {
		return "Viagem:\n Bairro Destino: " + destino + 
				"\n Bairro Origem: " + origem + "\n Cidade: " + cidade +
				"\n Custo: "+ custo;
    }
}
