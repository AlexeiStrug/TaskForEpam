/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author SAV
 */
public class StartGui extends javax.swing.JFrame {

    /**
     * Creates new form StartGui
     */
    public StartGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonCA = new javax.swing.JLabel();
        ButtonDiv = new javax.swing.JLabel();
        ButtonTimes = new javax.swing.JLabel();
        ButtonMinus = new javax.swing.JLabel();
        ButtonPlus = new javax.swing.JLabel();
        ButtonEquals = new javax.swing.JLabel();
        ButtonDec = new javax.swing.JLabel();
        Button0 = new javax.swing.JLabel();
        Button1 = new javax.swing.JLabel();
        Button2 = new javax.swing.JLabel();
        Button3 = new javax.swing.JLabel();
        Button6 = new javax.swing.JLabel();
        Button5 = new javax.swing.JLabel();
        Button4 = new javax.swing.JLabel();
        Button7 = new javax.swing.JLabel();
        Button8 = new javax.swing.JLabel();
        Button9 = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Display = new javax.swing.JLabel();
        FontImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonCA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonCA.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonCA.setText("CA");
        ButtonCA.setToolTipText("");
        ButtonCA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonCA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ButtonCAMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ButtonCAMouseMoved(evt);
            }
        });
        ButtonCA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonCAMouseReleased(evt);
            }
        });
        getContentPane().add(ButtonCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 60, 40));

        ButtonDiv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonDiv.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDiv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonDiv.setText("/");
        ButtonDiv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonDiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonDivMouseReleased(evt);
            }
        });
        getContentPane().add(ButtonDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 60, 40));

        ButtonTimes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonTimes.setForeground(new java.awt.Color(255, 255, 255));
        ButtonTimes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonTimes.setText("*");
        ButtonTimes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonTimes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonTimesMouseReleased(evt);
            }
        });
        getContentPane().add(ButtonTimes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 60, 40));

        ButtonMinus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonMinus.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMinus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonMinus.setText("-");
        ButtonMinus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonMinusMouseReleased(evt);
            }
        });
        getContentPane().add(ButtonMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 60, 40));

        ButtonPlus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonPlus.setForeground(new java.awt.Color(255, 255, 255));
        ButtonPlus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonPlus.setText("+");
        ButtonPlus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonPlusMouseReleased(evt);
            }
        });
        getContentPane().add(ButtonPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 150, 60, 90));

        ButtonEquals.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonEquals.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEquals.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonEquals.setText("=");
        ButtonEquals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonEquals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonEqualsMouseReleased(evt);
            }
        });
        getContentPane().add(ButtonEquals, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 60, 90));

        ButtonDec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonDec.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonDec.setText(".");
        ButtonDec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonDec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonDecMouseReleased(evt);
            }
        });
        getContentPane().add(ButtonDec, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 60, 40));

        Button0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button0.setForeground(new java.awt.Color(255, 255, 255));
        Button0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button0.setText("0");
        Button0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button0MouseReleased(evt);
            }
        });
        getContentPane().add(Button0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 130, 40));

        Button1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button1.setForeground(new java.awt.Color(255, 255, 255));
        Button1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button1.setText("1");
        Button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button1MouseReleased(evt);
            }
        });
        getContentPane().add(Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 60, 40));

        Button2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button2.setForeground(new java.awt.Color(255, 255, 255));
        Button2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button2.setText("2");
        Button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button2MouseReleased(evt);
            }
        });
        getContentPane().add(Button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 60, 40));

        Button3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button3.setForeground(new java.awt.Color(255, 255, 255));
        Button3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button3.setText("3");
        Button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button3MouseReleased(evt);
            }
        });
        getContentPane().add(Button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 60, 40));

        Button6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button6.setForeground(new java.awt.Color(255, 255, 255));
        Button6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button6.setText("6");
        Button6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button6MouseReleased(evt);
            }
        });
        getContentPane().add(Button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 60, 40));

        Button5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button5.setForeground(new java.awt.Color(255, 255, 255));
        Button5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button5.setText("5");
        Button5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button5MouseReleased(evt);
            }
        });
        getContentPane().add(Button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 60, 40));

        Button4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button4.setForeground(new java.awt.Color(255, 255, 255));
        Button4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button4.setText("4");
        Button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button4MouseReleased(evt);
            }
        });
        getContentPane().add(Button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 60, 40));

        Button7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button7.setForeground(new java.awt.Color(255, 255, 255));
        Button7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button7.setText("7");
        Button7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button7MouseReleased(evt);
            }
        });
        getContentPane().add(Button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 60, 40));

        Button8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button8.setForeground(new java.awt.Color(255, 255, 255));
        Button8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button8.setText("8");
        Button8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button8MouseReleased(evt);
            }
        });
        getContentPane().add(Button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 60, 40));

        Button9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button9.setForeground(new java.awt.Color(255, 255, 255));
        Button9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button9.setText("9");
        Button9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button9MouseReleased(evt);
            }
        });
        getContentPane().add(Button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 60, 40));

        Close.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Close.setForeground(new java.awt.Color(255, 255, 255));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setText("X");
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CloseMouseReleased(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, -1));

        Display.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Display.setForeground(new java.awt.Color(255, 255, 255));
        Display.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 280, 48));

        FontImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/1.jpg"))); // NOI18N
        getContentPane().add(FontImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCAMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCAMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCAMouseDragged

    private void ButtonCAMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCAMouseMoved
     
    }//GEN-LAST:event_ButtonCAMouseMoved

    private void CloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseReleased
       System.exit(0);
    }//GEN-LAST:event_CloseMouseReleased

    private void Button0MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button0MouseReleased
        String PreVal = Display.getText() + "0";
        Display.setText(PreVal);
                
    }//GEN-LAST:event_Button0MouseReleased

    private void Button1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseReleased
         String PreVal = Display.getText() + "1";
         Display.setText(PreVal);
    }//GEN-LAST:event_Button1MouseReleased

    private void Button2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseReleased
         String PreVal = Display.getText() + "2";
         Display.setText(PreVal);
    }//GEN-LAST:event_Button2MouseReleased

    private void Button3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseReleased
         String PreVal = Display.getText() + "3";
         Display.setText(PreVal);
    }//GEN-LAST:event_Button3MouseReleased

    private void Button4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseReleased
         String PreVal = Display.getText() + "4";
         Display.setText(PreVal);
    }//GEN-LAST:event_Button4MouseReleased

    private void Button5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseReleased
         String PreVal = Display.getText() + "5";
         Display.setText(PreVal);
    }//GEN-LAST:event_Button5MouseReleased

    private void Button6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button6MouseReleased
         String PreVal = Display.getText() + "6";
         Display.setText(PreVal);
    }//GEN-LAST:event_Button6MouseReleased

    private void Button7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button7MouseReleased
         String PreVal = Display.getText() + "7";
         Display.setText(PreVal);
    }//GEN-LAST:event_Button7MouseReleased

    private void Button8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button8MouseReleased
         String PreVal = Display.getText() + "8";
         Display.setText(PreVal);
    }//GEN-LAST:event_Button8MouseReleased

    private void Button9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button9MouseReleased
         String PreVal = Display.getText() + "9";
         Display.setText(PreVal);
    }//GEN-LAST:event_Button9MouseReleased

    private void ButtonDivMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDivMouseReleased
         String PreVal = Display.getText() + "/";
         Display.setText(PreVal);
    }//GEN-LAST:event_ButtonDivMouseReleased

    private void ButtonTimesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonTimesMouseReleased
         String PreVal = Display.getText() + "*";
         Display.setText(PreVal);
    }//GEN-LAST:event_ButtonTimesMouseReleased

    private void ButtonMinusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonMinusMouseReleased
         String PreVal = Display.getText() + "-";
         Display.setText(PreVal);
    }//GEN-LAST:event_ButtonMinusMouseReleased

    private void ButtonPlusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonPlusMouseReleased
         String PreVal = Display.getText() + "+";
         Display.setText(PreVal);
    }//GEN-LAST:event_ButtonPlusMouseReleased

    private void ButtonCAMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCAMouseReleased
        Display.setText("");
    }//GEN-LAST:event_ButtonCAMouseReleased

    private void ButtonEqualsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonEqualsMouseReleased
      ScriptEngineManager SEM = new ScriptEngineManager();
      ScriptEngine SE = SEM.getEngineByName("JavaScript");
      
      try
      {
         Display.setText(SE.eval(Display.getText()).toString());
      }
      catch (ScriptException e)
      {
          System.out.println("Error: " + e); 
      }
    }//GEN-LAST:event_ButtonEqualsMouseReleased

    private void ButtonDecMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDecMouseReleased
         String PreVal = Display.getText() + ".";
         Display.setText(PreVal);
    }//GEN-LAST:event_ButtonDecMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button0;
    private javax.swing.JLabel Button1;
    private javax.swing.JLabel Button2;
    private javax.swing.JLabel Button3;
    private javax.swing.JLabel Button4;
    private javax.swing.JLabel Button5;
    private javax.swing.JLabel Button6;
    private javax.swing.JLabel Button7;
    private javax.swing.JLabel Button8;
    private javax.swing.JLabel Button9;
    private javax.swing.JLabel ButtonCA;
    private javax.swing.JLabel ButtonDec;
    private javax.swing.JLabel ButtonDiv;
    private javax.swing.JLabel ButtonEquals;
    private javax.swing.JLabel ButtonMinus;
    private javax.swing.JLabel ButtonPlus;
    private javax.swing.JLabel ButtonTimes;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Display;
    private javax.swing.JLabel FontImg;
    // End of variables declaration//GEN-END:variables
}
