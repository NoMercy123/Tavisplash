package sourse;

import com.melloware.jintellitype.HotkeyListener;
import com.melloware.jintellitype.JIntellitype;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
import javax.swing.JTree;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * @author Den
 */
public class TaviConfig {

    static JLabel path = new JLabel("Чеширский кот");
    static JLabel colormark = new JLabel("Металлик");
    static JLabel frasemark = new JLabel("<default>");
    static JLabel Tavi = new JLabel(new ImageIcon("D:/Data/Чеширский кот.png"));
    static JFrame splash = new JFrame("Tavi");
    static JTextArea text = new JTextArea();
    static String frase[];
    static int id = 1;
    static int it = 0;
    static int kf = 0;
    static int time = 0;
    static boolean flag = true;
       static boolean isOnTimer = false;
    static JLabel background = new JLabel(new ImageIcon("D:/Data/metall.png"));
    static JLabel label = new JLabel(new ImageIcon("D:/Data/text.png"));

    public static void main(String[] args) throws FileNotFoundException, IOException {
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
        final JFrame fraseframe = new JFrame("FraseConfig");
        final JFrame settingsFrame = new JFrame("Settings");
        Font font = new Font("Comic Sans MS", Font.PLAIN, 14);
        JLabel color = new JLabel("Цвет: ");
        final JLabel fraselabel = new JLabel("Фразы: ");
        JLabel skin = new JLabel("Скин: ");
        JButton run = new JButton("Готово");
        JButton Exit = new JButton("Выход");
        JButton Back = new JButton("Готово");
        JButton Back4Config = new JButton("Готово");
        JButton Me = new JButton("OldTeaOwl");
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
        JMenuItem fraselist1 = new JMenuItem("Список 1");
        JMenuItem fraselist2 = new JMenuItem("Список 2");
        JMenuItem fraselist3 = new JMenuItem("Список 3");
        JMenuItem fraselist4 = new JMenuItem("Список 4");
        JMenuItem fraselist5 = new JMenuItem("Список 5");
        JMenuItem D2 = new JMenuItem("2D");
        JMenuItem HarryPotter = new JMenuItem("Гарри Поттер");
        JMenuItem DipperPines = new JMenuItem("Диппер Пайнс");
        JMenuItem Totoro = new JMenuItem("Тоторо");
        JMenuItem Alphis = new JMenuItem("Альфис");
        JMenuItem Cheshier = new JMenuItem("Чеширский кот");
        JMenuItem Octavia = new JMenuItem("Октавия");
        JTextArea abouttext = new JTextArea();
        JTextArea ConfigfFrase = new JTextArea();
        final DefaultMutableTreeNode Root = new DefaultMutableTreeNode("Настройки");
        final DefaultMutableTreeNode setFrase = new DefaultMutableTreeNode("Изменить список фраз");
        final DefaultMutableTreeNode frase1 = new DefaultMutableTreeNode("Список1");
        final DefaultMutableTreeNode frase2 = new DefaultMutableTreeNode("Список2");
        final DefaultMutableTreeNode frase3 = new DefaultMutableTreeNode("Список3");
        final DefaultMutableTreeNode frase4 = new DefaultMutableTreeNode("Список4");
        final DefaultMutableTreeNode frase5 = new DefaultMutableTreeNode("Список5");
        final JTree tree = new JTree(Root);
                        final DefaultMutableTreeNode StateRoot = new DefaultMutableTreeNode("Режим");
                        final DefaultMutableTreeNode state1 = new DefaultMutableTreeNode("По хоткею");
                        final DefaultMutableTreeNode state2 = new DefaultMutableTreeNode("По таймеру");
        final Timer timer = new Timer(time, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                    it++;
                    if (it > kf) {
                        System.exit(0);
                    }
                    text.setText(frase[it]);
                    for (float i = 0; i < 1; i += 0.1f) {
                        SplashVoid(i, 50);
                    }
                    SplashVoid(1, 2500);
                    for (float i = 1; i > 0; i -= 0.1f) {
                        SplashVoid(i, 50);
                    }
                    SplashVoid(0, 0);
            }
        });

        tree.addTreeSelectionListener(new TreeSelectionListener() {

            public void valueChanged(TreeSelectionEvent e) {
                if (tree.getLastSelectedPathComponent() == frase1) {
                    SetText.file = "list1";
                    settingsFrame.setVisible(false);
                    new SetText();
                }
                if (tree.getLastSelectedPathComponent() == frase2) {
                    SetText.file = "list2";
                    settingsFrame.setVisible(false);
                    new SetText();

                }
                if (tree.getLastSelectedPathComponent() == frase3) {
                    SetText.file = "list3";
                    settingsFrame.setVisible(false);
                    new SetText();

                }
                if (tree.getLastSelectedPathComponent() == frase4) {
                    SetText.file = "list4";
                    settingsFrame.setVisible(false);
                    new SetText();

                }
                if (tree.getLastSelectedPathComponent() == frase5) {
                    SetText.file = "list5";
                    settingsFrame.setVisible(false);
                    new SetText();

                }
                if (tree.getLastSelectedPathComponent() == state1) {
                    isOnTimer = false;
                    settingsFrame.setVisible(false);
                }

                if (tree.getLastSelectedPathComponent() == state2) {
                    isOnTimer = true;
                    time = 1000*Integer.parseInt(JOptionPane.showInputDialog("Введите шаг таймера (сек)"));
                    settingsFrame.setVisible(false);
                }
            }
        });

        Exit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        run.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                setWindowsLaF();
                config.setVisible(false);
                try {
                    TavisplashRun();
                    if (isOnTimer){timer.start();}
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TaviConfig.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(TaviConfig.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

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

        Back4Config.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                fraseframe.setVisible(false);
                fraseframe.repaint();
            }
        });

        frasemenu.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                fraseframe.setVisible(true);
                fraseframe.repaint();
            }
        });

        settings.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                settingsFrame.setVisible(true);
                settingsFrame.repaint();
            }
        });

        setBackground(green, "Природа");
        setBackground(metallic, "Металлик");
        setBackground(pink, "Сакура");
        setBackground(yellow, "Жёлтый");
        setSkin(D2, "2D");
        setSkin(HarryPotter, "Гарри Поттер");
        setSkin(DipperPines, "Диппер Пайнс");
        setSkin(Totoro, "Тоторо");
        setSkin(Alphis, "Альфис");
        setSkin(Cheshier, "Чеширский кот");
        setSkin(Octavia, "Октавия");
        setList(fraselist1, "list1");
        setList(fraselist2, "list2");
        setList(fraselist3, "list3");
        setList(fraselist4, "list4");
        setList(fraselist5, "list5");
        Me.setBounds(320, 18, 120, 20);
        project.setBounds(10, 10, 200, 300);
        Back.setBounds(200, 325, 80, 40);
        abouttext.setBounds(220, 10, 250, 300);
        ConfigfFrase.setBounds(220, 10, 250, 300);
        how2use.setBounds(247, 143, 150, 20);
        Tavi.setBounds(230, 10, 150, 150);
        test.setBounds(0, 0, 400, 20);
        path.setBounds(70, 65, 120, 20);
        colormark.setBounds(70, 40, 120, 20);
        frasemark.setBounds(70, 90, 120, 20);
        run.setBounds(10, 130, 100, 30);
        Exit.setBounds(120, 130, 80, 30);
        color.setBounds(10, 40, 120, 20);
        fraselabel.setBounds(10, 90, 120, 20);
        skin.setBounds(10, 65, 120, 20);
        color.setFont(font);
        fraselabel.setFont(font);
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
        ConfigfFrase.setLineWrap(true);
        ConfigfFrase.setWrapStyleWord(true);
        how2use.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        abouttext.setText("Разработчик: "
                + "\nНазвание: Tavisplash"
                + "\nДата создания: 22.05.16, 23:54"
                + "\nЯзык: Русский"
                + "\n\nОписание: Простая бесплатная утилита."
                + " Её цель - демонстрация заметок в реальном времени по нажатию "
                + "клавиш Cntr+Spase, или по таймеру. Можно использовать в процессе "
                + "видеозахвата при создании роликов.");
                Root.add(setFrase);
        Root.add(StateRoot);
        StateRoot.add(state1);
        StateRoot.add(state2);
        setFrase.add(frase1);
        setFrase.add(frase2);
        setFrase.add(frase3);
        setFrase.add(frase4);
        setFrase.add(frase5);
        settingsFrame.add(tree);
        frasemenu.add(fraselist1);
        frasemenu.add(fraselist2);
        frasemenu.add(fraselist3);
        frasemenu.add(fraselist4);
        frasemenu.add(fraselist5);
        colormenu.add(pink);
        colormenu.add(metallic);
        colormenu.add(green);
        colormenu.add(yellow);
        skinmenu.add(D2);
        skinmenu.add(DipperPines);
        skinmenu.add(HarryPotter);
        skinmenu.add(Totoro);
        skinmenu.add(Alphis);
        skinmenu.add(Cheshier);
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
        config.add(fraselabel);
        config.add(skin);
        aboutframe.add(Me);
        aboutframe.add(abouttext);
        aboutframe.add(project);
        aboutframe.add(Back);
        aboutframe.setResizable(false);
        aboutframe.setLayout(null);
        aboutframe.setVisible(false);
        settingsFrame.setBounds((hor - 200) / 2, (vert - 200) / 2, 200, 200);
        settingsFrame.setResizable(false);
        aboutframe.setBounds((hor - 500) / 2, (vert - 400) / 2, 500, 400);
        fraseframe.setResizable(false);
        fraseframe.setLayout(null);
        fraseframe.setVisible(false);
        fraseframe.setBounds((hor - 500) / 2, (vert - 400) / 2, 500, 400);
        config.setBounds((hor - 400) / 2, (vert - 200) / 2, 400, 200);
        config.setLayout(null);
        config.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        config.setResizable(false);
        config.setVisible(true);
    }

    public static void setBackground(JMenuItem item, final String name) {
        item.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                background.setIcon(new ImageIcon("D:/Data/" + name + ".png"));
                colormark.setText(name);
            }
        });
    }

    public static void setSkin(JMenuItem item, final String name) {
        item.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Tavi.setIcon(new ImageIcon("D:/Data/" + name + ".png"));
                path.setText(name);
            }
        });
    }

    public static void setList(JMenuItem item, final String doc) {
        item.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    BufferedReader reader = new BufferedReader(new FileReader("D:/Data/" + doc + ".txt"));
                    BufferedReader tester = new BufferedReader(new FileReader("D:/Data/" + doc + ".txt"));

                    try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter("D:/Data/test.txt"));
                        while (tester.readLine() != null) {
                            writer.write(reader.readLine() + "\n");
                        }
                        writer.close();
                    } catch (IOException ex) {
                        Logger.getLogger(TaviConfig.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TaviConfig.class.getName()).log(Level.SEVERE, null, ex);
                }
                frasemark.setText("<" + doc + ">");
            }
        });
    }

    public static void TavisplashRun() throws FileNotFoundException, IOException {
        setWindowsLaF();
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        int vert = sSize.height;
        int hor = sSize.width;
        BufferedReader reader = new BufferedReader(new FileReader("D:/Data/test.txt"));
        BufferedReader reader1 = new BufferedReader(new FileReader("D:/Data/test.txt"));
        String say2 = null;
        while (reader.readLine() != null) {
            kf++;
        }
        frase = new String[kf + 1];
        for (int i = 0; i < kf; i++) {
            frase[i] = reader1.readLine();
            System.out.println(frase[i]);
        }
        text.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
        text.setEditable(false);
        text.setEnabled(false);
        text.setDisabledTextColor(Color.BLACK);
        text.setBounds(30, 35, 260, 60);
        text.setLineWrap(true);
        text.setOpaque(false);
        text.setWrapStyleWord(true);
        background.setSize(400, 150);
        Tavi.setBounds(290, 10, 90, 90);
        label.setBounds(15, 10, 50, 20);
        text.setText(frase[it]);
        splash.add(text);
        splash.add(Tavi);
        splash.add(label);
        splash.add(background);
        splash.setUndecorated(true);
        splash.setOpacity(0);
        splash.setBounds(hor - 401, vert - 141, 400, 100);
        splash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        splash.setFocusable(true);
        splash.setAlwaysOnTop(true);
        splash.setVisible(true);
        final int id = 1;
        JIntellitype.setLibraryLocation("D:/Data/jintellitype/JIntellitype.dll");
        JIntellitype.getInstance().registerHotKey(id, JIntellitype.MOD_CONTROL, KeyEvent.VK_SPACE);
        JIntellitype.getInstance().addHotKeyListener(new HotkeyListener() {
            public void onHotKey(int in) {
                if (id == in) {
                    it++;
                    if (it > kf) {
                        System.exit(0);
                    }
                    text.setText(frase[it]);
                    for (float i = 0; i < 1; i += 0.1f) {
                        SplashVoid(i, 50);
                    }
                    SplashVoid(1, 2500);
                    for (float i = 1; i > 0; i -= 0.1f) {
                        SplashVoid(i, 50);
                    }
                    SplashVoid(0, 0);
                }
            }
        });
    }

    static void SplashVoid(float opacity, int sleep) {
        try {
            splash.setOpacity(opacity);
            Thread.currentThread().sleep(sleep);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void setWindowsLaF() {
        try {
            UIManager.setLookAndFeel(new com.sun.java.swing.plaf.windows.WindowsLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TaviConfig.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
