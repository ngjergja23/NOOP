package calc;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel {

    private JTextField fstNumField;
    private JTextField sndNumField;
    private JTextField result;

    private JComboBox<Operation> operationBox;
    private JButton confirm;

    private FormPaneListener formPaneListener;
//    private ViewPanel viewPanel; //pr //prvo brisemo viewPanel

    public FormPanel() {

        Dimension dims = getPreferredSize();
        dims.height = 220;
        this.setPreferredSize(dims);
        Border outer = BorderFactory.createEmptyBorder(5,5,5,5); //lijepo
        Border inner = BorderFactory.createTitledBorder("Calculation panel: ");
        Border border = BorderFactory.createCompoundBorder(outer, inner);

        //
//        this.viewPanel = viewPanel;
        //
        setBorder(border);

        initComps();
        layoutComps();
        activateFormPanel();
    }

    public void initComps(){

        fstNumField = new JTextField(10);
        sndNumField = new JTextField(10);
        result = new JTextField(10);

        operationBox = new JComboBox<>();
        DefaultComboBoxModel<Operation> operationBoxModel = new DefaultComboBoxModel<>(); //
        operationBoxModel.addElement(new Addition());  //treba nam toString
        operationBoxModel.addElement(new Subtraction());
        operationBoxModel.addElement(new Multiplication());
        operationBoxModel.addElement(new Division());
        operationBox.setModel(operationBoxModel);

        confirm = new JButton("Calculate");

    }

    public void setFormPaneListener(FormPaneListener formPaneListener) {
        this.formPaneListener = formPaneListener;
    }

    public void layoutComps(){

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        //prvi
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("First number: "), gbc);

        gbc.gridx = 1;
        add(fstNumField, gbc);

        //drugi
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Second number: "), gbc);

        gbc.gridx = 1;
        add(sndNumField, gbc);

        gbc.gridx = 2;
        add(Box.createHorizontalStrut(20), gbc);
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Choose operation: "), gbc);

        gbc.gridx = 3;
        add(operationBox, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        add(Box.createVerticalStrut(10));

        gbc.gridy++;
        add(confirm, gbc);

        gbc.gridx++;
        add(new JLabel("Result: "), gbc);

        gbc.gridx++;
        add(result, gbc);

    }

    public void activateFormPanel(){

        confirm.addActionListener(e -> {

            System.out.println("Test for btn activation");
            double f = Double.parseDouble(fstNumField.getText());
            double s = Double.parseDouble(sndNumField.getText());
            Operation operationStrategy = (Operation) operationBox.getSelectedItem();
            double r = operationStrategy.calculate(f,s);
            result.setText(String.valueOf(r));

            CalculationFormData formRecord = new CalculationFormData(f, s, r, operationStrategy);
//                viewPanel.addTextToViewPanel(formRecord);

            if (formPaneListener != null){
                formPaneListener.formPanelEventOccurred(formRecord);  //ovako bi trebalo

                resetForm();
            }

        });

    }

    private void resetForm() {

        this.fstNumField.setText("");
        this.sndNumField.setText("");
        result.setEnabled(false);
        fstNumField.requestFocus();
//        operationBox.setSelectedIndex(-1);

    }
}
