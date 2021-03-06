
import java.util.Scanner;

/*
 * Launa Bucher-Austin
 * This program allows the user to input a diameter for their pizza and find out the price of their order.
 * February 25 2020
 */

/**
 *
 * @author labuc9806
 */
public class makingpizzafrm extends javax.swing.JFrame {

    /**
     * Creates new form makingpizzafrm
     */
    public makingpizzafrm() {
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

        jPanel1 = new javax.swing.JPanel();
        diameterlbl = new javax.swing.JLabel();
        diametertxt = new javax.swing.JTextField();
        calcbtn = new javax.swing.JButton();
        subtlbl = new javax.swing.JLabel();
        taxeslbl = new javax.swing.JLabel();
        totallbl = new javax.swing.JLabel();
        messagelbl = new javax.swing.JLabel();
        subt = new javax.swing.JLabel();
        tax = new javax.swing.JLabel();
        total = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        diameterlbl.setText("Diameter of pizza (cm) : ");

        calcbtn.setText("Calculate");
        calcbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcbtnActionPerformed(evt);
            }
        });

        subtlbl.setText("Subtotal ($) :");

        taxeslbl.setText("Taxes :");

        totallbl.setText("Total : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(messagelbl))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(calcbtn)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(taxeslbl, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(diameterlbl)
                                    .addComponent(totallbl, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(subtlbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(subt)
                                        .addGap(6, 6, 6)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(diametertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tax)
                            .addComponent(total))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diameterlbl)
                    .addComponent(diametertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calcbtn)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtlbl)
                    .addComponent(subt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taxeslbl)
                    .addComponent(tax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totallbl)
                    .addComponent(total))
                .addGap(18, 18, 18)
                .addComponent(messagelbl)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcbtnActionPerformed
        
        
        Scanner keyedInput = new Scanner (System.in);
        double diameter; 
        double subtotal; 
        double labour;
        double rent;
        double taxes;
        double total1;
       
        diameter = Integer.parseInt(diametertxt.getText());
        
        rent = 0.99;
        labour = 0.75;
        subtotal = 0.5*diameter + labour + rent;
        taxes = 0.13*subtotal;
        total1 = subtotal + taxes;
        
        //diameter is between 1cm and 15cm
        
        if (diameter <= 15 )
        { 
            //rounding values
            total1 = total1*100;
            total1 = Math.round(total1);
            total1 = total1/100;
            
            subtotal = subtotal*100;
            subtotal = Math.round(subtotal);
            subtotal = subtotal/100;
            
            taxes = taxes*100;
            taxes = Math.round(taxes);
            taxes = taxes/100;
            
            // text and integer outputs
            messagelbl.setText (String.valueOf("We are going to make you a cute little pizza!"));
            subt.setText (String.valueOf (""+subtotal+""));
            tax.setText (String.valueOf (""+taxes+"") );
            total.setText (String.valueOf (""+total1+""));
            
          
            
            //if diamerer is under 40 cm
        }
       
        else if (diameter < 40)
        {
            //rounding values
            total1 = total1*100;
            total1 = Math.round(total1);
            total1 = total1/100;
            
            subtotal = subtotal*100;
            subtotal = Math.round(subtotal);
            subtotal = subtotal/100;
            
            taxes = taxes*100;
            taxes = Math.round(taxes);
            taxes = taxes/100;
            
         //text and integer outputs   
         messagelbl.setText (String.valueOf("This will be delicious!"));
         subt.setText (String.valueOf (""+subtotal+""));
         tax.setText (String.valueOf (""+taxes+"") );
         total.setText (String.valueOf (""+total1+""));
         
            
            //if diameter is over 40 cm
        }
            else if (diameter > 40)
                
            { 
                
             // rounding values   
            total1 = total1*100;
            total1 = Math.round(total1);
            total1 = total1/100;
            
            subtotal = subtotal*100;
            subtotal = Math.round(subtotal);
            subtotal = subtotal/100;
            
            taxes = taxes*100;
            taxes = Math.round(taxes);
            taxes = taxes/100;
            
         //text and integer outputs   
         messagelbl.setText (String.valueOf("Woah, big pizza! You might need a truck to get this home!"));
         subt.setText (String.valueOf (""+subtotal+""));
         tax.setText (String.valueOf (""+taxes+"") );
         total.setText (String.valueOf (""+total1+""));
         
          
         
            
                    
            
            
            
            
            
            
        }
             
        
        
        
       
        
    }//GEN-LAST:event_calcbtnActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(makingpizzafrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(makingpizzafrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(makingpizzafrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(makingpizzafrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new makingpizzafrm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcbtn;
    private javax.swing.JLabel diameterlbl;
    private javax.swing.JTextField diametertxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel messagelbl;
    private javax.swing.JLabel subt;
    private javax.swing.JLabel subtlbl;
    private javax.swing.JLabel tax;
    private javax.swing.JLabel taxeslbl;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totallbl;
    // End of variables declaration//GEN-END:variables
}
