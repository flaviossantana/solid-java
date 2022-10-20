package io.com.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

    private DadosPessoais dadosPessoais;
    private BigDecimal salario;
    private LocalDate dataUltimoReajuste;

    public Funcionario(DadosPessoais dadosPessoais, LocalDate dataUltimoReajuste) {
        this.dadosPessoais = dadosPessoais;
        this.dataUltimoReajuste = dataUltimoReajuste;
    }

	public BigDecimal getSalario() {
		return salario;
	}

	public void atualizarSalario(BigDecimal novoSalario) {
        this.salario = novoSalario;
        this.dataUltimoReajuste = LocalDate.now();
    }

    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }

    public Cargo getCargo() {
        return dadosPessoais.getCargo();
    }

	public void promover(Cargo novoCargo) {
		this.dadosPessoais.setCargo(novoCargo);
	}

	public boolean isGerente() {
		return Cargo.GERENTE == this.dadosPessoais.getCargo();
	}

}
