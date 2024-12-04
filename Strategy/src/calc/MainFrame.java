package calc;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class  MainFrame extends JFrame {

    private FormPanel formPanel;
    private ViewPanel viewPanel;
    private ToolBar toolBar;
    private final ArrayList<String> txtData;


    public MainFrame(){

        super("Simple calculator gui");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(680, 580);
        setVisible(true);

        txtData = new ArrayList<>();

        initComps();
        layoutComps();
        activateMainFrame();

    }

    private void initComps() {
        viewPanel = new ViewPanel();
        formPanel = new FormPanel();
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
                txtData.add(formRecord.toString());
            }
        });


        toolBar.setToolbarListener(new ToolbarListener() {
            @Override
            public void toolbarEventOccurred(String buttonActionString) {

                if (buttonActionString.equals("Save TXT")){
                    SaveToTxt saveToTxt = new SaveToTxt();
                    saveToTxt.saveDataToFile("dataTXT.txt", txtData);
                }
                if (buttonActionString.equals("Clear all")){
                    txtData.clear();
                    viewPanel.clearViewPanel();
                    JOptionPane.showMessageDialog(MainFrame.this, "List is erased", "Warning", JOptionPane.INFORMATION_MESSAGE);
                }
                if (buttonActionString.equals("Load TXT")){
                    LoadFromTxt loadFromTxt = new LoadFromTxt();
                    List<String> loadedData = loadFromTxt.loadDataFromFile("dataTXT.txt");
                    for (String element : loadedData){
                        viewPanel.addTextToViewPanel(element);
                    }
                    txtData.addAll(loadedData);
                }

            }

        });

    }

}
