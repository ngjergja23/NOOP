package calc;

import javax.swing.*;
import java.awt.*;

public class ToolBar extends JPanel {

    private JButton saveAsTxtbtn;
    private JButton saveAsObjbtn;
    private JButton loadTxt;
    private JButton loadObj;
    private JButton claerAll;


    public ToolBar() {
        initComps();
        layoutComps();
        activateToolBar();
    }


    private void initComps() {

        this.saveAsTxtbtn = new JButton("Save txt");
        this.saveAsObjbtn = new JButton("Save bin");
        this.loadTxt = new JButton("Load txt");
        this.loadObj = new JButton("Load bin");
        this.claerAll = new JButton("Claer all");

    }

    private void layoutComps() {

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(saveAsTxtbtn);
        add(saveAsObjbtn);
        add(loadTxt);
        add(loadObj);
        add(claerAll);

    }

    private void activateToolBar() {
    }




}
