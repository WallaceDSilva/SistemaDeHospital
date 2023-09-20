/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package TesteUnit;

import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import persistencia.ConexaoBanco;

/**
 *
 * @author astof
 */
public class TestPersist {

    ConexaoBanco cnBanco;

    public TestPersist() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        cnBanco = new ConexaoBanco();
    }

    @After
    public void tearDown() {
        cnBanco = null;
    }

    @Test
    public void test() throws SQLException {
        
        assertNotNull(cnBanco.getConexao());
        
        
        
    }
    
    
}
