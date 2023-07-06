/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author Deibidson Mesquita
 */
@Entity

public class Caixa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private String descr;

    @Column(columnDefinition = "DATE", nullable = false, unique = true)
    private LocalDate dtabertura;

    @Column(columnDefinition = "DATE")
    private LocalDate dtfechamento;

    private BigDecimal valorAbertura;
    private BigDecimal valorFecamento;
    private String status;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "caixa", fetch = FetchType.LAZY, orphanRemoval = true)
    @Fetch(FetchMode.JOIN)
    private List<Lancamento> lancamentos;

    public Caixa() {
    }

    public Caixa(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caixa)) {
            return false;
        }
        Caixa other = (Caixa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    public List<Lancamento> getLancamentos() {
        return lancamentos;
    }

    public void setLancamentos(List<Lancamento> lancamentos) {
        this.lancamentos = lancamentos;
    }

    @Override
    public String toString() {
        return "model.Caixa[ id=" + id + " ]";
    }

    public LocalDate getDtabertura() {
        return dtabertura;
    }

    public void setDtabertura(LocalDate dtabertura) {
        this.dtabertura = dtabertura;
    }

    public LocalDate getDtfechamento() {
        return dtfechamento;
    }

    public void setDtfechamento(LocalDate dtfechamento) {
        this.dtfechamento = dtfechamento;
    }

    public BigDecimal getValorAbertura() {
        return valorAbertura;
    }

    public void setValorAbertura(BigDecimal valorAbertura) {
        this.valorAbertura = valorAbertura;
    }

    public BigDecimal getValorFecamento() {
        return valorFecamento;
    }

    public void setValorFecamento(BigDecimal valorFecamento) {
        this.valorFecamento = valorFecamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

}
