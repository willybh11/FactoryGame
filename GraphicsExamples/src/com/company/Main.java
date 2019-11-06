package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
//                BasicEx ex = new BasicEx();
//                PointsEx ex = new PointsEx();
//                LinesEx ex = new LinesEx();
//                BasicStrokesEx ex = new BasicStrokesEx();
//                CapsEx ex = new CapsEx();
//                JoinsEx ex = new JoinsEx();
//                BasicShapesEx ex = new BasicShapesEx();
//                StarEx ex = new StarEx();
//                AreasEx ex = new AreasEx();
//                ColorsEx ex = new ColorsEx();
//                GradientsEx ex = new GradientsEx();
//                TexturesEx ex = new TexturesEx();
//                TransparentRectanglesEx ex = new TransparentRectanglesEx();
//                FadeOutEx ex = new FadeOutEx();
                WaitingEx ex = new WaitingEx();
//                CompositionEx ex = new CompositionEx();
//                SunAndCloudEx ex = new SunAndCloudEx();
//                SpotlightEx ex = new SpotlightEx();
//                ClippingEx ex = new ClippingEx();
//                ClippingShapesEx ex = new ClippingShapesEx();
//                TranslationEx ex = new TranslationEx();
//                RotationEx ex = new RotationEx();
//                ScalingEx ex = new ScalingEx();
                ex.setVisible(true);
            }
        });
    }
}
