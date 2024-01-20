import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

public class game_Frame_3 extends JFrame implements ActionListener {
    JButton s1_Button;
    int i = 5;
    String[] transport = new String[5];
    JTextField take_Name;
    JTextField take_Round;
    game_Frame_3(String Transport[]) {
        take_Name = new JTextField();
        take_Name.setBounds(53,319,340,64);
        take_Name.setPreferredSize(new DimensionUIResource(340, 64));
        take_Name.setForeground(Color.white);
        take_Name.setFont(new Font("Aldrich", Font.PLAIN, 64));
        take_Name.setBackground(Color.black);
        take_Name.setCaretColor(Color.black);
        take_Name.setHorizontalAlignment(JLabel.CENTER);
        take_Name.setText("ISIM");

        take_Round = new JTextField();
        take_Round.setBounds(426,319,340,64);
        take_Round.setPreferredSize(new DimensionUIResource(340, 64));
        take_Round.setForeground(Color.white);
        take_Round.setFont(new Font("Aldrich", Font.PLAIN, 64));
        take_Round.setBackground(Color.black);
        take_Round.setCaretColor(Color.black);
        take_Round.setHorizontalAlignment(JLabel.CENTER);
        take_Round.setText("10");

        transport = Transport;
        s1_Button = new JButton();
        s1_Button.setBounds(275,609,250,120);
        s1_Button.addActionListener(this);
        s1_Button.setText("<html>ANLADIM</html>");
        s1_Button.setFocusable(false);
        s1_Button.setHorizontalAlignment(JLabel.CENTER);
        s1_Button.setVerticalAlignment(JLabel.CENTER);
        s1_Button.setForeground(Color.black);
        s1_Button.setFont(new Font("Aldrich", Font.PLAIN, 40));

        JLabel title = new JLabel();
        title.setText("RPS+");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setForeground(Color.white);
        title.setFont(new Font("Aldrich", Font.PLAIN, 64));
        title.setBounds(294, 38, 212, 63);

        JLabel roundcount = new JLabel();
        roundcount.setText("round sayisi");
        roundcount.setHorizontalAlignment(JLabel.CENTER);
        roundcount.setVerticalAlignment(JLabel.CENTER);
        roundcount.setForeground(Color.white);
        roundcount.setFont(new Font("Aldrich", Font.PLAIN, 50));
        roundcount.setBounds(426,251,340,49);

        JLabel howto = new JLabel();
        howto.setText("NASIL OYNANIR");
        howto.setHorizontalAlignment(JLabel.CENTER);
        howto.setVerticalAlignment(JLabel.CENTER);
        howto.setForeground(Color.white);
        howto.setFont(new Font("Aldrich", Font.PLAIN, 64));
        howto.setBounds(59,166,675,63);

        JLabel info = new JLabel();
        info.setText("<html>OYUNCULAR BIR ESYA SECIP BIRBIRLERINE HASAR VERIR.<br>IKI ESYAYI YENEN KART SEVIYEATLAR. BUTUN ESYAYI BITEN VEYA<br> ESYA CANI EN AZ OLAN OYUNCU KAYBEDER.</html>");
        info.setHorizontalAlignment(JLabel.CENTER);
        info.setVerticalAlignment(JLabel.CENTER);
        info.setForeground(Color.white);
        info.setFont(new Font("Aldrich", Font.PLAIN, 20));
        info.setBounds(53,396,694,192);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(0, 0, 0));
        this.setBounds(522,196,800,800);
        this.setSize(800, 800);
        this.setLayout(null);

        this.add(roundcount);
        this.add(title);
        this.add(info);
        this.add(take_Round);
        this.add(take_Name);
        this.add(howto);
        this.add(s1_Button);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == s1_Button) {
            System.out.println("wakatta success");
            this.setVisible(false);
            game_Frame_3_1 game_Frame_3_1 = new game_Frame_3_1(transport,take_Name.getText(),take_Round.getText());
        }
        
    }
}