package simplecalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SCalculator {

   static long firstNumber ;
   static long secondNumber ;
    static int pos;

    public static void main(String[] args)
    {




        JFrame frame= new JFrame("Calculator");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,10,350,430);
        frame.setResizable(false);
        Container c;
        c=frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);


        JTextField textfield= new JTextField();
        textfield.setBounds(10,5,310,70);
        textfield.setBackground(Color.PINK);
        textfield.setFont(new Font("Arial",Font.LAYOUT_LEFT_TO_RIGHT,30));
        frame.add(textfield);


        Font font= new Font("Arial",Font.PLAIN,20);

        JButton btn1= new JButton("1");
        btn1.setBounds(10,90,70,50);
        btn1.setFont(font);
        btn1.setBackground(Color.white);
        frame.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(firstNumber== 0) {
                    firstNumber = 1;
                    textfield.setText(String.valueOf(firstNumber));
                }else
                {
                    firstNumber=firstNumber*10+1;
                    textfield.setText(String.valueOf(firstNumber));
                }
            }
        });




        JButton btn2= new JButton("2");
        btn2.setBounds(90,90,70,50);
        btn2.setFont(font);
        btn2.setBackground(Color.white);
        frame.add(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(firstNumber==0) {
                    firstNumber = 2;
                    textfield.setText(String.valueOf(firstNumber));
                }else
                {
                    firstNumber=firstNumber*10+2;
                    textfield.setText(String.valueOf(firstNumber));
                }
            }
        });




        JButton btn3= new JButton("3");
        btn3.setBounds(170,90,70,50);
        btn3.setFont(font);
        btn3.setBackground(Color.white);
        frame.add(btn3);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(firstNumber==0) {
                    firstNumber = 3;
                    textfield.setText(String.valueOf(firstNumber));
                }else
                {
                    firstNumber=firstNumber*10+3;
                    textfield.setText(String.valueOf(firstNumber));
                }
            }
        });


        JButton btn4= new JButton("4");
        btn4.setSize(70,50);
        btn4.setLocation(10,150);
        btn4.setFont(font);
        btn4.setBackground(Color.white);
        frame.add(btn4);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(firstNumber==0) {
                    firstNumber = 4;
                    textfield.setText(String.valueOf(firstNumber));
                }else
                {
                    firstNumber=firstNumber*10+4;
                    textfield.setText(String.valueOf(firstNumber));
                }
            }
        });



        JButton btn5= new JButton("5");
        btn5.setSize(70,50);
        btn5.setLocation(90,150);
        btn5.setFont(font);
        btn5.setBackground(Color.white);
        frame.add(btn5);
         btn5.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if(firstNumber==0) {
                     firstNumber = 5;
                     textfield.setText(String.valueOf(firstNumber));
                 }else
                 {
                     firstNumber=firstNumber*10+5;
                     textfield.setText(String.valueOf(firstNumber));
                 }
             }
         });

        JButton btn6= new JButton("6");
        btn6.setSize(70,50);
        btn6.setLocation(170,150);
        btn6.setFont(font);
        btn6.setBackground(Color.white);
        frame.add(btn6);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(firstNumber==0) {
                    firstNumber = 6;
                    textfield.setText(String.valueOf(firstNumber));
                }else
                {
                    firstNumber=firstNumber*10+6;
                    textfield.setText(String.valueOf(firstNumber));
                }
            }
        });


        JButton btn7= new JButton("7");
        btn7.setSize(70,50);
        btn7.setLocation(10,210);
        btn7.setFont(font);
        btn7.setBackground(Color.white);
        frame.add(btn7);
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(firstNumber==0) {
                    firstNumber = 7;
                    textfield.setText(String.valueOf(firstNumber));
                }else
                {
                    firstNumber=firstNumber*10+7;
                    textfield.setText(String.valueOf(firstNumber));
                }
            }
        });


        JButton btn8= new JButton("8");
        btn8.setSize(70,50);
        btn8.setLocation(90,210);
        btn8.setFont(font);
        btn8.setBackground(Color.white);
        frame.add(btn8);
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(firstNumber==0) {
                    firstNumber = 8;
                    textfield.setText(String.valueOf(firstNumber));
                }else
                {
                    firstNumber=firstNumber*10+8;
                    textfield.setText(String.valueOf(firstNumber));
                }
            }
        });


        JButton btn9= new JButton("9");
       btn9.setLocation(170,210);
        btn9.setSize(70,50);
        btn9.setFont(font);
        btn9.setBackground(Color.white);
        frame.add(btn9);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(firstNumber==0) {
                    firstNumber = 9;
                    textfield.setText(String.valueOf(firstNumber));
                }else
                {
                    firstNumber=firstNumber*10+9;
                    textfield.setText(String.valueOf(firstNumber));
                }
            }
        });



        JButton btn0= new JButton("0");
      btn0.setLocation(10,270);
        btn0.setSize(70,50);
        btn0.setFont(font);
        btn0.setBackground(Color.white);
        frame.add(btn0);
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(firstNumber==0) {
                    firstNumber = 0;
                    textfield.setText(String.valueOf(firstNumber));
                }else
                {
                    firstNumber=firstNumber*10+0;
                    textfield.setText(String.valueOf(firstNumber));
                }
            }
        });



        JButton btn11= new JButton("+");
        btn11.setSize(70,50);
        btn11.setLocation(90,270);
        btn11.setFont(font);
        btn11.setBackground(Color.magenta);
        frame.add(btn11);
        btn11.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                secondNumber=firstNumber;
                firstNumber=0;
                 pos=1;
                 textfield.setText(null);
                return;

            }
        });


        JButton btn12= new JButton("=");
        btn12.setSize(150,50);
        btn12.setLocation(170,270);
        btn12.setFont(font);
        btn12.setBackground(Color.magenta);
        frame.add(btn12);
        btn12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(pos==1)
                {
                  long result=firstNumber+secondNumber;
                  textfield.setText(String.valueOf(result));
                }else if(pos==2)
                {
                    long result=secondNumber-firstNumber;
                    textfield.setText(String.valueOf(result));
                }else if(pos==3)
                {
                    long result=firstNumber*secondNumber;
                    textfield.setText(String.valueOf(result));
                }else if(pos==4)
                {
                    long result=secondNumber/firstNumber;
                    textfield.setText(String.valueOf(result));
                }else
                {
                    textfield.setText("oohho.. !");
                }

            }
        });



        JButton btn13= new JButton("*");
        btn13.setSize(70,50);
        btn13.setLocation(250,90);
        btn13.setFont(font);
        btn13.setBackground(Color.magenta);
        frame.add(btn13);
        btn13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondNumber=firstNumber;
                firstNumber=0;
                pos=3;
                textfield.setText(null);
                return;
            }
        });

        JButton btn14= new JButton("/");
        btn14.setSize(70,50);
        btn14.setLocation(250,150);
        btn14.setFont(font);
        btn14.setBackground(Color.magenta);
        frame.add(btn14);
        btn14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondNumber=firstNumber;
                firstNumber=0;
                pos=4;
                textfield.setText(null);
                return;
            }
        });




        JButton btn15= new JButton("-");
        btn15.setSize(70,50);
        btn15.setLocation(250,210);
        btn15.setFont(font);
        btn15.setBackground(Color.magenta);
        frame.add(btn15);
        btn15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondNumber=firstNumber;
                firstNumber=0;
                pos=2;
                textfield.setText(null);
                return;
            }
        });





        JButton clean= new JButton("clear");
        clean.setSize(150,50);
        clean.setLocation(90,330);
        clean.setFont(font);
        clean.setBackground(Color.pink);
        frame.add(clean);
        clean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber=0;
                secondNumber=0;
                textfield.setText(null);
                return;
            }
        });


        frame.setVisible(true);

    }
}
