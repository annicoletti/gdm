/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.math.BigDecimal;
import java.util.List;
import model.Caixa;
import model.CaixaDiario;

/**
 *
 * @author Deibidson Mesquita
 */
public interface CaixaInterface {

    public BigDecimal calcularSaldoDiario();

    public void deleteCaixa(Caixa cx);

    public void salvaCaixa(Caixa c);

    public List<Caixa> listaCaixa();

    public List<CaixaDiario> listaCaixaDiario();

    public Caixa getCaixaPoCodigo(Long codigo);

    public String getStatusCaixa(Caixa c);

    public Caixa getCaixaPorStatusAberto();

    public void abrirCaixa(Caixa cx);

    public void fecharCaixa(Caixa cx);

    public void salvaCaixaDiario(CaixaDiario cxd);

}
