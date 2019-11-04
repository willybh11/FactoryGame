package com.company;

import java.awt.AlphaComposite;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

class Fade_Surface extends JPanel implements ActionListener {

    private Image img;
    private Timer timer;
    private float alpha = 1f;

    private final int DELAY = 40;
    private final int INITIAL_DELAY = 500;

    public Fade_Surface() {

        loadImage();
        setSurfaceSize();
        initTimer();
    }

    private void loadImage() {

        img = new ImageIcon("/home/willh/Programming/FactoryGame/src/slate.png").getImage();
    }

    private void setSurfaceSize() {

        int h = img.getHeight(this);
        int w = img.getWidth(this);
        setPreferredSize(new Dimension(w,h));
    }

    private void initTimer() {

        timer = new Timer(DELAY,this);
        timer.setInitialDelay(INITIAL_DELAY);
        timer.start();
    }

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g.create();

        AlphaComposite acomp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha);
        g2d.setComposite(acomp);
        g2d.drawImage(img,0,0,null);

        g2d.dispose();
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }

    private void step() {

        alpha += -0.01f;

        if (alpha <= 0) {

            alpha = 0;
            timer.stop();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        step();
        repaint();
    }
}

public class FadeOutEx extends JFrame {

    public FadeOutEx() {

        initUI();
    }

    private void initUI() {

        add(new Fade_Surface());

        pack();

        setTitle("Fade Out");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
