package io.com.rh.service;

import io.com.rh.ValidacaoException;
import io.com.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReajusteService implements ReajusteSalarial {

    @Override
    public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {

        BigDecimal percentualReajuste = aumento.divide(funcionario.getSalario(), RoundingMode.HALF_UP);

        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }

        funcionario.atualizarSalario(funcionario.getSalario().add(aumento));
    }


}
