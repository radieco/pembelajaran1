import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// 1. jet frames
        JFrame jFrame = new JFrame("hello word frem");
// 2. set  content pane
        jFrame.setContentPane(new TableFrom().panel1);

        // 3. jika tombol x di klik
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 4. pack
        jFrame.setSize(800,800);

        jFrame.setVisible(true);
    }
}