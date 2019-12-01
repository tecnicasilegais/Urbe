package com.urbe.entidades;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Motorista
{
	private String cpf;
	private String nome;
	private long somaAvaliacoes;
	private long qtdAvaliacoes;
	private Veiculo veiculo;
	private Set<FormaPagamento> formasPagamento;

	/**
	 * Construtor para um novo motorista.
	 * @param cpf String contendo cpf do motorista
	 * @param nome String contendo nome do motorista
	 * @param veiculo Veiculo do motorista
	 * @param formasPagamento Lista contendo as formas de pagamento que o motorista aceita
	 * @return Uma instância de motorista
	 */
	public static Motorista novoMotorista(String cpf, String nome, Veiculo veiculo, List<FormaPagamento> formasPagamento)
	{
		return new Motorista(cpf, nome, veiculo, new HashSet<FormaPagamento>(formasPagamento),8,1);
	}

	/**
	 * Construtor para um motorista existente na base de dados
	 * @param cpf String contendo cpf do motorista
	 * @param nome String contendo nome do motorista
	 * @param somaAvaliacoes soma das avaliações recebidas pelo motorista
	 * @param qtdAvaliacoes quantidade de avaliações que o motorista ja recebeu
	 * @param veiculo Veiculo do motorista
	 * @param formasPagamento Lista contendo as formas de pagamento que o motorista aceita
	 * @return Uma instância de motorista
	 */
	public static Motorista motoristaExistente(String cpf, String nome, long somaAvaliacoes, long qtdAvaliacoes, Veiculo veiculo, List<FormaPagamento> formasPagamento)
	{
		return new Motorista(cpf, nome, veiculo, new HashSet<FormaPagamento>(formasPagamento), somaAvaliacoes, qtdAvaliacoes);
	}

	private Motorista(String cpf, String nome, Veiculo veiculo, Set<FormaPagamento> formasPagamento, long somaAvaliacoes, long qtdAvaliacoes)
	{
		this.cpf = cpf;
		this.nome = nome;
		this.somaAvaliacoes = somaAvaliacoes;
		this.qtdAvaliacoes = qtdAvaliacoes;
		this.veiculo = veiculo;
		this.formasPagamento = formasPagamento;
	}

	// region Getters/Setters
	public double pontuacaoMedia()
	{
		return this.somaAvaliacoes / this.qtdAvaliacoes;
	}

	public String cpf()
	{
		return cpf;
	}

	public String nome()
	{
		return nome;
	}

	public long somaAvaliacoes()
	{
		return somaAvaliacoes;
	}

	public long qtdAvaliacoes()
	{
		return qtdAvaliacoes;
	}

	public Veiculo veiculo()
	{
		return veiculo;
	}

	public Set<FormaPagamento> formasPagamento()
	{
		return formasPagamento;
	}

	public void avalia (int pontuacao)
	{
		if (!(pontuacao > 0 && pontuacao < 10))
		{
			throw new IllegalArgumentException("Pontuação inválida ! Deve ser uma pontuação de 0 a 10.");
		}
		somaAvaliacoes += pontuacao;
		qtdAvaliacoes++;
	}

	//endregion
	@Override
	public String toString()
	{
		return "Motorista: \n	nome: "+nome+"\n	cpf: "+cpf+"\n pontuação: "+ this.pontuacaoMedia();
	}
}
