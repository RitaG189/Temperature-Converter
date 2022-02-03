import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConverterFrame extends JFrame{
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton convertButton;
    private JPanel panel;
    private JSpinner temp1;
    private JLabel label;

    static final int SCREEN_WIDTH = 300;
    static final int SCREEN_HEIGHT = 300;
    private String scale1, scale2;
    private int text1, text2;

    public ConverterFrame(){

        this.setTitle("Temperature Converter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.pack();

        //this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.lightGray);
        this.setFocusable(true);


        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                text1 = (int) temp1.getValue();
                scale1 = (String) comboBox1.getSelectedItem();
                scale2 = (String) comboBox2.getSelectedItem();

                if(scale1.equals(scale2)) {
                    JOptionPane.showMessageDialog(panel, "Select different scales");
                }
                else {
                    var conv = new Conversions(text1, scale1, scale2);
                    int finalRes = conv.setScale();
                    showResult(finalRes);

                }
            }
        });


    }

    public void showResult(int res) {

        String finalRes = Integer.toString(res);

        label.setText(finalRes);
    }
}
