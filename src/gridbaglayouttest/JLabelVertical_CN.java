/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridbaglayouttest;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class JLabelVertical_CN extends JLabel {

    String regex = "[\u4e00-\u9fff]";//中文

    /**
     *
     * @param text
     */
    public JLabelVertical_CN(String text) {
        this.add(getContentPanel(text));
    }

    private JPanel getContentPanel(String text) {

        int number = 4;//text.length();//(" " + text + " ").split(regex).length - 1;
        JPanel jPanel = new JPanel(new GridLayout(0, 1));//new GridLayout(number, 1));
        JLabel jLabel[] = new JLabel[number];
        JFrame jFrame = new JFrame();
        jFrame.setLayout(new GridLayout(0, 1));
        jLabel[0] = new JLabel("模");
        jLabel[1] = new JLabel("型");
        jPanel.add(jLabel[0]);
        jFrame.add(jLabel[0]);
        jFrame.add(jLabel[1]);

        jFrame.getContentPane().add(jPanel);
        jFrame.getContentPane().add(new JLabel("打"));
        jFrame.pack();
        jFrame.setVisible(true);
        return jPanel;
    }
}
