import java.awt.*;
import javax.swing.*;

public class window4 { 
    final private static Color mainColor = new Color(255,255,0);
    final private static Font mainFont = new Font("Sitka Text", Font.BOLD, 40);
    final private static Font quizzz = new Font("Sitka Text", Font.PLAIN, 65);
    final private static Font titleFont = new Font("Sitka Text", Font.BOLD, 50);
    public static void main(String [] args){
        JFrame frame = new JFrame();
        frame.setTitle("Window 4");
        frame.getContentPane().setBackground(new Color(255, 255, 0));
        frame.setSize(1000, 800);
        frame.setLayout(new BorderLayout());


        JPanel panel1 = new JPanel();
        panel1.setBackground(mainColor);
        panel1.setLayout(new FlowLayout(FlowLayout.LEADING, 30,40));

        JLabel quiztitle = new JLabel("Quiz with me");
        quiztitle.setFont(new Font("Sitka Text", Font.BOLD, 30));
        panel1.add(quiztitle);

        JPanel panel2 = new JPanel();
        panel2.setBackground(mainColor);

/************************************************************************************/
        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(3,1,0,10));
        panel3.setBackground(mainColor);


        JPanel quiz1 = new JPanel();
        quiz1.setBackground(mainColor);
        quiz1.setLayout(null);
        JPanel content1 = new JPanel();
        JButton button1 = new JButton("Take me!"); 
        button1.setFont(new Font("Sitka Text", Font.BOLD, 18));
        button1.setBackground(Color.WHITE);
        button1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        button1.setFocusable(false); 
        button1.setBounds(750,65,120,50);
        content1.setBounds(0,0, 700,180);
        content1.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        content1.setLayout(null);

        JLabel QUIZZZ1 = new JLabel("QUIZ 1");
        QUIZZZ1.setFont(quizzz);
        QUIZZZ1.setBounds(30,0,350,180);

        JLabel amount1 = new JLabel("Amount of Question: 10");
        amount1.setFont(new Font("Sitka Text",Font.PLAIN, 20));
        amount1.setBounds(440,0,350,180);

        content1.add(amount1);
        content1.add(QUIZZZ1);

        quiz1.add(content1);
        quiz1.add(button1);

        JPanel quiz2 = new JPanel();
        quiz2.setPreferredSize(new Dimension(720,266));
        quiz2.setBackground(mainColor);
        quiz2.setLayout(null);
        JPanel content2 = new JPanel();
        JButton button2 = new JButton("Take me!"); 
        button2.setFont(new Font("Sitka Text", Font.BOLD, 18));
        button2.setBackground(Color.WHITE);
        button2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        button2.setFocusable(false); 
        button2.setBounds(750,65,120,50);
        content2.setBounds(0,0, 700,180);
        content2.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        content2.setLayout(null);
        JLabel QUIZZZ2 = new JLabel("QUIZ 2");
        QUIZZZ2.setFont(quizzz);
        QUIZZZ2.setBounds(30,0,350,180);

        JLabel amount2 = new JLabel("Amount of Question: 20");
        amount2.setFont(new Font("Sitka Text",Font.PLAIN, 20));
        amount2.setBounds(440,0,350,180);

        content2.add(amount2);
        content2.add(QUIZZZ2);

        quiz2.add(content2);
        quiz2.add(button2);

        JPanel quiz3 = new JPanel();
        quiz3.setPreferredSize(new Dimension(720,266));
        quiz3.setBackground(mainColor);

        quiz3.setLayout(null);
        JPanel content3 = new JPanel();
        JButton button3 = new JButton("Take me!");
        button3.setFont(new Font("Sitka Text", Font.BOLD, 18));
        button3.setBackground(Color.WHITE);
        button3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        button3.setFocusable(false); 
        button3.setBounds(750,65,120,50);
        content3.setBounds(0,0, 700,180);
        content3.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));

        content3.setLayout(null);
        JLabel QUIZZZ3 = new JLabel("QUIZ 3");
        QUIZZZ3.setFont(quizzz);
        QUIZZZ3.setBounds(30,0,350,180);

        JLabel amount3 = new JLabel("Amount of Question: 10");
        amount3.setFont(new Font("Sitka Text",Font.PLAIN, 20));
        amount3.setBounds(440,0,350,180);

        content3.add(amount3);
        content3.add(QUIZZZ3);

        quiz3.add(content3);
        quiz3.add(button3);

        panel3.add(quiz1);
        panel3.add(quiz2);
        panel3.add(quiz3);
/************************************************************************************/
        JPanel panel4 = new JPanel();
        panel4.setBackground(mainColor);

        JPanel panel5 = new JPanel();
        panel5.setBackground(mainColor);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(50, 100));
        panel5.setPreferredSize(new Dimension(50, 100));
        panel4.setPreferredSize(new Dimension(40, 100));
        panel5.setPreferredSize(new Dimension(40, 100));

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.CENTER);
        frame.add(panel4,BorderLayout.EAST);
        frame.add(panel5,BorderLayout.WEST);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
