package sourse;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

/**
 * @author Den
 */
public class SetText {
   static int index = -1;
   static int caret = 0;
   static JLabel buffer = null;
   static JLabel history[] = new JLabel[50];
   static String file = "test";
   static String lasttext;
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
        final JFrame ConfigFrame = new JFrame("Фразы");
        final JDialog TextFrame = new JDialog();
        JPanel border = new JPanel();
        final JPanel content = new JPanel();
        final JScrollPane scroll = new JScrollPane(content);
        final JTextArea text = new JTextArea();
        final JLabel chars = new JLabel("Символов: 0/200");
        JButton Add  = new JButton("Добавить");
        JButton Edit  = new JButton("Изменить");
        JButton Delite  = new JButton("Удалить");
        JButton Back  = new JButton("Назад");
        JButton Save  = new JButton("Сохранить");
        JButton Save2File  = new JButton("Сохранить");
        ConfigFrame.setBounds((hor-600)/2, (vert-300)/2,600,280);
        TextFrame.setBounds((hor-400)/2, (vert-200)/2,400,200);
        border.setBounds(390,20,180,200);
        Add.setBounds(400,30,160,25);
        Edit.setBounds(400,60,160,25);
        Delite.setBounds(400,90,160,25);
        Save2File.setBounds(400,120,160,25);
        Back.setBounds(400,180,160,25);
        content.setBounds(20,20,360,200);
        scroll.setBounds(20,20,360,200);
        text.setBounds(15,30,350,100);
        Save.setBounds(130,133,120,25);
        chars.setBounds(15,5,300,20);
        chars.setFont(new Font(Font.SERIF, Font.PLAIN, 14));
        text.setBackground(Color.lightGray);
        text.setWrapStyleWord(true);
        text.setAutoscrolls(true);
        text.setLineWrap(true);
        Save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        buffer.setText(text.getText());
        text.setText("");
        TextFrame.setVisible(false);
        TextFrame.repaint();
            }
        });
        text.addCaretListener(new CaretListener() {
            public void caretUpdate(CaretEvent e) {
            if(text.getCaretPosition()>caret){caret++;}
            else{caret--;}
            if(caret<=200){lasttext = text.getText();}
            if(caret>200){text.setText(lasttext);}

            chars.setText("Символов: "+(caret+1)+"/200");
            }
        });
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        Add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        addLabel(content, "Фраза"+index);
        ConfigFrame.repaint();
        TextFrame.setVisible(true);
        TextFrame.repaint();
            }
        });

        Edit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text.setText(buffer.getText());
                TextFrame.setVisible(true);
            }
        });

        Save2File.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Write2File(file);
                ConfigFrame.setVisible(false);
            }
        });

        border.setBorder(new LineBorder(Color.gray));
        scroll.setAutoscrolls(true);
        TextFrame.add(Save);
        TextFrame.add(text);
        TextFrame.add(chars);
        ConfigFrame.add(Add);
        ConfigFrame.add(Edit);
        ConfigFrame.add(Delite);
        ConfigFrame.add(Save2File);
        ConfigFrame.add(Back);
        ConfigFrame.add(scroll);
        border.setOpaque(false);
        ConfigFrame.add(border);
        ConfigFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ConfigFrame.setLayout(null);
        TextFrame.setLayout(null);
        content.setLayout(null);
        ConfigFrame.setVisible(true);
    }
    public static void addLabel(JPanel scroll, String name){
    index++;
    final JLabel item = new JLabel(name);
    item.setBounds(5,7+(20*index),320,20);
    item.setBorder(new LineBorder(Color.gray));

    item.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
item.setBorder(new LineBorder(Color.green));
buffer = item;
System.out.println(buffer.getText());
            }
            public void mouseEntered(MouseEvent e) {
item.setBorder(new LineBorder(Color.yellow));
            }

            public void mouseExited(MouseEvent e) {
item.setBorder(new LineBorder(Color.gray));
            }
        });
    buffer = item;
    history[index+1] = item;
    scroll.setLayout(new BoxLayout(scroll, BoxLayout.Y_AXIS));
    scroll.setSize(360, (200+20*index));
    scroll.add(item);
    }
    public static void Write2File(String file){
                        try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter("D:/Data/"+file+".txt"));
                        for(int i = 0; history[i] != null; i++) {
                            System.out.println(history[i].getText());
                            writer.write(history[i].getText() + "\n");
                        }
                        writer.close();
                    } catch (IOException ex) {
                        Logger.getLogger(TaviConfig.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }
}
//Скачать Paint Tool SAI ver(1.2)