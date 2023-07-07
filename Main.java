import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //INTERFAZ
        JFrame frame = new JFrame("Formulario");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Formulario().getRootPanel());
        frame.setVisible(true);

        String filePath="datosform.dat";


    }
}
