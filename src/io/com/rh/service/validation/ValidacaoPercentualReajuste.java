package io.com.rh.service.validation;

import io.com.rh.model.Funcionario;
<<<<<<<< HEAD:src/io/com/rh/service/validation/ValidacaoPercentualReajuste.java
========
import io.com.rh.service.interfaces.ReajusteSalarial;
>>>>>>>> 02d257e (fix: extraindo validações):src/io/com/rh/service/ReajusteService.java
import io.com.rh.service.interfaces.ValidacaoReajusteSalarial;

import java.math.BigDecimal;
import java.util.List;

public class ValidacaoPercentualReajuste implements ValidacaoReajusteSalarial {

    private List<ValidacaoReajusteSalarial> validacoes;

    public ReajusteService(List<ValidacaoReajusteSalarial> validacoes) {
        this.validacoes = validacoes;
    }

    @Override
<<<<<<<< HEAD:src/io/com/rh/service/validation/ValidacaoPercentualReajuste.java
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        BigDecimal percentualReajuste = aumento.divide(funcionario.getSalario(), RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
========
    public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {

        this.validacoes.forEach(v -> v.validar(funcionario, aumento));

        funcionario.atualizarSalario(funcionario.getSalario().add(aumento));
>>>>>>>> 02d257e (fix: extraindo validações):src/io/com/rh/service/ReajusteService.java
    }

}
