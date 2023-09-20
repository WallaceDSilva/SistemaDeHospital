package TesteUnit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
import dao.PacienteDAO;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import junit.framework.Assert;
import modelo.Paciente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

;

/**
 *
 * @author astof
 */
public class PacienteTest {

    public PacienteTest() {
    }

    PacienteDAO dao;
    Paciente pa;
    Paciente pa2;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws ParseException {

        SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");

        pa = new Paciente(2, "Teste", "ReaTeste", d.parse("21/01/2005"), "123", "233.455.656-75", "213213", "sadasd@Ga", 4);

        dao = new PacienteDAO();

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testarCadastro() throws SQLException {

        dao.cadastrarPaciente(pa);

        Paciente p = dao.buscarPacienteFiltro("WHERE NOME = 'Teste'").get(0);

        Assert.assertEquals(pa.getNome(), p.getNome());

    }

    @Test
    public void testarBusca() throws SQLException {

        ArrayList<Paciente> pacientes = dao.buscarPaciente();

        Assert.assertNotNull(pacientes);

    }

    @Test
    public void testarFiltro() throws SQLException {

        Assert.assertNotNull(dao.buscarPacienteFiltro("WHERE NOME = 'Teste'"));
        Assert.assertTrue(dao.buscarPacienteFiltro("WHERE NOME = '' ").isEmpty());

    }

}
