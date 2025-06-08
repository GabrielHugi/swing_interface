package screens;

import java.awt.*;
import javax.swing.*;

public class Form extends JFrame {
    // java swing documentation so I don't forget
    // https://docs.oracle.com/javase/8/docs/api/javax/swing/package-summary.html
    // https://www.geeksforgeeks.org/introduction-to-java-swing/
    // https://javamex.com/tutorials/swing/components.shtml 
    // this one ^ is the best one because the java documentation is ass


    /*
     * 
     *  LEMBRAR DE FAZER BOTÃO CONFIRMAR PEGAR OS DADOS E MOSTRAR ELES NA MENSAGEM
     * 
     * 
     * 
     * 
     * 
     */
    private JPanel panel;
    private JPanel titulo, linha1, linha2, linha3, linha4, linha5, linha6, linha7, linha8, linha9, buttons;

    public Form() {
        super("Cadastro de Pessoa");
        start();
    }
    
    // keeps track of input fields
    java.util.List<JTextField> textFields = new java.util.ArrayList<>();
    java.util.List<ButtonGroup> radioButtons = new java.util.ArrayList<>();
    java.util.List<JCheckBox> checkBoxes = new java.util.ArrayList<>();

    private void start() {

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(25, 20,25, 20));

 
        titulo = createRow();
        titulo.add(Box.createHorizontalStrut(25));
        titulo.setMaximumSize(new Dimension(2500, 50));
        JLabel titulo_label = new JLabel("Cadastro de pessoas", SwingConstants.LEFT);
        titulo_label.setFont(titulo_label.getFont().deriveFont(Font.PLAIN, 60f));
        titulo_label.setMaximumSize(new Dimension(800, 50));
        titulo_label.setBackground(null);
        titulo_label.setBorder(null);
        titulo_label.setAlignmentY(Component.TOP_ALIGNMENT);
        titulo_label.setAlignmentX(Component.LEFT_ALIGNMENT);
        titulo_label.setForeground(new Color(243, 123, 47));
        titulo.add(titulo_label);
        panel.add(titulo);
        panel.add(Box.createVerticalStrut(60));


        linha1 = createRow();
        linha1.add(createLabel("Tipo"));
        linha1.add(Box.createHorizontalStrut(5));
        JComboBox<String> pessoa = new JComboBox<>(new String[]{"Física", "Jurídica"});
        pessoa.setMaximumSize(new Dimension(160, 32));
        pessoa.setAlignmentY(Component.TOP_ALIGNMENT);
        linha1.add(pessoa);
        linha1.add(Box.createHorizontalStrut(5));
        linha1.add(createLabel("CPF / CNPJ..."));
        linha1.add(Box.createHorizontalStrut(5));
        linha1.add(createTextField(20));
        linha1.add(Box.createHorizontalStrut(5));
        linha1.add(createLabel("Fornecedor"));
        linha1.add(Box.createHorizontalStrut(5));
        linha1.add(createCheckBox());
        panel.add(linha1);

 
        linha2 = createRow();
        linha2.add(createLabel("Nome"));
        linha2.add(Box.createHorizontalStrut(5));
        linha2.add(createTextField(78));
        panel.add(linha2);


        linha3 = createRow();
        linha3.add(createLabel("RG / Inscrição Estadual"));
        linha3.add(Box.createHorizontalStrut(5));
        linha3.add(createTextField(15));
        linha3.add(Box.createHorizontalStrut(5));
        linha3.add(createLabel("Orgão Expedidor"));
        linha3.add(Box.createHorizontalStrut(5));
        linha3.add(createTextField(15));
        panel.add(linha3);


        linha4 = createRow();
        linha4.add(createLabel("Email"));
        linha4.add(Box.createHorizontalStrut(5));
        linha4.add(createTextField(31));
        linha4.add(Box.createHorizontalStrut(5));
        linha4.add(createLabel("CEP"));
        linha4.add(Box.createHorizontalStrut(5));
        linha4.add(createTextField(31));
        panel.add(linha4);


        linha5 = createRow();
        linha5.add(createLabel("País"));
        linha5.add(Box.createHorizontalStrut(5));
        JTextField pais = createTextField(31);
        pais.setBackground(new Color(230, 230, 230));
        pais.setText("BRASIL");
        linha5.add(pais);
        linha5.add(Box.createHorizontalStrut(5));
        linha5.add(createLabel("UF..."));
        linha5.add(Box.createHorizontalStrut(5));
        linha5.add(createTextField(5));
        linha5.add(Box.createHorizontalStrut(5));
        JTextField UF = createTextField(25);
        UF.setBackground(new Color(230, 230, 230));
        linha5.add(UF);
        panel.add(linha5);


        linha6 = createRow();
        linha6.add(createLabel("Município..."));
        linha6.add(Box.createHorizontalStrut(5));
        JTextField municipio = createTextField(78);
        municipio.setBackground(new Color(230, 230, 230));
        linha6.add(municipio);
        panel.add(linha6);


        linha7 = createRow();
        linha7.add(createLabel("Logradouro"));
        linha7.add(Box.createHorizontalStrut(5));
        linha7.add(createTextField(78));
        panel.add(linha7);


        linha8 = createRow();
        linha8.add(createLabel("Número"));
        linha8.add(Box.createHorizontalStrut(5));
        linha8.add(createTextField(21));
        linha8.add(Box.createHorizontalStrut(5));
        linha8.add(createLabel("Complemento"));
        linha8.add(Box.createHorizontalStrut(5));
        linha8.add(createTextField(41));
        panel.add(linha8);


        linha9 = createRow();
        linha9.add(createLabel("Bairro"));
        linha9.add(Box.createHorizontalStrut(5));
        linha9.add(createTextField(15));
        linha9.add(Box.createHorizontalStrut(5));
        linha9.add(createLabel("Telefone"));
        linha9.add(Box.createHorizontalStrut(5));
        linha9.add(createTextField(15));
        linha9.add(Box.createHorizontalStrut(5));
        linha9.add(createLabel("Situação"));
        linha9.add(Box.createHorizontalStrut(5));
        // radio buttons
        JRadioButton linha9_ativo = new JRadioButton("Ativo");
        linha9_ativo.setActionCommand("Ativo");
        linha9_ativo.setAlignmentY(Component.TOP_ALIGNMENT);
        JRadioButton linha9_inativo = new JRadioButton("Inativo");
        linha9_inativo.setActionCommand("Inativo");
        linha9_inativo.setAlignmentY(Component.TOP_ALIGNMENT);
        ButtonGroup linha9_bg = new ButtonGroup();
        linha9_bg.add(linha9_ativo); 
        linha9_bg.add(linha9_inativo);  
        radioButtons.add(linha9_bg);
        linha9.add(linha9_ativo); 
        linha9.add(linha9_inativo);
        panel.add(linha9);
        panel.add(Box.createVerticalStrut(30));


        buttons = createRow();
        buttons.setMaximumSize(new Dimension(2500, 60));
        JButton confirmarBtn = createButton("Confirmar", new Color(230,100,0));
        /*
        confirmarBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Adicionado");
        });
        */
        confirmarBtn.addActionListener(e -> {
            // construindo a string para listar todos os bagulhos
            StringBuilder mensagem = new StringBuilder();
            mensagem.append("Tipo: ").append(pessoa.getSelectedItem()).append("\n\n");
            String[] labels = {
                "CPF/CNPJ", "Nome", "RG / Inscrição Estadual", "Orgão Expedidor",
                "Email", "CEP", "País", "UF (sigla)", "UF (nome)",
                "Município", "Logradouro", "Número", "Complemento",
                "Bairro", "Telefone"
            };
            // adiciona cada valor em ordem
            for (int i = 0; i < textFields.size(); i++) {
                mensagem.append(labels[i])
                .append(": ")
                .append(textFields.get(i).getText())
                .append("\n");
            }
            mensagem.append("\n");
            boolean isFornecedor = checkBoxes.get(0).isSelected();
            mensagem.append("Fornecedor: ").append(isFornecedor ? "Sim" : "Não").append("\n\n");
            ButtonGroup situacaoGroup = radioButtons.get(0);
            ButtonModel sel = situacaoGroup.getSelection();
            String sit = (sel != null ? sel.getActionCommand() : "Não definido");
            mensagem.append("Situação: ").append(sit).append("\n");
            //mensagem
            JOptionPane.showMessageDialog(
                this,
                mensagem.toString(),
                "Dados Informados",
                JOptionPane.INFORMATION_MESSAGE
            );
        });
        buttons.add(confirmarBtn);
        buttons.add(Box.createHorizontalStrut(5));
        JButton excluirBtn = createButton("Excluir", new Color(230,100,0));
        excluirBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Excluido");
        });
        buttons.add(excluirBtn);
        buttons.add(Box.createHorizontalStrut(5));
        JButton limparBtn = createButton("Limpar", Color.LIGHT_GRAY);
        limparBtn.addActionListener(e -> {
            for (JTextField textField : textFields) textField.setText("");
            //for (JRadioButton rb : radioButtons) rb.setSelected(false);
            // this radio thing isn't working for some reason
            for (ButtonGroup buttonGroup : radioButtons) buttonGroup.clearSelection();
            for (JCheckBox checkBox : checkBoxes) checkBox.setSelected(false);
        });
        buttons.add(limparBtn);
        panel.add(buttons);

        setContentPane(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1500,900);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // create functions
    private JPanel createRow() {
        JPanel row = new JPanel();
        row.setLayout(new BoxLayout(row, BoxLayout.X_AXIS));
        row.setAlignmentX(Component.LEFT_ALIGNMENT);
        row.setMaximumSize(new Dimension(2500, 40));
        return row;
    }

    private JLabel createLabel(String text) {
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setFont(label.getFont().deriveFont(Font.BOLD,16f));
        label.setBackground(Color.WHITE);
        label.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        label.setPreferredSize(new Dimension(200,32));
        label.setMaximumSize(new Dimension(200,32));
        label.setAlignmentY(Component.TOP_ALIGNMENT);
        return label;
    }

    private JTextField createTextField(int columns) {
        JTextField textField = new JTextField(columns);
        textField.setFont(textField.getFont().deriveFont(16f));
        textField.setBackground(Color.WHITE);
        textField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        textField.setMaximumSize(new Dimension(2000,32));
        textField.setAlignmentY(Component.TOP_ALIGNMENT);
        textFields.add(textField);
        return textField;
    }

    private JCheckBox createCheckBox() {
        JCheckBox checkBox = new JCheckBox();
        checkBox.setPreferredSize(new Dimension(40, 40));
        checkBox.setBorder(BorderFactory.createEmptyBorder(10,5,10,5));
        checkBox.setAlignmentY(Component.TOP_ALIGNMENT);
        checkBoxes.add(checkBox);
        return checkBox;
    }

    private JButton createButton(String text, Color backgroundColor) {
        JButton button = new JButton(text);
        button.setFont(button.getFont().deriveFont(Font.BOLD,16f));
        button.setBackground(backgroundColor);
        button.setForeground(Color.WHITE);
        button.setBorder(BorderFactory.createEmptyBorder(8,60,8,60));
        button.setAlignmentY(Component.TOP_ALIGNMENT);
        return button;
    }
}
