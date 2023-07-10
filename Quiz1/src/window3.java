import javax.swing.*;
import java.awt.*;

public class window3 {
    final private static Color mainColor = new Color(255,255,0);
    final private static Font mainFont = new Font("Sitka Text", Font.BOLD, 40);
    final private static Font titleFont = new Font("Sitka Text", Font.BOLD, 50);
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setTitle("Window 3");
        frame.getContentPane().setBackground(new Color(255, 255, 0));
        frame.setSize(1000, 800);
        frame.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        panel1.setBackground(mainColor);
        panel1.setLayout(new FlowLayout(FlowLayout.LEADING, 50,15));

        JLabel quiztitle = new JLabel("Quiz 1");
        quiztitle.setFont(titleFont);
        panel1.add(quiztitle);

        JPanel panel2 = new JPanel();
        panel2.setBackground(mainColor);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(2,1,0,10));
        panel3.setBackground(mainColor);
        
        JTextArea textArea = new JTextArea("Question 1:");
        textArea.setFont(new Font("Sitka Text", Font.PLAIN, 16));
        textArea.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
        textArea.setBackground(Color.WHITE);
        textArea.setBorder(BorderFactory.createCompoundBorder(
            textArea.getBorder(),
            BorderFactory.createEmptyBorder(10,10,10,10)
        ));
        textArea.setEditable(false);

        JPanel quizoptions = new JPanel();
        quizoptions.setBackground(new Color(255,255,0));
        quizoptions.setLayout(new GridLayout(1,2, 10,10));

        JRadioButton optionA = new JRadioButton("True");
        optionA.setFocusable(false);
        optionA.setHorizontalAlignment(SwingConstants.CENTER);
        optionA.setIcon(new RadioButtonIcon(40));
        optionA.setBackground(mainColor);
        optionA.setFont(mainFont);

        JRadioButton optionB = new JRadioButton("False");
        optionB.setFocusable(false);
        optionB.setHorizontalAlignment(SwingConstants.CENTER);
        optionB.setIcon(new RadioButtonIcon(40));
        optionB.setBackground(mainColor);
        optionB.setFont(mainFont);

        ButtonGroup quizGroup = new ButtonGroup();
        quizGroup.add(optionA);
        quizGroup.add(optionB);

        quizoptions.add(optionA);
        quizoptions.add(optionB);

        panel3.add(textArea);
        panel3.add(quizoptions);

        JPanel panel4 = new JPanel();
        panel4.setBackground(mainColor);

        JPanel panel5 = new JPanel();
        panel5.setBackground(mainColor);


        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(50, 100));
        panel5.setPreferredSize(new Dimension(50, 100));
        panel4.setPreferredSize(new Dimension(50, 100));
        panel5.setPreferredSize(new Dimension(50, 100));

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.CENTER);
        frame.add(panel4,BorderLayout.EAST);
        frame.add(panel5,BorderLayout.WEST);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }

    private static class RadioButtonIcon implements Icon {
        private final int size;

        public RadioButtonIcon(int size) {
            this.size = size;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            ButtonModel model = ((AbstractButton) c).getModel();
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            Color selectedColor = Color.BLACK;     
            Color unselectedColor = Color.WHITE;    

            if (model.isSelected()) {
                g2d.setColor(unselectedColor);
                g2d.fillOval(x, y, size, size);
                g2d.setColor(selectedColor);
                g2d.fillOval(x + 4, y + 4, size - 8, size - 8);
            } else {
                g2d.setColor(selectedColor);
                g2d.fillOval(x, y, size, size);
                g2d.setColor(unselectedColor);
                g2d.fillOval(x + 4, y + 4, size - 8, size - 8);
            }

            g2d.dispose();
        }

        @Override
        public int getIconWidth() {
            return size;
        }

        @Override
        public int getIconHeight() {
            return size;
        }
    }
}
