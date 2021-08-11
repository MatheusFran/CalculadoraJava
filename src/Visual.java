import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Visual extends JPanel  {

//BOTOES:
    JButton JUM =new JButton();
    JButton JDOIS =new JButton();
    JButton JTRES =new JButton();
    JButton JQUATRO =new JButton();
    JButton JCINCO =new JButton();
    JButton JSEIS =new JButton();
    JButton JSETE =new JButton();
    JButton JOITO =new JButton();
    JButton JNOVE =new JButton();
    JButton JIGUAL=new JButton();
    JButton JSOMA =new JButton();
    JButton JSUBTRACAO =new JButton();
    JButton JMULTIPLICACAO =new JButton();
    JButton JDIVISAO =new JButton();
//Display
    JTextField display=new JTextField();
//Clear
    JButton Clear=new JButton();

    //Metodo com retorno
    public Visual(){
        add(JUM);
        JUM.setBounds(300,200, 50, 50);
        JUM.setVisible(true);
        JUM.setText("1");
        add(JDOIS);
        JDOIS.setBounds(120,140, 50, 50);
        JDOIS.setVisible(true);
        JDOIS.setText("2");
        add(JTRES);
        JTRES.setBounds(140,160, 50, 50);
        JTRES.setVisible(true);
        JTRES.setText("3");
        add(JQUATRO);
        JQUATRO.setBounds(160,180, 50, 50);
        JQUATRO.setVisible(true);
        JQUATRO.setText("4");
        add(JCINCO);
        JCINCO.setBounds(180,200, 50, 50);
        JCINCO.setVisible(true);
        JCINCO.setText("5");
        add(JSEIS);
        JSEIS.setBounds(200,220, 50, 50);
        JSEIS.setVisible(true);
        JSEIS.setText("6");
        add(JSETE);
        JSETE.setBounds(220,240, 50, 50);
        JSETE.setVisible(true);
        JSETE.setText("7");
        add(JOITO);
        JOITO.setBounds(240,260, 50, 50);
        JOITO.setVisible(true);
        JOITO.setText("8");
        add(JNOVE);
        JNOVE.setBounds(260,280, 50, 50);
        JNOVE.setVisible(true);
        JNOVE.setText("9");
        add(JSOMA);
        JSOMA.setBounds(280,300, 50, 50);
        JSOMA.setVisible(true);
        JSOMA.setText("+");
        add(JSUBTRACAO);
        JSUBTRACAO.setBounds(300,320, 50, 50);
        JSUBTRACAO.setVisible(true);
        JSUBTRACAO.setText("-");
        add(JMULTIPLICACAO);
        JMULTIPLICACAO.setBounds(320,340, 50, 50);
        JMULTIPLICACAO.setVisible(true);
        JMULTIPLICACAO.setText("*");
        add(JDIVISAO);
        JDIVISAO.setBounds(340,360, 50, 50);
        JDIVISAO.setVisible(true);
        JDIVISAO.setText("/");
        add(JIGUAL);
        JIGUAL.setBounds(360,380, 50, 50);
        JIGUAL.setVisible(true);
        JIGUAL.setText("=");

        add(display);
        display.setVisible(true);
        display.setText("                ");
        display.setSize(800,800);
        display.setLocation(100, 100);

        add(Clear);
        Clear.setVisible(true);
        Clear.setText("Clear");
        Clear.setBounds(380,400,200,50);
        //Chamando metodos sem retorno, que caracterizam os elementos
        Background();

    }
    
    private void Background(){
        setBackground(Color.CYAN);
    }
}



