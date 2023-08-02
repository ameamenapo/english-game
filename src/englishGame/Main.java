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

import javax.swing.ImageIcon;
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
        menutext.setFont(new Font("Arial", Font.PLAIN, 28));
        menutext.setPreferredSize(new Dimension(800, 200));//画面縦サイズ半分を指定することで位置調整
        menutext.setHorizontalAlignment(JLabel.CENTER);
        
        //フルーツボタンの上に載せる空ラベル。これがないと他のコンポーネントとの位置調整できない
        JLabel fruitbtnLabel = new JLabel();
        fruitbtnLabel.setPreferredSize(new Dimension(800, 30));//横いっぱいにして残りボタン２つを下にさげる
        //フルーツボタン
        JButton fruitbtn = new JButton("くだもの");
        fruitbtn.setPreferredSize(new Dimension(250, 100));//ボタンの大きさ。
        fruitbtn.addActionListener(this);
        fruitbtn.setActionCommand("fruitbtn");
        fruitbtn.setFont(new Font("Arial", Font.PLAIN, 28));
        //fruitbtn.setBorderPainted(false);//元々設定されてた色をオフ？
        //fruitbtn.setBackground(null);//背景をデフォルトに？
        //fruitbtn.setContentAreaFilled(false);
        fruitbtn.setBackground(new Color(240, 95, 141));//色変更したいが利かない
        
        fruitbtnLabel.add(fruitbtn);//いらないかも
        
        JButton colorbtn = new JButton("いろ");
        colorbtn.setPreferredSize(new Dimension(250, 100));//ボタンの大きさ。
        colorbtn.addActionListener(this);
        colorbtn.setActionCommand("colorbtn");
        colorbtn.setFont(new Font("Arial", Font.PLAIN, 28));
        
        JButton animalbtn = new JButton("どうぶつ");
        animalbtn.setPreferredSize(new Dimension(250, 100));//ボタンの大きさ。
        animalbtn.addActionListener(this);
        animalbtn.setActionCommand("animalbtn");
        animalbtn.setFont(new Font("Arial", Font.PLAIN, 28));
        
        
	    
        //カードにコンポーネント追加
        card1.add(menutext);
        card1.add(fruitbtn);//①ボタン
    	card1.add(fruitbtnLabel);//②ラベル。も下のボタンも両方載せないとだめ。
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
	    
	  //フルーツボタンの上に載せる空ラベル。これがないと他のコンポーネントとの位置調整できない
        JLabel fruitsYohakuLabel = new JLabel();
        fruitsYohakuLabel.setPreferredSize(new Dimension(800, 50));//横いっぱいにして他コンポーネントを下にさげる
        
        JLabel fruitQuestionLabel = new JLabel("りんご");
        fruitQuestionLabel.setPreferredSize(new Dimension(800, 100));//ラベルの大きさ。
        fruitQuestionLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        fruitQuestionLabel.setForeground(Color.RED);
        fruitQuestionLabel.setHorizontalAlignment(JLabel.CENTER);
	    //fruitQuestionBtn.setAlignmentX(0.5f);これを入れても聞かない。文字を大きくして縦にする
	    
	    JLabel fruitQuestion = new JLabel();
	    fruitQuestion.setText("えいご(English)ではなんていう？えらんでね！");
	    fruitQuestion.setFont(new Font("Arial", Font.PLAIN, 24));
	    //fruitQuestion.setAlignmentX(0.5f);これを入れても聞かない。文字を大きくして縦にする
	    
	    JLabel fruitsYohakuLabel2 = new JLabel();
        fruitsYohakuLabel2.setPreferredSize(new Dimension(800, 50));
        
	    JButton fruitOptionLeft = new JButton("Apple");
	    fruitOptionLeft.setFont(new Font("Arial", Font.PLAIN, 28));
	    fruitOptionLeft.addActionListener(this);
	    fruitOptionLeft.setActionCommand("appleAtari");
	    JButton fruitOptionRight = new JButton("Strawberry");
	    fruitOptionRight.setFont(new Font("Arial", Font.PLAIN, 28));
	    fruitOptionRight.addActionListener(this);
	    fruitOptionRight.setActionCommand("strawberryHazure");
	    fruitOptionLeft.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    fruitOptionRight.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    
	    JLabel fruitsYohakuLabel3 = new JLabel();
        fruitsYohakuLabel3.setPreferredSize(new Dimension(800, 100));
        
        JLabel backBtnYohakuLabel = new JLabel();
        backBtnYohakuLabel.setPreferredSize(new Dimension(600, 100));
	    
	    JPanel backBtnPanel = new JPanel();
	    JButton backBtn = new JButton("やめる");
	    backBtn.setFont(new Font("Arial", Font.PLAIN, 20));
	    backBtn.setPreferredSize(new Dimension(100, 100));//ボタンの大きさ。
	    //backBtn.setBackground(Color.BLUE);//ボタンの色。聞いてない
	    //backBtn.setAlignmentY(0.5f);//縦にしたい。聞いてない
	    backBtn.addActionListener(this);
	    backBtn.setActionCommand("backMenu");
	    
	    backBtnPanel.setBackground(null);//これを入れないとボタンの周りが色違くなる
	    backBtnPanel.add(backBtn);
	   
	    
	    //card2に足したいコンポーネントを上から順に追加
	    card2.add(fruitsYohakuLabel);
	    card2.add(fruitQuestionLabel);
	    card2.add(fruitQuestion);
	    card2.add(fruitsYohakuLabel2);
	    card2.add(fruitOptionLeft);
	    card2.add(fruitOptionRight);
	    card2.add(fruitsYohakuLabel3);
	    
	    card2.add(backBtnYohakuLabel);
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
	    //card3.add(backBtnPanel);
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
	    
////////////////////////////////ここからcard5(フルーツ問題２)/////////////////////////////////////////	    
	  //パネル作成
	    JPanel card5 = new JPanel();
	    //コンポーネント(ボタンとか)作成
	    
	  //フルーツボタンの上に載せる空ラベル。これがないと他のコンポーネントとの位置調整できない
        JLabel fruitsYohakuLabel4 = new JLabel();
        fruitsYohakuLabel2.setPreferredSize(new Dimension(800, 50));//横いっぱいにして他コンポーネントを下にさげる
        
        JLabel fruitQuestionLabel2 = new JLabel("バナナ");
        fruitQuestionLabel2.setPreferredSize(new Dimension(800, 100));//ラベルの大きさ。
        fruitQuestionLabel2.setFont(new Font("Arial", Font.PLAIN, 30));
        fruitQuestionLabel2.setForeground(Color.RED);
        fruitQuestionLabel2.setHorizontalAlignment(JLabel.CENTER);
	    //fruitQuestionBtn.setAlignmentX(0.5f);これを入れても聞かない。文字を大きくして縦にする
	    
	    JLabel fruitQuestion2 = new JLabel();
	    fruitQuestion2.setText("えいご(English)ではなんていう？えらんでね！");
	    fruitQuestion2.setFont(new Font("Arial", Font.PLAIN, 24));
	    //fruitQuestion.setAlignmentX(0.5f);これを入れても聞かない。文字を大きくして縦にする
	    
	    JLabel fruitsYohakuLabel5 = new JLabel();
        fruitsYohakuLabel5.setPreferredSize(new Dimension(800, 50));
        
	    JButton fruitOptionLeft2 = new JButton("Banana");
	    fruitOptionLeft2.setFont(new Font("Arial", Font.PLAIN, 28));
	    fruitOptionLeft2.addActionListener(this);
	    fruitOptionLeft2.setActionCommand("bananaeAtari");
	    JButton fruitOptionRight2 = new JButton("Blueberry");
	    fruitOptionRight2.setFont(new Font("Arial", Font.PLAIN, 28));
	    fruitOptionRight2.addActionListener(this);
	    fruitOptionRight2.setActionCommand("blueberryHazure");
	    fruitOptionLeft2.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    fruitOptionRight2.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    
	    JLabel fruitsYohakuLabel6 = new JLabel();
        fruitsYohakuLabel6.setPreferredSize(new Dimension(800, 100));
        
        JLabel backBtnYohakuLabel2 = new JLabel();
        backBtnYohakuLabel2.setPreferredSize(new Dimension(600, 100));
	    
	    JPanel backBtnPanel2 = new JPanel();
	    JButton backBtn2 = new JButton("やめる");
	    backBtn2.setFont(new Font("Arial", Font.PLAIN, 20));
	    backBtn2.setPreferredSize(new Dimension(100, 100));//ボタンの大きさ。
	    //backBtn.setBackground(Color.BLUE);//ボタンの色。聞いてない
	    //backBtn.setAlignmentY(0.5f);//縦にしたい。聞いてない
	    backBtn2.addActionListener(this);
	    backBtn2.setActionCommand("backMenu");
	    
	    backBtnPanel2.setBackground(null);//これを入れないとボタンの周りが色違くなる
	    backBtnPanel2.add(backBtn2);
	   
	    
	    //card2に足したいコンポーネントを上から順に追加
	    card5.add(fruitsYohakuLabel4);
	    card5.add(fruitQuestionLabel2);
	    card5.add(fruitQuestion2);
	    card5.add(fruitsYohakuLabel5);
	    card5.add(fruitOptionLeft2);
	    card5.add(fruitOptionRight2);
	    card5.add(fruitsYohakuLabel6);
	    
	    card5.add(backBtnYohakuLabel2);
	    card5.add(backBtnPanel2);
	    card5.setBackground(new Color(255, 240, 245));
////////////////////////////////ここからcorrect(正解画面)/////////////////////////////////////////		    
	    //パネル作成
	    JPanel correct = new JPanel();
	    //コンポーネント(ボタンとか)作成
	    JLabel correctLabel = new JLabel();
	    correctLabel.setText("アタリ！");
	    correctLabel.setFont(new Font("Arial", Font.PLAIN, 30));
	    correctLabel.setPreferredSize(new Dimension(800, 250));//画面縦サイズ半分を指定することで位置調整
	    correctLabel.setHorizontalAlignment(JLabel.CENTER);
	        
	    JButton nextBtn = new JButton("つぎのもんだい");
	    nextBtn.setFont(new Font("Arial", Font.PLAIN, 24));
	    nextBtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	    nextBtn.setBackground(Color.BLUE);//ボタンの色。聞いてない
	    nextBtn.addActionListener(this);
	    nextBtn.setActionCommand("fruitsNext");
	 
	    
	    ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("cat.png"));
	    JLabel catLabel = new JLabel(icon);
	    
	    JLabel atariYohakuLabel = new JLabel();
	    atariYohakuLabel.setPreferredSize(new Dimension(800, 30));
        
        JLabel atariYohakuLabel2 = new JLabel();
        atariYohakuLabel2.setPreferredSize(new Dimension(600, 0));
	    
	    JPanel atariBackBtnPanel = new JPanel();
	    JButton atariBackBtn = new JButton("やめる");
	    atariBackBtn.setFont(new Font("Arial", Font.PLAIN, 20));
	    atariBackBtn.setPreferredSize(new Dimension(100, 100));//ボタンの大きさ。
	    atariBackBtn.addActionListener(this);
	    atariBackBtn.setActionCommand("ataribackMenu");
	  
	    atariBackBtnPanel.add(atariBackBtn);
	    atariBackBtnPanel.setBackground(null);//これを入れないとボタンの周りが色違くなる
    
      //correctカードに足したいコンポーネントを上から順に追加
	    correct.add(correctLabel);
	    correct.add(nextBtn);
	    correct.add(catLabel);
	    correct.add(atariYohakuLabel);
	    correct.add(atariYohakuLabel2);
	    correct.add(atariBackBtnPanel);
	    //correctカード.add(backBtnPanel);ここに入れると変になる。card2の戻るボタンが消える
	    correct.setBackground(new Color(255, 240, 245));
	   
	    
////////////////////////////////ここからincorrect(不正解画面)/////////////////////////////////////////		    	    
	    //パネル作成
	    JPanel incorrect = new JPanel();
	   
	    JLabel incorrectLabel = new JLabel();
	    incorrectLabel.setText("ハズレ！");
	    incorrectLabel.setFont(new Font("Arial", Font.PLAIN, 30));
	    incorrectLabel.setPreferredSize(new Dimension(800, 250));//画面縦サイズ半分を指定することで位置調整
	    incorrectLabel.setHorizontalAlignment(JLabel.CENTER);
	    
	    
	    JButton nextBtn2 = new JButton("つぎのもんだい");
	    nextBtn2.setFont(new Font("Arial", Font.PLAIN, 24));
	    nextBtn2.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。聞いてない
	    nextBtn2.setBackground(Color.BLUE);//ボタンの色。聞いてない
	    
	    JButton retryBtn = new JButton("もう１かい！");
	    retryBtn.setFont(new Font("Arial", Font.PLAIN, 24));
	    retryBtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。聞いてない
	    //retryBtn.setBackground(Color.BLUE);//ボタンの色。聞いてない
	    retryBtn.addActionListener(this);
	    retryBtn.setActionCommand("retryBtn");
	    
	    JLabel hazureYohakuLabel = new JLabel();
	    hazureYohakuLabel.setPreferredSize(new Dimension(800, 50));
        
        JLabel hazureYohakuLabel2 = new JLabel();
        hazureYohakuLabel2.setPreferredSize(new Dimension(600, 50));
	    
	    JPanel hazureBackBtnPanel = new JPanel();
	    JButton hazureBackBtn = new JButton("やめる");
	    hazureBackBtn.setFont(new Font("Arial", Font.PLAIN, 20));
	    hazureBackBtn.setPreferredSize(new Dimension(100, 100));//ボタンの大きさ。
	    hazureBackBtn.addActionListener(this);
	    hazureBackBtn.setActionCommand("ataribackMenu");
	  
	    hazureBackBtnPanel.add(hazureBackBtn);
	    hazureBackBtnPanel.setBackground(null);//これを入れないとボタンの周りが色違くなる
	      
	  //incorrectカードに足したいコンポーネントを上から順に追加
	    incorrect.add(incorrectLabel);
	    incorrect.add(nextBtn2);
	    incorrect.add(retryBtn);
	    incorrect.add(hazureYohakuLabel);
	    incorrect.add(hazureYohakuLabel2);
	    incorrect.add(hazureBackBtnPanel);
	    incorrect.setBackground(new Color(255, 240, 245));
	    
	 
	    layout = new CardLayout();
        Container contentPane = getContentPane();
	    contentPane.setLayout(layout);
	    
        contentPane.add(card1, "card1");//第二引数はcard1じゃなくてもいいっぽい？
        contentPane.add(card2, "card2");
        contentPane.add(card3, "card3");
        contentPane.add(card4, "card4");
        
        contentPane.add(card5, "card5");
        
        contentPane.add(correct, "correct");
        contentPane.add(incorrect, "incorrect");
        
        
       
	    /*JPanel cardPanel = new JPanel();
	    layout = new CardLayout();
	    cardPanel.setLayout(layout);
	    
	    cardPanel.add(card1, "card1");
	    cardPanel.add(card2, "card2");
	    cardPanel.add(card3, "card3");
	    cardPanel.add(card4, "card4");*/
	    /* カード移動用ボタン */
	    /*JButton firstButton = new JButton("もどる");
	    firstButton.addActionListener(this);
	    firstButton.setActionCommand("First");
	    
	    JPanel btnPanel = new JPanel();
	    btnPanel.add(firstButton);
	    
	    getContentPane().add(cardPanel, BorderLayout.CENTER);
	    getContentPane().add(btnPanel, BorderLayout.PAGE_END);*/
    }
    
    
    
    public void actionPerformed (ActionEvent e){
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
        	layout.show(getContentPane(), "correct");
        }
        else if (cmd.equals("strawberryHazure")){
        	layout.show(getContentPane(), "incorrect");	
        }
        else if (cmd.equals("fruitsNext")){
        	layout.show(getContentPane(), "card5");
        }
        else if (cmd.equals("retryBtn")){
        	layout.show(getContentPane(), "card2");	
        }
        else if (cmd.equals("backMenu")){
        	layout.show(getContentPane(), "card1");	
        }
        else if (cmd.equals("ataribackMenu")){
        	layout.show(getContentPane(), "card1");	
        }
        else if (cmd.equals("bananaeAtari")){
        	layout.show(getContentPane(), "correct");
        }
        else if (cmd.equals("blueberryHazure")){
        	layout.show(getContentPane(), "incorrect");	
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


