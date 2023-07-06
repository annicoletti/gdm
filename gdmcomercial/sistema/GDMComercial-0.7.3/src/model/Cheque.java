/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cheque implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String numero;
    private String banco;
    private String clienteNome;
    private BigDecimal valor;
    private LocalDate dataTroca;

    private static final long serialVersionUID = -2483255779334426843L;

    public Cheque() {
    }

    public Long getId() {
        return id;
    }

    public Cheque(Long id) {
        this.id = id;
    }

    public Cheque(String numero, String banco, String clienteNome, BigDecimal valor, LocalDate dataTroca) {
        this.numero = numero;
        this.banco = banco;
        this.clienteNome = clienteNome;
        this.valor = valor;
        this.dataTroca = dataTroca;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getDataTroca() {
        return dataTroca;
    }

    public void setDataTroca(LocalDate dataTroca) {
        this.dataTroca = dataTroca;
    }

}
