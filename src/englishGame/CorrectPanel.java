package englishGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CorrectPanel extends JPanel {
	
	public CorrectPanel(){
	    
		 //パネル作成
	    JPanel p1 = new JPanel();
	    JPanel p2 = new JPanel();
	    //Button b1 = new Button("B1");
	    //Button b2 = new Button("B2");
	    //Button b3 = new Button("B3");
	    //Button b4 = new Button("B4");
	    
	    
	    JLabel correctLabel = new JLabel();
	    correctLabel.setText("アタリ！");
	    correctLabel.setFont(new Font("Arial", Font.PLAIN, 30));
	    //correctLabel.setAlignmentY(0.5f);
	    //correctLabel.setOpaque(true);これ入れると背景の色がオフ。falseだと色つく。
	    correctLabel.setHorizontalAlignment(JLabel.CENTER);
	    
	    
	    JButton nextBtn = new JButton("つぎのもんだい");
	    nextBtn.setFont(new Font("Arial", Font.PLAIN, 24));
	    nextBtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    
	    ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("cat.png"));
	    JLabel label5 = new JLabel(icon);
	      
	    p1.setBackground(new Color(255, 240, 245));
	    p2.setBackground(new Color(255, 240, 245));
	    
	    setLayout(new GridLayout(2, 1));
        add(p1);
        add(p2);
        p1.setLayout(new GridLayout(1, 1));
        p2.setLayout(new GridLayout(1, 2));
        //p1.add(b1);
        
        p1.add(correctLabel);
        p2.add(nextBtn);
        p2.add(label5);
        //p2.add(b4);
        //setSize(300, 200);
        
       
	  
        
	  }

}
