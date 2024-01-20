import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class game_Frame_2 extends JFrame implements ActionListener {

    JButton stone, paper, scissors;
    JPanel slot_1;
    JLabel stone_logo, paper_logo, scissors_logo, stone_logo2, paper_logo2, scissors_logo2, stone_logo3, paper_logo3,
            scissors_logo3;
    JPanel[] panel_Array;
    int i = 0;
    int a = 0;
    int b = 0;
    int c = 0;
    int x = 1;
    String[] transport = new String[5];

    game_Frame_2() {

        ImageIcon stone_button = new ImageIcon("sprites/stone.png");
        ImageIcon scissors_button = new ImageIcon("sprites/scissors.png");
        ImageIcon paper_button = new ImageIcon("sprites/paper.png");

        panel_Array = new JPanel[5];

        stone_logo = new JLabel();
        stone_logo.setBounds(0, 0, 100, 100);
        stone_logo.setIcon(stone_button);
        stone_logo.setVisible(false);

        scissors_logo = new JLabel();
        stone_logo.setOpaque(true);
        scissors_logo.setBounds(0, 0, 100, 100);
        scissors_logo.setIcon(scissors_button);
        scissors_logo.setVisible(false);

        paper_logo = new JLabel();
        stone_logo.setOpaque(true);
        paper_logo.setBounds(0, 0, 100, 100);
        paper_logo.setIcon(paper_button);
        paper_logo.setVisible(false);

        stone_logo2 = new JLabel();
        stone_logo2.setBounds(0, 0, 100, 100);
        stone_logo2.setIcon(stone_button);
        stone_logo2.setVisible(false);

        scissors_logo2 = new JLabel();
        stone_logo2.setOpaque(true);
        scissors_logo2.setBounds(0, 0, 100, 100);
        scissors_logo2.setIcon(scissors_button);
        scissors_logo2.setVisible(false);

        paper_logo2 = new JLabel();
        stone_logo2.setOpaque(true);
        paper_logo2.setBounds(0, 0, 100, 100);
        paper_logo2.setIcon(paper_button);
        paper_logo2.setVisible(false);

        stone_logo3 = new JLabel();
        stone_logo3.setBounds(0, 0, 100, 100);
        stone_logo3.setIcon(stone_button);
        stone_logo3.setVisible(false);

        scissors_logo3 = new JLabel();
        stone_logo3.setOpaque(true);
        scissors_logo3.setBounds(0, 0, 100, 100);
        scissors_logo3.setIcon(scissors_button);
        scissors_logo3.setVisible(false);

        paper_logo3 = new JLabel();
        stone_logo3.setOpaque(true);
        paper_logo3.setBounds(0, 0, 100, 100);
        paper_logo3.setIcon(paper_button);
        paper_logo3.setVisible(false);

        JLabel stone_label = new JLabel();
        stone_label.setText("TAS");
        stone_label.setHorizontalAlignment(JLabel.CENTER);
        stone_label.setVerticalAlignment(JLabel.CENTER);
        stone_label.setForeground(Color.white);
        stone_label.setFont(new Font("Aldrich", Font.PLAIN, 40));
        stone_label.setBounds(85, 631, 150, 39);

        JLabel paper_label = new JLabel();
        paper_label.setText("KAGIT");
        paper_label.setHorizontalAlignment(JLabel.CENTER);
        paper_label.setVerticalAlignment(JLabel.CENTER);
        paper_label.setForeground(Color.white);
        paper_label.setFont(new Font("Aldrich", Font.PLAIN, 40));
        paper_label.setBounds(325, 631, 150, 39);

        JLabel scissors_label = new JLabel();
        scissors_label.setText("MAKAS");
        scissors_label.setHorizontalAlignment(JLabel.CENTER);
        scissors_label.setVerticalAlignment(JLabel.CENTER);
        scissors_label.setForeground(Color.white);
        scissors_label.setFont(new Font("Aldrich", Font.PLAIN, 40));
        scissors_label.setBounds(557, 631, 150, 39);

        stone = new JButton();
        stone.setBounds(85, 452, 150, 150);
        stone.addActionListener(this);
        stone.setBackground(new Color(0xD9D9D9));
        stone.setForeground(new Color(0xD9D9D9));
        stone.setFocusable(false);
        stone.setIcon(stone_button);

        paper = new JButton();
        paper.setBounds(325, 452, 150, 150);
        paper.addActionListener(this);
        paper.setBackground(new Color(0xD9D9D9));
        paper.setForeground(new Color(0xD9D9D9));
        paper.setFocusable(false);
        paper.setIcon(paper_button);

        scissors = new JButton();
        scissors.setBounds(557, 452, 150, 150);
        scissors.addActionListener(this);
        scissors.setBackground(new Color(0xD9D9D9));
        scissors.setForeground(new Color(0xD9D9D9));
        scissors.setFocusable(false);
        scissors.setIcon(scissors_button);

        JLabel slot_1_1 = new JLabel();
        slot_1_1.setText("<html>1</html>");
        slot_1_1.setHorizontalAlignment(JLabel.CENTER);
        slot_1_1.setVerticalAlignment(JLabel.CENTER);
        slot_1_1.setForeground(Color.white);
        slot_1_1.setFont(new Font("Aldrich", Font.PLAIN, 64));
        slot_1_1.setBounds(116, 195, 39, 80);

        JPanel slot_1 = new JPanel();
        slot_1.setBackground(new Color(0xD9D9D9));
        slot_1.setBounds(85, 283, 100, 100);
        slot_1.setBorder(BorderFactory.createLineBorder(Color.green, 5));
        slot_1.setLayout(null);

        JLabel slot_2_1 = new JLabel();
        slot_2_1.setText("<html>2</html>");
        slot_2_1.setHorizontalAlignment(JLabel.CENTER);
        slot_2_1.setVerticalAlignment(JLabel.CENTER);
        slot_2_1.setForeground(Color.white);
        slot_2_1.setFont(new Font("Aldrich", Font.PLAIN, 64));
        slot_2_1.setBounds(246, 195, 39, 80);

        JPanel slot_2 = new JPanel();
        slot_2.setBackground(new Color(0xD9D9D9));
        slot_2.setBounds(215, 283, 100, 100);
        slot_2.setLayout(null);

        JLabel slot_3_1 = new JLabel();
        slot_3_1.setText("<html>3</html>");
        slot_3_1.setHorizontalAlignment(JLabel.CENTER);
        slot_3_1.setVerticalAlignment(JLabel.CENTER);
        slot_3_1.setForeground(Color.white);
        slot_3_1.setFont(new Font("Aldrich", Font.PLAIN, 64));
        slot_3_1.setBounds(381, 195, 39, 80);

        JPanel slot_3 = new JPanel();
        slot_3.setBackground(new Color(0xD9D9D9));
        slot_3.setBounds(345, 283, 100, 100);
        slot_3.setLayout(null);

        JLabel slot_4_1 = new JLabel();
        slot_4_1.setText("<html>4</html>");
        slot_4_1.setHorizontalAlignment(JLabel.CENTER);
        slot_4_1.setVerticalAlignment(JLabel.CENTER);
        slot_4_1.setForeground(Color.white);
        slot_4_1.setFont(new Font("Aldrich", Font.PLAIN, 64));
        slot_4_1.setBounds(506, 195, 39, 80);

        JPanel slot_4 = new JPanel();
        slot_4.setBackground(new Color(0xD9D9D9));
        slot_4.setBounds(476, 283, 100, 100);
        slot_4.setLayout(null);

        JLabel slot_5_1 = new JLabel();
        slot_5_1.setText("<html>5</html>");
        slot_5_1.setHorizontalAlignment(JLabel.CENTER);
        slot_5_1.setVerticalAlignment(JLabel.CENTER);
        slot_5_1.setForeground(Color.white);
        slot_5_1.setFont(new Font("Aldrich", Font.PLAIN, 64));
        slot_5_1.setBounds(636, 195, 39, 80);

        JPanel slot_5 = new JPanel();
        slot_5.setBackground(new Color(0xD9D9D9));
        slot_5.setBounds(606, 283, 100, 100);
        slot_5.setLayout(null);

        JLabel title = new JLabel();
        title.setText("RPS+");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setForeground(Color.white);
        title.setFont(new Font("Aldrich", Font.PLAIN, 64));
        title.setBounds(294, 38, 212, 63);

        JLabel info = new JLabel();
        info.setText("ESYA SEC");
        info.setHorizontalAlignment(JLabel.CENTER);
        info.setVerticalAlignment(JLabel.CENTER);
        info.setForeground(Color.white);
        info.setFont(new Font("Aldrich", Font.PLAIN, 64));
        info.setBounds(63, 132, 675, 63);

        panel_Array[0] = slot_1;
        panel_Array[1] = slot_2;
        panel_Array[2] = slot_3;
        panel_Array[3] = slot_4;
        panel_Array[4] = slot_5;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(0, 0, 0));
        this.setBounds(522, 196, 800, 800);
        this.setSize(800, 800);
        this.setLayout(null);

        this.add(title);
        this.add(info);
        this.add(slot_1);
        this.add(slot_1_1);
        this.add(slot_2);
        this.add(slot_2_1);
        this.add(slot_3);
        this.add(slot_3_1);
        this.add(slot_4);
        this.add(slot_4_1);
        this.add(slot_5);
        this.add(slot_5_1);
        this.add(stone);
        this.add(scissors);
        this.add(paper);
        this.add(stone_label);
        this.add(scissors_label);
        this.add(paper_label);

        ImageIcon image = new ImageIcon("logo.png");
        this.setIconImage(image.getImage());
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == stone) {
            transport[i] = "stone";
            if (i < 5) {
                panel_Array[i].setBorder(BorderFactory.createEmptyBorder());
                if (i >= 2) {
                    if (a == 0) {
                        panel_Array[i].add(stone_logo);
                        stone_logo.setVisible(true);
                    } else {
                        stone.setEnabled(true);
                        panel_Array[i].add(stone_logo2);
                        stone_logo2.setVisible(true);
                        if (i == 4) {
                            panel_Array[i].add(stone_logo3);
                            stone_logo3.setVisible(true);
                        }
                    }
                }
                panel_Array[i].add(stone_logo);
                a = 1;
                ++i;
                if (i == 5) {
                    this.setVisible(false);
                    game_Frame_3 game_Frame_3 = new game_Frame_3(transport);
                } else if (i < 3)
                    stone.setEnabled(false);
                else if (i == 3) {
                    scissors.setEnabled(true);
                    paper.setEnabled(true);
                    stone.setEnabled(true);
                }
                System.out.println("stone success");
                System.out.println("i tried to print something");
                stone_logo.setVisible(true);
                panel_Array[i].setBorder(BorderFactory.createLineBorder(Color.green, 5));
            }
        } else if (e.getSource() == paper) {

            transport[i] = "paper";
            if (i < 5) {
                panel_Array[i].setBorder(BorderFactory.createEmptyBorder());
                if (i >= 2) {
                    if (b == 0) {
                        panel_Array[i].add(paper_logo);
                        paper_logo.setVisible(true);
                    } else {
                        paper.setEnabled(true);
                        panel_Array[i].add(paper_logo2);
                        paper_logo2.setVisible(true);
                        if (i == 4) {
                            panel_Array[i].add(paper_logo3);
                            paper_logo3.setVisible(true);
                        }
                    }
                }
                b = 1;
                panel_Array[i].add(paper_logo);
                ++i;
                if (i == 5) {
                    game_Frame_3 game_Frame_3 = new game_Frame_3(transport);
                    this.setVisible(false);
                } else if (i < 3)
                    paper.setEnabled(false);
                else if (i == 3) {
                    scissors.setEnabled(true);
                    paper.setEnabled(true);
                    stone.setEnabled(true);
                }
                System.out.println("paper success");
                paper_logo.setVisible(true);
                panel_Array[i].setBorder(BorderFactory.createLineBorder(Color.green, 5));
            }
        } else if (e.getSource() == scissors) {
            transport[i] = "scissors";
            if (i < 5) {
                panel_Array[i].setBorder(BorderFactory.createEmptyBorder());
                if (i >= 2) {
                    if (c == 0) {
                        System.out.println("imin");
                        panel_Array[i].add(scissors_logo);
                        scissors_logo.setVisible(true);
                    } else {
                        scissors.setEnabled(true);
                        panel_Array[i].add(scissors_logo2);
                        scissors_logo2.setVisible(true);
                        if (i == 4) {
                            panel_Array[i].add(scissors_logo3);
                            scissors_logo3.setVisible(true);
                        }
                    }
                }
                c = 1;
                panel_Array[i].add(scissors_logo);
                ++i;
                if (i < 3)
                    scissors.setEnabled(false);
                if (i == 3) {
                    scissors.setEnabled(true);
                    paper.setEnabled(true);
                    stone.setEnabled(true);
                }

                System.out.println("scissors success");
                scissors_logo.setVisible(true);
                if (i < 5) {
                    panel_Array[i].setBorder(BorderFactory.createLineBorder(Color.green, 5));
                }

                if (i == 5) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException p) {
                        Thread.currentThread().interrupt();
                    }
                    this.setVisible(false);

                    game_Frame_3 game_Frame_3 = new game_Frame_3(transport);
                }

            }
        }
    }
}
