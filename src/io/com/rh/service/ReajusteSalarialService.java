package io.com.rh.service;

import io.com.rh.model.Funcionario;
import io.com.rh.service.interfaces.ReajusteSalarial;
import io.com.rh.service.interfaces.ValidacaoReajusteSalarial;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteSalarialService implements ReajusteSalarial {

    private List<ValidacaoReajusteSalarial> validacoes;

    public ReajusteSalarialService(List<ValidacaoReajusteSalarial> validacoes) {
        this.validacoes = validacoes;
    }

    @Override
    public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {

        this.validacoes.forEach(v -> v.validar(funcionario, aumento));

        funcionario.atualizarSalario(funcionario.getSalario().add(aumento));
    }

}
