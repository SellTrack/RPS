import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import main1.*;

import java.util.*;

public class game_Frame_3_1 extends JFrame implements ActionListener {
    double items_score;
    double pc_score;
    int r;
    String Name;
    String round1;
    JLabel damage_interface_taken_value = new JLabel(); // burada pencereleri yine başka pencerelerin içine sokuyoruz:D
    JLabel damage_interface_given_value = new JLabel(); // burada pencereleri yine başka pencerelerin içine sokuyoruz:D
    JLabel user_interface_item_name = new JLabel(); // burada pencereleri yine başka pencerelerin içine sokuyoruz:D
    JLabel pc_interface_item_name = new JLabel(); // burada pencereleri yine başka pencerelerin içine sokuyoruz:D

    ImageIcon stone_button = new ImageIcon("sprites/stone.png"); // burada resimleri görüntülemek için elemanlar
                                                                 // oluşturduk
    ImageIcon scissors_button = new ImageIcon("sprites/scissors.png");
    ImageIcon paper_button = new ImageIcon("sprites/paper.png");

    ImageIcon stone_button2 = new ImageIcon("sprites/heavy_stone.png"); // burada resimleri görüntülemek için elemanlar
                                                                        // oluşturduk
    ImageIcon scissors_button2 = new ImageIcon("sprites/master_scissors.png");
    ImageIcon paper_button2 = new ImageIcon("sprites/special_paper.png");

    JLabel[] logoarray = new JLabel[5];
    JLabel[] logoarray_pc = new JLabel[5];
    JLabel stone_logo, paper_logo, scissors_logo, stone_logo2, paper_logo2, scissors_logo2, stone_logo3, paper_logo3,
            scissors_logo3; // logoları taşıyacak label lar burada
    JPanel slot_1, slot_2, slot_3, slot_4, slot_5, pc_interface, user_interface, damage_interface, round_interface; // arayüzde
                                                                                                                    // görüntülecenek
                                                                                                                    // pencereler
                                                                                                                    // oluşturuldu
                                                                                                                    // burada
    JLabel round_interface_count; // round daki sayaç
    JPanel[] panel_Array; // arayüzde butonların yerini tutacak olan paneller görsellik için yani
    JButton but1, but2, but3, but4, but5; // buttonlar oluşturuldu henüz bişi atanmaıd
    JButton[] but_array; // butonlarla item slotlarını eşlemek için kullandığım dizi
    double a = 0.2; // hesaplamadaki 0.2 sabiti gereksiz olabilir
    // int stat_array[][];
    int roundcount = 1; // round 1 den başlaması için
    Random random = new Random(); // herhangi bir randomluk işi için kullnılacak olan eleman kullanımı basit en
                                  // basitinden örnek int x = random.nextint(5); dersek 0 1 2 3 4 arası rastgele
                                  // seçiçek
    String[] transport = new String[5]; // bir önceki pencerede hangi slotun hangi itemi seçtiğini anlamak için
                                        // oluşturduğum string dizisi
    String[] computer = new String[5];
    String[][] stat_array = new String[5][4]; // araryüzde bize ait olan elemanların değerlerini xp hp levelini
                                              // görüntülemek için oluştruduğum dizi görsellik için yani

    JLabel stats_values_hp_a = new JLabel(); // burası da tamamen görsellik için görüntüleme işlemleri için
    JLabel stats_values_xp_a = new JLabel();
    JLabel stats_values_lvl_a = new JLabel();
    JLabel stats_values_hp_b = new JLabel();
    JLabel stats_values_xp_b = new JLabel();
    JLabel stats_values_lvl_b = new JLabel();
    JLabel stats_values_hp_c = new JLabel();
    JLabel stats_values_xp_c = new JLabel();
    JLabel stats_values_lvl_c = new JLabel();
    JLabel stats_values_hp_d = new JLabel();
    JLabel stats_values_xp_d = new JLabel();
    JLabel stats_values_lvl_d = new JLabel();
    JLabel stats_values_hp_e = new JLabel();
    JLabel stats_values_xp_e = new JLabel();
    JLabel stats_values_lvl_e = new JLabel();

    items[] items = new items[5]; // burası önemli burada itemlerimizi saklayacak olan dizi class dizisi alt class
                                  // saklayabiliyor ama bizim durumda nereye ne geleceği belli olmadığı için çok
                                  // etkili olmuyor ama yinede yapabiliyor.
    items[] items_pc = new items[5]; // yukarıda bahsettiğim şeyin pc için olacak versiyonu

    game_Frame_3_1(String Transport[], String name, String round) {
        round1 = round;
        Name = name;
        panel_Array = new JPanel[5];

        transport = Transport; // burada bir önceki pencereden aldğım değerleri buraya atıyorum. şimdi
                               // düşününce çok gereksiz gibi gelebiliyor ama kaldılıksın şimdilik.
        System.out.println(transport[0]); // kontrol amaçlı bi önceki pencereden gelen değerlerimn doğrulupunu kontrol
                                          // ediyorum.
        System.out.println(transport[1]);
        System.out.println(transport[2]);
        System.out.println(transport[3]);
        System.out.println(transport[4]);

        stone_logo = new JLabel(); // bundan sonrası buna benzeyen hepsi görsellik için görsellik çalışmaları
                                   // burada başlıyor.
        stone_logo.setBounds(42, 88, 97, 97);
        stone_logo.setIcon(stone_button);
        stone_logo.setVisible(false);

        scissors_logo = new JLabel(); // görsellik
        stone_logo.setOpaque(true);
        scissors_logo.setBounds(42, 88, 97, 97);
        scissors_logo.setIcon(scissors_button);
        scissors_logo.setVisible(false);

        paper_logo = new JLabel(); // görsellik
        stone_logo.setOpaque(true);
        paper_logo.setBounds(42, 88, 97, 97);
        paper_logo.setIcon(paper_button);
        paper_logo.setVisible(false);

        stone_logo2 = new JLabel(); // görsellik
        stone_logo2.setBounds(42, 88, 97, 97);
        stone_logo2.setIcon(stone_button);
        stone_logo2.setVisible(false);

        scissors_logo2 = new JLabel(); // görsellik
        stone_logo2.setOpaque(true);
        scissors_logo2.setBounds(42, 88, 97, 97);
        scissors_logo2.setIcon(scissors_button);
        scissors_logo2.setVisible(false);

        paper_logo2 = new JLabel(); // görsellik
        stone_logo2.setOpaque(true);
        paper_logo2.setBounds(0, 0, 97, 97);
        paper_logo2.setIcon(paper_button);
        paper_logo2.setVisible(false);

        stone_logo3 = new JLabel(); // görsellik
        stone_logo3.setBounds(0, 0, 97, 97);
        stone_logo3.setIcon(stone_button);
        stone_logo3.setVisible(false);

        scissors_logo3 = new JLabel(); // görsellik
        stone_logo3.setOpaque(true);
        scissors_logo3.setBounds(0, 0, 97, 97);
        scissors_logo3.setIcon(scissors_button);
        scissors_logo3.setVisible(false);

        paper_logo3 = new JLabel();
        stone_logo3.setOpaque(true);
        paper_logo3.setBounds(0, 0, 90, 90);
        paper_logo3.setIcon(paper_button);
        paper_logo3.setVisible(false); // buraya kadar görsellikti

        logoarray_pc[0] = new JLabel();
        logoarray_pc[0].setBounds(0, 85, 100, 100);
        logoarray_pc[0].setIcon(paper_button);
        logoarray_pc[0].setVisible(false);

        logoarray_pc[1] = new JLabel();
        logoarray_pc[1].setBounds(0, 85, 100, 100);
        logoarray_pc[1].setIcon(paper_button);
        logoarray_pc[1].setVisible(false);

        logoarray_pc[2] = new JLabel();
        logoarray_pc[2].setBounds(0, 85, 100, 100);
        logoarray_pc[2].setIcon(paper_button);
        logoarray_pc[2].setVisible(false);

        logoarray_pc[3] = new JLabel();
        logoarray_pc[3].setBounds(0, 85, 100, 100);
        logoarray_pc[3].setIcon(paper_button);
        logoarray_pc[3].setVisible(false);

        logoarray_pc[4] = new JLabel();
        logoarray_pc[4].setBounds(0, 85, 100, 100);
        logoarray_pc[4].setIcon(paper_button);
        logoarray_pc[4].setVisible(false);

        int[] numberarray = new int[5]; // BURADA pc için 5 lik slot açıyorum burada pc için rastgele kart seçme
                                        // oluşturma atama işlemi yapacağız
        for (int i = 0; i < 5; i++) {
            numberarray[i] = random.nextInt(3) + 1; // 5 lik bi dizi oluşturp içine 1 2 3 diye rastgele sayı atıyor
        }

        for (int i = 0; i < 5; i++) {
            if (numberarray[i] == 1) { // eğer 1 ise o pc için oluşturduğumuz class dizisnde taş alt klası oluşturacak
                items_pc[i] = new stone();
                logoarray_pc[i].setIcon(stone_button);
            }

            if (numberarray[i] == 2) { // eğer 2 ise kağıt
                items_pc[i] = new paper();
                logoarray_pc[i].setIcon(paper_button);
            }

            if (numberarray[i] == 3) { // eğer 3 ise makas diye alt klass oluşturcak. dediğim gibi aksiyon anında
                                       // damage hesaplama kısmında hangi slotun yani item_pc[i] kısmında tam olarak
                                       // hangi itemin olacağı net kesin olmadığı için o alt klasın içindeki
                                       // özelliklere eriemeyeceğiz ve dolayısıyla bi anlamı kalmaayacak ama en azından
                                       // hocanın dediği bir şeyi yapmış oluyoruz.
                items_pc[i] = new scissors();
                logoarray_pc[i].setIcon(scissors_button);
            }
        }

        JLabel player_Name = new JLabel(); // başlığımız
        player_Name.setText("" + name);
        player_Name.setHorizontalAlignment(JLabel.CENTER);
        player_Name.setVerticalAlignment(JLabel.CENTER);
        player_Name.setForeground(Color.white);
        player_Name.setFont(new Font("Aldrich", Font.PLAIN, 64));
        player_Name.setBounds(25, 42, 212, 63);

        JLabel title = new JLabel(); // başlığımız
        title.setText("RPS+");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setForeground(Color.white);
        title.setFont(new Font("Aldrich", Font.PLAIN, 64));
        title.setBounds(294, 38, 212, 63);

        JLabel stats_name_a = new JLabel(); // burada her bir butonun altında olan hp lvl xp gibi yazılar ve görsellik
                                            // parametreleri var buraso bayağı uzun
        stats_name_a.setText("HP:");
        stats_name_a.setHorizontalAlignment(JLabel.LEFT);
        stats_name_a.setVerticalAlignment(JLabel.CENTER);
        stats_name_a.setForeground(Color.white);
        stats_name_a.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_name_a.setBounds(0, 111, 36, 20);

        JLabel stats_name_2_a = new JLabel(); // görsellik çalışması
        stats_name_2_a.setText("XP:");
        stats_name_2_a.setHorizontalAlignment(JLabel.LEFT);
        stats_name_2_a.setVerticalAlignment(JLabel.CENTER);
        stats_name_2_a.setForeground(Color.white);
        stats_name_2_a.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_name_2_a.setBounds(0, 142, 34, 20);

        JLabel stats_name_3_a = new JLabel(); // görsellik çalışması
        stats_name_3_a.setText("LVL:");
        stats_name_3_a.setHorizontalAlignment(JLabel.LEFT);
        stats_name_3_a.setVerticalAlignment(JLabel.CENTER);
        stats_name_3_a.setForeground(Color.white);
        stats_name_3_a.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_name_3_a.setBounds(0, 173, 45, 20);

        stats_values_hp_a.setText("20.0"); // görsellik çalışması
        stats_values_hp_a.setHorizontalAlignment(JLabel.CENTER);
        stats_values_hp_a.setVerticalAlignment(JLabel.CENTER);
        stats_values_hp_a.setForeground(Color.white);
        stats_values_hp_a.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_values_hp_a.setBounds(47, 111, 53, 25);

        stats_values_xp_a.setText("0.0"); // görsellik çalışması
        stats_values_xp_a.setHorizontalAlignment(JLabel.CENTER);
        stats_values_xp_a.setVerticalAlignment(JLabel.CENTER);
        stats_values_xp_a.setForeground(Color.white);
        stats_values_xp_a.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_values_xp_a.setBounds(47, 139, 53, 25);

        stats_values_lvl_a.setText("1"); // görsellik çalışması
        stats_values_lvl_a.setHorizontalAlignment(JLabel.CENTER);
        stats_values_lvl_a.setVerticalAlignment(JLabel.CENTER);
        stats_values_lvl_a.setForeground(Color.white);
        stats_values_lvl_a.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_values_lvl_a.setBounds(47, 170, 53, 25);

        JLabel stats_name_b = new JLabel(); // görsellik çalışması
        stats_name_b.setText("HP:");
        stats_name_b.setHorizontalAlignment(JLabel.LEFT);
        stats_name_b.setVerticalAlignment(JLabel.CENTER);
        stats_name_b.setForeground(Color.white);
        stats_name_b.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_name_b.setBounds(0, 111, 36, 20);

        JLabel stats_name_2_b = new JLabel(); // görsellik çalışması
        stats_name_2_b.setText("XP:");
        stats_name_2_b.setHorizontalAlignment(JLabel.LEFT);
        stats_name_2_b.setVerticalAlignment(JLabel.CENTER);
        stats_name_2_b.setForeground(Color.white);
        stats_name_2_b.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_name_2_b.setBounds(0, 142, 34, 20);

        JLabel stats_name_3_b = new JLabel(); // görsellik çalışması
        stats_name_3_b.setText("LVL:");
        stats_name_3_b.setHorizontalAlignment(JLabel.LEFT);
        stats_name_3_b.setVerticalAlignment(JLabel.CENTER);
        stats_name_3_b.setForeground(Color.white);
        stats_name_3_b.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_name_3_b.setBounds(0, 173, 45, 20);

        stats_values_hp_b.setText("20.0"); // görsellik çalışması
        stats_values_hp_b.setHorizontalAlignment(JLabel.CENTER);
        stats_values_hp_b.setVerticalAlignment(JLabel.CENTER);
        stats_values_hp_b.setForeground(Color.white);
        stats_values_hp_b.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_values_hp_b.setBounds(47, 106, 53, 25);

        stats_values_xp_b.setText("0.0"); // görsellik çalışması
        stats_values_xp_b.setHorizontalAlignment(JLabel.CENTER);
        stats_values_xp_b.setVerticalAlignment(JLabel.CENTER);
        stats_values_xp_b.setForeground(Color.white);
        stats_values_xp_b.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_values_xp_b.setBounds(47, 137, 53, 25);

        stats_values_lvl_b.setText("1.0"); // görsellik çalışması
        stats_values_lvl_b.setHorizontalAlignment(JLabel.CENTER);
        stats_values_lvl_b.setVerticalAlignment(JLabel.CENTER);
        stats_values_lvl_b.setForeground(Color.white);
        stats_values_lvl_b.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_values_lvl_b.setBounds(47, 168, 53, 25);

        JLabel stats_name_c = new JLabel(); // görsellik çalışması
        stats_name_c.setText("HP:");
        stats_name_c.setHorizontalAlignment(JLabel.LEFT);
        stats_name_c.setVerticalAlignment(JLabel.CENTER);
        stats_name_c.setForeground(Color.white);
        stats_name_c.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_name_c.setBounds(0, 111, 36, 20);

        JLabel stats_name_2_c = new JLabel(); // görsellik çalışması
        stats_name_2_c.setText("XP:");
        stats_name_2_c.setHorizontalAlignment(JLabel.LEFT);
        stats_name_2_c.setVerticalAlignment(JLabel.CENTER);
        stats_name_2_c.setForeground(Color.white);
        stats_name_2_c.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_name_2_c.setBounds(0, 142, 34, 20);

        JLabel stats_name_3_c = new JLabel(); // görsellik çalışması
        stats_name_3_c.setText("LVL:");
        stats_name_3_c.setHorizontalAlignment(JLabel.LEFT);
        stats_name_3_c.setVerticalAlignment(JLabel.CENTER);
        stats_name_3_c.setForeground(Color.white);
        stats_name_3_c.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_name_3_c.setBounds(0, 173, 45, 20);

        stats_values_hp_c.setText("20.0"); // görsellik çalışması
        stats_values_hp_c.setHorizontalAlignment(JLabel.CENTER);
        stats_values_hp_c.setVerticalAlignment(JLabel.CENTER);
        stats_values_hp_c.setForeground(Color.white);
        stats_values_hp_c.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_values_hp_c.setBounds(47, 106, 53, 25);

        stats_values_xp_c.setText("0.0"); // görsellik çalışması
        stats_values_xp_c.setHorizontalAlignment(JLabel.CENTER);
        stats_values_xp_c.setVerticalAlignment(JLabel.CENTER);
        stats_values_xp_c.setForeground(Color.white);
        stats_values_xp_c.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_values_xp_c.setBounds(47, 137, 53, 25);

        stats_values_lvl_c.setText("1.0"); // görsellik çalışması
        stats_values_lvl_c.setHorizontalAlignment(JLabel.CENTER);
        stats_values_lvl_c.setVerticalAlignment(JLabel.CENTER);
        stats_values_lvl_c.setForeground(Color.white);
        stats_values_lvl_c.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_values_lvl_c.setBounds(47, 168, 53, 25);

        JLabel stats_name_d = new JLabel(); // görsellik çalışması
        stats_name_d.setText("HP:");
        stats_name_d.setHorizontalAlignment(JLabel.LEFT);
        stats_name_d.setVerticalAlignment(JLabel.CENTER);
        stats_name_d.setForeground(Color.white);
        stats_name_d.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_name_d.setBounds(0, 111, 36, 20);

        JLabel stats_name_2_d = new JLabel(); // görsellik çalışması
        stats_name_2_d.setText("XP:");
        stats_name_2_d.setHorizontalAlignment(JLabel.LEFT);
        stats_name_2_d.setVerticalAlignment(JLabel.CENTER);
        stats_name_2_d.setForeground(Color.white);
        stats_name_2_d.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_name_2_d.setBounds(0, 142, 34, 20);

        JLabel stats_name_3_d = new JLabel(); // görsellik çalışması
        stats_name_3_d.setText("LVL:");
        stats_name_3_d.setHorizontalAlignment(JLabel.LEFT);
        stats_name_3_d.setVerticalAlignment(JLabel.CENTER);
        stats_name_3_d.setForeground(Color.white);
        stats_name_3_d.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_name_3_d.setBounds(0, 173, 45, 20);

        stats_values_hp_d.setText("20.0"); // görsellik çalışması
        stats_values_hp_d.setHorizontalAlignment(JLabel.CENTER);
        stats_values_hp_d.setVerticalAlignment(JLabel.CENTER);
        stats_values_hp_d.setForeground(Color.white);
        stats_values_hp_d.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_values_hp_d.setBounds(47, 106, 53, 25);

        stats_values_xp_d.setText("0.0"); // görsellik çalışması
        stats_values_xp_d.setHorizontalAlignment(JLabel.CENTER);
        stats_values_xp_d.setVerticalAlignment(JLabel.CENTER);
        stats_values_xp_d.setForeground(Color.white);
        stats_values_xp_d.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_values_xp_d.setBounds(47, 137, 53, 25);

        stats_values_lvl_d.setText("1.0"); // görsellik çalışması
        stats_values_lvl_d.setHorizontalAlignment(JLabel.CENTER);
        stats_values_lvl_d.setVerticalAlignment(JLabel.CENTER);
        stats_values_lvl_d.setForeground(Color.white);
        stats_values_lvl_d.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_values_lvl_d.setBounds(47, 168, 53, 25);

        JLabel stats_name_e = new JLabel(); // görsellik çalışması
        stats_name_e.setText("HP:");
        stats_name_e.setHorizontalAlignment(JLabel.LEFT);
        stats_name_e.setVerticalAlignment(JLabel.CENTER);
        stats_name_e.setForeground(Color.white);
        stats_name_e.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_name_e.setBounds(0, 111, 36, 20);

        JLabel stats_name_2_e = new JLabel(); // görsellik çalışması
        stats_name_2_e.setText("XP:");
        stats_name_2_e.setHorizontalAlignment(JLabel.LEFT);
        stats_name_2_e.setVerticalAlignment(JLabel.CENTER);
        stats_name_2_e.setForeground(Color.white);
        stats_name_2_e.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_name_2_e.setBounds(0, 142, 34, 20);

        JLabel stats_name_3_e = new JLabel(); // görsellik çalışması
        stats_name_3_e.setText("LVL:");
        stats_name_3_e.setHorizontalAlignment(JLabel.LEFT);
        stats_name_3_e.setVerticalAlignment(JLabel.CENTER);
        stats_name_3_e.setForeground(Color.white);
        stats_name_3_e.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_name_3_e.setBounds(0, 173, 45, 20);

        stats_values_hp_e.setText("20.0"); // görsellik çalışması
        stats_values_hp_e.setHorizontalAlignment(JLabel.CENTER);
        stats_values_hp_e.setVerticalAlignment(JLabel.CENTER);
        stats_values_hp_e.setForeground(Color.white);
        stats_values_hp_e.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_values_hp_e.setBounds(47, 106, 53, 25);

        stats_values_xp_e.setText("0.0"); // görsellik çalışması
        stats_values_xp_e.setHorizontalAlignment(JLabel.CENTER);
        stats_values_xp_e.setVerticalAlignment(JLabel.CENTER);
        stats_values_xp_e.setForeground(Color.white);
        stats_values_xp_e.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_values_xp_e.setBounds(47, 137, 53, 25);

        stats_values_lvl_e.setText("1.0"); // görsellik çalışması
        stats_values_lvl_e.setHorizontalAlignment(JLabel.CENTER);
        stats_values_lvl_e.setVerticalAlignment(JLabel.CENTER);
        stats_values_lvl_e.setForeground(Color.white);
        stats_values_lvl_e.setFont(new Font("Aldrich", Font.PLAIN, 20));
        stats_values_lvl_e.setBounds(47, 168, 53, 25);

        but_array = new JButton[5]; // burada buton tanımlıyoruz 5 tane

        // 5 butonun 3 erli textinden ve 3 erli değerinden dolayı biraz uzun olabiliyor
        // bu yukarıdaki kod.
        but1 = new JButton(); // burada butonlar için görselleştirmeler özellikler atanıyor
        but1.setBounds(0, 0, 100, 100);
        but1.addActionListener(this);
        but1.setFocusable(false);
        // but1.setIcon(stone_button); //burası biraz ayarlanması lazım

        but2 = new JButton(); // burada butonlar için görselleştirmeler özellikler atanıyor
        but2.setBounds(0, 0, 100, 100);
        but2.addActionListener(this);
        but2.setFocusable(false);
        // but1.setIcon(); burası biraz ayarlanması lazım

        but3 = new JButton(); // burada butonlar için görselleştirmeler özellikler atanıyor
        but3.setBounds(0, 0, 100, 100);
        but3.addActionListener(this);
        but3.setFocusable(false);
        // but1.setIcon(); burası biraz ayarlanması lazım

        but4 = new JButton(); // burada butonlar için görselleştirmeler özellikler atanıyor
        but4.setBounds(0, 0, 100, 100);
        but4.addActionListener(this);
        but4.setFocusable(false);
        // but1.setIcon(); burası biraz ayarlanması lazım

        but5 = new JButton(); // burada butonlar için görselleştirmeler özellikler atanıyor
        but5.setBounds(0, 0, 100, 100);
        but5.addActionListener(this);
        but5.setFocusable(false);
        // but1.setIcon(); burası biraz ayarlanması lazım
        but_array[0] = but1;
        but_array[1] = but2;
        but_array[2] = but3;
        but_array[3] = but4;
        but_array[4] = but5;

        logoarray[0] = new JLabel();
        logoarray[0].setBounds(42, 88, 100, 100);
        logoarray[0].setIcon(paper_button);
        logoarray[0].setVisible(false);

        logoarray[1] = new JLabel();
        logoarray[1].setBounds(42, 88, 100, 100);
        logoarray[1].setIcon(paper_button);
        logoarray[1].setVisible(false);

        logoarray[2] = new JLabel();
        logoarray[2].setBounds(42, 88, 100, 100);
        logoarray[2].setIcon(paper_button);
        logoarray[2].setVisible(false);

        logoarray[3] = new JLabel();
        logoarray[3].setBounds(42, 88, 100, 100);
        logoarray[3].setIcon(paper_button);
        logoarray[3].setVisible(false);

        logoarray[4] = new JLabel();
        logoarray[4].setBounds(42, 88, 100, 100);
        logoarray[4].setIcon(paper_button);
        logoarray[4].setVisible(false);

        for (int i = 0; i < 5; i++) { // burası önemli işte ney ne ise ona göre alt class oluşturuyor. tam hocanın
                                      // istediği bişe ama çok kullanamıcaz gibi.
            if (transport[i] == "stone") {
                items[i] = new stone();
                but_array[i].setIcon(stone_button);
                logoarray[i].setIcon(stone_button);

            } else if (transport[i] == "paper") {
                items[i] = new paper();
                but_array[i].setIcon(paper_button);
                logoarray[i].setIcon(paper_button);
            } else if (transport[i] == "scissors") {
                items[i] = new scissors();
                but_array[i].setIcon(scissors_button);
                logoarray[i].setIcon(scissors_button);
            }
        }

        // butonlarımızı ayarladık ama bunlar biribirlerinden bi haber ve neyin kaç
        // nunmara olduğu belli değil bu aşağıda eşleştirme yapıyorum bunun kolaylığı
        // isimden direk değerlere erişim sağlayabilmek için kısacası görsellik için
        // dinamik olarak resmini falan güncellemek için tıklanamaz yapmak için fln

        slot_1 = new JPanel(); // burada butonları label ları panellere yerleştiriyoruz
        slot_1.setBounds(89, 504, 100, 193);
        slot_1.setBackground(Color.black);
        slot_1.setLayout(null);
        slot_1.add(but1);
        slot_1.add(stats_name_a);
        slot_1.add(stats_name_2_a);
        slot_1.add(stats_name_3_a);
        slot_1.add(stats_values_hp_a);
        slot_1.add(stats_values_xp_a);
        slot_1.add(stats_values_lvl_a);

        slot_2 = new JPanel(); // burada butonları label ları panellere yerleştiriyoruz
        slot_2.setBounds(219, 504, 100, 193);
        slot_2.setBackground(Color.black);
        slot_2.setLayout(null);
        slot_2.add(but2);
        slot_2.add(stats_name_b);
        slot_2.add(stats_name_2_b);
        slot_2.add(stats_name_3_b);
        slot_2.add(stats_values_hp_b);
        slot_2.add(stats_values_xp_b);
        slot_2.add(stats_values_lvl_b);

        slot_3 = new JPanel(); // burada butonları label ları panellere yerleştiriyoruz
        slot_3.setBounds(350, 504, 100, 193);
        slot_3.setBackground(Color.black);
        slot_3.setLayout(null);
        slot_3.add(but3);
        slot_3.add(stats_name_c);
        slot_3.add(stats_name_2_c);
        slot_3.add(stats_name_3_c);
        slot_3.add(stats_values_hp_c);
        slot_3.add(stats_values_xp_c);
        slot_3.add(stats_values_lvl_c);

        slot_4 = new JPanel(); // burada butonları label ları panellere yerleştiriyoruz
        slot_4.setBounds(478, 504, 100, 193);
        slot_4.setBackground(Color.black);
        slot_4.setLayout(null);
        slot_4.add(but4);
        slot_4.add(stats_name_d);
        slot_4.add(stats_name_2_d);
        slot_4.add(stats_name_3_d);
        slot_4.add(stats_values_hp_d);
        slot_4.add(stats_values_xp_d);
        slot_4.add(stats_values_lvl_d);

        slot_5 = new JPanel(); // burada butonları label ları panellere yerleştiriyoruz
        slot_5.setBounds(612, 504, 100, 193);
        slot_5.setBackground(Color.black);
        slot_5.setLayout(null);
        slot_5.add(but5);
        slot_5.add(stats_name_e);
        slot_5.add(stats_name_2_e);
        slot_5.add(stats_name_3_e);
        slot_5.add(stats_values_hp_e);
        slot_5.add(stats_values_xp_e);
        slot_5.add(stats_values_lvl_e);

        panel_Array[0] = slot_1; // sonrasında bu butonlarımızın görselliğiyle kolay erişim için bunu
                                 // oluşturuyoruz
        panel_Array[1] = slot_2;
        panel_Array[2] = slot_3;
        panel_Array[3] = slot_4;
        panel_Array[4] = slot_5;

        JLabel pc_interface_title = new JLabel(); // burada pencereleri yine başka pencerelerin içine sokuyoruz:D
        pc_interface_title.setText("PC");
        pc_interface_title.setHorizontalAlignment(JLabel.CENTER);
        pc_interface_title.setVerticalAlignment(JLabel.CENTER);
        pc_interface_title.setForeground(Color.white);
        pc_interface_title.setFont(new Font("Aldrich", Font.PLAIN, 64));
        pc_interface_title.setBounds(0, 0, 92, 63);

        pc_interface_item_name.setText("ITEM");
        pc_interface_item_name.setHorizontalAlignment(JLabel.CENTER);
        pc_interface_item_name.setVerticalAlignment(JLabel.CENTER);
        pc_interface_item_name.setForeground(Color.white);
        pc_interface_item_name.setFont(new Font("Aldrich", Font.PLAIN, 30));
        pc_interface_item_name.setBounds(0, 207, 100, 29);

        JLabel user_interface_title = new JLabel(); // burada pencereleri yine başka pencerelerin içine sokuyoruz:D
        user_interface_title.setText("USER");
        user_interface_title.setHorizontalAlignment(JLabel.CENTER);
        user_interface_title.setVerticalAlignment(JLabel.CENTER);
        user_interface_title.setForeground(Color.white);
        user_interface_title.setFont(new Font("Aldrich", Font.PLAIN, 64));
        user_interface_title.setBounds(0, 0, 185, 63);

        user_interface_item_name.setText("ITEM");
        user_interface_item_name.setHorizontalAlignment(JLabel.CENTER);
        user_interface_item_name.setVerticalAlignment(JLabel.CENTER);
        user_interface_item_name.setForeground(Color.white);
        user_interface_item_name.setFont(new Font("Aldrich", Font.PLAIN, 30));
        user_interface_item_name.setBounds(5, 210, 150, 29);

        JLabel round_interface_title = new JLabel(); // burada pencereleri yine başka pencerelerin içine sokuyoruz:D
        round_interface_title.setText("ROUND:");
        round_interface_title.setHorizontalAlignment(JLabel.CENTER);
        round_interface_title.setVerticalAlignment(JLabel.CENTER);
        round_interface_title.setForeground(Color.white);
        round_interface_title.setFont(new Font("Aldrich", Font.PLAIN, 40));
        round_interface_title.setBounds(0, 0, 179, 39);

        round_interface_count = new JLabel(); // burada pencereleri yine başka pencerelerin içine sokuyoruz:D
        round_interface_count.setText("" + roundcount);
        round_interface_count.setHorizontalAlignment(JLabel.CENTER);
        round_interface_count.setVerticalAlignment(JLabel.CENTER);
        round_interface_count.setForeground(Color.white);
        round_interface_count.setFont(new Font("Aldrich", Font.PLAIN, 40));
        round_interface_count.setBounds(180, 0, 60, 45);

        JLabel damage_interface_taken_name = new JLabel(); // burada pencereleri yine başka pencerelerin içine
                                                           // sokuyoruz:D
        damage_interface_taken_name.setText("ALINAN HASAR:");
        damage_interface_taken_name.setHorizontalAlignment(JLabel.CENTER);
        damage_interface_taken_name.setVerticalAlignment(JLabel.CENTER);
        damage_interface_taken_name.setForeground(Color.white);
        damage_interface_taken_name.setFont(new Font("Aldrich", Font.PLAIN, 20));
        damage_interface_taken_name.setBounds(0, 50, 185, 20);

        damage_interface_taken_value.setText("20");
        damage_interface_taken_value.setHorizontalAlignment(JLabel.CENTER);
        damage_interface_taken_value.setVerticalAlignment(JLabel.CENTER);
        damage_interface_taken_value.setForeground(Color.white);
        damage_interface_taken_value.setFont(new Font("Aldrich", Font.PLAIN, 20));
        damage_interface_taken_value.setBounds(198, 44, 44, 35);

        JLabel damage_interface_given_name = new JLabel(); // burada pencereleri yine başka pencerelerin içine
                                                           // sokuyoruz:D
        damage_interface_given_name.setText("VERILEN HASAR:"); // burada pencereleri yine başka pencerelerin içine
                                                               // sokuyoruz:D
        damage_interface_given_name.setHorizontalAlignment(JLabel.CENTER);
        damage_interface_given_name.setVerticalAlignment(JLabel.CENTER);
        damage_interface_given_name.setForeground(Color.white);
        damage_interface_given_name.setFont(new Font("Aldrich", Font.PLAIN, 20));
        damage_interface_given_name.setBounds(0, 7, 185, 20);

        damage_interface_given_value.setText("20");
        damage_interface_given_value.setHorizontalAlignment(JLabel.CENTER);
        damage_interface_given_value.setVerticalAlignment(JLabel.CENTER);
        damage_interface_given_value.setForeground(Color.white);
        damage_interface_given_value.setFont(new Font("Aldrich", Font.PLAIN, 20));
        damage_interface_given_value.setBounds(198, 0, 44, 33);

        pc_interface = new JPanel(); // yine pencere düzenlemerleri
        pc_interface.setBounds(133, 209, 100, 236);
        pc_interface.setBackground(Color.black);
        pc_interface.setLayout(null);
        pc_interface.add(pc_interface_item_name);
        pc_interface.add(pc_interface_title);
        pc_interface.add(logoarray_pc[0]);
        pc_interface.add(logoarray_pc[1]);
        pc_interface.add(logoarray_pc[2]);
        pc_interface.add(logoarray_pc[3]);
        pc_interface.add(logoarray_pc[4]);

        user_interface = new JPanel(); // yine pencere düzenlemerleri
        user_interface.setBounds(515, 212, 185, 239);
        user_interface.setBackground(Color.black);
        user_interface.setLayout(null);
        user_interface.add(user_interface_title);
        user_interface.add(user_interface_item_name);
        user_interface.add(logoarray[0]);
        user_interface.add(logoarray[1]);
        user_interface.add(logoarray[2]);
        user_interface.add(logoarray[3]);
        user_interface.add(logoarray[4]);

        damage_interface = new JPanel(); // yine pencere düzenlemerleri
        damage_interface.setBounds(269, 294, 242, 79);
        damage_interface.setBackground(Color.black);
        damage_interface.setLayout(null);
        damage_interface.add(damage_interface_given_value);
        damage_interface.add(damage_interface_taken_value);
        damage_interface.add(damage_interface_taken_name);
        damage_interface.add(damage_interface_given_name);

        round_interface = new JPanel(); // yine pencere düzenlemerleri
        round_interface.setBounds(279, 134, 243, 39);
        round_interface.setBackground(Color.black);
        round_interface.setLayout(null);
        round_interface.add(round_interface_title);
        round_interface.add(round_interface_count);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // burada en dıştaki asıl penceremizi özelleştiriyoruz
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(0, 0, 0));
        this.setBounds(522, 196, 800, 800);
        this.setSize(800, 800);
        this.setLayout(null);

        this.add(title); // şimdi oluşturduğumuz ok kadar pencere yazıyı asıl ana ekran penceremize
                         // yerleştırıyirouz
        this.add(slot_1);
        this.add(slot_2);
        this.add(slot_3);
        this.add(slot_4);
        this.add(slot_5);
        this.add(pc_interface);
        this.add(user_interface);
        this.add(round_interface);
        this.add(damage_interface);
        this.add(player_Name);
        this.setVisible(true);// görünürlüğünü açıyoruz
    }

    @Override // burada buttonlara tıklanıldığında yapılacak işlemler olacak
    public void actionPerformed(ActionEvent e) {
        logoarray_pc[r].setVisible(false);
        if (e.getSource() == but1) { // buton 1 e tıkladığımızda 
            r = random.nextInt(5);
            int flag = 0;
            while (items_pc[r].Health <= 0) {
                for (int i = 0; i < 4; i++) {
                    if (items_pc[i].Health > 0)
                        flag = 1;
                }
                if (flag == 0) {
                    System.out.println("------THE END --------");
                    return;
                }
                r = random.nextInt(5);
            }

            items[0].damage_take(items,items_pc,r,0);
            items_pc[r].damage_take(items,items_pc,0,r);

            System.out.println("pc nin sectigi kart" + r + "yani su elemana denk geliyor " + items_pc[r].eternity
                    + " pc nin cani " + items_pc[r].Health);

            if (items[0].Health <= 0) {
                items_pc[r].xp += 20;
            }
            if (items_pc[r].xp >= 30) {
                if (items_pc[r].eternity == 2) {
                    logoarray_pc[r].setIcon(stone_button2);
                } else if (items_pc[r].eternity == 3) {
                    logoarray_pc[r].setIcon(paper_button2);
                } else if (items_pc[r].eternity == 4) {
                    logoarray_pc[r].setIcon(scissors_button2);
                }
                items_pc[r].level += 1;
                items_pc[r].speciality[0][1] = 2;
                items_pc[r].speciality[1][1] = 2;
                items_pc[r].speciality[2][1] = 2;
            }

            if (items[0].Health <= 0) {
                items[0].xp += 20;
            }
            if (items[0].xp >= 30) {
                if (items[0].eternity == 2) {
                    but_array[0].setIcon(stone_button2);
                    logoarray[0].setIcon(stone_button2);
                } else if (items[0].eternity == 3) {
                    but_array[0].setIcon(paper_button2);
                    logoarray[0].setIcon(paper_button2);
                } else if (items[0].eternity == 4) {
                    but_array[0].setIcon(scissors_button2);
                    logoarray[0].setIcon(scissors_button2);
                }
                items[0].level += 1;
                items[0].speciality[0][1] = 2;
                items[0].speciality[1][1] = 2;
                items[0].speciality[2][1] = 2;
            }

            System.out.println(items[0].name);
            pc_interface_item_name.setText("" + items_pc[r].name);
            logoarray_pc[r].setVisible(true);

            user_interface_item_name.setText("" + items[0].name);
            logoarray[1].setVisible(false);
            logoarray[2].setVisible(false);
            logoarray[3].setVisible(false);
            logoarray[4].setVisible(false);
            logoarray[0].setVisible(true);

            stats_values_hp_a.setText("" + items[0].Health);
            stats_values_xp_a.setText("" + items[0].xp);
            stats_values_lvl_a.setText("" + items[0].level);
            damage_interface_taken_value.setText(
                    "" + items_pc[r].damage_give(items[0].speciality, items_pc[r].eternity, items[0].eternity));
            damage_interface_given_value.setText(
                    "" + items[0].damage_give(items_pc[r].speciality, items[0].eternity, items_pc[r].eternity));

            // if (items[0].Health <= 0) {
            //     items_pc[r].xp += 20;
            // }
            if (items_pc[r].xp >= 30) {
                if (items_pc[r].eternity == 2) {

                    logoarray_pc[r].setIcon(stone_button2);
                } else if (items_pc[r].eternity == 3) {

                    logoarray_pc[r].setIcon(paper_button2);
                } else if (items_pc[r].eternity == 4) {

                    logoarray_pc[r].setIcon(scissors_button2);
                }
                items_pc[r].level += 1;
                items_pc[r].speciality[0][1] = 2;
                items_pc[r].speciality[1][1] = 2;
                items_pc[r].speciality[2][1] = 2;
            }
            if (items[0].Health <= 0) {
                but1.setEnabled(false);
                System.out.println("i've been killed");
            }
            roundcount += 1;
            if (roundcount == Integer.parseInt(round1)) {
                items_score = items[0].Health + items[1].Health + items[2].Health + items[3].Health + items[4].Health;
                pc_score = items_pc[0].Health + items_pc[1].Health + items_pc[2].Health + items_pc[3].Health + items_pc[4].Health;
                if (items_score > pc_score) {
                    this.setVisible(false);
                    game_Frame_4 game_Frame_4 = new game_Frame_4(Name, items[0].Health, items_pc[1].Health, items[2].Health,
                            items[3].Health, items[4].Health);
    
                } else if (items_score < pc_score) {
                    this.setVisible(false);
                    game_Frame_4 game_Frame_4 = new game_Frame_4("PC", items_pc[0].Health, items_pc[1].Health, items_pc[2].Health,
                            items_pc[3].Health, items_pc[4].Health);
                } else {
                    this.setVisible(false);
                    game_Frame_4 game_Frame_4 = new game_Frame_4("TIE", 0, 0, 0, 0, 0);
                }
            }
            round_interface_count.setText("" + roundcount);
        }

        else if (e.getSource() == but2) { // buton 2 e tıkladığımızda
            logoarray_pc[r].setVisible(false);
            r = random.nextInt(5);
            int flag = 0;
            while (items_pc[r].Health <= 0) {
                for (int i = 0; i < 4; i++) {
                    if (items_pc[i].Health > 0)
                        flag = 1;
                }
                if (flag == 0) {
                    System.out.println("------THE END --------");
                    return;
                }
                r = random.nextInt(5);
            }

            items[1].damage_take(items,items_pc,r,1);
            items_pc[r].damage_take(items,items_pc,1,r);



            System.out.println("pc nin sectigi kart" + r + "yani su elemana denk geliyor " + items_pc[r].eternity
                    + " pc nin canı " + items_pc[r].Health);

            if (items[1].Health <= 0) {
                items_pc[r].xp += 20;
            }
            if (items_pc[r].xp >= 30) {
                if (items_pc[r].eternity == 2) {

                    logoarray_pc[r].setIcon(stone_button2);
                } else if (items_pc[r].eternity == 3) {

                    logoarray_pc[r].setIcon(paper_button2);
                } else if (items_pc[r].eternity == 4) {

                    logoarray_pc[r].setIcon(scissors_button2);
                }
                items_pc[r].level += 1;
                items_pc[r].speciality[0][1] = 2;
                items_pc[r].speciality[1][1] = 2;
                items_pc[r].speciality[2][1] = 2;
            }
            if (items_pc[r].Health <= 0) {
                items[1].xp += 20;
            }
            if (items[1].xp >= 30) {
                if (items[1].eternity == 2) {
                    but_array[1].setIcon(stone_button2);
                    logoarray[1].setIcon(stone_button2);
                }
                if (items[1].eternity == 3) {
                    but_array[1].setIcon(paper_button2);
                    logoarray[1].setIcon(paper_button2);
                }
                if (items[1].eternity == 4) {
                    but_array[1].setIcon(scissors_button2);
                    logoarray[1].setIcon(scissors_button2);
                }
                items[1].level += 1;
                items[1].speciality[0][1] = 2;
                items[1].speciality[1][1] = 2;
                items[1].speciality[2][1] = 2;
            }

            pc_interface_item_name.setText("" + items_pc[r].name);
            logoarray_pc[r].setVisible(true);

            user_interface_item_name.setText("" + items[1].name);
            logoarray[0].setVisible(false);
            logoarray[2].setVisible(false);
            logoarray[3].setVisible(false);
            logoarray[4].setVisible(false);
            logoarray[1].setVisible(true);

            stats_values_hp_b.setText("" + items[1].Health);
            stats_values_xp_b.setText("" + items[1].xp);
            stats_values_lvl_b.setText("" + items[1].level);
            damage_interface_taken_value.setText(
                    "" + items_pc[r].damage_give(items[1].speciality, items_pc[r].eternity, items[1].eternity));
            damage_interface_given_value.setText(
                    "" + items[1].damage_give(items_pc[r].speciality, items[1].eternity, items_pc[r].eternity));
            if (items[1].Health <= 0) {
                but2.setEnabled(false);
            }
            roundcount += 1;
            if (roundcount == Integer.parseInt(round1)) {
                items_score = items[0].Health + items[1].Health + items[2].Health + items[3].Health + items[4].Health;
                pc_score = items_pc[0].Health + items_pc[1].Health + items_pc[2].Health + items_pc[3].Health + items_pc[4].Health;
                if (items_score > pc_score) {
                    this.setVisible(false);
                    game_Frame_4 game_Frame_4 = new game_Frame_4(Name, items[0].Health, items_pc[1].Health, items[2].Health,
                            items[3].Health, items[4].Health);
    
                } else if (items_score < pc_score) {
                    this.setVisible(false);
                    game_Frame_4 game_Frame_4 = new game_Frame_4("PC", items_pc[0].Health, items_pc[1].Health, items_pc[2].Health,
                            items_pc[3].Health, items_pc[4].Health);
                } else {
                    this.setVisible(false);
                    game_Frame_4 game_Frame_4 = new game_Frame_4("TIE", 0, 0, 0, 0, 0);
                }
            }
            round_interface_count.setText("" + roundcount);
        } else if (e.getSource() == but3) { // buton 3 e tıkladığımızda
            logoarray_pc[r].setVisible(false);
            r = random.nextInt(5);
            int flag = 0;
            while (items_pc[r].Health <= 0) {
                for (int i = 0; i < 4; i++) {
                    if (items_pc[i].Health > 0)
                        flag = 1;
                }
                if (flag == 0) {
                    System.out.println("------THE END --------");
                    return;
                }
                r = random.nextInt(5);
            }
            items[2].damage_take(items,items_pc,r,2);
            items_pc[r].damage_take(items,items_pc,2,r);



            System.out.println("pc nin sectigi kart" + r + "yani su elemana denk geliyor " + items_pc[r].eternity
                    + " pc nin canı " + items_pc[r].Health);

            if (items[2].Health <= 0) {
                items_pc[r].xp += 20;
            }
            if (items_pc[r].xp >= 30) {
                if (items_pc[r].eternity == 2) {

                    logoarray_pc[r].setIcon(stone_button2);
                } else if (items_pc[r].eternity == 3) {

                    logoarray_pc[r].setIcon(paper_button2);
                } else if (items_pc[r].eternity == 4) {

                    logoarray_pc[r].setIcon(scissors_button2);
                }
                items_pc[r].level += 1;
                items_pc[r].speciality[0][1] = 2;
                items_pc[r].speciality[1][1] = 2;
                items_pc[r].speciality[2][1] = 2;
            }
            if (items_pc[r].Health <= 0) {
                items[2].xp += 20;
            }
            if (items[2].xp >= 30) {
                if (items[2].eternity == 2) {
                    but_array[2].setIcon(stone_button2);
                    logoarray[2].setIcon(stone_button2);
                }
                if (items[2].eternity == 3) {
                    but_array[2].setIcon(paper_button2);
                    logoarray[2].setIcon(paper_button2);
                }
                if (items[2].eternity == 4) {
                    but_array[2].setIcon(scissors_button2);
                    logoarray[2].setIcon(scissors_button2);
                }
                items[2].level += 1;
                items[2].speciality[0][1] = 2;
                items[2].speciality[1][1] = 2;
                items[2].speciality[2][1] = 2;
            }

            pc_interface_item_name.setText("" + items_pc[r].name);
            logoarray_pc[r].setVisible(true);

            user_interface_item_name.setText("" + items_pc[2].name);
            logoarray[0].setVisible(false);
            logoarray[1].setVisible(false);
            logoarray[3].setVisible(false);
            logoarray[4].setVisible(false);
            logoarray[2].setVisible(true);

            stats_values_hp_c.setText("" + items[2].Health);
            stats_values_xp_c.setText("" + items[2].xp);
            stats_values_lvl_c.setText("" + items[2].level);
            damage_interface_taken_value.setText(
                    "" + items_pc[r].damage_give(items[2].speciality, items_pc[r].eternity, items[2].eternity));
            damage_interface_given_value.setText(
                    "" + items[2].damage_give(items_pc[r].speciality, items[2].eternity, items_pc[r].eternity));
            if (items[2].Health <= 0) {
                but3.setEnabled(false);
            }
            roundcount += 1;
            if (roundcount == Integer.parseInt(round1)) {
                items_score = items[0].Health + items[1].Health + items[2].Health + items[3].Health + items[4].Health;
                pc_score = items_pc[0].Health + items_pc[1].Health + items_pc[2].Health + items_pc[3].Health + items_pc[4].Health;
                if (items_score > pc_score) {
                    this.setVisible(false);
                    game_Frame_4 game_Frame_4 = new game_Frame_4(Name, items[0].Health, items_pc[1].Health, items[2].Health,
                            items[3].Health, items[4].Health);
    
                } else if (items_score < pc_score) {
                    this.setVisible(false);
                    game_Frame_4 game_Frame_4 = new game_Frame_4("PC", items_pc[0].Health, items_pc[1].Health, items_pc[2].Health,
                            items_pc[3].Health, items_pc[4].Health);
                } else {
                    this.setVisible(false);
                    game_Frame_4 game_Frame_4 = new game_Frame_4("TIE", 0, 0, 0, 0, 0);
                }
            }
            round_interface_count.setText("" + roundcount);
        } else if (e.getSource() == but4) { // buton 4 e tıkladığımızda
            logoarray_pc[r].setVisible(false);
            r = random.nextInt(5);
            int flag = 0;
            while (items_pc[r].Health <= 0) {
                for (int i = 0; i < 4; i++) {
                    if (items_pc[i].Health > 0)
                        flag = 1;
                }
                if (flag == 0) {
                    System.out.println("------THE END --------");
                    return;
                }
                r = random.nextInt(5);
            }

            items[3].damage_take(items,items_pc,r,3);
            items_pc[r].damage_take(items,items_pc,3,r);


            System.out.println("pc nin sectigi kart" + r + "yani su elemana denk geliyor " + items_pc[r].eternity
                    + " pc nin canı " + items_pc[r].Health);

            if (items[3].Health <= 0) {
                items_pc[r].xp += 20;
            }
            if (items_pc[r].xp >= 30) {
                if (items_pc[r].eternity == 2) {

                    logoarray_pc[r].setIcon(stone_button2);
                } else if (items_pc[r].eternity == 3) {

                    logoarray_pc[r].setIcon(paper_button2);
                } else if (items_pc[r].eternity == 4) {

                    logoarray_pc[r].setIcon(scissors_button2);
                }
                items_pc[r].level += 1;
                items_pc[r].speciality[0][1] = 2;
                items_pc[r].speciality[1][1] = 2;
                items_pc[r].speciality[2][1] = 2;
            }
            if (items_pc[r].Health <= 0) {
                items[3].xp += 20;
            }
            if (items[3].xp >= 30) {
                if (items[3].eternity == 2) {
                    but_array[3].setIcon(stone_button2);
                    logoarray[3].setIcon(stone_button2);
                }
                if (items[3].eternity == 3) {
                    but_array[3].setIcon(paper_button2);
                    logoarray[3].setIcon(paper_button2);
                }
                if (items[3].eternity == 4) {
                    but_array[3].setIcon(scissors_button2);
                    logoarray[3].setIcon(scissors_button2);
                }
                items[3].level += 1;
                items[3].speciality[0][1] = 2;
                items[3].speciality[1][1] = 2;
                items[3].speciality[2][1] = 2;
            }

            pc_interface_item_name.setText("" + items_pc[r].name);
            logoarray_pc[r].setVisible(true);

            user_interface_item_name.setText("" + items[3].name);
            logoarray[0].setVisible(false);
            logoarray[1].setVisible(false);
            logoarray[2].setVisible(false);
            logoarray[4].setVisible(false);
            logoarray[3].setVisible(true);

            stats_values_hp_d.setText("" + items[3].Health);
            stats_values_xp_d.setText("" + items[3].xp);
            stats_values_lvl_d.setText("" + items[3].level);
            damage_interface_taken_value.setText(
                    "" + items_pc[r].damage_give(items[3].speciality, items_pc[r].eternity, items[3].eternity));
            damage_interface_given_value.setText(
                    "" + items[3].damage_give(items_pc[r].speciality, items[3].eternity, items_pc[r].eternity));
            if (items[3].Health <= 0) {
                but4.setEnabled(false);
            }
            roundcount += 1;
            if (roundcount == Integer.parseInt(round1)) {
                items_score = items[0].Health + items[1].Health + items[2].Health + items[3].Health + items[4].Health;
                pc_score = items_pc[0].Health + items_pc[1].Health + items_pc[2].Health + items_pc[3].Health + items_pc[4].Health;
                if (items_score > pc_score) {
                    this.setVisible(false);
                    game_Frame_4 game_Frame_4 = new game_Frame_4(Name, items[0].Health, items_pc[1].Health, items[2].Health,
                            items[3].Health, items[4].Health);
    
                } else if (items_score < pc_score) {
                    this.setVisible(false);
                    game_Frame_4 game_Frame_4 = new game_Frame_4("PC", items_pc[0].Health, items_pc[1].Health, items_pc[2].Health,
                            items_pc[3].Health, items_pc[4].Health);
                } else {
                    this.setVisible(false);
                    game_Frame_4 game_Frame_4 = new game_Frame_4("TIE", 0, 0, 0, 0, 0);
                }
            }
            round_interface_count.setText("" + roundcount);
        } else { // buton 5 e tıkladığımızda
            logoarray_pc[r].setVisible(false);
            r = random.nextInt(5);
            int flag = 0;
            while (items_pc[r].Health <= 0) {
                for (int i = 0; i < 4; i++) {
                    if (items_pc[i].Health > 0)
                        flag = 1;
                }
                if (flag == 0) {
                    System.out.println("------THE END --------");
                    return;
                }
                r = random.nextInt(5);
            }

            items[4].damage_take(items,items_pc,r,4);
            items_pc[r].damage_take(items,items_pc,4,r);



            System.out.println("pc nin sectigi kart" + r + "yani su elemana denk geliyor " + items_pc[r].eternity
                    + " pc nin canı " + items_pc[r].Health);

            if (items[4].Health <= 0) {
                items_pc[r].xp += 20;
            }
            if (items_pc[r].xp >= 30) {
                if (items_pc[r].eternity == 2) {

                    logoarray_pc[r].setIcon(stone_button2);
                } else if (items_pc[r].eternity == 3) {

                    logoarray_pc[r].setIcon(paper_button2);
                } else if (items_pc[r].eternity == 4) {

                    logoarray_pc[r].setIcon(scissors_button2);
                }
                items_pc[r].level += 1;
                items_pc[r].speciality[0][1] = 2;
                items_pc[r].speciality[1][1] = 2;
                items_pc[r].speciality[2][1] = 2;
            }
            if (items_pc[r].Health <= 0) {
                items[4].xp += 20;
            }
            if (items[4].xp >= 30) {
                if (items[4].eternity == 2) {
                    but_array[4].setIcon(stone_button2);
                    logoarray[4].setIcon(stone_button2);
                } else if (items[4].eternity == 3) {
                    but_array[4].setIcon(paper_button2);
                    logoarray[4].setIcon(paper_button2);
                } else if (items[4].eternity == 4) {
                    but_array[4].setIcon(scissors_button2);
                    logoarray[4].setIcon(scissors_button2);
                }
                items[4].level += 1;
                items[4].speciality[0][1] = 2;
                items[4].speciality[1][1] = 2;
                items[4].speciality[2][1] = 2;
            }

            pc_interface_item_name.setText("" + items_pc[r].name);
            logoarray_pc[r].setVisible(true);

            user_interface_item_name.setText("" + items[4].name);
            logoarray[0].setVisible(false);
            logoarray[1].setVisible(false);
            logoarray[2].setVisible(false);
            logoarray[3].setVisible(false);
            logoarray[4].setVisible(true);

            stats_values_hp_e.setText("" + items[4].Health);
            stats_values_xp_e.setText("" + items[4].xp);
            stats_values_lvl_e.setText("" + items[4].level);
            damage_interface_taken_value.setText(
                    "" + items_pc[r].damage_give(items[4].speciality, items_pc[r].eternity, items[4].eternity));
            damage_interface_given_value.setText(
                    "" + items[4].damage_give(items_pc[r].speciality, items[4].eternity, items_pc[r].eternity));
            if (items[4].Health <= 0) {
                but5.setEnabled(false);
            }
            roundcount += 1;
            if (roundcount == Integer.parseInt(round1)) {
                items_score = items[0].Health + items[1].Health + items[2].Health + items[3].Health + items[4].Health;
                pc_score = items_pc[0].Health + items_pc[1].Health + items_pc[2].Health + items_pc[3].Health + items_pc[4].Health;
                if (items_score > pc_score) {
                    this.setVisible(false);
                    game_Frame_4 game_Frame_4 = new game_Frame_4(Name, items[0].Health, items_pc[1].Health, items[2].Health,
                            items[3].Health, items[4].Health);
    
                } else if (items_score < pc_score) {
                    this.setVisible(false);
                    game_Frame_4 game_Frame_4 = new game_Frame_4("PC", items_pc[0].Health, items_pc[1].Health, items_pc[2].Health,
                            items_pc[3].Health, items_pc[4].Health);
                } else {
                    this.setVisible(false);
                    game_Frame_4 game_Frame_4 = new game_Frame_4("TIE", 0, 0, 0, 0, 0);
                }
            }
            round_interface_count.setText("" + roundcount);
        }
    }
}