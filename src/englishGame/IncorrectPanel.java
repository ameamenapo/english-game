package englishGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IncorrectPanel extends JPanel {
	
	public IncorrectPanel() {
		//super();
		//initialize();
		 //パネル作成
	    /*JPanel p1 = new JPanel();
	    JPanel p2 = new JPanel();
	    JPanel p3 = new JPanel();
	    
	    p1.setBackground(new Color(255, 240, 245));
	    p2.setBackground(new Color(255, 240, 245));
	   
	    JLabel incorrectLabel = new JLabel();
	    incorrectLabel.setText("ハズレ！");
	    incorrectLabel.setFont(new Font("Arial", Font.PLAIN, 30));
	    incorrectLabel.setHorizontalAlignment(JLabel.CENTER);
	    
	    
	    JButton nextBtn = new JButton("つぎのもんだい");
	    nextBtn.setFont(new Font("Arial", Font.PLAIN, 24));
	    nextBtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。聞いてない
	    nextBtn.setBackground(Color.BLUE);//ボタンの色。聞いてない
	    
	    JButton retryBtn = new JButton("もう１かい！");
	    retryBtn.setFont(new Font("Arial", Font.PLAIN, 24));
	    retryBtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。聞いてない
	    retryBtn.setBackground(Color.BLUE);//ボタンの色。聞いてない
	    
	   
        p1.add(incorrectLabel);
        p2.add(nextBtn);
        p2.add(retryBtn);
        p3.add(p1);
        p3.add(p2);*/
        
      //パネル作成
	    JPanel p1 = new JPanel();
	    JPanel p2 = new JPanel();
	    
	    p1.setBackground(new Color(255, 240, 245));
	    p2.setBackground(new Color(255, 240, 245));
	   
	    JLabel correctLabel = new JLabel();
	    correctLabel.setText("ハズレ！");
	    correctLabel.setFont(new Font("Arial", Font.PLAIN, 30));
	    correctLabel.setHorizontalAlignment(JLabel.CENTER);
	    
	    
	    JButton nextBtn = new JButton("つぎのもんだい");
	    nextBtn.setFont(new Font("Arial", Font.PLAIN, 24));
	    nextBtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。聞いてない
	    nextBtn.setBackground(Color.BLUE);//ボタンの色。聞いてない
	    
	    JButton retryBtn = new JButton("もう１かい！");
	    retryBtn.setFont(new Font("Arial", Font.PLAIN, 24));
	    retryBtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。聞いてない
	    retryBtn.setBackground(Color.BLUE);//ボタンの色。聞いてない
	    
	    JLabel blankLabel = new JLabel();
	    blankLabel.setText("");
	      
	    setLayout(new GridLayout(2, 1));
        add(p1);
        add(p2);
        
        p1.setLayout(new GridLayout(1, 1));
        p2.setLayout(new GridLayout(1, 2));
     
        p1.add(correctLabel);
        p2.add(nextBtn);
        p2.add(retryBtn);
       
	}
}
