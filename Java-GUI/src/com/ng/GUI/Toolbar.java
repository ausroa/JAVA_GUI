package com.ng.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;

public class Toolbar extends JPanel implements ActionListener {

    private JButton helloBtn = new JButton("Hello");
    private JButton goodbyeBtn = new JButton("Goodbye");
    private StringListener textListener;

    public Toolbar()
    {
        helloBtn.addActionListener(this);
        goodbyeBtn.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloBtn);
        add(goodbyeBtn);

        Border innerBorder = BorderFactory.createTitledBorder("Menu");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
    }
    public void setStringListener(StringListener listener)
    {
        this.textListener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton clicked = (JButton)e.getSource();

        if (clicked == helloBtn)
        {
            if (textListener != null)
            {
                textListener.textEmitted("Hello\n");
            }
        }
        else if (clicked == goodbyeBtn)
        {
            textListener.textEmitted("Goodbye\n");
        }
    }
}
