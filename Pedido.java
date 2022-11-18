//package br.com.aulapdv.syspdv.domain;

import java.util.List;
import javax.xml.crypto.Data;
public class Pedido {
    private Integer id;
    private Data instante;
    private Pagamento pagamento;
    private List<ItemPedido> itensPedidos;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Data getInstante() {
        return instante;
    }
    public void setInstante(Data instante) {
        this.instante = instante;
    }
    public Pagamento getPagamento() {
        return pagamento;
    }
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    public List<ItemPedido> getItensPedidos() {
        return itensPedidos;
    }
    public void setItensPedidos(List<ItemPedido> itensPedidos) {
        this.itensPedidos = itensPedidos;
    }
    public Pedido(Integer id, Data instante, Pagamento pagamento, List<ItemPedido> itensPedidos) {
        this.id = id;
        this.instante = instante;
        this.pagamento = pagamento;
        this.itensPedidos = itensPedidos;
    }
}