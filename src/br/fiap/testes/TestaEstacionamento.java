package br.fiap.testes;

import br.fiap.models.BalancoDiario;
import br.fiap.models.Segurado;

public class TestaEstacionamento {
    public static void main(String[] args) {
        Segurado veicSg = new Segurado(10);
        veicSg.setValorAdicional(2);
        veicSg.setValorHora(5);
        veicSg.setHoras(0);
        System.out.println(veicSg.doViewCupom());
        BalancoDiario bd = new BalancoDiario();
        bd.doAdd(veicSg);
        System.out.println(bd.doGerarRelatorio());
    }

}
