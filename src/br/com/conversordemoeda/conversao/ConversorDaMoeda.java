package br.com.conversordemoeda.conversao;

import br.com.conversordemoeda.conexao.RequisicaoMoeda;

public class ConversorDaMoeda {

    Moeda moeda = new RequisicaoMoeda().requisicaoMoeda();

    public String moedaParaDolar(String siglaMoeda, Double valorDeConversao){
        Double valor = moeda.conversion_rates().get(siglaMoeda);
        Double conversaoDaMoeda = valorDeConversao / valor;

        String resposta = "Valor " + valorDeConversao + " [" + siglaMoeda +"]" +
                " corresponde ao valor final de =>>> " + conversaoDaMoeda +
                " [" + siglaMoeda +"]";
        return resposta;
    }

    public String dolarParaMoeda(String siglaMoeda, Double valorDeConversao){
        Double valor = moeda.conversion_rates().get(siglaMoeda);
        Double conversaoDaMoeda = valorDeConversao * valor;
        String resposta = "Valor " + valorDeConversao + " [" + siglaMoeda +"]" +
                " corresponde ao valor final de =>>> " + conversaoDaMoeda +
                " [" + siglaMoeda +"]";
        return resposta;
    }
}
