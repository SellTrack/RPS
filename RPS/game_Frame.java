import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class game_Frame extends JFrame implements ActionListener {
    JButton s1_Button;
    JButton s2_Button;

    game_Frame() {
        // ImageIcon paper = new ImageIcon("paper.png");
        // ImageIcon stone = new ImageIcon("stone.png");
        // ImageIcon scissors = new ImageIcon("scissors.png");
        // ImageIcon icon2 = new ImageIcon("stone.png");
        /*creating the first button */
        s1_Button = new JButton();
        s1_Button.setBounds(94, 400, 200, 200);
        s1_Button.addActionListener(this);
        s1_Button.setText("<html>USER<br>VS<br>PC</html>");
        s1_Button.setFocusable(true);
        s1_Button.setHorizontalAlignment(JLabel.CENTER);
        s1_Button.setVerticalAlignment(JLabel.CENTER);
        s1_Button.setForeground(Color.black);
        s1_Button.setFont(new Font("Aldrich", Font.PLAIN, 40));
        /*creating the second button */
        s2_Button = new JButton();
        s2_Button.setBounds(506, 400, 200, 200);
        s2_Button.addActionListener(this);
        s2_Button.setText("<html>PC<br>VS<br>PC</html>");
        s2_Button.setFocusable(false);
        s2_Button.setHorizontalAlignment(JLabel.CENTER);
        s2_Button.setVerticalAlignment(JLabel.CENTER);
        s2_Button.setForeground(Color.black);
        s2_Button.setFont(new Font("Aldrich", Font.PLAIN, 40));

        /*create the title  it's not clickable just text*/
        JLabel title = new JLabel();
        title.setText("RPS+");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setForeground(Color.white);
        title.setFont(new Font("Aldrich", Font.PLAIN, 64));
        title.setBounds(294, 38, 212, 63);

        JLabel mode = new JLabel();
        mode.setText("OYUN MODU SEC");
        mode.setHorizontalAlignment(JLabel.CENTER);
        mode.setVerticalAlignment(JLabel.CENTER);
        mode.setForeground(Color.white);
        mode.setFont(new Font("Aldrich", Font.PLAIN, 64));
        mode.setBounds(59, 166, 675, 63);

        /*i guess we add the click thing in buttons but buttons are already clikcable ?? */
        JLabel s1 = new JLabel();
        s1.setText("<html>USER<br>VS<br>PC</html>");
        s1.setHorizontalAlignment(JLabel.CENTER);
        s1.setVerticalAlignment(JLabel.CENTER);
        s1.setForeground(Color.black);
        s1.setFont(new Font("Aldrich", Font.PLAIN, 40));
        s1.setBounds(23, 41, 153, 117);

        JLabel s2 = new JLabel();
        s2.setText("<html>PC<br>VS<br>PC</html>");
        s2.setHorizontalAlignment(JLabel.CENTER);
        s2.setVerticalAlignment(JLabel.CENTER);
        s2.setForeground(Color.black);
        s2.setFont(new Font("Aldrich", Font.PLAIN, 40));
        s2.setBounds(19, 41, 161, 117);

        /*where is the panels */
        JPanel s1Panel = new JPanel();
        s1Panel.setBackground(new Color(0xD9D9D9));
        s1Panel.setBounds(94, 400, 200, 200);
        s1Panel.setLayout(null);
        s1Panel.add(s1);
        s1Panel.add(s1_Button);

        JPanel s2Panel = new JPanel();
        s2Panel.setBackground(new Color(0xD9D9D9));
        s2Panel.setBounds(506, 400, 200, 200);
        s2Panel.setLayout(null);
        s2Panel.add(s2);
        s2Panel.add(s2_Button);

        /*activate the exit button */
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(0, 0, 0));
        this.setBounds(522,196,800,800);
        this.setSize(800, 800);
        this.setLayout(null);

        this.add(title);
        this.add(mode);
        this.add(s1_Button);
        this.add(s2_Button);

        ImageIcon image = new ImageIcon("sprites/logo.png");
        this.setIconImage(image.getImage());
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == s1_Button) {
            System.out.println("s1 success");
            this.setVisible(false);
            game_Frame_2 game_Frame_2 = new game_Frame_2();
        }
        if (e.getSource() == s2_Button) {
            System.out.println("s2 success");
            this.setVisible(false);
            game_Frame_2_1 game_Frame_2_1 = new game_Frame_2_1();
        }
    }
}
