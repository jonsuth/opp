package exercises.exercise6;

import java.awt.*;
import java.awt.event.*;

/**
 * Created by Jon on 20/03/2017.
 */
public class VehicleGUI extends Frame implements ActionListener {

    private TextField textField = new TextField(30);
    private Button button;

    public VehicleGUI() {
        super("Vehicle Creator");

        setSize(500, 500);
        setLayout(new FlowLayout());

        button = new Button("Create Van");
        add(button);
        button.addActionListener(this);

        add(textField);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        textField.setText("button pressed");
    }

    public static void main(String[] args) {
        new VehicleGUI();
    }
}
