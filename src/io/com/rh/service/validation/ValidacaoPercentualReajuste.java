package io.com.rh.service.validation;

import io.com.rh.ValidacaoException;
import io.com.rh.model.Funcionario;
import io.com.rh.service.interfaces.ValidacaoReajusteSalarial;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentualReajuste implements ValidacaoReajusteSalarial {

    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        BigDecimal percentualReajuste = aumento.divide(funcionario.getSalario(), RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
    }

}
