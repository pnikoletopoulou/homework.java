package homework_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class AnimalApp {
    private static ArrayList<Animal> animals = new ArrayList<>();
    private static int index = 0;

    public static void main(String[] args) {
        animals.add(new Animal("Dog", "images/dog.jpg"));
        animals.add(new Animal("Cat", "images/cat.jpg"));
        animals.add(new Animal("Horse", "images/horse.jpg"));

        JFrame frame = new JFrame("Preschool Letter Training");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        
        JLabel label = new JLabel();
        label.setHorizontalAlignment(SwingConstants.CENTER);
    
        JTextField txtField = new JTextField(5);
        JButton button = new JButton("Check");
        JLabel resultLabel = new JLabel("", SwingConstants.CENTER);

        setImage(label, animals.get(index).getImage());

        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter the first letter: "));
        panel.add(txtField);
        panel.add(button);

        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);
        frame.add(resultLabel, BorderLayout.NORTH);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = txtField.getText().trim().toLowerCase();
                String correct = animals.get(index).getAnimal().substring(0, 1).toLowerCase();

                if (user.length() != 1) {
                    resultLabel.setText("Enter one letter");
                    return;
                }

                if (user.equals(correct)) {
                    resultLabel.setText("Correct!");
                    index = (index + 1) % animals.size();
                    setImage(label, animals.get(index).getImage());
                    txtField.setText("");
                }
                else {
                    resultLabel.setText("Wrong! The correct letter is " + correct);
                }


            }
        });

        frame.setVisible(true);
    }

    private static void setImage(JLabel label, String image) {
        ImageIcon imageIcon = new ImageIcon(image);
        Image sc = imageIcon.getImage().getScaledInstance(300, 250, Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(sc));
    }
}
