package englishGame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


//public class Home extends JFrame implements ActionListener {
public class Main extends JFrame {//①成功に戻すにはこっち採用
	
	CardLayout layout;
	
	/*JPanel card1;
	JPanel card2;
	JPanel card3;
	JPanel card4;
   
    JButton fruitbtn;
    JButton colorbtn;
    JButton animalbtn;*/
    
    public static void main(String[] args) {
        Main frame = new Main();
        frame.setTitle("English Game");
        frame.setSize( 800, 620 );
      //frame.setBounds(100, 100, 250, 300);//window(PC?)のどこにフレームを表示させるか細かく設定するにはこれっぽい。
        frame.setLocationRelativeTo(null);//window(PC?)の中央にフレームを表示させる。
        								  //frame.setLocationRelativeTo(null)はframe.setSize( 800, 620 );の下に書かないと反映されない
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    Main() {
/////////////////ここからcard1(メニュー画面)/////////////////////////////////////////
    	//パネル作成
        JPanel card1 = new JPanel();
        //コンポーネント(ボタンとか)作成
        JButton fruitbtn = new JButton("くだもの");
        fruitbtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
        //implements ActionListenerをつけた時に足した２行
        //fruitbtn.addActionListener(this);
        //fruitbtn.setActionCommand("くだもの");
        
        JButton colorbtn = new JButton("いろ");
        colorbtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
        //colorbtn.addActionListener(this);
        
        JButton animalbtn = new JButton("どうぶつ");
        animalbtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
        
        //カードにコンポーネント追加
    	card1.add(fruitbtn);
    	card1.add(colorbtn);
    	card1.add(animalbtn);
    	//カードのデザイン
    	card1.setBackground(new Color(255, 240, 245));
	    card1.setPreferredSize(new Dimension(200, 100));//card1、つまりパネルの大きさを指定
	    	    
////////////////////////////////ここからcard2/////////////////////////////////////////
	    //パネル作成
	    JPanel card2 = new JPanel();
	    //コンポーネント(ボタンとか)作成
	    JButton fruitQuestionBtn = new JButton("りんご");
	    fruitQuestionBtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    fruitQuestionBtn.setAlignmentX(0.5f);
	    
	    JLabel fruitQuestion = new JLabel();
	    fruitQuestion.setText("えいご(English)ではなんていう？えらんでね！");
	    fruitQuestion.setFont(new Font("Arial", Font.PLAIN, 24));
	    fruitQuestion.setAlignmentX(0.5f);
	    
	    JButton fruitOptionLeft = new JButton("Apple");
	    JButton fruitOptionRight = new JButton("Strawberry");
	    fruitOptionLeft.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    fruitOptionRight.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    
	    //card2に足したいコンポーネントを上から順に追加
	    card2.add(fruitQuestionBtn);
	    card2.add(fruitQuestion);
	    card2.add(fruitOptionLeft);
	    card2.add(fruitOptionRight);
	    card2.setBackground(new Color(255, 240, 245));
	    
	    
	    
////////////////////////////////ここからcard3/////////////////////////////////////////
	    //パネル作成
	    JPanel card3 = new JPanel();
	    //コンポーネント(ボタンとか)作成
	    JButton colorQuestionBtn = new JButton("あお");
	    colorQuestionBtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    colorQuestionBtn.setAlignmentX(0.5f);
	    
	    JLabel colorQuestion = new JLabel();
	    colorQuestion.setText("えいご(English)ではなんていう？えらんでね！");
	    colorQuestion.setFont(new Font("Arial", Font.PLAIN, 24));
	    colorQuestion.setAlignmentX(0.5f);
	    
	    JButton colorOptionLeft = new JButton("Blue");
	    JButton colorOptionRight = new JButton("Red");
	    colorOptionLeft.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    colorOptionRight.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    
	    //card2に足したいコンポーネントを上から順に追加
	    card3.add(colorQuestionBtn);
	    card3.add(colorQuestion);
	    card3.add(colorOptionLeft);
	    card3.add(colorOptionRight);
	    card3.setBackground(new Color(255, 240, 245));
	    
////////////////////////////////ここからcard4/////////////////////////////////////////	    
	  //パネル作成
	    JPanel card4 = new JPanel();
	    //コンポーネント(ボタンとか)作成
	    JButton animalQuestionBtn = new JButton("うさぎ");
	    animalQuestionBtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    animalQuestionBtn.setAlignmentX(0.5f);
	    
	    JLabel animalQuestion = new JLabel();
	    animalQuestion.setText("えいご(English)ではなんていう？えらんでね！");
	    animalQuestion.setFont(new Font("Arial", Font.PLAIN, 24));
	    animalQuestion.setAlignmentX(0.5f);
	    
	    JButton animalOptionLeft = new JButton("Rabbit");
	    JButton animalOptionRight = new JButton("Cat");
	    animalOptionLeft.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    animalOptionRight.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    
	    //card2に足したいコンポーネントを上から順に追加
	    card4.add(animalQuestionBtn);
	    card4.add(animalQuestion);
	    card4.add(animalOptionLeft);
	    card4.add(animalOptionRight);
	    card4.setBackground(new Color(255, 240, 245));
	    
	    
	    

        layout = new CardLayout();
        Container contentPane = getContentPane();
        
        
	    
	    setLayout(layout);
	    contentPane.setLayout(layout);
       
        contentPane.add(card1, "card1");//第二引数はcard1じゃなくてもいいっぽい？
        contentPane.add(card2, "card2");
        contentPane.add(card3, "card3");
        contentPane.add(card4, "card4");
        
      //ボタンをクリックしたらshowメソッドの第二引数のcard2とかが表示される
	    fruitbtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                layout.show(getContentPane(), "card2");
            }
        });
	    colorbtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                layout.show(getContentPane(), "card3");
            }
        });
	    animalbtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                layout.show(getContentPane(), "card4");
            }
        });
        
    }
    
    

}


