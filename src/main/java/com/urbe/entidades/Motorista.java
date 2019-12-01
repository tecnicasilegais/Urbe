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
	/**
	 * Retorna a media de pontuação do motorista (de 0 a 10)
	 * @return double contendo a media de pontuação
	 */
	public double pontuacaoMedia()
	{
		return this.somaAvaliacoes / this.qtdAvaliacoes;
	}

	/**
	 * Retorna o cpf do motorista
	 * @return String contendo o cpf
	 */
	public String cpf()
	{
		return cpf;
	}

	/**
	 * Retorna o nome do motorista
	 * @return String contendo o nome
	 */
	public String nome()
	{
		return nome;
	}

	/**
	 * Retorna a soma das avaliações recebidas pelo motorista
	 * @return long contendo a soma das avaliações
	 */
	public long somaAvaliacoes()
	{
		return somaAvaliacoes;
	}

	/**
	 * Retorna a quantidade de avaliações que o motorista recebeu
	 * @return long contendo a quantidade de avaliações
	 */
	public long qtdAvaliacoes()
	{
		return qtdAvaliacoes;
	}

	/**
	 * Retorna o Veiculo que o motorista utiliza
	 * @return Veiculo
	 */
	public Veiculo veiculo()
	{
		return veiculo;
	}

	/**
	 * Retorna as formas de pagamento que o motorista aceita
	 * @return Set de FormaPagamento contendo as formas aceitas
	 */
	public Set<FormaPagamento> formasPagamento()
	{
		return formasPagamento;
	}

	/**
	 * Avalia o motorista referente à uma viagem realizada
	 * @param pontuacao pontuação avaliada
	 * @throws IllegalArgumentException caso o numero não seja de 0 a 10
	 */
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
