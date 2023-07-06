/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Produto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Deibidson Mesquita
 */
public class ProdutoDaoTest {

    public ProdutoDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of listaProdutos method, of class ProdutoDao.
     */
    @Test
    public void testListaProdutos() {
        System.out.println("listaProdutos");
        ProdutoDao instance = new ProdutoDao();
        List<Produto> expResult = null;
        List<Produto> result = instance.listaProdutos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteProduto method, of class ProdutoDao.
     */
    @Test
    public void testDeleteProduto() {
        System.out.println("deleteProduto");
        long p = 0L;
        ProdutoDao instance = new ProdutoDao();
        instance.deleteProduto(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of produtoByCodigo method, of class ProdutoDao.
     */
    @Test
    public void testProdutoByCodigo() {
        System.out.println("produtoByCodigo");
        long codigo = 0L;
        ProdutoDao instance = new ProdutoDao();
        Produto expResult = null;
        Produto result = instance.produtoByCodigo(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizarProduto method, of class ProdutoDao.
     */
    @Test
    public void testAtualizarProduto() {
        System.out.println("atualizarProduto");
        Produto p = null;
        ProdutoDao instance = new ProdutoDao();
        instance.atualizarProduto(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadastra method, of class ProdutoDao.
     */
    @Test
    public void testCadastra() {
        System.out.println("cadastra");
        Produto p = null;
        ProdutoDao instance = new ProdutoDao();
        instance.cadastra(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of produtoByCodigoBarras method, of class ProdutoDao.
     */
    @Test
    public void testProdutoByCodigoBarras() {
        System.out.println("produtoByCodigoBarras");
        String codigobar = "";
        ProdutoDao instance = new ProdutoDao();
        Produto expResult = null;
        Produto result = instance.produtoByCodigoBarras(codigobar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
