import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class AWTCalculator extends Frame implements ActionListener{
    TextArea display;
    Button[] numberButtons = new Button[10];
    Button addButton, subButton, multiButton, divButton, eqButton, clrButton;
    Panel panel;

    double num1=0, num2=0, result=0;
    char operator;

    AWTCalculator(){
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        panel = new Panel();
        panel.setLayout(new GridLayout(4,4,8,8));

        display = new TextArea(4,1);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        for (int i=0; i<10;i++){
            numberButtons[i] = new Button(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            panel.add(numberButtons[i]);
        }

        addButton = new Button("+");
        subButton = new Button("-");
        multiButton = new Button("*");
        divButton = new Button("/");
        eqButton = new Button("=");
        clrButton = new Button("C");

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        multiButton.addActionListener(this);
        divButton.addActionListener(this);
        eqButton.addActionListener(this);
        clrButton.addActionListener(this);

        panel.add(addButton);
        panel.add(subButton);
        panel.add(multiButton);
        panel.add(divButton);
        panel.add(eqButton);
        panel.add(clrButton);

        add(panel, BorderLayout.CENTER);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e){
        for (int i=0;i<10;i++){
            if (e.getSource() ==numberButtons[i]){
                display.setText(display.getText()+i);
            }
        }

        if (e.getSource() == addButton){
            num1 = Double.parseDouble(display.getText());
            operator = '+';
            display.setText("");
        } else if (e.getSource()== subButton) {
            num1 = Double.parseDouble(display.getText());
            operator = '-';
            display.setText("");
        } else if (e.getSource() == multiButton) {
            num1 = Double.parseDouble(display.getText());
            operator = '*';
            display.setText("");
        } else if (e.getSource() == divButton) {
            num1 = Double.parseDouble(display.getText());
            operator = '/';
            display.setText("");
        } else if (e.getSource() == eqButton) {
            num2 = Double.parseDouble(display.getText());
            switch(operator){
                case '+':
                    result = num1+num2;
                    break;
                case '-':
                    result = num1-num2;
                    break;
                case '*':
                    result = num1*num2;
                    break;
                case '/':
                    result = num1/num2;
                    break;
            }
            display.setText(String.valueOf(result));
            num1 = result;
        }else if(e.getSource() == clrButton){
            display.setText("");
        }
    }
}

public class AWT_Calculator {
    public static void main(String[] args) {
        new AWTCalculator();
    }
}
