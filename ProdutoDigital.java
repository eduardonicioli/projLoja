package Models;

public class ProdutoDigital extends Produto {
    private String formato;
    private double tamanhoArquivo;

    public ProdutoDigital(int codigo, String nome, String descricao, double preco, int quantidadeEstoque, String formato, double tamanhoArquivo) {
        super(codigo, nome, descricao, preco, quantidadeEstoque);
        this.formato = formato;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getFormato() {
        return formato;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Formato: " + formato);
        System.out.println("Tamanho do Arquivo: " + tamanhoArquivo + " MB");
    }
}
