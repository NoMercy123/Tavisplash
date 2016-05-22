package sourse;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

/**
* @author Den
*/
public class TaviConfig {
public static void main(String[] args) {
try {
javax.swing.LookAndFeel alloyLnF = new com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel();
UIManager.setLookAndFeel(alloyLnF);
} catch (UnsupportedLookAndFeelException e) {
JOptionPane.showMessageDialog(null, "Error in a LaF of executable file");
}
Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
int vert = sSize.height;
int hor = sSize.width;
final JFrame config = new JFrame("Tavisplash Config");
final JFrame aboutframe = new JFrame("About");
Font font = new Font("Comic Sans MS", Font.PLAIN, 14);
JLabel Tavi = new JLabel(new ImageIcon("D:/Data/OctaviaConfig.png"));
JLabel color = new JLabel("Цвет: ");
JLabel frase = new JLabel("Фразы: ");
JLabel skin = new JLabel("Скин: ");
JButton run = new JButton("Готово");
JButton Exit = new JButton("Выход");
JButton Back = new JButton("Готово");
JButton Me = new JButton("OldTeaOwl");
JLabel path = new JLabel("Октавия");
JLabel colormark = new JLabel("Металлик");
JLabel frasemark = new JLabel("<default>");
JLabel how2use = new JLabel("How2Use: Ctrl+Spase");
JLabel project = new JLabel(new ImageIcon("D:/Data/AboutOctavia.png"));
JMenuBar test = new JMenuBar();
JMenu colormenu = new JMenu("Цвет");
JMenu frasemenu = new JMenu("Фразы");
JMenu skinmenu = new JMenu("Скин");
JMenu settings = new JMenu("Настройки");
JMenu about = new JMenu("О программе");
JMenuItem pink = new JMenuItem("Сакура");
JMenuItem metallic = new JMenuItem("Металлик");
JMenuItem green = new JMenuItem("Природа");
JMenuItem yellow = new JMenuItem("Жёлтый");
JMenuItem Twilight = new JMenuItem("Твайлайт Спаркл");
JMenuItem Flattershy = new JMenuItem("Флаттершай");
JMenuItem PinkePie = new JMenuItem("Пинки Пай");
JMenuItem Rarity = new JMenuItem("Рарити");
JMenuItem Applejack = new JMenuItem("Эпплджек");
JMenuItem Raibow = new JMenuItem("Рейнбоу Дэш");
JMenuItem Octavia = new JMenuItem("Октавия");
JTextArea abouttext = new JTextArea();
Exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
System.exit(0);
            }});
run.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
config.setVisible(false);
                try {
                    javax.swing.LookAndFeel alloyLnF = new com.sun.java.swing.plaf.windows.WindowsLookAndFeel();
                    UIManager.setLookAndFeel(alloyLnF);
                    new Tavisplash();
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(TaviConfig.class.getName()).log(Level.SEVERE, null, ex);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TaviConfig.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(TaviConfig.class.getName()).log(Level.SEVERE, null, ex);
                }
            }});
about.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
aboutframe.setVisible(true);
  }
});
Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
aboutframe.setVisible(false);
            }
        });
Me.setBounds(320,18,120,20);
project.setBounds(10,10,200,300);
Back.setBounds(200,325,80,40);
abouttext.setBounds(220,10,250,300);
how2use.setBounds(247,143,150,20);
Tavi.setBounds(230,10,150,150);
test.setBounds(0,0,400,20);
path.setBounds(70,65,120,20);
colormark.setBounds(70,40,120,20);
frasemark.setBounds(70,90,120,20);
run.setBounds(10,130,100,30);
Exit.setBounds(120,130,80,30);
color.setBounds(10,40,120,20);
frase.setBounds(10,90,120,20);
skin.setBounds(10,65,120,20);
color.setFont(font);
frase.setFont(font);
skin.setFont(font);
pink.setFont(font);
path.setFont(font);
colormark.setFont(font);
frasemark.setFont(font);
metallic.setFont(font);
green.setFont(font);
yellow.setFont(font);
abouttext.setFont(font);
abouttext.setEditable(false);
abouttext.setEnabled(false);
abouttext.setLineWrap(true);
abouttext.setWrapStyleWord(true);
abouttext.setDisabledTextColor(Color.black);
project.setBorder(new LineBorder(Color.black));
how2use.setFont(new Font("Times New Roman", Font.PLAIN, 10));
abouttext.setText("Разработчик: "
                + "\nНазвание: Tavisplash"
                + "\nДата создания: 22.05.16, 23:54"
                + "\nЯзык: Русский"
                + "\n\nОписание: Простая бесплатная утилита."
                + " Её цель - демонстрация заметок в реальном времени по нажатию "
                + "клавиш Cntr+Spase, или по таймеру. Можно использовать в процессе "
                + "видеозахвата при создании роликов.");
colormenu.add(pink);
colormenu.add(metallic);
colormenu.add(green);
colormenu.add(yellow);
skinmenu.add(Twilight);
skinmenu.add(PinkePie);
skinmenu.add(Flattershy);
skinmenu.add(Rarity);
skinmenu.add(Applejack);
skinmenu.add(Raibow);
skinmenu.add(Octavia);
test.add(colormenu);
test.add(skinmenu);
test.add(frasemenu);
test.add(settings);
test.add(about);
config.add(how2use);
config.add(Tavi);
config.add(path);
config.add(colormark);
config.add(frasemark);
config.add(test);
config.add(run);
config.add(Exit);
config.add(color);
config.add(frase);
config.add(skin);
aboutframe.add(Me);
aboutframe.add(abouttext);
aboutframe.add(project);
aboutframe.add(Back);
aboutframe.setResizable(false);
aboutframe.setLayout(null);
aboutframe.setVisible(false);
aboutframe.setBounds((hor-500)/2,(vert-400)/2,500,400);
config.setBounds((hor-400)/2,(vert-200)/2,400,200);
config.setLayout(null);
config.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
config.setResizable(false);
config.setVisible(true);
}
}