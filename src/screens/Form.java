package screens;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class Form extends JFrame{
    private JPanel linha1, linha2, linha3, linha4, linha5, linha6, linha7, linha8, linha9, linha10;

    //linha 1
    private JPanel linha1_panel_tipo;
    private JLabel linha1_label_tipo;

    private JPanel linha1_panel_pessoa;
    private JList linha1_option_pessoa;

    private JPanel linha1_panel_cpf;
    private JLabel linha1_label_cpf;

    private JPanel linha1_panel_cpfInput;
    private JTextField linha1_text_cpfInput;

    private JPanel linha1_panel_fornecedor;
    private JLabel linha1_label_fornecedor;

    private JPanel linha1_panel_fornecedorCheck;
    private JCheckBox linha1_check_fornecedorCheck;

    //linha 2
    private JPanel linha2_panel_nome;
    private JLabel linha2_label_nome;

    private JPanel linha2_panel_nomeInput;
    private JTextField linha2_text_nomeInput;

    //linha 3
    private JPanel linha3_panel_rg;
    private JLabel linha3_label_rg;

    private JPanel linha3_panel_rgInput;
    private JTextField linha3_text_rgInput;
    
    private JPanel linha3_panel_expeditor;
    private JLabel linha3_label_expeditor;

    private JPanel linha3_panel_expeditorInput;
    private JTextField linha3_text_expeditorInput;
    
    //linha 4
    private JPanel linha4_panel_email;
    private JLabel linha4_label_email;

    private JPanel linha4_panel_emailInput;
    private JTextField linha4_text_emailInput;
    
    private JPanel linha4_panel_cep;
    private JLabel linha4_label_cep;

    private JPanel linha4_panel_cepInput;
    private JTextField linha4_text_cepInput;

    //linha 5
    private JPanel linha5_panel_pais;
    private JLabel linha5_label_pais;

    private JPanel linha5_panel_paisInput;
    private JTextField linha5_text_paisInput;

    private JPanel linha5_panel_uf;
    private JLabel linha5_label_uf;

    private JPanel linha5_panel_ufInput; // uf seria estado de acordo com sei la google
    private JTextField linha5_text_ufInput; //sei lá para q essa text area é
    private JTextField linha5_text2_ufInput;

    //linha 6
    private JPanel linha6_panel_municipio;
    private JLabel linha6_label_municipio;

    private JPanel linha6_panel_municipioInput;
    private JTextField linha6_text_municipioInput;

    //linha 7
    private JPanel linha7_panel_logradouro;
    private JLabel linha7_label_logradouro;

    private JPanel linha7_panel_logradouroInput;
    private JTextField linha7_text_logradouroInput;

    //linha 8
    private JPanel linha8_panel_numero;
    private JLabel linha8_label_numero;

    private JPanel linha8_panel_numeroInput;
    private JTextField linha8_text_numeroInput;

    private JPanel linha8_panel_complemento;
    private JLabel linha8_label_complemento;

    private JPanel linha8_panel_complementoInput;
    private JTextField linha8_text_complementoInput;

    //linha 9
    private JPanel linha9_panel_bairro;
    private JLabel linha9_label_bairro;

    private JPanel linha9_panel_bairroInput;
    private JTextField linha9_text_bairroInput;

    private JPanel linha9_panel_telefone;
    private JLabel linha9_label_telefone;

    private JPanel linha9_panel_telefoneInput;
    private JTextField linha9_text_telefoneInput;

    private JPanel linha9_panel_situacao;
    private JLabel linha9_label_situacao;

    private JPanel linha9_panel_radios;
    private ButtonGroup radioGroup;  // radioGroup.add(linha9_radio_ativo) etc
    private JRadioButton linha9_radio_ativo;
    private JRadioButton linha9_radio_inativo;

    //linha10
    private JPanel linha10_panel_confirmar;
    private JButton linha10_button_confirmar;

    private JPanel linha10_panel_excluir;
    private JButton linha10_button_excluir;

    private JPanel linha10_panel_limpar;
    private JButton linha10_button_limpar;


    private JPanel panel;
    public Form () {
        super("title");
        run();
    }

    private void run() {
        //UIManager.put("Tree.closedIcon", null);
        //UIManager.put("Tree.openIcon", null);
        //UIManager.put("Tree.leafIcon", null);
        panel = new JPanel();
        panel.setLayout(null);
        // line 1
            //linha1 prepare
            linha1 = new JPanel();
            linha1.setBounds(0, 0, 1000, 480);
            linha1.setLayout(new FlowLayout(FlowLayout.LEFT, 40, 0));
            //linha1 components
            linha1_panel_tipo = new JPanel();
            linha1_panel_tipo.setSize(60, 50);
            linha1_label_tipo = new JLabel("pessoa");
            linha1_panel_tipo.add(linha1_label_tipo);

            linha1_panel_pessoa = new JPanel();
            DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
            DefaultMutableTreeNode sigma = new DefaultMutableTreeNode("sigma");
            DefaultMutableTreeNode sigmea = new DefaultMutableTreeNode("sigmea");
            root.add(sigma);
            sigma.add(sigmea);
            JTree tree = new JTree(root);
            tree.setRootVisible(false);
            tree.setShowsRootHandles(true);
            tree.setToggleClickCount(1);
            tree.setRowHeight(24);
            tree.putClientProperty("JTree.lineStyle", "none");
            tree.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
            linha1_panel_pessoa.add(tree);

            linha1_panel_cpf = new JPanel();
            linha1_label_cpf = new JLabel();
            linha1_panel_cpf.add(linha1_label_cpf);

            linha1_panel_cpfInput = new JPanel();
            linha1_text_cpfInput = new JTextField();
            linha1_panel_cpfInput.add(linha1_text_cpfInput);

            linha1_panel_fornecedor = new JPanel();
            linha1_label_fornecedor = new JLabel();
            linha1_panel_fornecedor.add(linha1_label_fornecedor);

            linha1_panel_fornecedorCheck = new JPanel();
            linha1_check_fornecedorCheck = new JCheckBox();
            linha1_panel_fornecedorCheck.add(linha1_check_fornecedorCheck);

            //linha1 add
            linha1.add(linha1_panel_tipo);
            linha1.add(linha1_panel_pessoa);
            linha1.add(linha1_panel_cpf);
            linha1.add(linha1_panel_cpfInput);
            linha1.add(linha1_panel_fornecedor);
            linha1.add(linha1_panel_fornecedorCheck);
            panel.add(linha1);
        // line 2




        //ending regards about panel
        this.setContentPane (panel);
        this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
