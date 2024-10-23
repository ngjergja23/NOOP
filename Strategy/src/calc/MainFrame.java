package calc;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private FormPanel formPanel;
    private ViewPanel viewPanel;
    private ToolBar toolBar;


    public MainFrame(){
        super("Simple calculator gui");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(680, 580);
        setVisible(true);

        initComps();
        layoutComps();
        activateMainFrame();
    }

    private void initComps() {
        viewPanel = new ViewPanel();  //formPanel = new FormPanel(viewPanel);
        formPanel = new FormPanel();  //krivo form panel i view panel are tight coupled -> ne valja
                                      //form panel mora bit nezavisan o view panelu
        toolBar = new ToolBar();
    }


    private void layoutComps(){

        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.SOUTH);
        add(toolBar, BorderLayout.NORTH);
    }

    private void activateMainFrame() {

        formPanel.setFormPaneListener(new FormPaneListener() {         //anonimna klasa; ja pozivam klasu koja implementira određeno sučelje ali ne dajem joj ime
            @Override
            public void formPanelEventOccurred(CalculationFormData formRecord) {
                viewPanel.addTextToViewPanel(formRecord);
            }
        });

    }


}
