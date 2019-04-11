package com.company;

import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class T_Surface extends JPanel {

    private BufferedImage slate;
    private BufferedImage java;
    private BufferedImage pane;
    private TexturePaint slatetp;
    private TexturePaint javatp;
    private TexturePaint panetp;

    public T_Surface() {

        loadImages();
    }

    private void loadImages() {

        try {

            slate = ImageIO.read(new File("/home/willh/Programming/FactoryGame/src/slate.png"));
            java = ImageIO.read(new File("/home/willh/Programming/FactoryGame/src/java.png"));
            pane = ImageIO.read(new File("/home/willh/Programming/FactoryGame/src/pane.png"));

        } catch (IOException ex) {

            Logger.getLogger(T_Surface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g.create();

        slatetp = new TexturePaint(slate, new Rectangle(0,0,90,60));
        javatp = new TexturePaint(java,new Rectangle(0,0,90,60));
        panetp = new TexturePaint(pane,new Rectangle(0,0,90,60));

        g2d.setPaint(slatetp);
        g2d.fillRect(10,15,90,60);

        g2d.setPaint(javatp);
        g2d.fillRect(130,15,90,60);

        g2d.setPaint(panetp);
        g2d.fillRect(250,15,90,60);

        g2d.dispose();
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}


public class TexturesEx extends JFrame {

    public TexturesEx() {

        initUI();
    }

    private void initUI() {

        add(new T_Surface());

        setTitle("Textures");
        setSize(360,120);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}