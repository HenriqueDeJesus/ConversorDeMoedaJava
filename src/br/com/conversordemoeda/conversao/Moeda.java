package br.com.conversordemoeda.conversao;

import java.util.Map;

public record Moeda(Map<String, Double> conversion_rates) {
}
