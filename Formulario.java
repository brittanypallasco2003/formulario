import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario {
    private JTextField textField1;
    private JLabel name;
    private JTextField textField2;
    private JLabel id;
    private JTextField textField3;
    private JButton guardarInfo;
    private JPanel rootPanel;
    private JButton cargarButton;

    public Formulario() {
        guardarInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nameform=textField1.getText();
                String idform=textField2.getText();
                String edadform=textField3.getText();

            }
        });
        cargarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    //GETTERS Y SETTERS
    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JLabel getName() {
        return name;
    }

    public void setName(JLabel name) {
        this.name = name;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public JLabel getId() {
        return id;
    }

    public void setId(JLabel id) {
        this.id = id;
    }

    public JTextField getTextField3() {
        return textField3;
    }

    public void setTextField3(JTextField textField3) {
        this.textField3 = textField3;
    }

    public JButton getGuardarInfo() {
        return guardarInfo;
    }

    public void setGuardarInfo(JButton guardarInfo) {
        this.guardarInfo = guardarInfo;
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void setRootPanel(JPanel rootPanel) {
        this.rootPanel = rootPanel;
    }


}
