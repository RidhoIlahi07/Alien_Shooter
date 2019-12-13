package sprite;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class CollisionEx extends JFrame {
    String nama;   
    public CollisionEx(String nama) {
        this.nama=nama;
        initUI();
    }
    public CollisionEx() {
        
    }
    private void initUI() {
        
        add(new Board(this));
        this.dispose();
        setResizable(false);
        pack();
        setTitle("Alien Shooter");
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {        
        
        EventQueue.invokeLater(() -> {
            CollisionEx ex = new CollisionEx();
            ex.setVisible(true);
        });
    }    
}
