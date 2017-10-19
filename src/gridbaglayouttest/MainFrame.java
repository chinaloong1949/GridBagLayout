/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridbaglayouttest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class MainFrame extends JFrame {

    JPanel contentPanel = new JPanel();

    public MainFrame() {

//        this.getContentPane().add(getGridBagPanes(2, null));
        contentPanel.setLayout(new BorderLayout());//一定要加布局管理器，不然出错，JPanel添加布局管理器之后类似于JFrame的getContentPane()
        contentPanel.add(getGridBagPanes(1, null));
        this.getContentPane().add(contentPanel);
        this.setTitle("GridBagLayoutTest");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

    }

    private JPanel getGridBagPanes(int tab, Object object) {
        //上侧的工具选择面板  

        JPanel jPanel;
        jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        switch (tab) {
            case 1:
                System.out.println("1");
                JPanel firstPanel = new JPanel();
                firstPanel.setLayout(new BorderLayout());
                firstPanel.setBackground(Color.green);
                JPanel secondPanel = new JPanel(new BorderLayout());
                secondPanel.setBackground(Color.YELLOW);
                JPanel thirdPanel = new JPanel(new BorderLayout());
                thirdPanel.setBackground(Color.LIGHT_GRAY);
                JPanel forthPanel = new JPanel(new BorderLayout());
                forthPanel.setBackground(Color.CYAN);
                JLabel jLabel20_0 = new JLabel("模型设置");
                jLabel20_0.setFont(new Font("楷体", Font.BOLD, 20));

                JButton jButton20_0 = new JButton("继续");
                firstPanel.add(jLabel20_0, BorderLayout.NORTH);
                firstPanel.add(jButton20_0, BorderLayout.SOUTH);

                JButton jButton20_2_0 = new JButton("编辑");
                secondPanel.add(jButton20_2_0, BorderLayout.SOUTH);
                jPanel.add(firstPanel, new GBC(0, 0).
                        setFill(GBC.BOTH).setIpad(1000, 900).setWeight(100, 100));

                jPanel.add(secondPanel, new GBC(1, 0).
                        setFill(GBC.BOTH).setIpad(50, 900).setWeight(0, 100));

                jPanel.add(thirdPanel, new GBC(2, 0).
                        setFill(GBC.BOTH).setIpad(50, 900).setWeight(0, 100));

                jPanel.add(forthPanel, new GBC(3, 0).
                        setFill(GBC.BOTH).setIpad(50, 900).setWeight(0, 100));
                jButton20_0.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        changePanel(2, null);
                    }
                });
                jButton20_2_0.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String fileType[] = {"txt", "log"};
                        FileChooser fc = new FileChooser(FileChooser.SAVE_TO_FILE);
                        fc.setFileType(fileType);
                        
                        fc.getFile();
                    }
                });
                break;
            case 2:
                System.out.println("2");
                JPanel firstPanel1 = new JPanel(new BorderLayout());
                firstPanel1.setLayout(new BorderLayout());
                firstPanel1.setBackground(Color.green);
                JPanel secondPanel1 = new JPanel(new BorderLayout());
                secondPanel1.setBackground(Color.YELLOW);
                JPanel thirdPanel1 = new JPanel(new BorderLayout());
                thirdPanel1.setBackground(Color.LIGHT_GRAY);
                JPanel forthPanel1 = new JPanel(new BorderLayout());
                forthPanel1.setBackground(Color.CYAN);
                JLabel jLabel1_0 = new JLabel("模型设置");
                jLabel1_0.setFont(new Font("楷体", Font.BOLD, 20));
//
                JButton jButtonFir_0 = new JButton("编辑");
                firstPanel1.add(jLabel1_0, BorderLayout.NORTH);
                firstPanel1.add(jButtonFir_0, BorderLayout.SOUTH);

                JButton jButton1_2_0 = new JButton("继续");
                JButton jButton1_2_1 = new JButton("返回");
                Box secBox = Box.createHorizontalBox();
                secBox.add(jButton1_2_0);
                secBox.add(jButton1_2_1);

                secondPanel1.add(secBox, BorderLayout.SOUTH);
                jPanel.add(firstPanel1, new GBC(0, 0).
                        setFill(GBC.BOTH).setIpad(50, 900).setWeight(0, 100));

                jPanel.add(secondPanel1, new GBC(1, 0).
                        setFill(GBC.BOTH).setIpad(1000, 900).setWeight(100, 100));

                jPanel.add(thirdPanel1, new GBC(2, 0).
                        setFill(GBC.BOTH).setIpad(50, 900).setWeight(0, 100));

                jPanel.add(forthPanel1, new GBC(3, 0).
                        setFill(GBC.BOTH).setIpad(50, 900).setWeight(0, 100));
                jButton1_2_1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        changePanel(1, null);
                    }
                });
                jButton1_2_0.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        changePanel(3, null);
                    }
                });
                break;
            case 3:
                JPanel firstPanel3 = new JPanel(new BorderLayout());
                firstPanel3.setBackground(Color.green);
                JPanel secondPanel3 = new JPanel(new BorderLayout());
                secondPanel3.setBackground(Color.YELLOW);
                JPanel thirdPanel3 = new JPanel(new BorderLayout());
                thirdPanel3.setBackground(Color.LIGHT_GRAY);
                JPanel forthPanel3 = new JPanel(new BorderLayout());
                forthPanel3.setBackground(Color.CYAN);
                JLabel jLabel3_0 = new JLabel("模型设置");
                jLabel3_0.setFont(new Font("楷体", Font.BOLD, 20));
//
                JButton jButtonFir_3_0 = new JButton("编辑");
                firstPanel3.add(jLabel3_0, BorderLayout.NORTH);
                firstPanel3.add(jButtonFir_3_0, BorderLayout.SOUTH);

                JButton jButtonSec_3_0 = new JButton("编辑");
                secondPanel3.add(jButtonSec_3_0, BorderLayout.SOUTH);

                JButton jButtonThi_3_0 = new JButton("继续");
                JButton jButtonThi_3_1 = new JButton("返回");
                thirdPanel3.add(jButtonThi_3_0);
                jPanel.add(firstPanel3, new GBC(0, 0).
                        setFill(GBC.BOTH).setIpad(50, 900).setWeight(0, 100));

                jPanel.add(secondPanel3, new GBC(1, 0).
                        setFill(GBC.BOTH).setIpad(50, 900).setWeight(0, 100));

                jPanel.add(thirdPanel3, new GBC(2, 0).
                        setFill(GBC.BOTH).setIpad(1000, 900).setWeight(100, 100));

                jPanel.add(forthPanel3, new GBC(3, 0).
                        setFill(GBC.BOTH).setIpad(50, 900).setWeight(0, 100));
                jButtonFir_3_0.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        changePanel(1, null);
                    }
                });
                jButtonSec_3_0.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        changePanel(2, null);
                    }
                });
                break;
            case 4:
                break;
            default:
                break;
        }
        jPanel.revalidate();
        return jPanel;
    }

    private void changePanel(int tab, Object object) {
        contentPanel.removeAll();
        contentPanel.add(getGridBagPanes(tab, object));
        contentPanel.revalidate();
//        this.getContentPane().removeAll();
//        this.getContentPane().add(getGridBagPanes(tab, object));
        this.revalidate();
    }

}
