package model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Endereco implements Serializable {

    private static final long serialVersionUID = 6733500123948062082L;
    @Id
    @GeneratedValue
    private Long id;

    private String endereco;
    private int numero;
    private String cidade;
    private String uf;
    private String cep;
    private String bairro;
    private String referencia;
    private String tipo;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Fornecedor fornecedor;

    @ManyToOne
    private Empresa empresa;

    @ManyToOne
    private Vendedor vendedor;

    public Endereco() {
    }

    public Endereco(Long id, String endereco, int numero, String cidade, String uf, String cep, String bairro, String referencia, String tipo) {
        this.id = id;
        this.endereco = endereco;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.bairro = bairro;
        this.referencia = referencia;
        this.tipo = tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.id);
        hash = 19 * hash + Objects.hashCode(this.endereco);
        hash = 19 * hash + this.numero;
        hash = 19 * hash + Objects.hashCode(this.cidade);
        hash = 19 * hash + Objects.hashCode(this.uf);
        hash = 19 * hash + Objects.hashCode(this.cep);
        hash = 19 * hash + Objects.hashCode(this.bairro);
        hash = 19 * hash + Objects.hashCode(this.referencia);
        hash = 19 * hash + Objects.hashCode(this.cliente);
        hash = 19 * hash + Objects.hashCode(this.fornecedor);
        hash = 19 * hash + Objects.hashCode(this.empresa);
        hash = 19 * hash + Objects.hashCode(this.vendedor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Endereco other = (Endereco) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.uf, other.uf)) {
            return false;
        }
        if (!Objects.equals(this.cep, other.cep)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.referencia, other.referencia)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.fornecedor, other.fornecedor)) {
            return false;
        }
        if (!Objects.equals(this.empresa, other.empresa)) {
            return false;
        }
        if (!Objects.equals(this.vendedor, other.vendedor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Endereco{" + "id=" + id + ", endereco=" + endereco + ", numero=" + numero + ", cidade=" + cidade + ", uf=" + uf + ", cep=" + cep + ", bairro=" + bairro + ", referencia=" + referencia + ", cliente=" + cliente + ", fornecedor=" + fornecedor + ", empresa=" + empresa + ", vendedor=" + vendedor + '}';
    }

}
