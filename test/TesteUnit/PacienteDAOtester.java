/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package TesteUnit;

import dao.PacienteDAO;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import modelo.Paciente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author astof
 */
public class PacienteDAOtester {

    PacienteDAO dAO;
    Paciente paciente;
    Paciente paciente1;
    String querytest;
    String querytest2 ;

    public PacienteDAOtester() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws ParseException {

        dAO = new PacienteDAO();

        String data = "21/21/2444";

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        paciente = new Paciente(26, "w", "sa", sd.parse(data), "321323", "231321", "sadasd", "sad", 4);
        paciente1 = new Paciente(26, "w", "sa", sd.parse(data), "321323", "231321", "sadasd", "sad", 0);

        querytest = "WHERE NOME = 'Maria da Silva'";
        querytest2 = "WHERE NOME = 'as'";

    }

    @After
    public void tearDown() {
    }

    @Test
    public void test() throws SQLException {

        assertTrue(dAO.cadastrarPaciente(paciente));
        assertFalse(dAO.cadastrarPaciente(paciente1));
        assertNotNull(dAO.buscarPacienteFiltro(querytest));
        assertTrue(dAO.buscarPacienteFiltro(querytest2).isEmpty());
        assertNotNull(dAO.buscarPaciente());

    }
}
