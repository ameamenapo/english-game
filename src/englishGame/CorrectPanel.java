package englishGame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CorrectPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	//コンポーネント
	JLabel menuLavel;
	CardLayout layout;
	JButton fruitbtn;
	JButton colorbtn;
	JButton animalbtn;
	
	
	public CorrectPanel(){
		//パネルサイズと貼り付け位置の設定は不要（CardLayoutが勝手に画面サイズに合わせてくれる）
				this.setLayout(null);//レイアウトの設定
				this.setBackground(new Color(255, 240, 245)); //背景の色
				//その他の追加設定をここに追加
				// コンストラクタが呼ばれた後手動で呼び出す
	}
	public void prepareComponents() {   
	  //パネル作成
	    JPanel card5 = new JPanel();
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

	  //card5に足したいコンポーネントを上から順に追加
	    card5.add(correctLabel);
	    card5.add(nextBtn);
	    card5.add(catLabel);
	    card5.add(atariYohakuLabel);
	    card5.add(atariYohakuLabel2);
	    card5.add(atariBackBtnPanel);
	    //card5.add(backBtnPanel);ここに入れると変になる。card2の戻るボタンが消える
	    card5.setBackground(new Color(255, 240, 245));
	    
	   
	}
	
	
    
}
/*public class CorrectPanel extends JPanel {
	
	public CorrectPanel(){
		
		 //パネル作成
	    JPanel p1 = new JPanel();
	    JPanel p2 = new JPanel();
	    p1.setBackground(new Color(255, 240, 245));
	    p2.setBackground(new Color(255, 240, 245));
	    
	    JLabel correctLabel = new JLabel();
	    correctLabel.setText("アタリ！");
	    correctLabel.setFont(new Font("Arial", Font.PLAIN, 30));
	    //correctLabel.setAlignmentY(0.5f);
	    //correctLabel.setOpaque(true);これ入れると背景の色がオフ。falseだと色つく。
	    correctLabel.setHorizontalAlignment(JLabel.CENTER);
	    
	    
	    JButton nextBtn = new JButton("つぎのもんだい");
	    nextBtn.setFont(new Font("Arial", Font.PLAIN, 24));
	    nextBtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。聞いてない
	    //nextBtn.setBorderPainted(false);//元々設定されてた色をオフ？
	    //nextBtn.setBackground(null);//背景をデフォルトに？
	    //nextBtn.setContentAreaFilled(false);
	    nextBtn.setBackground(Color.BLUE);//ボタンの色。聞いてない
	 
	    
	    
	    ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("cat.png"));
	    JLabel catLabel = new JLabel(icon);
	      
	    //p1.setBackground(new Color(255, 240, 245));
	    //p2.setBackground(new Color(255, 240, 245));
	    
	    
	    
	    setLayout(new GridLayout(2, 1));
        add(p1);
        add(p2);
        p1.setLayout(new GridLayout(1, 1));
        p2.setLayout(new GridLayout(1, 2));
  
        
        p1.add(correctLabel);
        p2.add(nextBtn);
        p2.add(catLabel);
        
     // 現在のLook&Feelの名前を表示する
	    /*JLabel l1 = new JLabel(UIManager.getLookAndFeel().getName());
	    p2.add(l1);*/

	    // Look&FeelをMetalに変更する
	    /*try {
	    UIManager.setLookAndFeel(new MetalLookAndFeel());
	    } catch (UnsupportedLookAndFeelException e) {
	    e.printStackTrace();
	    }
	    SwingUtilities.updateComponentTreeUI(nextBtn);*/

	    // 変更後のLook&Feelの名前を表示する
	    /*JLabel l2 = new JLabel(UIManager.getLookAndFeel().getName());
	    p2.add(l2);

	    }*/
	  
	//}
	  

//}
