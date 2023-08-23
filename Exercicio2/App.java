package Exercicio2;

public class App {
    public static void main(String[] args) {
        // Exemplo 1 - Criando instância de Conta com apenas numero da conta e nome.
        Conta conta1 = new Conta.Builder(987654321L, "Maria Santos").build();

        // Exemplo 2 - Criando instância de Conta com numero da conta, nome e saldos.
        Conta conta2 = new Conta.Builder(246813579L, "Pedro Alves")
                .saldoLivreInicial(25000)
                .saldoAplicacaoInicial(5000)
                .build();

        // Exemplo 3 - Criando instância de Conta com todos os atributos disponíveis.
        Conta conta3 = new Conta.Builder(123456789L, "João da Silva")
                .categoriaInicial(Categoria.ADVANCED)
                .saldoLivreInicial(5000)
                .saldoAplicacaoInicial(10000)
                .taxaRemuneracao(0.03)
                .taxaSaldoNegativo(0.01)
                .build();

        // output
        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);

    }
}
