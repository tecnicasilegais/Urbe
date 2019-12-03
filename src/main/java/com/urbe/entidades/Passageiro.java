package com.urbe.entidades;

public class Passageiro
{
	private String cpf;
	private String nome;
	private FormaPagamento formaPagamentoPadrao;
	private long somaAvaliacoes;
	private long qtdAvaliacoes;

	/**
	 * Construtor para um novo passageiro.
	 *
	 * @param cpf            String contendo cpf do passageiro
	 * @param nome           String contendo nome do passageiro
	 * @param formaPagamento Forma de pagamento que o passageiro utiliza
	 * @return Uma instância de passageiro
	 */
	public static Passageiro novoPassageiro(String cpf, String nome, FormaPagamento formaPagamento)
	{
		final int avaliacaoInicial = 8;
		final int nroAvaliacoesInicial = 1;
		return new Passageiro(cpf, nome, formaPagamento, avaliacaoInicial, nroAvaliacoesInicial);
	}

	/**
	 * Construtor para um passageiro existente na base de dados
	 *
	 * @param cpf            String contendo cpf do passageiro
	 * @param nome           String contendo nome do passageiro
	 * @param formaPagamento Forma de pagamento que o passageiro utiliza
	 * @param somaAvaliacoes soma das avaliações recebidas pelo passageiro
	 * @param qtdAvaliacoes  quantidade de avaliações que o passageiro ja recebeu
	 * @return Uma instância de passageiro
	 */
	public static Passageiro novoPassageiroExistente(String cpf, String nome, FormaPagamento formaPagamento, long somaAvaliacoes, long qtdAvaliacoes)
	{
		return new Passageiro(cpf, nome, formaPagamento, somaAvaliacoes, qtdAvaliacoes);
	}

	private Passageiro(String cpf, String nome, FormaPagamento formaPagamento, long somaAvaliacoes, long qtdAvaliacoes)
	{
		this.cpf = cpf;
		this.nome = nome;
		this.formaPagamentoPadrao = formaPagamento;
		this.somaAvaliacoes = somaAvaliacoes;
		this.qtdAvaliacoes = qtdAvaliacoes;
	}

	// region getters/setters

	/**
	 * Retorna a media de pontuação do passageiro (de 0 a 10)
	 *
	 * @return double contendo a media de pontuação
	 */
	public double pontuacaoMedia()
	{
		return this.somaAvaliacoes / this.qtdAvaliacoes;
	}

	/**
	 * Retorna o cpf do passageiro
	 *
	 * @return String contendo o cpf
	 */
	public String cpf()
	{
		return cpf;
	}

	/**
	 * Retorna o nome do passageiro
	 *
	 * @return String contendo o nome
	 */
	public String nome()
	{
		return nome;
	}

	/**
	 * Retorna a soma das avaliações recebidas pelo passageiro
	 *
	 * @return long contendo a soma das avaliações
	 */
	public long somaAvaliacoes()
	{
		return somaAvaliacoes;
	}

	/**
	 * Retorna a quantidade de avaliações que o passageiro recebeu
	 *
	 * @return long contendo a quantidade de avaliações
	 */
	public long qtdAvaliacoes()
	{
		return qtdAvaliacoes;
	}

	/**
	 * Retorna a forma de pagamento que o passageiro utiliza
	 *
	 * @return FormaPagamento contendo a forma utilizada
	 */
	public FormaPagamento formaPagamento()
	{
		return formaPagamentoPadrao;
	}

	/**
	 * Atualiza a forma de pagamento padrão do passageiro.
	 *
	 * @param formaPagamento nova forma de pagamento
	 */
	public void formaPagamento(FormaPagamento formaPagamento)
	{
		this.formaPagamentoPadrao = formaPagamento;
	}

	/**
	 * Avalia o passageiro referente à uma viagem realizada
	 *
	 * @param pontuacao pontuação avaliada
	 * @throws IllegalArgumentException caso o numero não seja de 0 a 10
	 */
	public void avalia(int pontuacao)
	{
		if (!(pontuacao >= 0 && pontuacao <= 10))
		{
			throw new IllegalArgumentException("Pontuação inválida ! Deve ser uma pontuação de 0 a 10.");
		}
		somaAvaliacoes += pontuacao;
		qtdAvaliacoes++;
	}

	//endregion

	@Override
	public boolean equals(Object other)
	{
		if (this == other)
		{ return true; }

		if (other == null || other.getClass() != this.getClass())
		{ return false; }

		Passageiro otherPassageiro = (Passageiro) other;

		if (this.cpf.equals(otherPassageiro.cpf))
		{
			return true;
		}

		return false;
	}

	@Override
	public String toString()
	{
		return "Passageiro: \n	nome: " + nome + "\n	cpf: " + cpf + "\n pontuação: " + this.pontuacaoMedia();
	}
}
