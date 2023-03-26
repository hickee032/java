package sec_verify07_3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class CardChange extends Frame {

   public CardChange() {

      //Frame f = new Frame("Card");
      CardLayout card = new CardLayout();

      this.setLayout(new BorderLayout());
      this.setSize(470, 500);

      Panel c1 = new Panel();
      c1.setLayout(card);
      c1.setSize(470, 500);

      Panel card1 = new Panel();
      card1.setBackground(Color.BLUE);
      // card1.setLayout(card);
      card1.setSize(470, 500);
      card1.add(new Label("1번"));

      Panel card2 = new Panel();
      card2.setBackground(Color.CYAN);
      // card2.setLayout(card);
      card2.setSize(470, 500);
      card2.add(new Label("2번"));

      Panel card3 = new Panel();
      card3.setBackground(Color.PINK);
      // card3.setLayout(card);
      card3.setSize(470, 500);
      card3.add(new Label("3번"));

      Panel card4 = new Panel();
      card4.setBackground(Color.GREEN);
      // card4.setLayout(card);
      card4.setSize(470, 500);
      card4.add(new Label("4번"));

      Panel card5 = new Panel();
      card5.setBackground(Color.ORANGE);
      // card5.setLayout(card);
      card5.setSize(470, 500);
      card5.add(new Label("5번"));

      Panel barea = new Panel();

      Button bf = new Button("<<");
      bf.setSize(30, 30);
      Button bp = new Button("<");
      bp.setSize(30, 30);
      Button bn = new Button(">");
      bn.setSize(30, 30);
      Button be = new Button(">>");
      be.setSize(30, 30);

      barea.add(bf);
      barea.add(bp);
      barea.add(bn);
      barea.add(be);

      c1.add(card1, "1");
      c1.add(card2, "2");
      c1.add(card3, "3");
      c1.add(card4, "4");
      c1.add(card5, "5");

      this.add(c1, BorderLayout.CENTER);
      this.add(barea, BorderLayout.SOUTH);

//      this.add(card1, BorderLayout.CENTER);
//      this.add(card2, BorderLayout.CENTER);
//      this.add(card3, BorderLayout.CENTER);
//      this.add(card4, BorderLayout.CENTER);
//      this.add(card5, BorderLayout.CENTER);

      ActionListener evevt = new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {

            if (e.getSource() == bf) {
               System.out.println("처음");
               card.first(c1);
            } else if (e.getSource() == bp) {
               System.out.println("이전");
               card.previous(c1);
            } else if (e.getSource() == bn) {
               System.out.println("다음");
               card.next(c1);
            } else {
               System.out.println("끝");
               card.last(c1);
            }

         }
      };

      bf.addActionListener(evevt);
      bp.addActionListener(evevt);
      bn.addActionListener(evevt);
      be.addActionListener(evevt);

      this.addWindowListener(new WindowAdapter() {

         @Override
         public void windowClosing(WindowEvent e) {
        	System.out.println("종료");
            System.exit(0);
         }
      });

      this.setVisible(true);

   }
}

