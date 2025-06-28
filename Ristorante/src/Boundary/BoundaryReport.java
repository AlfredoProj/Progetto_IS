package Boundary;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import Controller.ControllerReport;
import DTO.DTOIngrediente;

public class BoundaryReport {
    private JButton generaReportButton;
    private JPanel panel1;
    private JTextArea areaNomi;
    private JScrollPane scrollPane;

    public BoundaryReport() {

        areaNomi.setVisible(false);
        scrollPane.setVisible(false);

        generaReportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//sarebbe clickOnGeneraReport
                GeneraReportOnClickHandler();
            }
        });


    }

    private void GeneraReportOnClickHandler() {
        ControllerReport cr = new ControllerReport();
        DTOIngrediente dto= cr.generaReport();
        updateGUI(dto.getLista());

        generaReportButton.setVisible(false);
        areaNomi.setVisible(true);
        scrollPane.setVisible(true);
    }

    private void updateGUI(List<String> lista_nomi){
        areaNomi.setText("");
        for(String nome: lista_nomi){
            areaNomi.append(nome + "\n");
        }
    }

    public JPanel getPanel() {
        return panel1;
    }

}
