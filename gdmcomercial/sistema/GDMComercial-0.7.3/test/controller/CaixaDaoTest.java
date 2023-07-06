package controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import model.Caixa;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CaixaDaoTest {

    public CaixaDaoTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSalvaCaixa() {
        System.out.println("salvaCaixa");
        Caixa c = null;
        CaixaDao instance = new CaixaDao();
        instance.salvaCaixa(c);

    }

    @Test
    public void testCalcularSaldoDiario() {
        System.out.println("calcularSaldoDiario");
        CaixaDao instance = new CaixaDao();
        BigDecimal result = instance.calcularSaldoDiario();
        assertEquals(new BigDecimal("0.00"), result);

    }

    @Test
    public void testDeleteCaixa() {
        System.out.println("deleteCaixa");
        Caixa cx = null;
        CaixaDao instance = new CaixaDao();
        instance.deleteCaixa(cx);

    }

    @Test
    public void testGetCaixaByNome() {
        System.out.println("getCaixaByNome");
        String nome = "MASTER-CX";
        CaixaDao instance = new CaixaDao();
        Caixa expResult = null;
        Caixa result = instance.getCaixaByNome(nome);
        assertNotNull(result);

    }

    @Test
    public void testGetCaixaByDataAbertura() {
        System.out.println("getCaixaByDataAbertura");
        LocalDate date = LocalDate.of(2019, Month.FEBRUARY, 19);
        CaixaDao instance = new CaixaDao();
        Caixa expResult = null;
        Caixa result = instance.getCaixaByDataAbertura(date);
        assertNull(result);

    }

    @Test
    public void testListaCaixa() {
        System.out.println("listaCaixa");
        CaixaDao instance = new CaixaDao();
        List<Caixa> expResult = null;
        List<Caixa> result = instance.listaCaixa();

        assertNotNull(result);
    }

    @Test
    public void testGetCaixaPoCodigo() {
        System.out.println("getCaixaPoCodigo");
        long codigo = 4L;
        CaixaDao instance = new CaixaDao();
        Caixa expResult = null;
        Caixa result = instance.getCaixaPoCodigo(codigo);
        assertNull(result);

    }

}
