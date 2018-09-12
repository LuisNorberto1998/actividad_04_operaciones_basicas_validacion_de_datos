package controllers;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.ModelBasicOperations;
import views.ViewBasicOperations;

//@author Norberto
public class ControllerBasicOperations implements ActionListener {

    ModelBasicOperations modelBasicOperations;
    ViewBasicOperations viewBasicOperations;

    public ControllerBasicOperations(ModelBasicOperations modelBasicOperations, ViewBasicOperations viewBasicOperations) {
        this.modelBasicOperations = modelBasicOperations;
        this.viewBasicOperations = viewBasicOperations;
        this.viewBasicOperations.jbSum.addActionListener(this);
        this.viewBasicOperations.jbSubtract.addActionListener(this);
        this.viewBasicOperations.jbMultiplication.addActionListener(this);
        this.viewBasicOperations.jbDivision.addActionListener(this);
        this.viewBasicOperations.jbModule.addActionListener(this);
        initComponents();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewBasicOperations.jbSum) {
            btSum();
        } else if (e.getSource() == viewBasicOperations.jbSubtract) {
            btSubtract();
        } else if (e.getSource() == viewBasicOperations.jbMultiplication) {
            btMultiplication();
        } else if (e.getSource() == viewBasicOperations.jbDivision) {
            btDivision();
        } else if (e.getSource() == viewBasicOperations.jbModule) {
            btModule();
        }
    }

    public void btSum() {
        try {
            modelBasicOperations.setNumberOne(Float.parseFloat(viewBasicOperations.jtfNumberOne.getText()));
            modelBasicOperations.setNumberTwo(Float.parseFloat(viewBasicOperations.jtfNumberTwo.getText()));
            if (modelBasicOperations.getNumberOne().equals(0.0f) || modelBasicOperations.getNumberTwo().equals(0.0f)) {
                JOptionPane.showMessageDialog(null, "Zero use is not allowed");
            } else {
                float result = modelBasicOperations.getNumberOne() + modelBasicOperations.getNumberTwo();
                JOptionPane.showMessageDialog(null, modelBasicOperations.getNumberOne() + " + " + modelBasicOperations.getNumberTwo() + " = " + result, "Result", JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Only numbers \n" + e);
        }
    }

    public void btSubtract() {
        try {
            modelBasicOperations.setNumberOne(Float.parseFloat(viewBasicOperations.jtfNumberOne.getText()));
            modelBasicOperations.setNumberTwo(Float.parseFloat(viewBasicOperations.jtfNumberTwo.getText()));
            if (modelBasicOperations.getNumberOne().equals(0.0f) || modelBasicOperations.getNumberTwo().equals(0.0f)) {
                JOptionPane.showMessageDialog(null, "Zero use is not allowed");
            } else {
                float result = modelBasicOperations.getNumberOne() - modelBasicOperations.getNumberTwo();
                JOptionPane.showMessageDialog(null, modelBasicOperations.getNumberOne() + " - " + modelBasicOperations.getNumberTwo() + " = " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Only numbers \n" + e);
        }
    }

    public void btMultiplication() {
        try {

            modelBasicOperations.setNumberOne(Float.parseFloat(viewBasicOperations.jtfNumberOne.getText()));
            modelBasicOperations.setNumberTwo(Float.parseFloat(viewBasicOperations.jtfNumberTwo.getText()));
            if (modelBasicOperations.getNumberOne().equals(0.0f) || modelBasicOperations.getNumberTwo().equals(0.0f)) {
                JOptionPane.showMessageDialog(null, "Zero use is not allowed");
            } else {
                float result = modelBasicOperations.getNumberOne() * modelBasicOperations.getNumberTwo();
                JOptionPane.showMessageDialog(null, modelBasicOperations.getNumberOne() + " * " + modelBasicOperations.getNumberTwo() + " = " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Only numbers \n" + e);
        }
    }

    public void btDivision() {
        try {

            modelBasicOperations.setNumberOne(Float.parseFloat(viewBasicOperations.jtfNumberOne.getText()));
            modelBasicOperations.setNumberTwo(Float.parseFloat(viewBasicOperations.jtfNumberTwo.getText()));
            if (modelBasicOperations.getNumberOne().equals(0.0f) || modelBasicOperations.getNumberTwo().equals(0.0f)) {
                JOptionPane.showMessageDialog(null, "Zero use is not allowed");
            } else {
                float result = modelBasicOperations.getNumberOne() / modelBasicOperations.getNumberTwo();
                JOptionPane.showMessageDialog(null, modelBasicOperations.getNumberOne() + " / " + modelBasicOperations.getNumberTwo() + " = " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Only numbers \n" + e);
        }
    }

    public void btModule() {
        try {

            modelBasicOperations.setNumberOne(Float.parseFloat(viewBasicOperations.jtfNumberOne.getText()));
            modelBasicOperations.setNumberTwo(Float.parseFloat(viewBasicOperations.jtfNumberTwo.getText()));
            if (modelBasicOperations.getNumberOne().equals(0.0f) || modelBasicOperations.getNumberTwo().equals(0.0f)) {
                JOptionPane.showMessageDialog(null, "Zero use is not allowed");
            } else {
                float result = modelBasicOperations.getNumberOne() % modelBasicOperations.getNumberTwo();
                JOptionPane.showMessageDialog(null, modelBasicOperations.getNumberOne() + " % " + modelBasicOperations.getNumberTwo() + " = " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Only numbers \n" + e);
        }
    }

    private void initComponents() {
        viewBasicOperations.setTitle("Basic Operations MVC");
        viewBasicOperations.setLocationRelativeTo(null);
        viewBasicOperations.setResizable(false);
        viewBasicOperations.setVisible(true);
    }
}
