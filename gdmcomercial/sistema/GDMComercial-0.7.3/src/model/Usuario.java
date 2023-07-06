/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String nivelAcesso;
    private String usuario;
    private String senha;

    @OneToOne
    private Vendedor funcionario;

    private static final long serialVersionUID = 3132016283867286556L;

    public Usuario() {
    }

    public Usuario(String nivelAcesso, String usuario, String senha, Vendedor funcionario) {
        this.nivelAcesso = nivelAcesso;
        this.usuario = usuario;
        this.senha = senha;
        this.funcionario = funcionario;
    }

    public Usuario(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Vendedor getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Vendedor funcionario) {
        this.funcionario = funcionario;
    }

}
