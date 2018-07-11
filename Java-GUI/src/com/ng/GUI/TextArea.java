package com.ng.GUI;
import javax.swing.*;
import java.awt.*;

public class TextArea extends JPanel
{
    private JTextArea textArea;

    public TextArea()
    {
        textArea = new JTextArea();

        setLayout(new BorderLayout());

        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }
    public void appendText(String text)
    {
        textArea.append(text);
    }
}
