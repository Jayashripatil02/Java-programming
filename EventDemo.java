package graphical.ui.apps;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
    public class EventDemo extends JFrame{
        private JButton cliclButton;
        private JLabel mouseLabel;
        private JTextField keyTextField;
        public EventDemo(){
            setTitle("Event Handling by Jayashri");
            setSize(400,200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new FlowLayout());
// Button for button click event
            cliclButton = new JButton("Click Me");
            cliclButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(EventDemo.this, "Button Clicked!");
                }
            });
// Label for mouse events
            mouseLabel = new JLabel("Move the mouse over this label");
            mouseLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);JOptionPane.showMessageDialog(EventDemo.this, "Mouse Clicked!");
                }
            });
// Text field for key events
            keyTextField = new JTextField(20);
            keyTextField.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char typedChar = e.getKeyChar();
                    JOptionPane.showMessageDialog(EventDemo.this, "Key Typed!");
                }
            });
// Add components to the frame
            add(cliclButton);
            add(mouseLabel);
            add(keyTextField);
            setVisible(true);
        }
        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> new EventDemo());
        }
    }
