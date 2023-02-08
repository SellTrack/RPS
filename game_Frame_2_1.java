import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import main1.*;
import java.util.*;

public class game_Frame_2_1 extends JFrame implements ActionListener {

    items[] pc_1 = new items[5];
    items[] pc_2 = new items[5];
    int r, r2;
    double pc_1_score, pc_2_score;
    int roundcount = 1; // round 1 den başlaması için
    JPanel[] pc_1_s = new JPanel[5];
    JButton next = new JButton();
    JButton continueue = new JButton();
    JPanel[] pc_2_s = new JPanel[5];
    JButton[] pc_1_b = new JButton[5];
    JButton[] pc_2_b = new JButton[5];
    JLabel[] logoarray_pc_1 = new JLabel[5];
    JLabel[] logoarray_pc_2 = new JLabel[5];
    JLabel damage_interface_taken_value = new JLabel(); // burada pencereleri yine
    JLabel damage_interface_given_value = new JLabel(); // burada pencereleri
    JLabel pc_1_interface_item_name = new JLabel(); // burada pencereleri yine
    JLabel pc_2_interface_item_name = new JLabel(); // burada pencereleri
    JLabel round_interface_count; // round daki sayaç
    JLabel[][] pc_1_stat_values = new JLabel[5][3];
    JLabel[][] pc_2_stat_values = new JLabel[5][3];
    JLabel[][] pc_1_stats_names = new JLabel[5][3];
    JLabel[][] pc_2_stats_names = new JLabel[5][3];
    Random random = new Random(); // herhangi bir
    ImageIcon stone_button = new ImageIcon("sprites/stone.png"); //
    ImageIcon scissors_button = new ImageIcon("sprites/scissors.png");
    ImageIcon paper_button = new ImageIcon("sprites/paper.png");
    ImageIcon stone_button2 = new ImageIcon("sprites/heavy_stone.png"); //
    ImageIcon scissors_button2 = new ImageIcon("sprites/master_scissors.png");
    ImageIcon paper_button2 = new ImageIcon("sprites/special_paper.png");
    JPanel round_interface = new JPanel();
    JPanel damage_interface = new JPanel(); // yine pencere düzenlemerleri
    JPanel pc_1_interface = new JPanel(); // yine pencere düzenlemerleri
    JPanel pc_2_interface = new JPanel(); // yine pencere düzenlemerleri

    game_Frame_2_1() {
        r = random.nextInt(5);
        int[] numberarray = new int[5];

        logoarray_pc_1[0] = new JLabel();
        logoarray_pc_1[0].setBounds(0, 85, 100, 100);
        logoarray_pc_1[0].setIcon(paper_button);
        logoarray_pc_1[0].setVisible(false);

        logoarray_pc_1[1] = new JLabel();
        logoarray_pc_1[1].setBounds(0, 85, 100, 100);
        logoarray_pc_1[1].setIcon(paper_button);
        logoarray_pc_1[1].setVisible(false);

        logoarray_pc_1[2] = new JLabel();
        logoarray_pc_1[2].setBounds(0, 85, 100, 100);
        logoarray_pc_1[2].setIcon(paper_button);
        logoarray_pc_1[2].setVisible(false);

        logoarray_pc_1[3] = new JLabel();
        logoarray_pc_1[3].setBounds(0, 85, 100, 100);
        logoarray_pc_1[3].setIcon(paper_button);
        logoarray_pc_1[3].setVisible(false);

        logoarray_pc_1[4] = new JLabel();
        logoarray_pc_1[4].setBounds(0, 85, 100, 100);
        logoarray_pc_1[4].setIcon(paper_button);
        logoarray_pc_1[4].setVisible(false);

        // pc2icin

        logoarray_pc_2[0] = new JLabel();
        logoarray_pc_2[0].setBounds(0, 85, 100, 100);
        logoarray_pc_2[0].setIcon(paper_button);
        logoarray_pc_2[0].setVisible(false);

        logoarray_pc_2[1] = new JLabel();
        logoarray_pc_2[1].setBounds(0, 85, 100, 100);
        logoarray_pc_2[1].setIcon(paper_button);
        logoarray_pc_2[1].setVisible(false);

        logoarray_pc_2[2] = new JLabel();
        logoarray_pc_2[2].setBounds(0, 85, 100, 100);
        logoarray_pc_2[2].setIcon(paper_button);
        logoarray_pc_2[2].setVisible(false);

        logoarray_pc_2[3] = new JLabel();
        logoarray_pc_2[3].setBounds(0, 85, 100, 100);
        logoarray_pc_2[3].setIcon(paper_button);
        logoarray_pc_2[3].setVisible(false);

        logoarray_pc_2[4] = new JLabel();
        logoarray_pc_2[4].setBounds(0, 85, 100, 100);
        logoarray_pc_2[4].setIcon(paper_button);
        logoarray_pc_2[4].setVisible(false);

        pc_1_b[0] = new JButton();
        pc_1_b[0].setBounds(0, 0, 100, 100);
        pc_1_b[0].addActionListener(null);
        pc_1_b[0].setFocusable(false);

        pc_1_b[1] = new JButton();
        pc_1_b[1].setBounds(0, 0, 100, 100);
        pc_1_b[1].addActionListener(null);
        pc_1_b[1].setFocusable(false);

        pc_1_b[2] = new JButton();
        pc_1_b[2].setBounds(0, 0, 100, 100);
        pc_1_b[2].addActionListener(null);
        pc_1_b[2].setFocusable(false);

        pc_1_b[3] = new JButton();
        pc_1_b[3].setBounds(0, 0, 100, 100);
        pc_1_b[3].addActionListener(null);
        pc_1_b[3].setFocusable(false);

        pc_1_b[4] = new JButton();
        pc_1_b[4].setBounds(0, 0, 100, 100);
        pc_1_b[4].addActionListener(null);
        pc_1_b[4].setFocusable(false);

        //

        next = new JButton();
        next.setBounds(351, 526, 115, 30);
        next.setText("BITIR");
        next.addActionListener(this);
        next.setFocusable(false);
        next.setEnabled(true);

        continueue = new JButton();
        continueue.setBounds(351, 366, 115, 30);
        continueue.setText("DEVAM");
        continueue.addActionListener(this);
        continueue.setFocusable(false);
        continueue.setEnabled(true);

        //

        pc_2_b[0] = new JButton();
        pc_2_b[0].setBounds(0, 0, 100, 100);
        pc_2_b[0].addActionListener(null);
        pc_2_b[0].setFocusable(false);

        pc_2_b[1] = new JButton();
        pc_2_b[1].setBounds(0, 0, 100, 100);
        pc_2_b[1].addActionListener(null);
        pc_2_b[1].setFocusable(false);

        pc_2_b[2] = new JButton();
        pc_2_b[2].setBounds(0, 0, 100, 100);
        pc_2_b[2].addActionListener(null);
        pc_2_b[2].setFocusable(false);

        pc_2_b[3] = new JButton();
        pc_2_b[3].setBounds(0, 0, 100, 100);
        pc_2_b[3].addActionListener(null);
        pc_2_b[3].setFocusable(false);

        pc_2_b[4] = new JButton();
        pc_2_b[4].setBounds(0, 0, 100, 100);
        pc_2_b[4].addActionListener(null);
        pc_2_b[4].setFocusable(false);

        int[] picker = { 1, 2, 3 };
        int rand = 4;
        for (int i = 0; i < 5; i++) {
            rand = random.nextInt(3) + 1; // 5 lik
            if (i < 3 && picker[rand - 1] != 0) {
                numberarray[i] = picker[rand - 1];
                picker[rand - 1] = 0;
            } else if (i < 3 && picker[rand - 1] == 0) {
                while (picker[rand - 1] == 0) {
                    rand = random.nextInt(3) + 1;
                }
                numberarray[i] = picker[rand - 1];
                picker[rand - 1] = 0;
            } else if (i >= 3) {
                picker[0] = 1;
                picker[1] = 2;
                picker[2] = 3;
                rand = random.nextInt(3) + 1; // 5 lik
                numberarray[i] = picker[rand - 1];
            }
        }

        for (int i = 0; i < 5; i++) {
            if (numberarray[i] == 1) { // eğer 1 ise o pc
                pc_1[i] = new stone();
                logoarray_pc_1[i].setIcon(stone_button);
                pc_1_b[i].setIcon(stone_button);
            }

            if (numberarray[i] == 2) { // eğer 2 ise kağıt
                pc_1[i] = new paper();
                logoarray_pc_1[i].setIcon(paper_button);
                pc_1_b[i].setIcon(paper_button);
            }

            if (numberarray[i] == 3) { // eğer 3 ise
                pc_1[i] = new scissors();
                logoarray_pc_1[i].setIcon(scissors_button);
                pc_1_b[i].setIcon(scissors_button);
            }
        }

        for (int i = 0; i < 5; i++) {
            rand = random.nextInt(3) + 1; // 5 lik
            if (i < 3 && picker[rand - 1] != 0) {
                numberarray[i] = picker[rand - 1];
                picker[rand - 1] = 0;
            } else if (i < 3 && picker[rand - 1] == 0) {
                while (picker[rand - 1] == 0) {
                    rand = random.nextInt(3) + 1;
                }
                numberarray[i] = picker[rand - 1];
                picker[rand - 1] = 0;
            } else if (i >= 3) {
                picker[0] = 1;
                picker[1] = 2;
                picker[2] = 3;
                rand = random.nextInt(3) + 1; // 5 lik
                numberarray[i] = picker[rand - 1];
            }
        }

        for (int i = 0; i < 5; i++) {
            if (numberarray[i] == 1) { // eğer 1 ise o pc
                pc_2[i] = new stone();
                pc_2_b[i].setIcon(stone_button);
                logoarray_pc_2[i].setIcon(stone_button);
            }

            if (numberarray[i] == 2) { // eğer 2 ise kağıt
                pc_2[i] = new paper();
                pc_2_b[i].setIcon(paper_button);
                logoarray_pc_2[i].setIcon(paper_button);
            }

            if (numberarray[i] == 3) { // eğer 3 ise
                pc_2[i] = new scissors();
                pc_2_b[i].setIcon(scissors_button);
                logoarray_pc_2[i].setIcon(scissors_button);
            }
        }

        pc_1_stats_names[0][0] = new JLabel();
        pc_1_stats_names[0][0].setText("HP:");
        pc_1_stats_names[0][0].setHorizontalAlignment(JLabel.LEFT);
        pc_1_stats_names[0][0].setVerticalAlignment(JLabel.CENTER);
        pc_1_stats_names[0][0].setForeground(Color.white);
        pc_1_stats_names[0][0].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stats_names[0][0].setBounds(0, 111, 36, 20);

        pc_1_stats_names[0][1] = new JLabel();
        pc_1_stats_names[0][1].setText("XP:");
        pc_1_stats_names[0][1].setHorizontalAlignment(JLabel.LEFT);
        pc_1_stats_names[0][1].setVerticalAlignment(JLabel.CENTER);
        pc_1_stats_names[0][1].setForeground(Color.white);
        pc_1_stats_names[0][1].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stats_names[0][1].setBounds(0, 142, 34, 20);

        pc_1_stats_names[0][2] = new JLabel();
        pc_1_stats_names[0][2].setText("LVL:");
        pc_1_stats_names[0][2].setHorizontalAlignment(JLabel.LEFT);
        pc_1_stats_names[0][2].setVerticalAlignment(JLabel.CENTER);
        pc_1_stats_names[0][2].setForeground(Color.white);
        pc_1_stats_names[0][2].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stats_names[0][2].setBounds(0, 173, 45, 20);

        pc_1_stat_values[0][0] = new JLabel();
        pc_1_stat_values[0][0].setText("20.0"); // görsellik çalışması
        pc_1_stat_values[0][0].setHorizontalAlignment(JLabel.CENTER);
        pc_1_stat_values[0][0].setVerticalAlignment(JLabel.CENTER);
        pc_1_stat_values[0][0].setForeground(Color.white);
        pc_1_stat_values[0][0].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stat_values[0][0].setBounds(47, 111, 53, 25);

        pc_1_stat_values[0][1] = new JLabel();
        pc_1_stat_values[0][1].setText("0.0"); // görsellik çalışması
        pc_1_stat_values[0][1].setHorizontalAlignment(JLabel.CENTER);
        pc_1_stat_values[0][1].setVerticalAlignment(JLabel.CENTER);
        pc_1_stat_values[0][1].setForeground(Color.white);
        pc_1_stat_values[0][1].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stat_values[0][1].setBounds(47, 139, 53, 25);

        pc_1_stat_values[0][2] = new JLabel();
        pc_1_stat_values[0][2].setText("1"); // görsellik çalışması
        pc_1_stat_values[0][2].setHorizontalAlignment(JLabel.CENTER);
        pc_1_stat_values[0][2].setVerticalAlignment(JLabel.CENTER);
        pc_1_stat_values[0][2].setForeground(Color.white);
        pc_1_stat_values[0][2].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stat_values[0][2].setBounds(47, 170, 53, 25);

        pc_1_stats_names[1][0] = new JLabel();
        pc_1_stats_names[1][0].setText("HP:");
        pc_1_stats_names[1][0].setHorizontalAlignment(JLabel.LEFT);
        pc_1_stats_names[1][0].setVerticalAlignment(JLabel.CENTER);
        pc_1_stats_names[1][0].setForeground(Color.white);
        pc_1_stats_names[1][0].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stats_names[1][0].setBounds(0, 111, 36, 20);

        pc_1_stats_names[1][1] = new JLabel();
        pc_1_stats_names[1][1].setText("XP:");
        pc_1_stats_names[1][1].setHorizontalAlignment(JLabel.LEFT);
        pc_1_stats_names[1][1].setVerticalAlignment(JLabel.CENTER);
        pc_1_stats_names[1][1].setForeground(Color.white);
        pc_1_stats_names[1][1].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stats_names[1][1].setBounds(0, 142, 34, 20);

        pc_1_stats_names[1][2] = new JLabel();
        pc_1_stats_names[1][2].setText("LVL:");
        pc_1_stats_names[1][2].setHorizontalAlignment(JLabel.LEFT);
        pc_1_stats_names[1][2].setVerticalAlignment(JLabel.CENTER);
        pc_1_stats_names[1][2].setForeground(Color.white);
        pc_1_stats_names[1][2].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stats_names[1][2].setBounds(0, 173, 45, 20);

        pc_1_stat_values[1][0] = new JLabel();
        pc_1_stat_values[1][0].setText("20.0"); // görsellik çalışması
        pc_1_stat_values[1][0].setHorizontalAlignment(JLabel.CENTER);
        pc_1_stat_values[1][0].setVerticalAlignment(JLabel.CENTER);
        pc_1_stat_values[1][0].setForeground(Color.white);
        pc_1_stat_values[1][0].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stat_values[1][0].setBounds(47, 106, 53, 25);

        pc_1_stat_values[1][1] = new JLabel();
        pc_1_stat_values[1][1].setText("0.0"); // görsellik çalışması
        pc_1_stat_values[1][1].setHorizontalAlignment(JLabel.CENTER);
        pc_1_stat_values[1][1].setVerticalAlignment(JLabel.CENTER);
        pc_1_stat_values[1][1].setForeground(Color.white);
        pc_1_stat_values[1][1].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stat_values[1][1].setBounds(47, 137, 53, 25);

        pc_1_stat_values[1][2] = new JLabel();
        pc_1_stat_values[1][2].setText("1.0"); // görsellik çalışması
        pc_1_stat_values[1][2].setHorizontalAlignment(JLabel.CENTER);
        pc_1_stat_values[1][2].setVerticalAlignment(JLabel.CENTER);
        pc_1_stat_values[1][2].setForeground(Color.white);
        pc_1_stat_values[1][2].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stat_values[1][2].setBounds(47, 168, 53, 25);

        pc_1_stats_names[2][0] = new JLabel();
        pc_1_stats_names[2][0].setText("HP:");
        pc_1_stats_names[2][0].setHorizontalAlignment(JLabel.LEFT);
        pc_1_stats_names[2][0].setVerticalAlignment(JLabel.CENTER);
        pc_1_stats_names[2][0].setForeground(Color.white);
        pc_1_stats_names[2][0].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stats_names[2][0].setBounds(0, 111, 36, 20);

        pc_1_stats_names[2][1] = new JLabel();
        pc_1_stats_names[2][1].setText("XP:");
        pc_1_stats_names[2][1].setHorizontalAlignment(JLabel.LEFT);
        pc_1_stats_names[2][1].setVerticalAlignment(JLabel.CENTER);
        pc_1_stats_names[2][1].setForeground(Color.white);
        pc_1_stats_names[2][1].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stats_names[2][1].setBounds(0, 142, 34, 20);

        pc_1_stats_names[2][2] = new JLabel();
        pc_1_stats_names[2][2].setText("LVL:");
        pc_1_stats_names[2][2].setHorizontalAlignment(JLabel.LEFT);
        pc_1_stats_names[2][2].setVerticalAlignment(JLabel.CENTER);
        pc_1_stats_names[2][2].setForeground(Color.white);
        pc_1_stats_names[2][2].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stats_names[2][2].setBounds(0, 173, 45, 20);

        pc_1_stat_values[2][0] = new JLabel();
        pc_1_stat_values[2][0].setText("20.0"); // görsellik çalışması
        pc_1_stat_values[2][0].setHorizontalAlignment(JLabel.CENTER);
        pc_1_stat_values[2][0].setVerticalAlignment(JLabel.CENTER);
        pc_1_stat_values[2][0].setForeground(Color.white);
        pc_1_stat_values[2][0].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stat_values[2][0].setBounds(47, 106, 53, 25);

        pc_1_stat_values[2][1] = new JLabel();
        pc_1_stat_values[2][1].setText("0.0"); // görsellik çalışması
        pc_1_stat_values[2][1].setHorizontalAlignment(JLabel.CENTER);
        pc_1_stat_values[2][1].setVerticalAlignment(JLabel.CENTER);
        pc_1_stat_values[2][1].setForeground(Color.white);
        pc_1_stat_values[2][1].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stat_values[2][1].setBounds(47, 137, 53, 25);

        pc_1_stat_values[2][2] = new JLabel();
        pc_1_stat_values[2][2].setText("1.0"); // görsellik çalışması
        pc_1_stat_values[2][2].setHorizontalAlignment(JLabel.CENTER);
        pc_1_stat_values[2][2].setVerticalAlignment(JLabel.CENTER);
        pc_1_stat_values[2][2].setForeground(Color.white);
        pc_1_stat_values[2][2].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stat_values[2][2].setBounds(47, 168, 53, 25);

        pc_1_stats_names[3][0] = new JLabel();
        pc_1_stats_names[3][0].setText("HP:");
        pc_1_stats_names[3][0].setHorizontalAlignment(JLabel.LEFT);
        pc_1_stats_names[3][0].setVerticalAlignment(JLabel.CENTER);
        pc_1_stats_names[3][0].setForeground(Color.white);
        pc_1_stats_names[3][0].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stats_names[3][0].setBounds(0, 111, 36, 20);

        pc_1_stats_names[3][1] = new JLabel();
        pc_1_stats_names[3][1].setText("XP:");
        pc_1_stats_names[3][1].setHorizontalAlignment(JLabel.LEFT);
        pc_1_stats_names[3][1].setVerticalAlignment(JLabel.CENTER);
        pc_1_stats_names[3][1].setForeground(Color.white);
        pc_1_stats_names[3][1].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stats_names[3][1].setBounds(0, 142, 34, 20);

        pc_1_stats_names[3][2] = new JLabel();
        pc_1_stats_names[3][2].setText("LVL:");
        pc_1_stats_names[3][2].setHorizontalAlignment(JLabel.LEFT);
        pc_1_stats_names[3][2].setVerticalAlignment(JLabel.CENTER);
        pc_1_stats_names[3][2].setForeground(Color.white);
        pc_1_stats_names[3][2].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stats_names[3][2].setBounds(0, 173, 45, 20);

        pc_1_stat_values[3][0] = new JLabel();
        pc_1_stat_values[3][0].setText("20.0"); // görsellik çalışması
        pc_1_stat_values[3][0].setHorizontalAlignment(JLabel.CENTER);
        pc_1_stat_values[3][0].setVerticalAlignment(JLabel.CENTER);
        pc_1_stat_values[3][0].setForeground(Color.white);
        pc_1_stat_values[3][0].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stat_values[3][0].setBounds(47, 106, 53, 25);

        pc_1_stat_values[3][1] = new JLabel();
        pc_1_stat_values[3][1].setText("0.0"); // görsellik çalışması
        pc_1_stat_values[3][1].setHorizontalAlignment(JLabel.CENTER);
        pc_1_stat_values[3][1].setVerticalAlignment(JLabel.CENTER);
        pc_1_stat_values[3][1].setForeground(Color.white);
        pc_1_stat_values[3][1].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stat_values[3][1].setBounds(47, 137, 53, 25);

        pc_1_stat_values[3][2] = new JLabel();
        pc_1_stat_values[3][2].setText("1.0"); // görsellik çalışması
        pc_1_stat_values[3][2].setHorizontalAlignment(JLabel.CENTER);
        pc_1_stat_values[3][2].setVerticalAlignment(JLabel.CENTER);
        pc_1_stat_values[3][2].setForeground(Color.white);
        pc_1_stat_values[3][2].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stat_values[3][2].setBounds(47, 168, 53, 25);

        pc_1_stats_names[4][0] = new JLabel();
        pc_1_stats_names[4][0].setText("HP:");
        pc_1_stats_names[4][0].setHorizontalAlignment(JLabel.LEFT);
        pc_1_stats_names[4][0].setVerticalAlignment(JLabel.CENTER);
        pc_1_stats_names[4][0].setForeground(Color.white);
        pc_1_stats_names[4][0].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stats_names[4][0].setBounds(0, 111, 36, 20);

        pc_1_stats_names[4][1] = new JLabel();
        pc_1_stats_names[4][1].setText("XP:");
        pc_1_stats_names[4][1].setHorizontalAlignment(JLabel.LEFT);
        pc_1_stats_names[4][1].setVerticalAlignment(JLabel.CENTER);
        pc_1_stats_names[4][1].setForeground(Color.white);
        pc_1_stats_names[4][1].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stats_names[4][1].setBounds(0, 142, 34, 20);

        pc_1_stats_names[4][2] = new JLabel();
        pc_1_stats_names[4][2].setText("LVL:");
        pc_1_stats_names[4][2].setHorizontalAlignment(JLabel.LEFT);
        pc_1_stats_names[4][2].setVerticalAlignment(JLabel.CENTER);
        pc_1_stats_names[4][2].setForeground(Color.white);
        pc_1_stats_names[4][2].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stats_names[4][2].setBounds(0, 173, 45, 20);

        pc_1_stat_values[4][0] = new JLabel();
        pc_1_stat_values[4][0].setText("20.0"); // görsellik çalışması
        pc_1_stat_values[4][0].setHorizontalAlignment(JLabel.CENTER);
        pc_1_stat_values[4][0].setVerticalAlignment(JLabel.CENTER);
        pc_1_stat_values[4][0].setForeground(Color.white);
        pc_1_stat_values[4][0].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stat_values[4][0].setBounds(47, 106, 53, 25);

        pc_1_stat_values[4][1] = new JLabel();
        pc_1_stat_values[4][1].setText("0.0"); // görsellik çalışması
        pc_1_stat_values[4][1].setHorizontalAlignment(JLabel.CENTER);
        pc_1_stat_values[4][1].setVerticalAlignment(JLabel.CENTER);
        pc_1_stat_values[4][1].setForeground(Color.white);
        pc_1_stat_values[4][1].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stat_values[4][1].setBounds(47, 137, 53, 25);

        pc_1_stat_values[4][2] = new JLabel();
        pc_1_stat_values[4][2].setText("1.0"); // görsellik çalışması
        pc_1_stat_values[4][2].setHorizontalAlignment(JLabel.CENTER);
        pc_1_stat_values[4][2].setVerticalAlignment(JLabel.CENTER);
        pc_1_stat_values[4][2].setForeground(Color.white);
        pc_1_stat_values[4][2].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_1_stat_values[4][2].setBounds(47, 168, 53, 25);

        pc_2_stats_names[0][0] = new JLabel();
        pc_2_stats_names[0][0].setText("HP:");
        pc_2_stats_names[0][0].setHorizontalAlignment(JLabel.LEFT);
        pc_2_stats_names[0][0].setVerticalAlignment(JLabel.CENTER);
        pc_2_stats_names[0][0].setForeground(Color.white);
        pc_2_stats_names[0][0].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stats_names[0][0].setBounds(0, 111, 36, 20);

        pc_2_stats_names[0][1] = new JLabel();
        pc_2_stats_names[0][1].setText("XP:");
        pc_2_stats_names[0][1].setHorizontalAlignment(JLabel.LEFT);
        pc_2_stats_names[0][1].setVerticalAlignment(JLabel.CENTER);
        pc_2_stats_names[0][1].setForeground(Color.white);
        pc_2_stats_names[0][1].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stats_names[0][1].setBounds(0, 142, 34, 20);

        pc_2_stats_names[0][2] = new JLabel();
        pc_2_stats_names[0][2].setText("LVL:");
        pc_2_stats_names[0][2].setHorizontalAlignment(JLabel.LEFT);
        pc_2_stats_names[0][2].setVerticalAlignment(JLabel.CENTER);
        pc_2_stats_names[0][2].setForeground(Color.white);
        pc_2_stats_names[0][2].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stats_names[0][2].setBounds(0, 173, 45, 20);

        pc_2_stat_values[0][0] = new JLabel();
        pc_2_stat_values[0][0].setText("20.0"); // görsellik çalışması
        pc_2_stat_values[0][0].setHorizontalAlignment(JLabel.CENTER);
        pc_2_stat_values[0][0].setVerticalAlignment(JLabel.CENTER);
        pc_2_stat_values[0][0].setForeground(Color.white);
        pc_2_stat_values[0][0].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stat_values[0][0].setBounds(47, 111, 53, 25);

        pc_2_stat_values[0][1] = new JLabel();
        pc_2_stat_values[0][1].setText("0.0"); // görsellik çalışması
        pc_2_stat_values[0][1].setHorizontalAlignment(JLabel.CENTER);
        pc_2_stat_values[0][1].setVerticalAlignment(JLabel.CENTER);
        pc_2_stat_values[0][1].setForeground(Color.white);
        pc_2_stat_values[0][1].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stat_values[0][1].setBounds(47, 139, 53, 25);

        pc_2_stat_values[0][2] = new JLabel();
        pc_2_stat_values[0][2].setText("1"); // görsellik çalışması
        pc_2_stat_values[0][2].setHorizontalAlignment(JLabel.CENTER);
        pc_2_stat_values[0][2].setVerticalAlignment(JLabel.CENTER);
        pc_2_stat_values[0][2].setForeground(Color.white);
        pc_2_stat_values[0][2].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stat_values[0][2].setBounds(47, 170, 53, 25);

        pc_2_stats_names[1][0] = new JLabel();
        pc_2_stats_names[1][0].setText("HP:");
        pc_2_stats_names[1][0].setHorizontalAlignment(JLabel.LEFT);
        pc_2_stats_names[1][0].setVerticalAlignment(JLabel.CENTER);
        pc_2_stats_names[1][0].setForeground(Color.white);
        pc_2_stats_names[1][0].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stats_names[1][0].setBounds(0, 111, 36, 20);

        pc_2_stats_names[1][1] = new JLabel();
        pc_2_stats_names[1][1].setText("XP:");
        pc_2_stats_names[1][1].setHorizontalAlignment(JLabel.LEFT);
        pc_2_stats_names[1][1].setVerticalAlignment(JLabel.CENTER);
        pc_2_stats_names[1][1].setForeground(Color.white);
        pc_2_stats_names[1][1].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stats_names[1][1].setBounds(0, 142, 34, 20);

        pc_2_stats_names[1][2] = new JLabel();
        pc_2_stats_names[1][2].setText("LVL:");
        pc_2_stats_names[1][2].setHorizontalAlignment(JLabel.LEFT);
        pc_2_stats_names[1][2].setVerticalAlignment(JLabel.CENTER);
        pc_2_stats_names[1][2].setForeground(Color.white);
        pc_2_stats_names[1][2].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stats_names[1][2].setBounds(0, 173, 45, 20);

        pc_2_stat_values[1][0] = new JLabel();
        pc_2_stat_values[1][0].setText("20.0"); // görsellik çalışması
        pc_2_stat_values[1][0].setHorizontalAlignment(JLabel.CENTER);
        pc_2_stat_values[1][0].setVerticalAlignment(JLabel.CENTER);
        pc_2_stat_values[1][0].setForeground(Color.white);
        pc_2_stat_values[1][0].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stat_values[1][0].setBounds(47, 106, 53, 25);

        pc_2_stat_values[1][1] = new JLabel();
        pc_2_stat_values[1][1].setText("0.0"); // görsellik çalışması
        pc_2_stat_values[1][1].setHorizontalAlignment(JLabel.CENTER);
        pc_2_stat_values[1][1].setVerticalAlignment(JLabel.CENTER);
        pc_2_stat_values[1][1].setForeground(Color.white);
        pc_2_stat_values[1][1].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stat_values[1][1].setBounds(47, 137, 53, 25);

        pc_2_stat_values[1][2] = new JLabel();
        pc_2_stat_values[1][2].setText("1.0"); // görsellik çalışması
        pc_2_stat_values[1][2].setHorizontalAlignment(JLabel.CENTER);
        pc_2_stat_values[1][2].setVerticalAlignment(JLabel.CENTER);
        pc_2_stat_values[1][2].setForeground(Color.white);
        pc_2_stat_values[1][2].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stat_values[1][2].setBounds(47, 168, 53, 25);

        pc_2_stats_names[2][0] = new JLabel();
        pc_2_stats_names[2][0].setText("HP:");
        pc_2_stats_names[2][0].setHorizontalAlignment(JLabel.LEFT);
        pc_2_stats_names[2][0].setVerticalAlignment(JLabel.CENTER);
        pc_2_stats_names[2][0].setForeground(Color.white);
        pc_2_stats_names[2][0].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stats_names[2][0].setBounds(0, 111, 36, 20);

        pc_2_stats_names[2][1] = new JLabel();
        pc_2_stats_names[2][1].setText("XP:");
        pc_2_stats_names[2][1].setHorizontalAlignment(JLabel.LEFT);
        pc_2_stats_names[2][1].setVerticalAlignment(JLabel.CENTER);
        pc_2_stats_names[2][1].setForeground(Color.white);
        pc_2_stats_names[2][1].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stats_names[2][1].setBounds(0, 142, 34, 20);

        pc_2_stats_names[2][2] = new JLabel();
        pc_2_stats_names[2][2].setText("LVL:");
        pc_2_stats_names[2][2].setHorizontalAlignment(JLabel.LEFT);
        pc_2_stats_names[2][2].setVerticalAlignment(JLabel.CENTER);
        pc_2_stats_names[2][2].setForeground(Color.white);
        pc_2_stats_names[2][2].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stats_names[2][2].setBounds(0, 173, 45, 20);

        pc_2_stat_values[2][0] = new JLabel();
        pc_2_stat_values[2][0].setText("20.0"); // görsellik çalışması
        pc_2_stat_values[2][0].setHorizontalAlignment(JLabel.CENTER);
        pc_2_stat_values[2][0].setVerticalAlignment(JLabel.CENTER);
        pc_2_stat_values[2][0].setForeground(Color.white);
        pc_2_stat_values[2][0].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stat_values[2][0].setBounds(47, 106, 53, 25);

        pc_2_stat_values[2][1] = new JLabel();
        pc_2_stat_values[2][1].setText("0.0"); // görsellik çalışması
        pc_2_stat_values[2][1].setHorizontalAlignment(JLabel.CENTER);
        pc_2_stat_values[2][1].setVerticalAlignment(JLabel.CENTER);
        pc_2_stat_values[2][1].setForeground(Color.white);
        pc_2_stat_values[2][1].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stat_values[2][1].setBounds(47, 137, 53, 25);

        pc_2_stat_values[2][2] = new JLabel();
        pc_2_stat_values[2][2].setText("1.0"); // görsellik çalışması
        pc_2_stat_values[2][2].setHorizontalAlignment(JLabel.CENTER);
        pc_2_stat_values[2][2].setVerticalAlignment(JLabel.CENTER);
        pc_2_stat_values[2][2].setForeground(Color.white);
        pc_2_stat_values[2][2].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stat_values[2][2].setBounds(47, 168, 53, 25);

        pc_2_stats_names[3][0] = new JLabel();
        pc_2_stats_names[3][0].setText("HP:");
        pc_2_stats_names[3][0].setHorizontalAlignment(JLabel.LEFT);
        pc_2_stats_names[3][0].setVerticalAlignment(JLabel.CENTER);
        pc_2_stats_names[3][0].setForeground(Color.white);
        pc_2_stats_names[3][0].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stats_names[3][0].setBounds(0, 111, 36, 20);

        pc_2_stats_names[3][1] = new JLabel();
        pc_2_stats_names[3][1].setText("XP:");
        pc_2_stats_names[3][1].setHorizontalAlignment(JLabel.LEFT);
        pc_2_stats_names[3][1].setVerticalAlignment(JLabel.CENTER);
        pc_2_stats_names[3][1].setForeground(Color.white);
        pc_2_stats_names[3][1].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stats_names[3][1].setBounds(0, 142, 34, 20);

        pc_2_stats_names[3][2] = new JLabel();
        pc_2_stats_names[3][2].setText("LVL:");
        pc_2_stats_names[3][2].setHorizontalAlignment(JLabel.LEFT);
        pc_2_stats_names[3][2].setVerticalAlignment(JLabel.CENTER);
        pc_2_stats_names[3][2].setForeground(Color.white);
        pc_2_stats_names[3][2].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stats_names[3][2].setBounds(0, 173, 45, 20);

        pc_2_stat_values[3][0] = new JLabel();
        pc_2_stat_values[3][0].setText("20.0"); // görsellik çalışması
        pc_2_stat_values[3][0].setHorizontalAlignment(JLabel.CENTER);
        pc_2_stat_values[3][0].setVerticalAlignment(JLabel.CENTER);
        pc_2_stat_values[3][0].setForeground(Color.white);
        pc_2_stat_values[3][0].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stat_values[3][0].setBounds(47, 106, 53, 25);

        pc_2_stat_values[3][1] = new JLabel();
        pc_2_stat_values[3][1].setText("0.0"); // görsellik çalışması
        pc_2_stat_values[3][1].setHorizontalAlignment(JLabel.CENTER);
        pc_2_stat_values[3][1].setVerticalAlignment(JLabel.CENTER);
        pc_2_stat_values[3][1].setForeground(Color.white);
        pc_2_stat_values[3][1].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stat_values[3][1].setBounds(47, 137, 53, 25);

        pc_2_stat_values[3][2] = new JLabel();
        pc_2_stat_values[3][2].setText("1.0"); // görsellik çalışması
        pc_2_stat_values[3][2].setHorizontalAlignment(JLabel.CENTER);
        pc_2_stat_values[3][2].setVerticalAlignment(JLabel.CENTER);
        pc_2_stat_values[3][2].setForeground(Color.white);
        pc_2_stat_values[3][2].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stat_values[3][2].setBounds(47, 168, 53, 25);

        pc_2_stats_names[4][0] = new JLabel();
        pc_2_stats_names[4][0].setText("HP:");
        pc_2_stats_names[4][0].setHorizontalAlignment(JLabel.LEFT);
        pc_2_stats_names[4][0].setVerticalAlignment(JLabel.CENTER);
        pc_2_stats_names[4][0].setForeground(Color.white);
        pc_2_stats_names[4][0].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stats_names[4][0].setBounds(0, 111, 36, 20);

        pc_2_stats_names[4][1] = new JLabel();
        pc_2_stats_names[4][1].setText("XP:");
        pc_2_stats_names[4][1].setHorizontalAlignment(JLabel.LEFT);
        pc_2_stats_names[4][1].setVerticalAlignment(JLabel.CENTER);
        pc_2_stats_names[4][1].setForeground(Color.white);
        pc_2_stats_names[4][1].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stats_names[4][1].setBounds(0, 142, 34, 20);

        pc_2_stats_names[4][2] = new JLabel();
        pc_2_stats_names[4][2].setText("LVL:");
        pc_2_stats_names[4][2].setHorizontalAlignment(JLabel.LEFT);
        pc_2_stats_names[4][2].setVerticalAlignment(JLabel.CENTER);
        pc_2_stats_names[4][2].setForeground(Color.white);
        pc_2_stats_names[4][2].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stats_names[4][2].setBounds(0, 173, 45, 20);

        pc_2_stat_values[4][0] = new JLabel();
        pc_2_stat_values[4][0].setText("20.0"); // görsellik çalışması
        pc_2_stat_values[4][0].setHorizontalAlignment(JLabel.CENTER);
        pc_2_stat_values[4][0].setVerticalAlignment(JLabel.CENTER);
        pc_2_stat_values[4][0].setForeground(Color.white);
        pc_2_stat_values[4][0].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stat_values[4][0].setBounds(47, 106, 53, 25);

        pc_2_stat_values[4][1] = new JLabel();
        pc_2_stat_values[4][1].setText("0.0"); // görsellik çalışması
        pc_2_stat_values[4][1].setHorizontalAlignment(JLabel.CENTER);
        pc_2_stat_values[4][1].setVerticalAlignment(JLabel.CENTER);
        pc_2_stat_values[4][1].setForeground(Color.white);
        pc_2_stat_values[4][1].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stat_values[4][1].setBounds(47, 137, 53, 25);

        pc_2_stat_values[4][2] = new JLabel();
        pc_2_stat_values[4][2].setText("1.0"); // görsellik çalışması
        pc_2_stat_values[4][2].setHorizontalAlignment(JLabel.CENTER);
        pc_2_stat_values[4][2].setVerticalAlignment(JLabel.CENTER);
        pc_2_stat_values[4][2].setForeground(Color.white);
        pc_2_stat_values[4][2].setFont(new Font("Aldrich", Font.PLAIN, 20));
        pc_2_stat_values[4][2].setBounds(47, 168, 53, 25);

        JLabel pc_1_interface_title = new JLabel();
        pc_1_interface_title.setText("PC1");
        pc_1_interface_title.setHorizontalAlignment(JLabel.CENTER);
        pc_1_interface_title.setVerticalAlignment(JLabel.CENTER);
        pc_1_interface_title.setForeground(Color.white);
        pc_1_interface_title.setFont(new Font("Aldrich", Font.PLAIN, 64));
        pc_1_interface_title.setBounds(0, 0, 150, 63);

        pc_1_interface_item_name.setText("ITEM");
        pc_1_interface_item_name.setHorizontalAlignment(JLabel.CENTER);
        pc_1_interface_item_name.setVerticalAlignment(JLabel.CENTER);
        pc_1_interface_item_name.setForeground(Color.white);
        pc_1_interface_item_name.setFont(new Font("Aldrich", Font.PLAIN, 30));
        pc_1_interface_item_name.setBounds(0, 207, 100, 29);

        JLabel pc_2_interface_title = new JLabel();
        pc_2_interface_title.setText("PC2");
        pc_2_interface_title.setHorizontalAlignment(JLabel.CENTER);
        pc_2_interface_title.setVerticalAlignment(JLabel.CENTER);
        pc_2_interface_title.setForeground(Color.white);
        pc_2_interface_title.setFont(new Font("Aldrich", Font.PLAIN, 64));
        pc_2_interface_title.setBounds(0, 0, 150, 63);

        pc_2_interface_item_name.setText("ITEM");
        pc_2_interface_item_name.setHorizontalAlignment(JLabel.CENTER);
        pc_2_interface_item_name.setVerticalAlignment(JLabel.CENTER);
        pc_2_interface_item_name.setForeground(Color.white);
        pc_2_interface_item_name.setFont(new Font("Aldrich", Font.PLAIN, 30));
        pc_2_interface_item_name.setBounds(0, 207, 100, 29);

        JLabel round_interface_title = new JLabel();
        round_interface_title.setText("ROUND:");
        round_interface_title.setHorizontalAlignment(JLabel.CENTER);
        round_interface_title.setVerticalAlignment(JLabel.CENTER);
        round_interface_title.setForeground(Color.white);
        round_interface_title.setFont(new Font("Aldrich", Font.PLAIN, 40));
        round_interface_title.setBounds(0, 0, 179, 39);

        round_interface_count = new JLabel();
        round_interface_count.setText("" + roundcount);
        round_interface_count.setHorizontalAlignment(JLabel.CENTER);
        round_interface_count.setVerticalAlignment(JLabel.CENTER);
        round_interface_count.setForeground(Color.white);
        round_interface_count.setFont(new Font("Aldrich", Font.PLAIN, 40));
        round_interface_count.setBounds(180, 0, 60, 45);

        round_interface = new JPanel(); // yine pencere düzenlemerleri
        round_interface.setBounds(293, 313, 243, 39);
        round_interface.setBackground(Color.black);
        round_interface.setLayout(null);
        round_interface.add(round_interface_title);
        round_interface.add(round_interface_count);

        JLabel damage_interface_taken_name = new JLabel();
        damage_interface_taken_name.setText("ALINAN HASAR:");
        damage_interface_taken_name.setHorizontalAlignment(JLabel.CENTER);
        damage_interface_taken_name.setVerticalAlignment(JLabel.CENTER);
        damage_interface_taken_name.setForeground(Color.white);
        damage_interface_taken_name.setFont(new Font("Aldrich", Font.PLAIN, 20));
        damage_interface_taken_name.setBounds(0, 50, 185, 20);

        damage_interface_taken_value.setText("00");
        damage_interface_taken_value.setHorizontalAlignment(JLabel.CENTER);
        damage_interface_taken_value.setVerticalAlignment(JLabel.CENTER);
        damage_interface_taken_value.setForeground(Color.white);
        damage_interface_taken_value.setFont(new Font("Aldrich", Font.PLAIN, 20));
        damage_interface_taken_value.setBounds(198, 44, 44, 35);

        JLabel damage_interface_given_name = new JLabel();
        damage_interface_given_name.setText("VERILEN HASAR:");
        damage_interface_given_name.setHorizontalAlignment(JLabel.CENTER);
        damage_interface_given_name.setVerticalAlignment(JLabel.CENTER);
        damage_interface_given_name.setForeground(Color.white);
        damage_interface_given_name.setFont(new Font("Aldrich", Font.PLAIN, 20));
        damage_interface_given_name.setBounds(0, 7, 185, 20);

        damage_interface_given_value.setText("00");
        damage_interface_given_value.setHorizontalAlignment(JLabel.CENTER);
        damage_interface_given_value.setVerticalAlignment(JLabel.CENTER);
        damage_interface_given_value.setForeground(Color.white);
        damage_interface_given_value.setFont(new Font("Aldrich", Font.PLAIN, 20));
        damage_interface_given_value.setBounds(198, 0, 44, 33);

        damage_interface = new JPanel(); // yine pencere düzenlemerleri
        damage_interface.setBounds(293, 410, 242, 79);
        damage_interface.setBackground(Color.black);
        damage_interface.setLayout(null);
        damage_interface.add(damage_interface_given_value);
        damage_interface.add(damage_interface_taken_value);
        damage_interface.add(damage_interface_taken_name);
        damage_interface.add(damage_interface_given_name);

        pc_1_interface = new JPanel(); // yine pencere düzenlemerleri
        pc_1_interface.setBounds(132, 304, 150, 236);
        pc_1_interface.setBackground(Color.black);
        pc_1_interface.setLayout(null);
        pc_1_interface.add(pc_1_interface_item_name);
        pc_1_interface.add(pc_1_interface_title);
        pc_1_interface.add(logoarray_pc_1[0]);
        pc_1_interface.add(logoarray_pc_1[1]);
        pc_1_interface.add(logoarray_pc_1[2]);
        pc_1_interface.add(logoarray_pc_1[3]);
        pc_1_interface.add(logoarray_pc_1[4]);

        pc_2_interface = new JPanel(); // yine pencere düzenlemerleri
        pc_2_interface.setBounds(584, 304, 150, 236);
        pc_2_interface.setBackground(Color.black);
        pc_2_interface.setLayout(null);
        pc_2_interface.add(pc_2_interface_item_name);
        pc_2_interface.add(pc_2_interface_title);
        pc_2_interface.add(logoarray_pc_2[0]);
        pc_2_interface.add(logoarray_pc_2[1]);
        pc_2_interface.add(logoarray_pc_2[2]);
        pc_2_interface.add(logoarray_pc_2[3]);
        pc_2_interface.add(logoarray_pc_2[4]);
        //
        pc_1_s[0] = new JPanel();
        pc_1_s[0].setBounds(90, 570, 100, 193);
        pc_1_s[0].setBackground(Color.black);
        pc_1_s[0].setLayout(null);
        pc_1_s[0].add(pc_1_b[0]);
        pc_1_s[0].add(pc_1_stats_names[0][0]);
        pc_1_s[0].add(pc_1_stats_names[0][1]);
        pc_1_s[0].add(pc_1_stats_names[0][2]);
        pc_1_s[0].add(pc_1_stat_values[0][0]);
        pc_1_s[0].add(pc_1_stat_values[0][1]);
        pc_1_s[0].add(pc_1_stat_values[0][2]);

        pc_1_s[1] = new JPanel();
        pc_1_s[1].setBounds(220, 570, 100, 193);
        pc_1_s[1].setBackground(Color.black);
        pc_1_s[1].setLayout(null);
        pc_1_s[1].add(pc_1_b[1]);
        pc_1_s[1].add(pc_1_stats_names[1][0]);
        pc_1_s[1].add(pc_1_stats_names[1][1]);
        pc_1_s[1].add(pc_1_stats_names[1][2]);
        pc_1_s[1].add(pc_1_stat_values[1][0]);
        pc_1_s[1].add(pc_1_stat_values[1][1]);
        pc_1_s[1].add(pc_1_stat_values[1][2]);

        pc_1_s[2] = new JPanel();
        pc_1_s[2].setBounds(350, 570, 100, 193);
        pc_1_s[2].setBackground(Color.black);
        pc_1_s[2].setLayout(null);
        pc_1_s[2].add(pc_1_b[2]);
        pc_1_s[2].add(pc_1_stats_names[2][0]);
        pc_1_s[2].add(pc_1_stats_names[2][1]);
        pc_1_s[2].add(pc_1_stats_names[2][2]);
        pc_1_s[2].add(pc_1_stat_values[2][0]);
        pc_1_s[2].add(pc_1_stat_values[2][1]);
        pc_1_s[2].add(pc_1_stat_values[2][2]);

        pc_1_s[3] = new JPanel();
        pc_1_s[3].setBounds(480, 570, 100, 193);
        pc_1_s[3].setBackground(Color.black);
        pc_1_s[3].setLayout(null);
        pc_1_s[3].add(pc_1_b[3]);
        pc_1_s[3].add(pc_1_stats_names[3][0]);
        pc_1_s[3].add(pc_1_stats_names[3][1]);
        pc_1_s[3].add(pc_1_stats_names[3][2]);
        pc_1_s[3].add(pc_1_stat_values[3][0]);
        pc_1_s[3].add(pc_1_stat_values[3][1]);
        pc_1_s[3].add(pc_1_stat_values[3][2]);

        pc_1_s[4] = new JPanel();
        pc_1_s[4].setBounds(610, 570, 100, 193);
        pc_1_s[4].setBackground(Color.black);
        pc_1_s[4].setLayout(null);
        pc_1_s[4].add(pc_1_b[4]);
        pc_1_s[4].add(pc_1_stats_names[4][0]);
        pc_1_s[4].add(pc_1_stats_names[4][1]);
        pc_1_s[4].add(pc_1_stats_names[4][2]);
        pc_1_s[4].add(pc_1_stat_values[4][0]);
        pc_1_s[4].add(pc_1_stat_values[4][1]);
        pc_1_s[4].add(pc_1_stat_values[4][2]);
        //
        pc_2_s[0] = new JPanel();
        pc_2_s[0].setBounds(90, 42, 100, 193);
        pc_2_s[0].setBackground(Color.black);
        pc_2_s[0].setLayout(null);
        pc_2_s[0].add(pc_2_b[0]);
        pc_2_s[0].add(pc_2_stats_names[0][0]);
        pc_2_s[0].add(pc_2_stats_names[0][1]);
        pc_2_s[0].add(pc_2_stats_names[0][2]);
        pc_2_s[0].add(pc_2_stat_values[0][0]);
        pc_2_s[0].add(pc_2_stat_values[0][1]);
        pc_2_s[0].add(pc_2_stat_values[0][2]);

        pc_2_s[1] = new JPanel();
        pc_2_s[1].setBounds(220, 42, 100, 193);
        pc_2_s[1].setBackground(Color.black);
        pc_2_s[1].setLayout(null);
        pc_2_s[1].add(pc_2_b[1]);
        pc_2_s[1].add(pc_2_stats_names[1][0]);
        pc_2_s[1].add(pc_2_stats_names[1][1]);
        pc_2_s[1].add(pc_2_stats_names[1][2]);
        pc_2_s[1].add(pc_2_stat_values[1][0]);
        pc_2_s[1].add(pc_2_stat_values[1][1]);
        pc_2_s[1].add(pc_2_stat_values[1][2]);

        pc_2_s[2] = new JPanel();
        pc_2_s[2].setBounds(350, 42, 100, 193);
        pc_2_s[2].setBackground(Color.black);
        pc_2_s[2].setLayout(null);
        pc_2_s[2].add(pc_2_b[2]);
        pc_2_s[2].add(pc_2_stats_names[2][0]);
        pc_2_s[2].add(pc_2_stats_names[2][1]);
        pc_2_s[2].add(pc_2_stats_names[2][2]);
        pc_2_s[2].add(pc_2_stat_values[2][0]);
        pc_2_s[2].add(pc_2_stat_values[2][1]);
        pc_2_s[2].add(pc_2_stat_values[2][2]);

        pc_2_s[3] = new JPanel();
        pc_2_s[3].setBounds(480, 42, 100, 193);
        pc_2_s[3].setBackground(Color.black);
        pc_2_s[3].setLayout(null);
        pc_2_s[3].add(pc_2_b[3]);
        pc_2_s[3].add(pc_2_stats_names[3][0]);
        pc_2_s[3].add(pc_2_stats_names[3][1]);
        pc_2_s[3].add(pc_2_stats_names[3][2]);
        pc_2_s[3].add(pc_2_stat_values[3][0]);
        pc_2_s[3].add(pc_2_stat_values[3][1]);
        pc_2_s[3].add(pc_2_stat_values[3][2]);

        pc_2_s[4] = new JPanel();
        pc_2_s[4].setBounds(610, 42, 100, 193);
        pc_2_s[4].setBackground(Color.black);
        pc_2_s[4].setLayout(null);
        pc_2_s[4].add(pc_2_b[4]);
        pc_2_s[4].add(pc_2_stats_names[4][0]);
        pc_2_s[4].add(pc_2_stats_names[4][1]);
        pc_2_s[4].add(pc_2_stats_names[4][2]);
        pc_2_s[4].add(pc_2_stat_values[4][0]);
        pc_2_s[4].add(pc_2_stat_values[4][1]);
        pc_2_s[4].add(pc_2_stat_values[4][2]);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(0, 0, 0));
        this.setBounds(522, 196, 800, 800);
        this.setSize(800, 800);
        this.setLayout(null);

        this.add(pc_1_s[0]);
        this.add(pc_1_s[1]);
        this.add(pc_1_s[2]);
        this.add(pc_1_s[3]);
        this.add(pc_1_s[4]);
        this.add(pc_2_s[0]);
        this.add(pc_2_s[1]);
        this.add(pc_2_s[2]);
        this.add(pc_2_s[3]);
        this.add(pc_2_s[4]);
        this.add(next);
        this.add(continueue);
        this.add(pc_1_interface);
        this.add(pc_2_interface);
        this.add(round_interface);
        this.add(damage_interface);
        this.setVisible(true);// görünürlüğünü açıyoruz
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            if (pc_1_score > pc_2_score) {
                this.setVisible(false);
                game_Frame_4 game_Frame_4 = new game_Frame_4("PC2", pc_2[0].Health, pc_2[1].Health, pc_2[2].Health,
                        pc_2[3].Health, pc_2[4].Health);

            } else if (pc_1_score < pc_2_score) {
                this.setVisible(false);
                game_Frame_4 game_Frame_4 = new game_Frame_4("PC1", pc_1[0].Health, pc_1[1].Health, pc_1[2].Health,
                        pc_1[3].Health, pc_1[4].Health);
            } else {
                this.setVisible(false);
                game_Frame_4 game_Frame_4 = new game_Frame_4("TIE", 0, 0, 0, 0, 0);
            }
        }

        if (e.getSource() == continueue) {
            roundcount += 1;

            r = random.nextInt(5);
            r2 = random.nextInt(5);
            if (pc_1[0].Health <= 0 && pc_1[1].Health <= 0 && pc_1[2].Health <= 0 && pc_1[3].Health <= 0
                    && pc_1[4].Health <= 0) {

            }

            if (pc_2[0].Health <= 0 && pc_2[1].Health <= 0 && pc_2[2].Health <= 0 && pc_2[3].Health <= 0
                    && pc_2[4].Health <= 0) {

            }

            while (pc_2[r2].Health <= 0)
                r2 = random.nextInt(5);
            while (pc_1[r].Health <= 0)
                r = random.nextInt(5);
            // int flag = 0;
            // while (pc_2[r2].Health <= 0) { // oyun bitti mi testi
            // for (int i = 0; i < 4; i++) {
            // if (pc_2[i].Health > 0)
            // flag = 1;
            // }
            // if (flag == 0) {
            // System.out.println("------THE END --------");
            // return;
            // }
            // r = random.nextInt(5);
            // }

            pc_1[r].Health -= pc_2[r2].damage_give(pc_1[r].speciality, pc_2[r2].eternity, pc_1[r].eternity);
            System.out.println("bizim kartin cani " + pc_1[r].Health);
            pc_2[r2].Health -= pc_1[r].damage_give(pc_2[r2].speciality, pc_1[r].eternity, pc_2[r2].eternity);
            System.out.println("pc nin sectigi kart" + r + "yani su elemana denk geliyor " + pc_2[r2].eternity
                    + " pc nin cani " + pc_2[r2].Health);

            if (pc_2[r2].Health <= 0) {
                pc_1[r].xp += 20;
            }
            if (pc_1[r].xp >= 30) {
                if (pc_1[r].eternity == 2) {
                    pc_1_b[r].setIcon(stone_button2);
                    logoarray_pc_1[r].setIcon(stone_button2);
                } else if (pc_1[r].eternity == 3) {
                    pc_1_b[r].setIcon(paper_button2);
                    logoarray_pc_1[r].setIcon(paper_button2);
                } else if (pc_1[r].eternity == 4) {
                    pc_1_b[r].setIcon(scissors_button2);
                    logoarray_pc_1[r].setIcon(scissors_button2);
                }
                pc_1[r].level += 1;
                pc_1[r].speciality[0][1] = 2;
                pc_1[r].speciality[1][1] = 2;
                pc_1[r].speciality[2][1] = 2;
            }

            if (pc_1[r].Health <= 0) {
                pc_2[r2].xp += 20;
            }
            if (pc_2[r2].xp >= 30) {
                if (pc_2[r2].eternity == 2) {
                    pc_2_b[r2].setIcon(stone_button2);
                    logoarray_pc_2[r2].setIcon(stone_button2);
                } else if (pc_2[r2].eternity == 3) {
                    pc_2_b[r2].setIcon(paper_button2);
                    logoarray_pc_2[r2].setIcon(paper_button2);
                } else if (pc_2[r2].eternity == 4) {
                    pc_2_b[r2].setIcon(scissors_button2);
                    logoarray_pc_2[r2].setIcon(scissors_button2);
                }

                pc_2[r2].level += 1;
                pc_2[r2].speciality[0][1] = 2;
                pc_2[r2].speciality[1][1] = 2;
                pc_2[r2].speciality[2][1] = 2;
            }

            System.out.println(pc_1[r].name);
            pc_2_interface_item_name.setText("" + pc_2[r2].name);
            logoarray_pc_2[1].setVisible(false);
            logoarray_pc_2[2].setVisible(false);
            logoarray_pc_2[3].setVisible(false);
            logoarray_pc_2[4].setVisible(false);
            logoarray_pc_2[0].setVisible(false);
            logoarray_pc_2[r2].setVisible(true);

            pc_1_interface_item_name.setText("" + pc_1[r].name);
            logoarray_pc_1[1].setVisible(false);
            logoarray_pc_1[2].setVisible(false);
            logoarray_pc_1[3].setVisible(false);
            logoarray_pc_1[4].setVisible(false);
            logoarray_pc_1[0].setVisible(false);
            logoarray_pc_1[r].setVisible(true);

            pc_1_stat_values[r][0].setText("" + pc_1[r].Health);
            pc_1_stat_values[r][1].setText("" + pc_1[r].xp);
            pc_1_stat_values[r][2].setText("" + pc_1[r].level);

            pc_2_stat_values[r2][0].setText("" + pc_2[r2].Health);
            pc_2_stat_values[r2][1].setText("" + pc_2[r2].xp);
            pc_2_stat_values[r2][2].setText("" + pc_2[r2].level);

            damage_interface_taken_value.setText(
                    "" + pc_2[r2].damage_give(pc_1[r].speciality, pc_2[r2].eternity, pc_1[r].eternity));
            damage_interface_given_value.setText(
                    "" + pc_1[r].damage_give(pc_2[r2].speciality, pc_1[r].eternity, pc_2[r2].eternity));

            if (pc_1[r].Health <= 0) {
                pc_1_b[r].setEnabled(false);
                System.out.println("i've been killed");
            }
            if (pc_2[r2].Health <= 0) {
                pc_2_b[r2].setEnabled(false);
                System.out.println("i've been killed");
            }

            round_interface_count.setText("" + roundcount);
            pc_1_score = pc_1[0].Health + pc_1[1].Health + pc_1[2].Health + pc_1[3].Health + pc_1[4].Health;
            pc_2_score = pc_2[0].Health + pc_2[1].Health + pc_2[2].Health + pc_2[3].Health + pc_2[4].Health;
        }
    }
}
