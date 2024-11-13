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
    private JButton clearAll;
    private ToolbarListener toolbarListener;


    public ToolBar() {
        initComps();
        layoutComps();
        activateToolBar();

    }

    public void setToolbarListener(ToolbarListener toolbarListener) {
        this.toolbarListener = toolbarListener;
    }

    private void initComps() {

        this.saveAsTxt = new JButton("Save txt");
        this.saveAsObj = new JButton("Save bin");
        this.loadTxt = new JButton("Load txt");
        this.loadObj = new JButton("Load bin");
        this.clearAll = new JButton("Clear all");

    }

    private void layoutComps() {

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(saveAsTxt);
        add(saveAsObj);
        add(loadTxt);
        add(loadObj);
        add(clearAll);

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
        clearAll.addActionListener(this);
        clearAll.setActionCommand("Clear all");

    }


    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == saveAsTxt){   //koji botun
            System.out.println("Clicked " + saveAsTxt.getActionCommand());
            if (toolbarListener != null){
                toolbarListener.toolbarEventOccurred(saveAsTxt.getActionCommand());
            }
        }
//        if (ae.getSource() == saveAsObj){
//            System.out.println("Clicked " + saveAsObj.getActionCommand());
//        }
        if (ae.getSource() == loadTxt){
            System.out.println("Clicked " + loadTxt.getActionCommand());
            if (toolbarListener != null){
                toolbarListener.toolbarEventOccurred((loadTxt.getActionCommand()));
            }
        }
//        if (ae.getSource() == loadObj){
//            System.out.println("Clicked " + loadObj.getActionCommand());
//        }
        if (ae.getSource() == clearAll){
            System.out.println("Clicked " + clearAll.getActionCommand());
            if (toolbarListener != null){
                toolbarListener.toolbarEventOccurred((clearAll.getActionCommand()));
            }
        }


    }


}
