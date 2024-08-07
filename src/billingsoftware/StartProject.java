
package billingsoftware;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class StartProject extends javax.swing.JFrame {
 
    int delay=20;
    int i=1;
    Timer timer=new Timer(delay, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            jProgressBar1.setValue(i);
            if(i==30)
            {
                jLabel6.setText("Modules are loading...please wait...!!");
            }
            if(i==70)
            {
                jLabel6.setText("Project is about to start....please be ready...!!");
            }
            if(i==100)
            {
                timer.stop();
                
//                Login l=new Login();
//                l.setVisible(true);
                
                new Login().setVisible(true);
                setVisible(false);
            }
            i++;
        }
    });
    
    
    
    public StartProject() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to Billing Software");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/billing-software-icon.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 68, 420, 420));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Billing");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, -1, 60));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Software");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, -1, -1));

        jProgressBar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(255, 153, 102));
        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 556, 1040, 20));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Project Started....!!");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        timer.start();
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
