package visao;

import dao.ConvenioDAO;
import dao.PacienteDAO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import modelo.Convenio;
import modelo.Paciente;
import servicos.ConvenioServicos;
import servicos.ServicosFactory;

public class GuiCadPaciente extends javax.swing.JInternalFrame {

    /**
     * Creates new form GuiCadPaciente
     */
    public GuiCadPaciente() {
        initComponents();
        preencherCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jlNome = new javax.swing.JLabel();
        jlCpf = new javax.swing.JLabel();
        jlEndereco = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jtEndereco = new javax.swing.JTextField();
        jlEspecialidade = new javax.swing.JLabel();
        jlDataNasc = new javax.swing.JLabel();
        jtDataNasc = new javax.swing.JTextField();
        jtTelefone = new javax.swing.JTextField();
        jlTelefone = new javax.swing.JLabel();
        jlEmail1 = new javax.swing.JLabel();
        jtEmail1 = new javax.swing.JTextField();
        jlRG = new javax.swing.JLabel();
        jtRG = new javax.swing.JTextField();
        jcConvenio = new javax.swing.JComboBox<>();
        jfCPF = new javax.swing.JFormattedTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbLimpar = new javax.swing.JButton();
        jbCadastrar1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("CADASTRO PACIENTE");

        jLayeredPane1.setBackground(new java.awt.Color(204, 255, 255));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLayeredPane1.setOpaque(true);

        jlNome.setText("Nome");
        jLayeredPane1.add(jlNome);
        jlNome.setBounds(40, 20, 60, 30);

        jlCpf.setText("CPF");
        jLayeredPane1.add(jlCpf);
        jlCpf.setBounds(40, 60, 90, 30);

        jlEndereco.setText("Endereço");
        jLayeredPane1.add(jlEndereco);
        jlEndereco.setBounds(40, 140, 60, 30);
        jLayeredPane1.add(jtNome);
        jtNome.setBounds(140, 20, 210, 30);

        jtEndereco.setToolTipText("xxx xxxx");
        jLayeredPane1.add(jtEndereco);
        jtEndereco.setBounds(140, 140, 210, 30);

        jlEspecialidade.setText("Convênio");
        jLayeredPane1.add(jlEspecialidade);
        jlEspecialidade.setBounds(40, 300, 100, 30);

        jlDataNasc.setText("Data Nascimento");
        jLayeredPane1.add(jlDataNasc);
        jlDataNasc.setBounds(40, 260, 100, 30);

        jtDataNasc.setToolTipText("(dd/mm/aaaa)");
        jLayeredPane1.add(jtDataNasc);
        jtDataNasc.setBounds(140, 260, 210, 30);

        jtTelefone.setToolTipText("(xx) xxxx-xxxx");
        jLayeredPane1.add(jtTelefone);
        jtTelefone.setBounds(140, 180, 130, 30);

        jlTelefone.setText("Telefone");
        jLayeredPane1.add(jlTelefone);
        jlTelefone.setBounds(40, 180, 50, 30);

        jlEmail1.setText("E-mal");
        jLayeredPane1.add(jlEmail1);
        jlEmail1.setBounds(40, 220, 90, 30);

        jtEmail1.setToolTipText("nome@dominio.com");
        jLayeredPane1.add(jtEmail1);
        jtEmail1.setBounds(140, 220, 210, 30);

        jlRG.setText("RG");
        jLayeredPane1.add(jlRG);
        jlRG.setBounds(40, 100, 90, 30);

        jtRG.setToolTipText("xxxxxxxxx");
        jLayeredPane1.add(jtRG);
        jtRG.setBounds(140, 100, 210, 30);

        jLayeredPane1.add(jcConvenio);
        jcConvenio.setBounds(140, 300, 150, 30);

        try {
            jfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jLayeredPane1.add(jfCPF);
        jfCPF.setBounds(140, 60, 160, 30);

        jLayeredPane2.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLayeredPane2.setOpaque(true);

        jbLimpar.setText("limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jbLimpar);
        jbLimpar.setBounds(290, 20, 140, 40);

        jbCadastrar1.setText("cadastrar");
        jbCadastrar1.setMinimumSize(new java.awt.Dimension(78, 20));
        jbCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrar1ActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jbCadastrar1);
        jbCadastrar1.setBounds(80, 20, 140, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addComponent(jLayeredPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean vereficaUnidade() {

        PacienteDAO dAO = new PacienteDAO();
        boolean b = false;
        try {

            b = dAO.buscarCPF(jfCPF.getText());

            if (b == false) {

                JOptionPane.showMessageDialog(rootPane, "Cpf existente no sistema, portanto não e possivel cadastrar");

            }

        } catch (Exception e) {

        }

        return b;

    }

    public Paciente validarDados() {

        Paciente pac = new Paciente();

        try {

            // Verificando se um convênio foi selecionado no JComboBox
            if (!(jcConvenio.getSelectedIndex() == 0)) {
                //   Obtendo o nome do convênio selecionado pelo usuário
                String conv = jcConvenio.getSelectedItem().toString();
                //   Criando objeto ConvenioDAO para buscar o convênio no banco de dados
                ConvenioDAO convDAO = new ConvenioDAO();
                //     Buscando o convênio no banco de dados com base no nome selecionado pelo usuário
                Convenio convenio = convDAO.buscarConvenioFiltro(conv);
                //      Atribuindo o ID do convênio ao paciente
                pac.setConvenio(convenio.getIdConvenio());

                // Atribuindo valores aos atributos do Paciente com base nos campos preenchidos pelo usuário na tela
                boolean nomeValido = jtNome.getText().matches("[a-z]{1,55}");
                boolean cpfValido = jfCPF.getText().matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}");
                boolean dataValida = jtDataNasc.getText().matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}");
                boolean enderecoValido = jtEndereco.getText().matches("[\\w]{0,197}[ ][0-9]{3}");
                boolean telefoneValido = jtTelefone.getText().matches("[(][0-9]{2}[)][ ][0-9]{4,5}[-][0-9]{4}");
                boolean emailValido = jtEmail1.getText().matches("\\w+@\\w+\\.\\w{2,3}");
                boolean rgValido = jtRG.getText().matches("[0-9]{1,15}");
                boolean cpfUnico = vereficaUnidade();
                String cpfSemMascara = jfCPF.getText().replace(".", "").replace("-", "");
                
                
                
                if (jtNome.getText().isEmpty()
                        || jtRG.getText().isEmpty()
                        || cpfSemMascara.equals("           ")
                        || jtDataNasc.getText().isEmpty()
                        || jtEndereco.getText().isEmpty()
                        || jtTelefone.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(rootPane, "Os campos obrigatorio são respectivamente \n"
                            + " Nome, "
                            + " CPF, "
                            + " RG. \n "
                            + " Endereço, "
                            + " Telefone, "
                            + " Data de nascimento.");

                } else {

                    if (nomeValido == true && jtNome.getText().length() <= 55) {

                        pac.setNome(jtNome.getText());

                        if (cpfValido == true) {

                            if (cpfUnico == true) {

                                pac.setCpf(cpfSemMascara);

                                if (rgValido == true && jtRG.getText().length() <= 15) {

                                    pac.setRg(jtRG.getText());

                                    if (enderecoValido == true && jtEndereco.getText().length() <= 200) {

                                        pac.setEndereco(jtEndereco.getText());

                                        if (telefoneValido == true && jtTelefone.getText().length() <= 15) {

                                            pac.setTelefone(jtTelefone.getText());

                                            if (emailValido == true || jtEmail1.getText().isEmpty()) {

                                                pac.setEmail(jtEmail1.getText());

                                                if (dataValida == true) {

                                                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

                                                    pac.setDataNascimento(sdf.parse(jtDataNasc.getText()));

                                                    limpar();

                                                    JOptionPane.showMessageDialog(this, "Paciente cadastrado com sucesso!");

                                                } else {

                                                    JOptionPane.showMessageDialog(rootPane, "O campo data deve apresentar o vormato dd/MM/yyyy");
                                                }

                                            } else {

                                                JOptionPane.showMessageDialog(rootPane, "O campo de e-mail é opcional, no entanto, se preenchido,"
                                                        + " deve conter um endereço de e-mail válido ou, no mínimo, números");

                                            }

                                        } else {

                                            JOptionPane.showMessageDialog(rootPane, "Telefone deve conter 15 ou menos numeros");

                                        }

                                    } else {

                                        JOptionPane.showMessageDialog(rootPane, "Endereço deve conter 200 ou menos ao final após um espaço deve conter o número da casa EX: RuaMarioVd 233");

                                    }

                                } else {

                                    JOptionPane.showMessageDialog(rootPane, "RG deve conter 15 ou menos numeros");

                                }
                            }
                        } else {

                            JOptionPane.showMessageDialog(rootPane, "CPF deve conter 11 numeros");

                        }

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Nome teve ser menor que 55 letras");
                    }

                }

            } else {
                JOptionPane.showMessageDialog(this,
                        "Selecione um Convenio");
            } // fecha else

        } catch (Exception e) {
        } finally {
            return pac;
        }

    }

    private void cadastrar() {

        try {

            // Criando objeto PacienteDAO para cadastrar o paciente no banco de dados
            PacienteDAO pacDAO = new PacienteDAO();

            Paciente paciente = validarDados();

            pacDAO.cadastrarPaciente(paciente);

        } catch (Exception e) {

        } // fecha catch

    }// fecha método

    //apaga valores dos campos
    private void limpar() {
        jtNome.setText("");
        jtDataNasc.setText("");
        jtEmail1.setText("");
        jtTelefone.setText("");
        jtEndereco.setText("");
        jfCPF.setText("");
        jcConvenio.setSelectedIndex(0);
        jtRG.setText("");

    }// fecha método

    // metodo para preencher o combo box com os produtos cadastrados no banco de dados
    private void preencherCombo() {
        try {

            // Buscando objeto ProdutoServicos
            ConvenioServicos ps = ServicosFactory.getConvenioServicos();

            /*
             * Criando um ArrayList<ProdutoVO> vazio
             * para receber o ArrayList com os dados
             */
            ArrayList<Convenio> p = new ArrayList<>();

            // Recebendo o ArrayList cheio em produtos
            p = ps.buscarConvenio();

            // Adicionando os dados do ArrayList no JComboBox
            jcConvenio.addItem("-Selecione-");
            for (int i = 0; i < p.size(); i++) {

                // Adicionando o nome do convênio ao JComboBox
                jcConvenio.addItem(p.get(i).getNomeConvenio());

            } // fecha for

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro! " + e.getMessage());
        } // fecha catch
    }// fecha classe

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {
        limpar();
    }

    private void jbCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {
        cadastrar();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JButton jbCadastrar1;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JComboBox<String> jcConvenio;
    private javax.swing.JFormattedTextField jfCPF;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlDataNasc;
    private javax.swing.JLabel jlEmail1;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlEspecialidade;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlRG;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JTextField jtDataNasc;
    private javax.swing.JTextField jtEmail1;
    private javax.swing.JTextField jtEndereco;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtRG;
    private javax.swing.JTextField jtTelefone;
    // End of variables declaration//GEN-END:variables
}
