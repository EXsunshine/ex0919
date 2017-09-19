import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;


public class MainFrame extends Frame{
    
    private Button bt =new Button("exit");
    private Button bt2 =new Button("ADD");
    private Label bl=new Label("0");
    private int x =0;
    public MainFrame(){
        initComp();
    }


    private void initComp(){
        this.setLocation(100,120);
        this.setSize(400,300);
        this.setLayout(null);
        bt.setBounds(100,50,30,30);
        bt.setBackground(new Color(172,255, 211));
        bt2.setBounds(100,90,30,30);
        bt2.setBackground(new Color(254,255, 148));
        bl.setBounds(100,120,30,30);
        this.add(bt);
        this.add(bt2);
        this.add(bl);
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               x++;
               bl.setText(Integer.toString(x));
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                super.windowClosing(windowEvent);
                System.exit(0);
            }
        });


    }
}
