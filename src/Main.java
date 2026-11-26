import javax.swing.*;
import java.awt.*;
import java.net.URI;
import javax.sound.sampled.*;

void main() throws IOException, UnsupportedAudioFileException, LineUnavailableException {

    JFrame janela = new JFrame("Big Red Button");
    JButton botão = new JButton();
    Dimension tamanho = new Dimension(800, 600);
    JPanel painel = new JPanel();
    var url = ClassLoader.getSystemResource("pngwing.com.png");
    ImageIcon icone = new ImageIcon(url);
    var Rickroll = ClassLoader.getSystemResourceAsStream("Rickroll.wav");
    var RickAudio = AudioSystem.getAudioInputStream(Rickroll);
    Clip Rickclip = AudioSystem.getClip();
    Rickclip.open(RickAudio);

    botão.setPreferredSize(tamanho);
    botão.setIcon(icone);
    botão.addActionListener(evento -> Rickclip.start());
    painel.add(botão);
    janela.add(painel);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setSize(800, 600);
    janela.setVisible(true);

}
