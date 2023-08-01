
package Clases;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class CaminosFrame extends JFrame {

    private JList<String> caminosList;

    public CaminosFrame(List<List<Integer>> caminos) {
        setTitle("Caminos Encontrados");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        caminosList = new JList<>();
        updateCaminosList(caminos);

        JScrollPane scrollPane = new JScrollPane(caminosList);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    public void updateCaminosList(List<List<Integer>> caminos) {
        DefaultListModel<String> model = new DefaultListModel<>();
        for (List<Integer> camino : caminos) {
            String caminoStr = camino.toString();
            model.addElement(caminoStr);
            model.addElement("Sucursal Origen "+ camino.get(0));
        }
        caminosList.setModel(model);
    }
}

