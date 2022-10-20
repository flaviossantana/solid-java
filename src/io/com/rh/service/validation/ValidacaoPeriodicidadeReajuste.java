package io.com.rh.service.validation;

import io.com.rh.ValidacaoException;
import io.com.rh.model.Funcionario;
import io.com.rh.service.interfaces.ValidacaoReajusteSalarial;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ValidacaoPeriodicidadeReajuste implements ValidacaoReajusteSalarial {

    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();

        if (dataUltimoReajuste != null && dataUltimoReajuste.isAfter(dataAtual.minusMonths(6))) {
            throw new ValidacaoException("Intervalo entre reajustes deve ser de no minimo 6 meses!");
        }
    }

}
