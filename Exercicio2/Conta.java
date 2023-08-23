package Exercicio2;

enum Categoria {
    NORMAL, ADVANCED, PREMIUM
};

public class Conta {

    Long numeroConta;
    String nomeCorrentista;
    Categoria categoriaInicial;
    int saldoLivreInicial;
    int saldoAplicacaoInicial;
    double taxaRemuneracao;
    double taxaSaldoNegativo;

    public static class Builder {

        Long numeroConta;
        String nomeCorrentista;

        Categoria categoriaInicial = Categoria.NORMAL;
        int saldoLivreInicial = 0;
        int saldoAplicacaoInicial = 0;
        double taxaRemuneracao = 0;
        double taxaSaldoNegativo = 0;

        public Builder(Long numeroConta, String nomeCorrentista) {
            this.numeroConta = numeroConta;
            this.nomeCorrentista = nomeCorrentista;
        }

        public Builder saldoLivreInicial(int saldo) {
            this.saldoLivreInicial = saldo;
            return this;
        }

        public Builder saldoAplicacaoInicial(int saldo) {
            this.saldoAplicacaoInicial = saldo;
            return this;
        }

        public Builder taxaRemuneracao(double taxa) {
            this.taxaRemuneracao = taxa;
            return this;
        }

        public Builder taxaSaldoNegativo(double taxa) {
            this.taxaSaldoNegativo = taxa;
            return this;
        }

        public Builder categoriaInicial(Categoria categoria) {
            this.categoriaInicial = categoria;
            return this;
        }

        public Conta build(){
            return new Conta(this);
        }
    }

    private Conta(Builder builder) {
        this.numeroConta = builder.numeroConta;
        this.nomeCorrentista = builder.nomeCorrentista;
        this.categoriaInicial = builder.categoriaInicial;
        this.saldoAplicacaoInicial = builder.saldoAplicacaoInicial;
        this.saldoLivreInicial = builder.saldoLivreInicial;
        this.taxaRemuneracao = builder.taxaRemuneracao;
        this.taxaSaldoNegativo = builder.taxaSaldoNegativo;
    }

    public Long getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public Categoria getCategoriaInicial() {
        return categoriaInicial;
    }

    public void setCategoriaInicial(Categoria categoriaInicial) {
        this.categoriaInicial = categoriaInicial;
    }

    public int getSaldoLivreInicial() {
        return saldoLivreInicial;
    }

    public void setSaldoLivreInicial(int saldoLivreInicial) {
        this.saldoLivreInicial = saldoLivreInicial;
    }

    public int getSaldoAplicacaoInicial() {
        return saldoAplicacaoInicial;
    }

    public void setSaldoAplicacaoInicial(int saldoAplicacaoInicial) {
        this.saldoAplicacaoInicial = saldoAplicacaoInicial;
    }

    public double getTaxaRemuneracao() {
        return taxaRemuneracao;
    }

    public void setTaxaRemuneracao(double taxaRemuneracao) {
        this.taxaRemuneracao = taxaRemuneracao;
    }

    public double getTaxaSaldoNegativo() {
        return taxaSaldoNegativo;
    }

    public void setTaxaSaldoNegativo(double taxaSaldoNegativo) {
        this.taxaSaldoNegativo = taxaSaldoNegativo;
    }

    @Override
    public String toString() {
        return "Conta [numeroConta=" + numeroConta + ", nomeCorrentista=" + nomeCorrentista + ", categoriaInicial="
                + categoriaInicial + ", saldoLivreInicial=" + saldoLivreInicial + ", saldoAplicacaoInicial="
                + saldoAplicacaoInicial + ", taxaRemuneracao=" + taxaRemuneracao + ", taxaSaldoNegativo="
                + taxaSaldoNegativo + "]";
    }

}
