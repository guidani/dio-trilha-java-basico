# Exemplos de projetos com Strategy Pattern

## Sistema de Pagamentos
Imagine que você está desenvolvendo um sistema de e-commerce que suporta diferentes formas de pagamento, como cartão de crédito, PayPal e Bitcoin.

- Problema:
Cada forma de pagamento possui um comportamento distinto para processar os dados e realizar a transação. Usar if-else ou switch-case para verificar o método de pagamento não é a melhor prática.

- Aplicação do Strategy Pattern:
Crie uma interface PagamentoStrategy com o método processarPagamento().
Crie implementações dessa interface, como CartaoCreditoStrategy, PaypalStrategy, BitcoinStrategy, cada uma com seu comportamento específico.
No sistema de checkout, escolha a estratégia de pagamento dinamicamente com base na escolha do cliente.

```java
public interface PagamentoStrategy {
    void processarPagamento(double valor);
}

public class CartaoCreditoStrategy implements PagamentoStrategy {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento via Cartão de Crédito: " + valor);
    }
}

public class PaypalStrategy implements PagamentoStrategy {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento via PayPal: " + valor);
    }
}

public class BitcoinStrategy implements PagamentoStrategy {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento via Bitcoin: " + valor);
    }
}

public class PagamentoContext {
    private PagamentoStrategy strategy;

    public void setPagamentoStrategy(PagamentoStrategy strategy) {
        this.strategy = strategy;
    }

    public void processarPagamento(double valor) {
        strategy.processarPagamento(valor);
    }
}

```

## Sistema de Compressão de Arquivos
Desenvolva uma aplicação que permita comprimir arquivos usando diferentes algoritmos de compressão, como ZIP e RAR.

- Problema:
Diferentes algoritmos de compressão têm suas próprias lógicas e parâmetros. Usar condicional para cada tipo de compressão não é escalável.

- Aplicação do Strategy Pattern:
Crie uma interface CompressaoStrategy com o método comprimir().
Implemente diferentes estratégias de compressão, como ZipCompressionStrategy e RarCompressionStrategy.
O cliente escolhe qual algoritmo de compressão usar em tempo de execução.

```java
public interface CompressaoStrategy {
    void comprimir(String arquivo);
}

public class ZipCompressionStrategy implements CompressaoStrategy {
    @Override
    public void comprimir(String arquivo) {
        System.out.println("Comprimindo " + arquivo + " em formato ZIP");
    }
}

public class RarCompressionStrategy implements CompressaoStrategy {
    @Override
    public void comprimir(String arquivo) {
        System.out.println("Comprimindo " + arquivo + " em formato RAR");
    }
}

public class Compressor {
    private CompressaoStrategy strategy;

    public void setCompressaoStrategy(CompressaoStrategy strategy) {
        this.strategy = strategy;
    }

    public void comprimirArquivo(String arquivo) {
        strategy.comprimir(arquivo);
    }
}

```

## Cálculo de Frete
Imagine que você está desenvolvendo um sistema para calcular o frete de uma loja online. O frete pode ser calculado de diferentes maneiras, como frete normal, frete expresso, ou frete internacional.

- Problema:
As regras para calcular o frete variam dependendo da opção de frete escolhida pelo cliente.

- Aplicação do Strategy Pattern:
Crie uma interface FreteStrategy com o método calcularFrete().
Implemente classes como FreteNormalStrategy, FreteExpressoStrategy e FreteInternacionalStrategy que encapsulam as regras específicas.
O sistema de checkout escolhe a estratégia de frete correta baseada na opção do cliente.

```java
public interface FreteStrategy {
    double calcularFrete(double peso);
}

public class FreteNormalStrategy implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 10;
    }
}

public class FreteExpressoStrategy implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 20;
    }
}

public class FreteInternacionalStrategy implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 50;
    }
}

public class CalculadoraFrete {
    private FreteStrategy strategy;

    public void setFreteStrategy(FreteStrategy strategy) {
        this.strategy = strategy;
    }

    public double calcular(double peso) {
        return strategy.calcularFrete(peso);
    }
}
```