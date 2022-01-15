package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class Game implements ActionListener, Runnable, ItemListener {
    int[] numbers = new int[52];
    int i;
    int temp = 0;
    int randomNum;
    boolean flag = true;
    int power1;
    int power2;
    int score1 = 0;
    int score2 = 0;
    Thread play;
    GUI gui;


    public Game(GUI in){
        gui = in;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

       String comm = e.getActionCommand();


        if(comm.equals("Stop")){
            stopTheGame();
        }

        if(comm.equals("Reset")){
            resetTheGame();
        }

        if(comm.equals("Start")){
            startTheGame();
        }

    }
    @Override
    public void itemStateChanged(ItemEvent e) {
      int comm = e.getStateChange();
    }


    public boolean numberCheck(int number){
        for(int i=0 ; i<numbers.length ; i++){
            if(number == numbers[i]){
                return false;
            }

        }
        return true;
    }



    void startTheGame(){
        play = new Thread(this);
        play.start();
        gui.stopButton.setEnabled(true);
        //gui.resetButton.setEnabled(true);
        gui.startButton.setEnabled(false);

    }

    void stopTheGame() {

        gui.stopButton.setEnabled(false);
        gui.resetButton.setEnabled(true);
        gui.startButton.setEnabled(true);
        play = null;
    }
    void resetTheGame(){

        gui.resetButton.setEnabled(false);
        gui.stopButton.setEnabled(false);
        gui.startButton.setEnabled(true);
        i -= 1;
        temp = 0;
        score1 = 0;
        score2 = 0;
        gui.score1.setText("0");
        gui.score2.setText("0");
        gui.card1.setText("");
        gui.card2.setText("");
        power1 = 0;
        power2 = 0;
    }

    @Override
    public void run() {

        Thread thread = Thread.currentThread();
        while (thread == play) {
            if(i == numbers.length){
                break;
            }
            for ( i = temp; i < numbers.length; i++) {
                temp = i;
                if(play == null){
                    break;
                }
                randomNum = ((int) Math.floor(Math.random() * 52 + 1));


                System.out.println(i);
                if(!numberCheck(randomNum)){
                    flag=false;
                }else{
                    flag = true;
                }


                if (numberCheck(randomNum)) {
                    numbers[i] = randomNum;
                    System.out.println(numbers[i]);
                    switch (randomNum) {
                        case 1:
                            if (i % 2 == 0) {
                                gui.card1.setText("AT");
                                power1 = 13;
                            } else {
                                gui.card2.setText("AT");
                                power2 = 13;
                            }

                            break;
                        case 2:
                            if (i % 2 == 0) {
                                gui.card1.setText("AP");
                                power1 = 13;
                            } else {
                                gui.card2.setText("AP");
                                power2 = 13;
                            }

                            break;
                        case 3:
                            if (i % 2 == 0) {
                                gui.card1.setText("AK");
                                power1 = 13;
                            } else {
                                gui.card2.setText("AK");
                                power2 = 13;
                            }
                            break;
                        case 4:
                            if (i % 2 == 0) {
                                gui.card1.setText("AR");
                                power1 = 13;
                            } else {
                                gui.card2.setText("AR");
                                power2 = 13;
                            }

                            break;
                        case 5:
                            if (i % 2 == 0) {
                                gui.card1.setText("KT");
                                power1 = 12;
                            } else {
                                gui.card2.setText("KT");
                                power2 = 12;
                            }

                            break;
                        case 6:
                            if (i % 2 == 0) {
                                gui.card1.setText("KP");
                                power1 = 12;
                            } else {
                                gui.card2.setText("KP");
                                power2 = 12;
                            }

                            break;
                        case 7:
                            if (i % 2 == 0) {
                                gui.card1.setText("KK");
                                power1 = 12;
                            } else {
                                gui.card2.setText("KK");
                                power2 = 12;
                            }
                            break;
                        case 8:
                            if (i % 2 == 0) {
                                gui.card1.setText("KR");
                                power1 = 12;
                            } else {
                                gui.card2.setText("KR");
                                power2 = 12;
                            }
                            break;
                        case 9:
                            if (i % 2 == 0) {
                                gui.card1.setText("QT");
                                power1 = 11;
                            } else {
                                gui.card2.setText("QT");
                                power2 = 11;
                            }

                            break;
                        case 10:
                            if (i % 2 == 0) {
                                gui.card1.setText("QP");
                                power1 = 11;
                            } else {
                                gui.card2.setText("QP");
                                power2 = 11;
                            }

                            break;
                        case 11:
                            if (i % 2 == 0) {
                                gui.card1.setText("QK");
                                power1 = 11;
                            } else {
                                gui.card2.setText("QK");
                                power2 = 11;
                            }
                            break;
                        case 12:
                            if (i % 2 == 0) {
                                gui.card1.setText("QR");
                                power1 = 11;
                            } else {
                                gui.card2.setText("QR");
                                power2 = 11;
                            }
                            break;
                        case 13:
                            if (i % 2 == 0) {
                                gui.card1.setText("JT");
                                power1 = 10;
                            } else {
                                gui.card2.setText("JT");
                                power2 = 10;
                            }
                            break;
                        case 14:
                            if (i % 2 == 0) {
                                gui.card1.setText("JP");
                                power1 = 10;
                            } else {
                                gui.card2.setText("JP");
                                power2 = 10;
                            }
                            break;
                        case 15:
                            if (i % 2 == 0) {
                                gui.card1.setText("JK");
                                power1 = 10;
                            } else {
                                gui.card2.setText("JK");
                                power2 = 10;
                            }
                            break;
                        case 16:
                            if (i % 2 == 0) {
                                gui.card1.setText("JR");
                                power1 = 10;
                            } else {
                                gui.card2.setText("JR");
                                power2 = 10;
                            }
                            break;
                        case 17:
                            if (i % 2 == 0) {
                                gui.card1.setText("10T");
                                power1 = 9;
                            } else {
                                gui.card2.setText("10T");
                                power2 = 9;
                            }
                            break;
                        case 18:
                            if (i % 2 == 0) {
                                gui.card1.setText("10P");
                                power1 = 9;
                            } else {
                                gui.card2.setText("10P");
                                power2 = 9;
                            }
                            break;
                        case 19:
                            if (i % 2 == 0) {
                                gui.card1.setText("10K");
                                power1 = 9;
                            } else {
                                gui.card2.setText("10K");
                                power2 = 9;
                            }
                            break;
                        case 20:
                            if (i % 2 == 0) {
                                gui.card1.setText("10R");
                                power1 = 9;
                            } else {
                                gui.card2.setText("10R");
                                power2 = 9;
                            }
                            break;
                        case 21:
                            if (i % 2 == 0) {
                                gui.card1.setText("9T");
                                power1 = 8;
                            } else {
                                gui.card2.setText("9T");
                                power2 = 8;
                            }

                            break;
                        case 22:
                            if (i % 2 == 0) {
                                gui.card1.setText("9P");
                                power1 = 8;
                            } else {
                                gui.card2.setText("9P");
                                power2 = 8;
                            }
                            break;
                        case 23:
                            if (i % 2 == 0) {
                                gui.card1.setText("9K");
                                power1 = 8;
                            } else {
                                gui.card2.setText("9K");
                                power2 = 8;
                            }
                            break;
                        case 24:
                            if (i % 2 == 0) {
                                gui.card1.setText("9R");
                                power1 = 8;
                            } else {
                                gui.card2.setText("9R");
                                power2 = 8;
                            }
                            break;
                        case 25:
                            if (i % 2 == 0) {
                                gui.card1.setText("8T");
                                power1 = 7;
                            } else {
                                gui.card2.setText("8T");
                                power2 = 7;
                            }
                            break;
                        case 26:
                            if (i % 2 == 0) {
                                gui.card1.setText("8P");
                                power1 = 7;
                            } else {
                                gui.card2.setText("8P");
                                power2 = 7;
                            }
                            break;
                        case 27:
                            if (i % 2 == 0) {
                                gui.card1.setText("8K");
                                power1 = 7;
                            } else {
                                gui.card2.setText("8K");
                                power2 = 7;
                            }
                            break;
                        case 28:
                            if (i % 2 == 0) {
                                gui.card1.setText("8R");
                                power1 = 7;
                            } else {
                                gui.card2.setText("8R");
                                power2 = 7;
                            }
                            break;
                        case 29:
                            if (i % 2 == 0) {
                                gui.card1.setText("7T");
                                power1 = 6;
                            } else {
                                gui.card2.setText("7T");
                                power2 = 6;
                            }
                            break;
                        case 30:
                            if (i % 2 == 0) {
                                gui.card1.setText("7P");
                                power1 = 6;
                            } else {
                                gui.card2.setText("7P");
                                power2 = 6;
                            }
                            break;
                        case 31:
                            if (i % 2 == 0) {
                                gui.card1.setText("7K");
                                power1 = 6;
                            } else {
                                gui.card2.setText("7K");
                                power2 = 6;
                            }
                            break;
                        case 32:
                            if (i % 2 == 0) {
                                gui.card1.setText("7R");
                                power1 = 6;
                            } else {
                                gui.card2.setText("7R");
                                power2 = 6;
                            }
                            break;
                        case 33:
                            if (i % 2 == 0) {
                                gui.card1.setText("6T");
                                power1 = 5;
                            } else {
                                gui.card2.setText("6T");
                                power2 = 5;
                            }
                            break;
                        case 34:
                            if (i % 2 == 0) {
                                gui.card1.setText("6P");
                                power1 = 5;
                            } else {
                                gui.card2.setText("6P");
                                power2 = 5;
                            }
                            break;
                        case 35:
                            if (i % 2 == 0) {
                                gui.card1.setText("6K");
                                power1 = 5;
                            } else {
                                gui.card2.setText("6K");
                                power2 = 5;
                            }
                            break;
                        case 36:
                            if (i % 2 == 0) {
                                gui.card1.setText("6R");
                                power1 = 5;
                            } else {
                                gui.card2.setText("6R");
                                power2 = 5;
                            }
                            break;
                        case 37:
                            if (i % 2 == 0) {
                                gui.card1.setText("5T");
                                power1 = 4;
                            } else {
                                gui.card2.setText("5T");
                                power2 = 4;
                            }
                            break;
                        case 38:
                            if (i % 2 == 0) {
                                gui.card1.setText("5P");
                                power1 = 4;
                            } else {
                                gui.card2.setText("5P");
                                power2 = 4;
                            }
                            break;
                        case 39:
                            if (i % 2 == 0) {
                                gui.card1.setText("5K");
                                power1 = 4;
                            } else {
                                gui.card2.setText("5K");
                                power2 = 4;
                            }
                            break;
                        case 40:
                            if (i % 2 == 0) {
                                gui.card1.setText("5R");
                                power1 = 4;
                            } else {
                                gui.card2.setText("5R");
                                power2 = 4;
                            }
                            break;
                        case 41:
                            if (i % 2 == 0) {
                                gui.card1.setText("4T");
                                power1 = 3;
                            } else {
                                gui.card2.setText("4T");
                                power2 = 3;
                            }
                            break;
                        case 42:
                            if (i % 2 == 0) {
                                gui.card1.setText("4P");
                                power1 = 3;
                            } else {
                                gui.card2.setText("4P");
                                power2 = 3;
                            }
                            break;
                        case 43:
                            if (i % 2 == 0) {
                                gui.card1.setText("4K");
                                power1 = 3;
                            } else {
                                gui.card2.setText("4K");
                                power2 = 3;
                            }
                            break;
                        case 44:
                            if (i % 2 == 0) {
                                gui.card1.setText("4R");
                                power1 = 3;
                            } else {
                                gui.card2.setText("4R");
                                power2 = 3;
                            }
                            break;
                        case 45:
                            if (i % 2 == 0) {
                                gui.card1.setText("3T");
                                power1 = 2;
                            } else {
                                gui.card2.setText("3T");
                                power2 = 2;
                            }
                            break;
                        case 46:
                            if (i % 2 == 0) {
                                gui.card1.setText("3P");
                                power1 = 2;
                            } else {
                                gui.card2.setText("3P");
                                power2 = 2;
                            }
                            break;
                        case 47:
                            if (i % 2 == 0) {
                                gui.card1.setText("3K");
                                power1 = 2;
                            } else {
                                gui.card2.setText("3K");
                                power2 = 2;
                            }
                            break;
                        case 48:
                            if (i % 2 == 0) {
                                gui.card1.setText("3R");
                                power1 = 2;
                            } else {
                                gui.card2.setText("3R");
                            }
                            break;
                        case 49:
                            if (i % 2 == 0) {
                                gui.card1.setText("2T");
                                power1 = 1;
                            } else {
                                gui.card2.setText("2T");
                                power2 = 1;
                            }
                            break;
                        case 50:
                            if (i % 2 == 0) {
                                gui.card1.setText("2P");
                                power1 = 1;
                            } else {
                                gui.card2.setText("2P");
                                power2 = 1;
                            }
                            break;
                        case 51:
                            if (i % 2 == 0) {
                                gui.card1.setText("2K");
                                power1 = 1;
                            } else {
                                gui.card2.setText("2K");
                                power2 = 1;
                            }
                            break;
                        case 52:
                            if (i % 2 == 0) {
                                gui.card1.setText("2R");
                                power1 = 1;
                            } else {
                                gui.card2.setText("2R");
                                power2 = 1;
                            }
                            break;
                    }
                }
                if (numbers[i] == 0) {
                    i -= 1;
                }
                
                if (power1 > power2 && power1 > 0 && power2 > 0) {
                    score1 += 1;
                    gui.score1.setText("" + score1);
                    power1 = 0;
                    power2 = 0;
                } else if (power1 < power2 && power1 > 0 && power2 > 0 ) {
                    score2 += 1;
                    gui.score2.setText("" + score2);
                    power2 = 0;
                    power1 = 0;
                } else if (power1 == power2 && power1 > 0 && power2 > 0) {
                    score1 += 1;
                    score2 += 1;
                    gui.score1.setText("" + score1);
                    gui.score2.setText("" + score2);
                    power1 = 0;
                    power2 = 0;


                }
                System.out.println(flag);
                if (flag) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {

                    }
                }else{
                    try {
                        Thread.sleep(0);
                    } catch (InterruptedException e) {

                    }
                }

            }

        }
    }


}
