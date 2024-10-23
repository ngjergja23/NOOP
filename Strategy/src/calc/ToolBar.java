package calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel implements ActionListener {

    private JButton saveAsTxt;
    private JButton saveAsObj;
    private JButton loadTxt;
    private JButton loadObj;
    private JButton claerAll;


    public ToolBar() {
        initComps();
        layoutComps();
        activateToolBar();
    }


    private void initComps() {

        this.saveAsTxt = new JButton("Save txt");
        this.saveAsObj = new JButton("Save bin");
        this.loadTxt = new JButton("Load txt");
        this.loadObj = new JButton("Load bin");
        this.claerAll = new JButton("Clear all");

    }

    private void layoutComps() {

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(saveAsTxt);
        add(saveAsObj);
        add(loadTxt);
        add(loadObj);
        add(claerAll);

    }

    private void activateToolBar() {

        saveAsTxt.addActionListener(this);
        saveAsTxt.setActionCommand("Save TXT"); //kao identifikator
        saveAsObj.addActionListener(this);
        saveAsObj.setActionCommand("Save BIN");
        loadTxt.addActionListener(this);
        loadTxt.setActionCommand("Load TXT");
        loadObj.addActionListener(this);
        loadObj.setActionCommand("Load BIN");
        claerAll.addActionListener(this);
        claerAll.setActionCommand("Clear all");

    }


    @Override
    public void actionPerformed(ActionEvent e) {



    }
}
