/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author pabli
 */
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Supongamos que tienes una lista de caminos encontrados
        List<List<Integer>> caminos = new ArrayList<>();
        caminos.add(Arrays.asList(1, 3, 5, 7));
        caminos.add(Arrays.asList(2, 4, 6));
        caminos.add(Arrays.asList(2, 4, 6));
        caminos.add(Arrays.asList(2, 4, 6));
        caminos.add(Arrays.asList(1, 3, 5, 7));
        caminos.add(Arrays.asList(2, 4, 6));
        caminos.add(Arrays.asList(2, 4, 6));
        caminos.add(Arrays.asList(2, 4, 6));
        caminos.add(Arrays.asList(1, 3, 5, 7));
        caminos.add(Arrays.asList(2, 4, 6));
        caminos.add(Arrays.asList(2, 4, 6));
        caminos.add(Arrays.asList(2, 4, 6));

        SwingUtilities.invokeLater(() -> {
            CaminosFrame caminosFrame = new CaminosFrame(caminos);
            caminosFrame.setVisible(true);
        });
    }
}
