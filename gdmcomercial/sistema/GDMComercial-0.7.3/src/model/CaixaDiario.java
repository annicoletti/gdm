/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class CaixaDiario implements Serializable {

    private static final long serialVersionUID = -6967087629718201100L;

    @Id
    @GeneratedValue(generator = "gent")
    @GenericGenerator(name = "gent", strategy = "increment")
    private long id;
    private String responsavel;
    @Column(columnDefinition = "DATE", nullable = false, unique = true)
    private LocalDate dataCaixa;
    @Column(nullable = false)
    private String horaFechamento;
    private BigDecimal valorSaida;
    private BigDecimal valorEntradas;
    private BigDecimal saldo;
    private BigDecimal total;

    @ManyToOne
    private Caixa caixa;

    public CaixaDiario() {
    }

    public CaixaDiario(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDataCaixa() {
        return dataCaixa;
    }

    public void setDataCaixa(LocalDate dataCaixa) {
        this.dataCaixa = dataCaixa;
    }

    public BigDecimal getValorSaida() {
        return valorSaida;
    }

    public void setValorSaida(BigDecimal valorSaida) {
        this.valorSaida = valorSaida;
    }

    public BigDecimal getValorEntradas() {
        return valorEntradas;
    }

    public void setValorEntradas(BigDecimal valorEntradas) {
        this.valorEntradas = valorEntradas;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal movimetacao) {
        this.saldo = movimetacao;
    }

    public String getHoraFechamento() {
        return horaFechamento;
    }

    public void setHoraFechamento(String horaFechamento) {
        this.horaFechamento = horaFechamento;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

}
