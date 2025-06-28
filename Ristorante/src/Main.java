import Boundary.BoundaryReport;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crea la finestra principale
            JFrame frame = new JFrame("Generazione Report");

            // Imposta il contenuto della finestra con il pannello della GUI
            frame.setContentPane(new BoundaryReport().getPanel());

            // Impostazioni della finestra
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack(); // adatta le dimensioni al contenuto
            frame.setResizable(false);
            frame.setLocationRelativeTo(null); // centra la finestra sullo schermo
            frame.setVisible(true);
        });
    }
}