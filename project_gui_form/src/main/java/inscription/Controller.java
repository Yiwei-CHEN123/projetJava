package inscription;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class Controller extends JFrame {

    public Controller(String title) throws HeadlessException {
        super(title);

        Container contentPane = getContentPane();
        // 使用流布局
//        contentPane.setLayout(new FlowLayout());
        // 使用自由布局
        contentPane.setLayout(null);

//        contentPane.add(new JScrollPane(), BorderLayout.NORTH);

        JScrollPane a = new JScrollPane();
        a.setVerticalScrollBar(new JScrollBar());
        contentPane.add(a);



        Component radio1 = contentPane.add(new JRadioButton("S'inscrire"));
        radio1.setBounds(40,30,100, 10);
        Component radio2 = contentPane.add(new JRadioButton("Se connecter"));
        radio2.setBounds(180,30,100, 10);

        Component label1 = contentPane.add(new JLabel("(*)Civilite: "));
        label1.setBounds(40,60,150,20);

        String[] listCombo = new String[]{"M.", "Mme.", "Mlle."};
        final JComboBox<String> comboBox = new JComboBox<String>(listCombo);

        // 匿名方法 添加条目选中后的监听器
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Sélectionné: " + comboBox.getSelectedIndex() + " = " + comboBox.getSelectedItem());
                }
            }
        });

        Component combo = contentPane.add(comboBox);
        combo.setBounds(200,60, 200, 20);

        Component label2 = contentPane.add(new JLabel("(*)Email : "));
        label2.setBounds(40, 100, 150, 20);
        Component textField1 = contentPane.add(new JTextField(16));
        textField1.setBounds(200, 100, 200, 20);

        Component label3 = contentPane.add(new JLabel("(*)Mot de passe : "));
        label3.setBounds(40, 140, 150, 20);
        Component textField2 = contentPane.add(new JTextField(16));
        textField2.setBounds(200, 140, 200, 20);

        Component sep1 = contentPane.add(new JSeparator());
        sep1.setBounds(40, 170, 600, 10);
        sep1.setForeground(Color.BLACK);

        Component label4 = contentPane.add(new JLabel("(*)Nom : "));
        label4.setBounds(40, 190, 150, 20);
        Component textField3 = contentPane.add(new JTextField(16));
        textField3.setBounds(200, 190, 200, 20);

        Component label5 = contentPane.add(new JLabel("(*)Prenom : "));
        label5.setBounds(40, 230, 150, 20);
        Component textField4 = contentPane.add(new JTextField(16));
        textField4.setBounds(200, 230, 200, 20);

        Component label6 = contentPane.add(new JLabel("(*)Adresse postale : "));
        label6.setBounds(40, 270, 150, 20);
        Component textField5 = contentPane.add(new JTextField(16));
        textField5.setBounds(200, 270, 200, 20);

        Component label7 = contentPane.add(new JLabel("(*)Code Postal : "));
        label7.setBounds(40, 310, 150, 20);
        Component textField6 = contentPane.add(new JTextField(16));
        textField6.setBounds(200, 310, 200, 20);

        Component label8 = contentPane.add(new JLabel("(*)Numero de telephone : "));
        label8.setBounds(40, 350, 150, 20);
        Component textField7 = contentPane.add(new JTextField(16));
        textField7.setBounds(200, 350, 200, 20);

        Component label9 = contentPane.add(new JLabel("Si vous etre une personne morale, saisissez votre Numero Siret / Numero Entreprise : "));
        label9.setBounds(40, 390, 550, 20);
        Component textField8 = contentPane.add(new JTextField(16));
        textField8.setBounds(40, 420, 200, 20);

        Component sep2 = contentPane.add(new JSeparator());
        sep2.setBounds(40, 460, 600, 10);
        sep2.setForeground(Color.BLACK);


        Component label10 = contentPane.add(new JLabel("Pour vous identifier, verifiez fournir votre piece d'identite : "));
        label10.setBounds(40, 480, 450, 20);

        Component label11 = contentPane.add(new JLabel("(*)Type de document : "));
        label11.setBounds(40, 520, 150, 20);

        String[] listCombo2 = new String[]{"Passeport", "Titre de sejour", "Permis de conduite", "Attestation de naissance"};
        final JComboBox<String> comboBox2 = new JComboBox<String>(listCombo2);

        // 匿名方法 添加条目选中后的监听器
        comboBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Sélectionné: " + comboBox2.getSelectedIndex() + " = " + comboBox2.getSelectedItem());
                }
            }
        });

        Component combo2 = contentPane.add(comboBox2);
        combo2.setBounds(200,520, 200, 20);

        Component label12 = contentPane.add(new JLabel("(*)Numero d'identite : "));
        label12.setBounds(40, 560, 150, 20);
        Component textField9 = contentPane.add(new JTextField(16));
        textField9.setBounds(200, 560, 200, 20);

        Component label13 = contentPane.add(new JLabel("(*)Depossez votre piece d'identite sous forme PDF : "));
        label13.setBounds(40, 590, 350, 20);

        Component btnDeposer = contentPane.add(new JButton("Brows.."));
        btnDeposer.setBounds(200, 620, 100, 20);

        Component label14 = contentPane.add(new JLabel("(*)IBAN : "));
        label14.setBounds(40, 660, 150, 20);
        Component textField10 = contentPane.add(new JTextField(16));
        textField10.setBounds(200, 660, 200, 20);












        Component btnvalider = contentPane.add(new JButton("Valider"));
        btnvalider.setBounds(500, 1050, 100, 20);
        Component btnsupprimer = contentPane.add(new JButton("Supprimer"));
        btnsupprimer.setBounds(1000, 1050, 100,20);





    }

    public void init() {
        UIManager.put("Tree.background", Color.LIGHT_GRAY);
        UIManager.put("Tree.textBackground", Color.LIGHT_GRAY);
        UIManager.put("Tree.line",Color.red);
        UIManager.put("ScrollBar.width", new Integer(20));
        getContentPane().add(new JScrollPane(new JTree()));
        //UIManager.put("Button.foreground", Color.red);
        // getContentPane().add(new JTree());
        // getContentPane().add(new JButton());
        //getContentPane().add(new JScrollPane(new JTree()));

    }


}
