package sourse;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import sun.font.Font2D;

/**
 * @author OldTeaOwl
 */
public class Tavisplash {
static JFrame splash = new JFrame("Tavi");
    public static void main(String[] args) {
Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
int vert = sSize.height;
int hor = sSize.width;
JLabel background = new JLabel(new ImageIcon("D:/Data/metall.png"));
JLabel Tavi = new JLabel(new ImageIcon("D:/Data/OctaviaSmall1.png"));
JLabel label = new JLabel(new ImageIcon("D:/Data/text.png"));
JTextArea text = new JTextArea();
//text.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 14));
text.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
text.setAlignmentY(JTextArea.CENTER_ALIGNMENT);
text.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
text.setEditable(false);
text.setEnabled(false);
text.setDisabledTextColor(Color.BLACK);
text.setBounds(30,35,260,50);
text.setLineWrap(true);
text.setOpaque(false);
text.setWrapStyleWord(true);
text.setText("Привет! Я - Октавия, мы с Профессором сегодня расскажем тебе много интересного, наслаждайся!^^");
background.setSize(400,150);
Tavi.setBounds(305,10,90,90);
label.setBounds(15,10,50,20);
splash.add(text);
splash.add(Tavi);
splash.add(label);
splash.add(background);
splash.setUndecorated(true);
splash.setOpacity(0);
splash.setBounds(hor-401,vert-141,400,100);
splash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
splash.setFocusable(true);
splash.setAlwaysOnTop(true);
splash.setVisible(true);
SplashVoid();
    }
         static void SplashVoid(){
        try {
            splash.setOpacity(0.1f);
            Thread.currentThread().sleep(50);
            splash.setOpacity(0.2f);
            Thread.currentThread().sleep(50);
            splash.setOpacity(0.3f);
            Thread.currentThread().sleep(50);
            splash.setOpacity(0.4f);
            Thread.currentThread().sleep(50);
            splash.setOpacity(0.5f);
            Thread.currentThread().sleep(50);
            splash.setOpacity(0.6f);
            Thread.currentThread().sleep(50);
            splash.setOpacity(0.7f);
            Thread.currentThread().sleep(50);
            splash.setOpacity(0.8f);
            Thread.currentThread().sleep(50);
            splash.setOpacity(0.9f);
            Thread.currentThread().sleep(50);
            splash.setOpacity(1f);
            Thread.currentThread().sleep(7000);
            splash.setOpacity(0.9f);
            Thread.currentThread().sleep(50);
            splash.setOpacity(0.8f);
            Thread.currentThread().sleep(50);
            splash.setOpacity(0.7f);
            Thread.currentThread().sleep(50);
            splash.setOpacity(0.6f);
            Thread.currentThread().sleep(50);
            splash.setOpacity(0.5f);
            Thread.currentThread().sleep(50);
            splash.setOpacity(0.4f);
            Thread.currentThread().sleep(50);
            splash.setOpacity(0.3f);
            Thread.currentThread().sleep(50);
            splash.setOpacity(0.2f);
            Thread.currentThread().sleep(50);
            splash.setOpacity(0.1f);
            Thread.currentThread().sleep(50);
            splash.setOpacity(0);
              System.exit(0);
        } catch (InterruptedException ex) {
        ex.printStackTrace();
        }
        }
}
/*
 окно implements AWTEventListener
public void eventDispatched(AWTEvent event)
{
KeyEvent ke = (KeyEvent)event;
if(ke.getID() == KeyEvent.KEY_PRESSED)
{
 */