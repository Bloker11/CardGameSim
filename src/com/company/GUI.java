package com.company;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    public JTextField score1 = new JTextField("0");
    public JTextField score2 = new JTextField("0");
    public JTextField card1 = new JTextField("");
    public JTextField card2 = new JTextField("");
    JButton stopButton = new JButton("Stop");
    JButton startButton = new JButton("Start");
    JButton resetButton = new JButton("Reset");
    JCheckBox regularSpeedCB = new JCheckBox("Regular speed",true);
    JCheckBox advancedSpeedCB = new JCheckBox("Other speed",false);
    Game game = new Game(this);

    public GUI(){
        super("King Game");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        functions();

    }
    public void functions(){
        setLayout(new GridLayout(4,2));

        //creating score panel at the top
        JPanel scorePanel = new JPanel(new GridLayout(1,2));
        scorePanel.add(score1);
        score1.setEditable(false);
        scorePanel.add(score2);
        score2.setEditable(false);
        add(scorePanel);

        //creating the game panel at the middle
        JPanel playPanel = new JPanel(new GridLayout(1,2));
        playPanel.add(card1);
        card1.setEditable(false);
        playPanel.add(card2);
        card2.setEditable(false);
        add(playPanel);

        //creating the play and stop button
        JPanel buttonPanel = new JPanel(new GridLayout(1,3));
        buttonPanel.add(stopButton);
        stopButton.addActionListener(game);
        stopButton.setEnabled(false);
        buttonPanel.add(resetButton);
        resetButton.addActionListener(game);
        resetButton.setEnabled(false);
        buttonPanel.add(startButton);
        startButton.addActionListener(game);
        add(buttonPanel);

        JPanel speedPanel = new JPanel(new GridLayout(1,2));

        speedPanel.add(regularSpeedCB);
        regularSpeedCB.addItemListener(game);
        speedPanel.add(advancedSpeedCB);
        advancedSpeedCB.addItemListener(game);

        add(speedPanel);

    }
}
