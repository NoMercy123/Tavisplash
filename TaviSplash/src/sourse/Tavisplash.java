package sourse;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import com.melloware.jintellitype.*;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author OldTeaOwl
 */

public class Tavisplash {
static JFrame splash = new JFrame("Tavi");
static JTextArea text = new JTextArea();
static String frase[];
static int id = 1;
static int it = 0;
static int kf = 0;
static JLabel background = new JLabel(new ImageIcon("D:/Data/metall.png"));
static JLabel Tavi = new JLabel(new ImageIcon("D:/Data/OctaviaSmall1.png"));
static JLabel label = new JLabel(new ImageIcon("D:/Data/text.png"));

Tavisplash() throws FileNotFoundException, IOException {
                    try {
                    javax.swing.LookAndFeel alloyLnF = new com.sun.java.swing.plaf.windows.WindowsLookAndFeel();
                    UIManager.setLookAndFeel(alloyLnF);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(TaviConfig.class.getName()).log(Level.SEVERE, null, ex);}

Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
int vert = sSize.height;
int hor = sSize.width;
BufferedReader reader = new BufferedReader(new FileReader("D:/Data/test.txt"));
BufferedReader reader1 = new BufferedReader(new FileReader("D:/Data/test.txt"));
String say2 = null;
while(reader.readLine()!= null){kf++;}
frase = new String[kf+1];
for(int i = 0; i<kf; i++){frase[i] = reader1.readLine(); System.out.println(frase[i]);}
text.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
text.setEditable(false);
text.setEnabled(false);
text.setDisabledTextColor(Color.BLACK);
text.setBounds(30,35,260,60);
text.setLineWrap(true);
text.setOpaque(false);
text.setWrapStyleWord(true);
background.setSize(400,150);
Tavi.setBounds(305,10,90,90);
label.setBounds(15,10,50,20);
text.setText(frase[it]);
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
final int id = 1;
JIntellitype.setLibraryLocation ( "D:/Data/jintellitype/JIntellitype.dll" );
JIntellitype.getInstance ().registerHotKey (id, JIntellitype.MOD_CONTROL, KeyEvent.VK_SPACE );
JIntellitype.getInstance ().addHotKeyListener ( new HotkeyListener() {
public void onHotKey (int in){
if (id == in){
it++;
if(it>kf){System.exit(0);}
text.setText(frase[it]);
for(float i = 0; i<1; i += 0.1f){SplashVoid(i,50);}
SplashVoid(1,5000);
for(float i = 1; i>0; i -= 0.1f){SplashVoid(i,50);}
SplashVoid(0, 0);
        }
        }
} );
    }

    static void SplashVoid(float opacity, int sleep){
try {
splash.setOpacity(opacity);
Thread.currentThread().sleep(sleep);
} catch (InterruptedException ex) {
ex.printStackTrace();
}
        }
}
//Onwards to victory!