package Client;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

//import Sawtooth_gen;
//import Sine_gen;
//import Square_gen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Display extends javax.swing.JFrame {

	/**
	 * Creates new form Display
	 */
	// static Sine_gen sin = new Sine_gen();
	// static Sawtooth_gen saw = new Sawtooth_gen();
	// static Square_gen square = new Square_gen();
	JFrame frame;

	public Display(TCPClient tcp, UDPClient udp) {
		initComponents();
		this.tcp = tcp;
		this.udp = udp;
		this.setVisible(true);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		Sine_Btn = new javax.swing.JButton();
		SineFreq = new javax.swing.JSlider();
		SineFreq.setMinimum(1);
		jLabel1 = new javax.swing.JLabel();
		SineAmp = new javax.swing.JSlider();
		SineAmp.setMinimum(1);
		jLabel2 = new javax.swing.JLabel();
		SineFreqLabel = new javax.swing.JLabel();
		SineAmpLabel = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		Square_Btn = new javax.swing.JButton();
		SquareDuty = new javax.swing.JSlider();
		jLabel5 = new javax.swing.JLabel();
		SquareDutyLabel = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		Sawtooth_Btn = new javax.swing.JButton();
		SawtoothFreq = new javax.swing.JSlider();
		SawtoothFreq.setMinimum(1);
		jLabel7 = new javax.swing.JLabel();
		SawtoothFreqLabel = new javax.swing.JLabel();

//		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		Sine_Btn.setText("Apply");
		Sine_Btn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Sine_BtnActionPerformed(evt);
			}
		});

		SineFreq.setMajorTickSpacing(99);
		SineFreq.setMinorTickSpacing(10);
		SineFreq.setPaintLabels(true);
		SineFreq.setPaintTicks(true);
		SineFreq.setValue(0);
		SineFreq.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				SineFreqStateChanged(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel1.setText("Frequency (Hz)");

		SineAmp.setMajorTickSpacing(99);
		SineAmp.setMinorTickSpacing(10);
		SineAmp.setPaintLabels(true);
		SineAmp.setPaintTicks(true);
		SineAmp.setValue(0);
		SineAmp.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				SineAmpStateChanged(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel2.setText("Amplitude");

		SineFreqLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		SineFreqLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		SineFreqLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		SineAmpLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		SineAmpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		SineAmpLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(SineAmp, javax.swing.GroupLayout.DEFAULT_SIZE,
														281, Short.MAX_VALUE)
												.addComponent(SineFreq, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGap(18, 18, 18)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(SineFreqLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 74,
														Short.MAX_VALUE)
												.addComponent(SineAmpLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(168, 168, 168)
										.addComponent(Sine_Btn))
								.addGroup(
										jPanel1Layout.createSequentialGroup().addGap(87, 87, 87).addComponent(jLabel2))
								.addGroup(
										jPanel1Layout.createSequentialGroup().addGap(68, 68, 68).addComponent(jLabel1)))
								.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addGap(52, 52, 52).addComponent(jLabel1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(SineFreqLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(SineFreq, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
						.addComponent(jLabel2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(SineAmpLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(SineAmp, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(60, 60, 60).addComponent(Sine_Btn).addContainerGap()));

		jTabbedPane1.addTab("Sine", jPanel1);

		Square_Btn.setText("Apply");
		Square_Btn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Square_BtnActionPerformed(evt);
			}
		});

		SquareDuty.setMajorTickSpacing(100);
		SquareDuty.setMinorTickSpacing(10);
		SquareDuty.setPaintLabels(true);
		SquareDuty.setPaintTicks(true);
		SquareDuty.setSnapToTicks(true);
		SquareDuty.setValue(0);
		SquareDuty.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				SquareDutyStateChanged(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel5.setText("Duty Cycle (%)");

		SquareDutyLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		SquareDutyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		SquareDutyLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(SquareDuty, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
							.addComponent(SquareDutyLabel, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addGap(158)
									.addComponent(Square_Btn))
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addGap(79)
									.addComponent(jLabel5)))
							.addGap(0, 171, Short.MAX_VALUE)))
					.addContainerGap())
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGap(93)
					.addComponent(jLabel5)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(SquareDutyLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(SquareDuty, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
					.addComponent(Square_Btn)
					.addContainerGap())
		);
		jPanel2.setLayout(jPanel2Layout);

		jTabbedPane1.addTab("Square", jPanel2);

		Sawtooth_Btn.setText("Apply");
		Sawtooth_Btn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Sawtooth_BtnActionPerformed(evt);
			}
		});

		SawtoothFreq.setMajorTickSpacing(99);
		SawtoothFreq.setMinorTickSpacing(10);
		SawtoothFreq.setPaintLabels(true);
		SawtoothFreq.setPaintTicks(true);
		SawtoothFreq.setSnapToTicks(true);
		SawtoothFreq.setValue(0);
		SawtoothFreq.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				SawtoothFreqStateChanged(evt);
			}
		});

		jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel7.setText("Frequency (Hz)");

		SawtoothFreqLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		SawtoothFreqLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		SawtoothFreqLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3Layout.setHorizontalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(SawtoothFreq, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(SawtoothFreqLabel, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
						.addGroup(jPanel3Layout.createSequentialGroup()
							.addGap(95)
							.addComponent(jLabel7)
							.addGap(0, 155, Short.MAX_VALUE))
						.addGroup(jPanel3Layout.createSequentialGroup()
							.addGap(163)
							.addComponent(Sawtooth_Btn)))
					.addContainerGap())
		);
		jPanel3Layout.setVerticalGroup(
			jPanel3Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addGap(89)
					.addComponent(jLabel7)
					.addGap(18)
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(SawtoothFreqLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(SawtoothFreq, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
					.addComponent(Sawtooth_Btn)
					.addContainerGap())
		);
		jPanel3.setLayout(jPanel3Layout);

		jTabbedPane1.addTab("Sawtooth", jPanel3);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
						.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void Sawtooth_BtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Sawtooth_BtnActionPerformed
		tcp.setSawtoothFreq(SawtoothFreq.getValue());
		tcp.setSendSawtooth(true);
		// JFrame frame = new JFrame();
		if (frame != null) {
			frame.dispose();
			frame = null;
			System.out.println("Frame is null: " + (frame == null));
		}
		if (frame == null) {
			frame = new JFrame();
		}
		frame.setSize(776, 471);
		frame.setTitle("Graphs");
		// frame.setLocationRelativeTo(null);
		// Sawtooth_gen draw = new Sawtooth_gen();
		// frame.getContentPane().add(draw);
		// frame.setVisible(true);

	}// GEN-LAST:event_Sawtooth_BtnActionPerformed

	private void Sine_BtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Sine_BtnActionPerformed
		tcp.setSineAmp(SineAmp.getValue());
		tcp.setSineFreq(SineFreq.getValue());
		tcp.setSendSine(true);
		// JFrame frame = new JFrame();

		if (frame != null) {
			frame.dispose();
			frame = null;
			System.out.println("Frame is null: " + (frame == null));
		}
		if (frame == null) {
			frame = new JFrame();
		}
		frame.setSize(776, 471);
		frame.setTitle("Graphs");
		//// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setLocationRelativeTo(null);
		// Sine_gen draw = new Sine_gen();
		// frame.getContentPane().add(draw);
		// frame.setVisible(true);

	}// GEN-LAST:event_Sine_BtnActionPerformed

	private void Square_BtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Square_BtnActionPerformed
		tcp.setSquarePWM(SquareDuty.getValue());
		tcp.setSendSquare(true);
		// JFrame frame = new JFrame();
		if (frame != null) {
			frame.dispose();
			frame = null;
			System.out.println("Frame is null: " + (frame == null));
		}
		if (frame == null) {
			frame = new JFrame();
		}
		frame.setSize(776, 471);
		frame.setTitle("Graphs");
		//// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setLocationRelativeTo(null);
		// Square_gen draw = new Square_gen();
		// frame.getContentPane().add(draw);
		// frame.setVisible(true);
	}// GEN-LAST:event_Square_BtnActionPerformed

	private void SineFreqStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_SineFreqStateChanged
		// TODO add your handling code here:
		SineFreqLabel.setText(Integer.toString(SineFreq.getValue()));
	}// GEN-LAST:event_SineFreqStateChanged

	private void SineAmpStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_SineAmpStateChanged
		// TODO add your handling code here:
		SineAmpLabel.setText(Integer.toString(SineAmp.getValue()));
	}// GEN-LAST:event_SineAmpStateChanged

	private void SquareDutyStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_SquareDutyStateChanged
		// TODO add your handling code here:
		SquareDutyLabel.setText(Integer.toString(SquareDuty.getValue()));
	}// GEN-LAST:event_SquareDutyStateChanged

	private void SawtoothFreqStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_SawtoothFreqStateChanged
		// TODO add your handling code here:
		SawtoothFreqLabel.setText(Integer.toString(SawtoothFreq.getValue()));
	}// GEN-LAST:event_SawtoothFreqStateChanged

	/**
	 * @param args
	 *            the command line arguments
	 */
	// public static void main(String args[]) {
	// /* Set the Nimbus look and feel */
	// //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code
	// (optional) ">
	// /* If Nimbus (introduced in Java SE 6) is not available, stay with the
	// default look and feel.
	// * For details see
	// http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
	// */
	// try {
	// for (javax.swing.UIManager.LookAndFeelInfo info :
	// javax.swing.UIManager.getInstalledLookAndFeels()) {
	// if ("Windows".equals(info.getName())) {
	// javax.swing.UIManager.setLookAndFeel(info.getClassName());
	// break;
	// }
	// }
	// } catch (ClassNotFoundException ex) {
	// java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// } catch (InstantiationException ex) {
	// java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// } catch (IllegalAccessException ex) {
	// java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	// java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// }
	// //</editor-fold>
	//
	// /* Create and display the form */
	// java.awt.EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// new Display().setVisible(true);
	// }
	// });
	//
	//
	//
	// }

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JSlider SawtoothFreq;
	private javax.swing.JLabel SawtoothFreqLabel;
	private javax.swing.JButton Sawtooth_Btn;
	private javax.swing.JSlider SineAmp;
	private javax.swing.JLabel SineAmpLabel;
	private javax.swing.JSlider SineFreq;
	private javax.swing.JLabel SineFreqLabel;
	private javax.swing.JButton Sine_Btn;
	private javax.swing.JSlider SquareDuty;
	private javax.swing.JLabel SquareDutyLabel;
	private javax.swing.JButton Square_Btn;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JTabbedPane jTabbedPane1;
	// End of variables declaration//GEN-END:variables
	private TCPClient tcp;
	private UDPClient udp;
}
