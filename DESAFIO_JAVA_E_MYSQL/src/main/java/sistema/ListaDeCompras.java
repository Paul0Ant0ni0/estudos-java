package sistema;

import java.util.Date;

public class ListaDeCompras {
    private Integer idCompra;
    private String dataCompra;
    private String hora;
    private String formaDePagamento;
    private Integer quantidade;
    private Double valorTotal;


    public ListaDeCompras(Integer idCompra, String dataCompra, String hora,
                          String formaDePagamento, Integer quantidade, Double valorTotal) {
        this.idCompra = idCompra;
        this.dataCompra = dataCompra;
        this.hora = hora;
        this.formaDePagamento = formaDePagamento;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
