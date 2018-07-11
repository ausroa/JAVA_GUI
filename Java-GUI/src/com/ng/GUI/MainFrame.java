package com.ng.GUI;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private TextArea textArea;
    private Toolbar toolbar;
    private FormPanel formPanel;

    public MainFrame()
    {
        super("App");

        setLayout(new BorderLayout());

        formPanel = new FormPanel();
        toolbar = new Toolbar();
        TextArea textArea = new TextArea();

        toolbar.setStringListener(new StringListener()
        {
            @Override
            public void textEmitted(String text)
            {
                textArea.appendText(text);
            }
        });

        formPanel.setFormListener(new FormListener()
        {

            public void formEventOccurred(FormEvent e)
            {
                String name = e.getName();
                String occupation = e.getOccupation();

                textArea.appendText(name + ": " + occupation + "\n");
            }
        });

        add(formPanel, BorderLayout.WEST);
        add(toolbar, BorderLayout.NORTH);
        add(textArea, BorderLayout.CENTER);

        setVisible(true);
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
