package inscription;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User_inscription {


    private JPanel panel1 = new JPanel();
    private JTextField textField1 = new JTextField();
    private JLabel helloLabel = new JLabel();
    private JButton button1 = new JButton();


    public static void main(String[] args) {

        Controller frame = new Controller("User_interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setContentPane(new User_inscription().panel1);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.pack();
        /*JScrollPane scrollPane = new JScrollPane(frame);
        scrollPane.setBounds(700, 0, 100, 600);
        frame.setPreferredSize(new Dimension(scrollPane.getWidth() - 50, scrollPane.getHeight()*2));
        frame.add(scrollPane);
        frame.revalidate();*/



        frame.setSize(800, 900);
        frame.setVisible(true);
        frame.init();

        /*int fraWidth = frame.getWidth();//frame的宽
        int fraHeight = frame.getHeight();//frame的高
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        frame.setSize(screenWidth, screenHeight);
        frame.setLocation(0, 0);
        float proportionW = screenWidth/fraWidth;
        float proportionH = screenHeight/fraHeight;

        modifyComponentSize(frame, proportionW,proportionH);
        frame.toFront();*/

    }

/*    public static void modifyComponentSize(JFrame frame,float proportionW,float proportionH) {

        try {
            Component[] components = frame.getRootPane().getContentPane().getComponents();
            for (Component co : components) {
                float locX = co.getX() * proportionW;
                float locY = co.getY() * proportionH;
                float width = co.getWidth() * proportionW;
                float height = co.getHeight() * proportionH;
                co.setLocation((int) locX, (int) locY);
                co.setSize((int) width, (int) height);
                int size = (int) (co.getFont().getSize() * proportionH);
                Font font = new Font(co.getFont().getFontName(), co.getFont().getStyle(), size);
                co.setFont(font);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }*/









    public User_inscription() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


}
