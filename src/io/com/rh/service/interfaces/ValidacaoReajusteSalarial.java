package io.com.rh.service.interfaces;

import io.com.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajusteSalarial {
    void validar(Funcionario funcionario, BigDecimal aumento);
}
