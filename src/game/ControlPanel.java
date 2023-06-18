package game;

import city.cs.engine.SoundClip;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControlPanel {
    private final Game game;
    private JPanel mainPanel;
    private JButton pauseButton ;
    private JButton resumeButton;
    private JButton quitButton;
    private JSlider slider1;


    public ControlPanel(Game game) {
        this.game=game;









    }

    public JPanel getMainPanel(){
        return mainPanel;
    }

}

