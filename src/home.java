import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class home extends JFrame{//GUI
    Container jpanel =getContentPane();
    Visual visual = new Visual();
    int memoria;
    int leitura = 0;
    char operacao;

    public home(){
        jpanel.add(visual);
        evento();   
    }

    private void evento(){

        visual.JUM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 1;
                visual.display.setText(visual.display.getText() + "1");
            }
        });
        visual.JDOIS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 2;
                visual.display.setText(visual.display.getText() + "2");
            }
        });
        visual.JTRES.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 3;
                visual.display.setText(visual.display.getText() + "3");
            }
        });
        visual.JQUATRO.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 4;
                visual.display.setText(visual.display.getText() + "4");
            }
        });;
        visual.JCINCO.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 5;
                visual.display.setText(visual.display.getText() + "5");
            }
        });
        visual.JSEIS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 6;
                visual.display.setText(visual.display.getText() + "6");
            }
        });
        visual.JSETE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 7;
                visual.display.setText(visual.display.getText() + "7");
            }
        });;
        visual.JOITO.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 8;
                visual.display.setText(visual.display.getText() + "8");
            }
        });
        visual.JNOVE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 9;
                visual.display.setText(visual.display.getText() + "9");
            }
        });
//Clear
        visual.Clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                visual.display.setText("");
                leitura=0;
                memoria=0;
            }
        });
    
//Operações
        visual.JSOMA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = '+';
                memoria += leitura;
                leitura = 0;
                visual.display.setText("");
            }
        });
        visual.JSUBTRACAO.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = '-';
                memoria += leitura;
                leitura = 0;
                visual.display.setText("");
            }
        });
        visual.JMULTIPLICACAO.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = '*';
                memoria+=leitura;
                leitura = 0;
                visual.display.setText("");
            }
        });

        visual.JDIVISAO.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = '/';
                memoria += leitura;
                leitura = 0;
                visual.display.setText("");
            }
        });
        visual.JIGUAL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                switch (operacao) {
                    case '+': {
                        memoria += leitura;
                        break;
                    }
                    case '-':{
                        memoria-= leitura;
                        break;
                    }
                    case '*':{
                        memoria*=leitura;
                        break;
                    }
                    case'/':{
                        memoria/=leitura;
                        break;
                    }
                }
                leitura = 0;
                visual.display.setText(" " + memoria);
            }
        });

    }


    public static void main(String[] args) throws Exception {
        home telaObject  = new home();
        telaObject.setDefaultCloseOperation(EXIT_ON_CLOSE);
        telaObject.setVisible(true);
        telaObject.setSize(300,500);
        telaObject.setResizable(false);
    }

 

}
