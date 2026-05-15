package br.fiap.models;

public class BalancoDiario {
    private static int qtdCarros;
    private static double total;


    public void doAdd(Veiculo obj){
        qtdCarros ++;
        total += obj.doTotal();
    }
    public String doGerarRelatorio(){
        return "Quantidade de carro: "+qtdCarros +
                "\n" + "Total arrecadado" + total;
    }
}
