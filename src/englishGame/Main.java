package englishGame;

//Graphicsなど用
/*public class Main {
	static MainWindow mainWindow;
	//CardLayout layout;
	
	MenuPanel menuPanel;
    
    public static void main(String[] args) {
    	mainWindow = new MainWindow(); //ウインドウのみを生成
    	mainWindow.preparePanels(); //ペインに直接貼るパネルのみを生成
		mainWindow.prepareComponents(); //その他のコンポーネントを生成
		//mainWindow.menuCommand(); //ボタンによって呼び出す画面を切り替える
		mainWindow.setVisible(true);  //最後にウィンドウを可視化
    }
}*/
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//public class Main extends JFrame {
public class Main extends JFrame implements ActionListener{ 
	
	CardLayout layout;
	
	JButton fruitbtn;
	JButton colorbtn;
	JButton animalbtn;
	
    
    public static void main(String[] args) {
        Main frame = new Main();
        frame.setTitle("English Game");
        frame.setSize( 800, 620 );
        //frame.setSize( 600, 420 );
        
        frame.setLocationRelativeTo(null);//window(PC?)の中央にフレームを表示させる。
        								  //frame.setLocationRelativeTo(null)はframe.setSize( 800, 620 );の下に書かないと反映されない
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    Main(){
/////////////////ここからcard1(メニュー画面)/////////////////////////////////////////
    	//パネル作成
        JPanel card1 = new JPanel();
        //コンポーネント(ボタンとか)作成
        JLabel menutext = new JLabel();
        menutext.setText("どれで遊ぶ？メニューからえらんでね！");
        menutext.setFont(new Font("Arial", Font.PLAIN, 30));
        
        JButton fruitbtn = new JButton("くだもの");
        fruitbtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
        fruitbtn.addActionListener(this);
        fruitbtn.setActionCommand("fruitbtn");
        fruitbtn.setFont(new Font("Arial", Font.PLAIN, 30));
        
        JButton colorbtn = new JButton("いろ");
        colorbtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
        colorbtn.addActionListener(this);
        colorbtn.setActionCommand("colorbtn");
        colorbtn.setFont(new Font("Arial", Font.PLAIN, 30));
        
        JButton animalbtn = new JButton("どうぶつ");
        animalbtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
        animalbtn.addActionListener(this);
        animalbtn.setActionCommand("animalbtn");
        animalbtn.setFont(new Font("Arial", Font.PLAIN, 30));
        
        //カードにコンポーネント追加
        card1.add(menutext);
    	card1.add(fruitbtn);
    	card1.add(colorbtn);
    	card1.add(animalbtn);
    	//card1.setLayout(new BoxLayout(card1, BoxLayout.Y_AXIS));
    	//カードのデザイン
    	card1.setBackground(new Color(255, 240, 245));
	    //card1.setPreferredSize(new Dimension(200, 100));//card1、つまりパネルの大きさを指定
	    	    
////////////////////////////////ここからcard2/////////////////////////////////////////
	    //パネル作成
	    JPanel card2 = new JPanel();
	    //コンポーネント(ボタンとか)作成
	    JButton fruitQuestionBtn = new JButton("りんご");
	    fruitQuestionBtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    //fruitQuestionBtn.setAlignmentX(0.5f);これを入れても聞かない。文字を大きくして縦にする
	    
	    JLabel fruitQuestion = new JLabel();
	    fruitQuestion.setText("えいご(English)ではなんていう？えらんでね！");
	    fruitQuestion.setFont(new Font("Arial", Font.PLAIN, 24));
	    //fruitQuestion.setAlignmentX(0.5f);これを入れても聞かない。文字を大きくして縦にする
	    
	    JButton fruitOptionLeft = new JButton("Apple");
	    fruitOptionLeft.addActionListener(this);
	    fruitOptionLeft.setActionCommand("appleAtari");
	    JButton fruitOptionRight = new JButton("Strawberry");
	    fruitOptionRight.addActionListener(this);
	    fruitOptionRight.setActionCommand("strawberryHazure");
	    fruitOptionLeft.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    fruitOptionRight.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    
	    /*JButton backBtn = new JButton("やめる");
	    backBtn.setFont(new Font("Arial", Font.PLAIN, 20));
	    backBtn.setPreferredSize(new Dimension(200, 100));//ボタンの大きさ。聞いてない
	    backBtn.setBackground(Color.BLUE);//ボタンの色。聞いてない
	    backBtn.setAlignmentY(0.5f);//縦にしたい。聞いてない
	    backBtn.addActionListener(this);
	    backBtn.setActionCommand("backMenu");*/
	    
	    
	    JPanel backBtnPanel = new JPanel();
	    JButton backBtn = new JButton("やめる");
	    backBtn.setFont(new Font("Arial", Font.PLAIN, 20));
	    backBtn.setPreferredSize(new Dimension(200, 100));//ボタンの大きさ。聞いてない
	    //backBtn.setBackground(Color.BLUE);//ボタンの色。聞いてない
	    backBtn.setAlignmentY(0.5f);//縦にしたい。聞いてない
	    backBtn.addActionListener(this);
	    backBtn.setActionCommand("backMenu");
	    
	    backBtnPanel.add(backBtn);
	    backBtnPanel.setBackground(null);//これを入れないとボタンの周りが色違くなる
	    //backBtnPanel.setPreferredSize(new Dimension(800, 200));カードレイアウトの中では利かない
	    //getContentPane().add(backBtnPanel, BorderLayout.PAGE_END);
	    
	    //backBtnPanel.setPreferredSize(new Dimension(200, 200));
	    
	    //card2に足したいコンポーネントを上から順に追加
	    card2.add(fruitQuestionBtn);
	    card2.add(fruitQuestion);
	    card2.add(fruitOptionLeft);
	    card2.add(fruitOptionRight);
	    
	    //card2.add(backBtn);
	    card2.add(backBtnPanel);
	    card2.setBackground(new Color(255, 240, 245));
	     
////////////////////////////////ここからcard3/////////////////////////////////////////
	    //パネル作成
	    JPanel card3 = new JPanel();
	    //コンポーネント(ボタンとか)作成
	    JButton colorQuestionBtn = new JButton("あお");
	    colorQuestionBtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    //colorQuestionBtn.setAlignmentX(0.5f);
	    
	    JLabel colorQuestion = new JLabel();
	    colorQuestion.setText("えいご(English)ではなんていう？えらんでね！");
	    colorQuestion.setFont(new Font("Arial", Font.PLAIN, 24));
	    //colorQuestion.setAlignmentX(0.5f);
	    
	    JButton colorOptionLeft = new JButton("Blue");
	    JButton colorOptionRight = new JButton("Red");
	    colorOptionLeft.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    colorOptionRight.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	   
	    
	    //card3に足したいコンポーネントを上から順に追加
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
	    //animalQuestionBtn.setAlignmentX(0.5f);
	    
	    JLabel animalQuestion = new JLabel();
	    animalQuestion.setText("えいご(English)ではなんていう？えらんでね！");
	    animalQuestion.setFont(new Font("Arial", Font.PLAIN, 24));
	    //animalQuestion.setAlignmentX(0.5f);
	    
	    JButton animalOptionLeft = new JButton("Rabbit");
	    JButton animalOptionRight = new JButton("Cat");
	    animalOptionLeft.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    animalOptionRight.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    
	    //card4に足したいコンポーネントを上から順に追加
	    card4.add(animalQuestionBtn);
	    card4.add(animalQuestion);
	    card4.add(animalOptionLeft);
	    card4.add(animalOptionRight);
	    card4.setBackground(new Color(255, 240, 245));

	    
	    JPanel card6 = new CorrectPanel();
	    JPanel card7 = new IncorrectPanel();
	    //card6.add(backBtnPanel);
	    //card6.add(backBtn);
	    card7.add(backBtn);
	    
	    //card7.add(backBtnPanel);
	    
	    
        fruitbtn.setActionCommand("fruitbtn");
	    
        layout = new CardLayout();
        //layout.setHgap(10);
        //layout.setVgap(25);
        
        Container contentPane = getContentPane();
	    
	    contentPane.setLayout(layout);
       
        contentPane.add(card1, "card1");//第二引数はcard1じゃなくてもいいっぽい？
        contentPane.add(card2, "card2");
        contentPane.add(card3, "card3");
        contentPane.add(card4, "card4");
        
        contentPane.add(card6, "correct");
        contentPane.add(card7, "incorrect");
        //contentPane.add(backBtnPanel, BorderLayout.PAGE_END);
       
	    
    }
    
    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();

        if (cmd.equals("fruitbtn")){
        	layout.show(getContentPane(), "card2");
        }else if (cmd.equals("colorbtn")){
        	layout.show(getContentPane(), "card3");
        }
        else if (cmd.equals("animalbtn")){
        	layout.show(getContentPane(), "card4");
        }
        else if (cmd.equals("appleAtari")){
        	//layout.show(getContentPane(), "card5");
        	layout.show(getContentPane(), "correct");
        }
        else if (cmd.equals("strawberryHazure")){
        	//IncorrectPanel incorrectpanel = new IncorrectPanel();
        	//incorrectpanel.setVisible(true);
        	layout.show(getContentPane(), "incorrect");	
        }
        else if (cmd.equals("backMenu")){
        	layout.show(getContentPane(), "card1");	
        }
      }
    
    /*public class EnglishListener extends MouseAdapter{
        public void mouseClicked(MouseEvent e){
        	Main clickBtn = new Main();
        	//ボタンをクリックしたらshowメソッドの第二引数のcard2とかが表示される
        	clickBtn.fruitbtn.addMouseListener(new MouseAdapter() {
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
     }*/

}    


