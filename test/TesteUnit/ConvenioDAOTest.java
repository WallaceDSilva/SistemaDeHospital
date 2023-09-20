package TesteUnit;




import dao.ConvenioDAO;
import java.sql.SQLException;
import modelo.Convenio;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Assert;
import org.junit.Test;


public class ConvenioDAOTest {
    
    ConvenioDAO dao;
    
    public ConvenioDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        dao = new ConvenioDAO();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testarBuscarConvenioComFiltro() throws SQLException  {
        
        Assert.assertNotNull(dao.buscarConvenioFiltro("Amil"));
        
        
    }
    
    
    @Test
    public void testarBuscarConvenios() throws SQLException{
        
        Assert.assertTrue(!dao.buscarcConvenios().isEmpty());
        
        
    }
    
   
    
}
