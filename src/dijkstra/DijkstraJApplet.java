/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DijkstraJApplet.java
 *
 * Created on Apr 29, 2011, 5:16:55 AM
 */
/**
 *
 * @author Linh
 */

package dijkstra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JApplet;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class DijkstraJApplet extends JApplet {

    /** Initializes the applet DijkstraJApplet */
    @Override
    public void init() {
	try {
	    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	} catch (Exception ex) {
	    
	}
	SwingUtilities.updateComponentTreeUI(this);
	super.init();
	try {
	    java.awt.EventQueue.invokeAndWait(new Runnable() {

		@Override
		public void run() {
		    initComponents();
		}
	    });
	} catch (Exception ex) {
	}
    }

    /** This method is called from within the init() method to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSaveFileChooser = new javax.swing.JFileChooser();
        jOpenFileChooser = new javax.swing.JFileChooser();
        pnButton = new javax.swing.JPanel();
        btnVertex = new javax.swing.JButton();
        btnEdge = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        btnEnd = new javax.swing.JButton();
        btnStep = new javax.swing.JButton();
        btnSolve = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        /*
        pnGraph = new javax.swing.JPanel();
        */this.pnGraph = new jGraphPanel();
        jTextStatus = new javax.swing.JTextField();
        jRandomCheck = new javax.swing.JCheckBox();
        /*
        pnHeap = new javax.swing.JPanel();
        */this.pnHeap = new jHeapPanel();
        jTextHeap = new javax.swing.JLabel();
        pnSolution = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jSolution = new javax.swing.JTextArea();

        jSaveFileChooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        jSaveFileChooser.setFileFilter(new AppFilter());

        jOpenFileChooser.setCurrentDirectory(new java.io.File("C:\\"));
            jOpenFileChooser.setFileFilter(new AppFilter());
            jOpenFileChooser.getAccessibleContext().setAccessibleParent(this);

            pnButton.setMinimumSize(new java.awt.Dimension(90, 300));

            btnVertex.setFont(new java.awt.Font("Monospaced", 0, 12));
            btnVertex.setText("Vertex");
            btnVertex.setToolTipText("Add new vertex");
            btnVertex.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            btnVertex.setMinimumSize(new java.awt.Dimension(70, 30));
            btnVertex.setPreferredSize(new java.awt.Dimension(70, 30));
            btnVertex.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnVertexMouseClicked(evt);
                }
            });

            btnEdge.setFont(new java.awt.Font("Monospaced", 0, 12));
            btnEdge.setText("Edge");
            btnEdge.setToolTipText("Add new edge");
            btnEdge.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            btnEdge.setMinimumSize(new java.awt.Dimension(70, 30));
            btnEdge.setPreferredSize(new java.awt.Dimension(70, 30));
            btnEdge.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnEdgeMouseClicked(evt);
                }
            });

            btnStart.setFont(new java.awt.Font("Monospaced", 0, 12));
            btnStart.setText("Start");
            btnStart.setToolTipText("Choose start vertical");
            btnStart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            btnStart.setMinimumSize(new java.awt.Dimension(70, 30));
            btnStart.setPreferredSize(new java.awt.Dimension(70, 30));
            btnStart.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnStartMouseClicked(evt);
                }
            });

            btnEnd.setFont(new java.awt.Font("Monospaced", 0, 12));
            btnEnd.setText("End");
            btnEnd.setToolTipText("Choose end vertical");
            btnEnd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            btnEnd.setMinimumSize(new java.awt.Dimension(70, 30));
            btnEnd.setPreferredSize(new java.awt.Dimension(70, 30));
            btnEnd.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnEndMouseClicked(evt);
                }
            });

            btnStep.setFont(new java.awt.Font("Monospaced", 0, 12));
            btnStep.setText("Step");
            btnStep.setToolTipText("Run algorithm step by step");
            btnStep.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            btnStep.setMinimumSize(new java.awt.Dimension(70, 30));
            btnStep.setPreferredSize(new java.awt.Dimension(70, 30));
            btnStep.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnStepMouseClicked(evt);
                }
            });

            btnSolve.setFont(new java.awt.Font("Monospaced", 0, 12));
            btnSolve.setText("Solve");
            btnSolve.setToolTipText("Solve current graph");
            btnSolve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            btnSolve.setMinimumSize(new java.awt.Dimension(70, 30));
            btnSolve.setPreferredSize(new java.awt.Dimension(70, 30));
            btnSolve.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnSolveMouseClicked(evt);
                }
            });

            btnClear.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
            btnClear.setText("Clear");
            btnClear.setToolTipText("Clear current graph");
            btnClear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            btnClear.setMaximumSize(new java.awt.Dimension(50, 50));
            btnClear.setMinimumSize(new java.awt.Dimension(70, 30));
            btnClear.setPreferredSize(new java.awt.Dimension(70, 30));
            btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnClearMouseClicked(evt);
                }
            });

            btnSave.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
            btnSave.setText("Save");
            btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnSaveMouseClicked(evt);
                }
            });

            btnOpen.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
            btnOpen.setText("Open");
            btnOpen.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnOpenMouseClicked(evt);
                }
            });

            javax.swing.GroupLayout pnButtonLayout = new javax.swing.GroupLayout(pnButton);
            pnButton.setLayout(pnButtonLayout);
            pnButtonLayout.setHorizontalGroup(
                pnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnButtonLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVertex, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdge, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStart, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(btnEnd, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(btnSolve, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(btnStep, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSave)
                        .addComponent(btnOpen))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pnButtonLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClear, btnEdge, btnEnd, btnOpen, btnSave, btnSolve, btnStart, btnStep, btnVertex});

            pnButtonLayout.setVerticalGroup(
                pnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnButtonLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnVertex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnEdge, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnSolve, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnStep, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnOpen, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addGap(29, 29, 29))
            );

            pnGraph.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Graph", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 12))); // NOI18N
            pnGraph.setToolTipText("Graph design here");
            pnGraph.setFont(new java.awt.Font("Monospaced", 0, 12));
            pnGraph.setMinimumSize(new java.awt.Dimension(600, 300));
            pnGraph.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseReleased(java.awt.event.MouseEvent evt) {
                    pnGraphMouseReleased(evt);
                }
            });
            pnGraph.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                public void mouseMoved(java.awt.event.MouseEvent evt) {
                    pnGraphMouseMoved(evt);
                }
            });

            jTextStatus.setEditable(false);
            jTextStatus.setFont(new java.awt.Font("Consolas", 0, 12));
            jTextStatus.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
            jTextStatus.setAutoscrolls(false);
            jTextStatus.setBorder(null);

            jRandomCheck.setFont(new java.awt.Font("Monospaced", 0, 10));
            jRandomCheck.setSelected(true);
            jRandomCheck.setText("Random length");
            jRandomCheck.setToolTipText("Set random length for edge");
            jRandomCheck.setEnabled(false);

            javax.swing.GroupLayout pnGraphLayout = new javax.swing.GroupLayout(pnGraph);
            pnGraph.setLayout(pnGraphLayout);
            pnGraphLayout.setHorizontalGroup(
                pnGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnGraphLayout.createSequentialGroup()
                    .addContainerGap(339, Short.MAX_VALUE)
                    .addGroup(pnGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnGraphLayout.createSequentialGroup()
                            .addComponent(jRandomCheck)
                            .addContainerGap())
                        .addComponent(jTextStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );
            pnGraphLayout.setVerticalGroup(
                pnGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnGraphLayout.createSequentialGroup()
                    .addComponent(jTextStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                    .addComponent(jRandomCheck)
                    .addContainerGap())
            );

            pnHeap.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Heap", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 12))); // NOI18N
            pnHeap.setToolTipText("Show fibonacci heap on solving");
            pnHeap.setFont(new java.awt.Font("Monospaced", 0, 12));
            pnHeap.setMinimumSize(new java.awt.Dimension(400, 250));

            jTextHeap.setFont(new java.awt.Font("Consolas", 0, 12));
            jTextHeap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

            javax.swing.GroupLayout pnHeapLayout = new javax.swing.GroupLayout(pnHeap);
            pnHeap.setLayout(pnHeapLayout);
            pnHeapLayout.setHorizontalGroup(
                pnHeapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnHeapLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTextHeap, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                    .addContainerGap())
            );
            pnHeapLayout.setVerticalGroup(
                pnHeapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnHeapLayout.createSequentialGroup()
                    .addComponent(jTextHeap, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(206, Short.MAX_VALUE))
            );

            pnSolution.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Solution", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 12))); // NOI18N
            pnSolution.setToolTipText("Result will show here");
            pnSolution.setMinimumSize(new java.awt.Dimension(290, 250));

            jSolution.setColumns(20);
            jSolution.setEditable(false);
            jSolution.setFont(new java.awt.Font("Monospaced", 0, 12));
            jSolution.setLineWrap(true);
            jSolution.setRows(4);
            jSolution.setToolTipText("Result will show here");
            jSolution.setWrapStyleWord(true);
            jSolution.setBorder(null);
            jSolution.setEnabled(false);
            jSolution.setFocusable(false);
            jScrollPane1.setViewportView(jSolution);

            javax.swing.GroupLayout pnSolutionLayout = new javax.swing.GroupLayout(pnSolution);
            pnSolution.setLayout(pnSolutionLayout);
            pnSolutionLayout.setHorizontalGroup(
                pnSolutionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
            );
            pnSolutionLayout.setVerticalGroup(
                pnSolutionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(pnButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pnGraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(pnHeap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pnSolution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pnGraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnHeap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnSolution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );
        }// </editor-fold>//GEN-END:initComponents

    private void btnVertexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVertexMouseClicked
	
	if (this.alState == StateAlgorithm.UNLOCK) {
	    this.jTextStatus.setText("Draw a vertex");
	    this.jRandomCheck.setEnabled(false);
	    this.drawType = DrawType.VERTEXS;
	    this.start = false;
	    this.end = false;
	    this.pnGraph.mDrag = false;
	    this.pnGraph.repaint();
	} else {
	    this.jTextStatus.setText("Can't not add, solving...");
	}
}//GEN-LAST:event_btnVertexMouseClicked

    private void btnEdgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEdgeMouseClicked
	
	if (this.alState == StateAlgorithm.UNLOCK) {
	    this.jTextStatus.setText("Draw an edge");
	    this.jRandomCheck.setEnabled(true);
	    this.draw = false;
	    this.drawType = DrawType.EDGES;
	    this.start = false;
	    this.end = false;
	    this.pnGraph.mDrag = false;
	    this.pnGraph.repaint();
	} else {
	    this.jTextStatus.setText("Can't not add, solving...");
	}
}//GEN-LAST:event_btnEdgeMouseClicked

    private void btnStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseClicked
	
	if (this.alState == StateAlgorithm.UNLOCK) {
	    this.drawType = DrawType.NODRAW;
	    this.jRandomCheck.setEnabled(false);
	    this.start = false;
	    this.end = false;
	    this.pnGraph.mDrag = false;
	    this.pnGraph.repaint();
	    if (this.startVertex != null) {
		this.jTextStatus.setText("Starting vertex has been chosen");
		return;
	    }
	    this.jTextStatus.setText("Choose starting vertex");
	    this.start = true;
	} else
	    this.jTextStatus.setText("Can't not choose, solving...");
}//GEN-LAST:event_btnStartMouseClicked

    private void btnEndMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEndMouseClicked
	
	if (this.alState == StateAlgorithm.UNLOCK) {
	    this.drawType = DrawType.NODRAW;
	    this.start = false;
	    this.end = false;
	    this.pnGraph.mDrag = false;
	    this.pnGraph.repaint();
	    this.jRandomCheck.setEnabled(false);
	    if (this.endVertex != null) {
		this.jTextStatus.setText("Ending vertex has been chosen");
		return;
	    }
	    this.jTextStatus.setText("Choose ending vertex");
	    this.end = true;
	} else {
	    this.jTextStatus.setText("Can't not choose, solving...");
	}
}//GEN-LAST:event_btnEndMouseClicked

    private void btnStepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStepMouseClicked
	
	if (this.alState == StateAlgorithm.SOLVED) {
	    this.jTextStatus.setText("Solved");
	    return;
	} else if (this.alState == StateAlgorithm.LOCK) {
	    this.jTextStatus.setText("Solving...");
	    this.dijkstraAlgorithm();
	    this.showResult();
	} else if (this.alState == StateAlgorithm.UNLOCK) {
	    this.drawType = DrawType.NODRAW;
	    this.start = false;
	    this.end = false;
	    this.pnGraph.mDrag = false;
	    this.pnGraph.repaint();
	    this.jRandomCheck.setEnabled(false);
	    if (this.startVertex == null) {
		this.jTextStatus.setText("Not chosen start vertex yet");
		return;
	    }
	    if (this.endVertex == null) {
		this.jTextStatus.setText("Not chosen end vertex yet");
		return;
	    }
	    
	    this.jTextStatus.setText("Solving...");
	    this.pnHeap.heap = new FibonacciHeap();
	    this.pnHeap.heap.insertVertex(this.startVertex);
	    this.alState = StateAlgorithm.LOCK;
	    this.dijkstraAlgorithm();
	    this.showResult();
	}
}//GEN-LAST:event_btnStepMouseClicked

    private void btnSolveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSolveMouseClicked
	
	if (this.alState == StateAlgorithm.SOLVED) {
	    this.jTextStatus.setText("Solved");
	    return;
	} else if (this.alState == StateAlgorithm.UNLOCK) {
	    this.drawType = DrawType.NODRAW;
	    this.start = false;
	    this.end = false;
	    this.pnGraph.mDrag = false;
	    this.pnGraph.repaint();
	    this.jRandomCheck.setEnabled(false);
	    if (this.startVertex == null) {
		this.jTextStatus.setText("Not chosen start vertex yet");
		return;
	    }
	    if (this.endVertex == null) {
		this.jTextStatus.setText("Not chosen end vertex yet");
		return;
	    }
	    this.pnHeap.heap = new FibonacciHeap();
	    this.pnHeap.heap.insertVertex(this.startVertex);
	}
	while (this.alState != StateAlgorithm.SOLVED)
	    this.dijkstraAlgorithm();
	this.jTextStatus.setText("Solved");
	this.showResult();
}//GEN-LAST:event_btnSolveMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
	
	this.clearAll();
}//GEN-LAST:event_btnClearMouseClicked

    private void pnGraphMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnGraphMouseReleased
	
	int x = 0;
	int y = 0;
	Vertex vertex = null;
	if (this.drawType != DrawType.NODRAW || this.start || this.end) {
	    x = evt.getX() - jGraphPanel.radius/2;
	    y = evt.getY() - jGraphPanel.radius/2;
	    if (x < 0 || y < 0) {
		this.jTextStatus.setText("Invalid position");
		this.drawType = DrawType.NODRAW;
		return;
	    }
	    vertex = this.pnGraph.checkInVertex(x, y);
	    if (vertex != null)
		if (vertex.state != State.LABELED)
		    if (this.start) {
			vertex.state = State.LABELED;
			vertex.setKey(0);
			this.startVertex = vertex;
			this.jTextStatus.setText("");
			this.jSolution.append("Starting vertex\t: Vertex " + Integer.toString(vertex.getData()) + "\n");
			this.start = false;
		    } else if (this.end) {
			vertex.state = State.LABELED;
			this.endVertex = vertex;
			this.jTextStatus.setText("");
			this.jSolution.append("Ending vertex\t: Vertex " + Integer.toString(vertex.getData()) + "\n");
			this.end = false;
		    }
	}
	
	if (this.drawType == DrawType.VERTEXS) {
	    if (vertex != null) {
		this.jTextStatus.setText("Concurred with another vertex");
	    } else {
		this.pnGraph.listVertexs.add(new Vertex(x, y, this.numVertexs, -1));
		this.numVertexs++;
	    }
	} else if (this.drawType == DrawType.EDGES){
	    if (vertex == null)
		this.jTextStatus.setText("You must click on exist vertex");
	    else if (vertex == this.head)
		this.jTextStatus.setText("You must choose another vertex");
	    else {
		if (draw) {
		    this.pnGraph.mDrag = false;
		    this.pnGraph.head = null;
		    Edge edge = new Edge(this.head, vertex, 10);
		    edge.edgeType = this.pnGraph.checkEdge(this.head, vertex);
		    if (this.jRandomCheck.isSelected()) {
			Random random = new Random();
			edge.setLength(random.nextInt(20));
		    } else
			edge.setLength(Integer.parseInt(JOptionPane.showInputDialog(null, "Length of edge", "Edge", JOptionPane.QUESTION_MESSAGE)));
		    this.head.outgoingEdges.add(edge);
		    vertex.incomingEdges.add(edge);
		    this.pnGraph.listEdges.add(edge);
		    this.head = null;
		    this.jTextStatus.setText("Draw an edge");
		    this.draw = false;
		} else {
		    this.head = vertex;
		    this.pnGraph.head = vertex;
		    this.pnGraph.xM = evt.getX();
		    this.pnGraph.yM = evt.getY();
		    this.pnGraph.mDrag = true;
		    this.jTextStatus.setText("Choose tail vertex");
		    this.draw = true;
		}
	    }
	}
	this.pnGraph.repaint();
}//GEN-LAST:event_pnGraphMouseReleased

    private void pnGraphMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnGraphMouseMoved
	
	if (this.pnGraph.mDrag) {
	    this.pnGraph.xM = evt.getX();
	    this.pnGraph.yM = evt.getY();
	    this.pnGraph.repaint();
	}
}//GEN-LAST:event_pnGraphMouseMoved

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
	
	this.jTextStatus.setText("");
	if (this.pnGraph.listEdges.isEmpty() && this.pnGraph.listVertexs.isEmpty()) {
	    this.jTextStatus.setText("Empty graph, not save");
	    return;
	}
	if (this.jSaveFileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
	    File file = this.jSaveFileChooser.getSelectedFile();
	    try {
		BufferedWriter output = new BufferedWriter(new FileWriter(file));
		try {
		    for (Vertex Vertex : this.pnGraph.listVertexs) {
			output.write(String.format("Vertex:%d:%d:%d", Vertex.getData(), Vertex.getX_cor(), Vertex.getY_cor()));
			output.newLine();
		    }
		    for (Edge edge : this.pnGraph.listEdges) {
			output.write(String.format("Edge:%d:%d:%d", edge.getHead().getData(), edge.getTail().getData(), edge.getLength()));
			output.newLine();
		    }
		    this.jTextStatus.setText("Save graph successfully");
		} finally {
		    output.close();
		}
	    } catch (IOException e) {
	    }
	}
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnOpenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpenMouseClicked
	
	this.jTextStatus.setText("");
	if (this.jOpenFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
	    File file = this.jOpenFileChooser.getSelectedFile();
	    this.clearAll();
	    try {
		BufferedReader input = new BufferedReader(new FileReader(file));
		try {
		    String line = null;
		    line = input.readLine();
		    while (line != null) {
			String splitLine[] = line.split(":");
			if (splitLine[0].equals("Vertex")) {
			    int d = Integer.parseInt(splitLine[1]);
			    int x = Integer.parseInt(splitLine[2]);
			    int y = Integer.parseInt(splitLine[3]);
			    this.pnGraph.listVertexs.add(new Vertex(x, y, d, -1));
			} else if (splitLine[0].equals("Edge")) {
			    Vertex headVertex = this.pnGraph.listVertexs.get(Integer.parseInt(splitLine[1]));
			    Vertex tailVertex = this.pnGraph.listVertexs.get(Integer.parseInt(splitLine[2]));
			    int l = Integer.parseInt(splitLine[3]);
			    Edge edge = new Edge( headVertex, tailVertex, l);
			    edge.edgeType = this.pnGraph.checkEdge(headVertex, tailVertex);
			    headVertex.outgoingEdges.add(edge);
			    tailVertex.incomingEdges.add(edge);
			    this.pnGraph.listEdges.add(edge);
			}
			line = input.readLine();
		    }
		    this.jTextStatus.setText("Load graph successfully");
		} finally {
		    input.close();
		}
	    } catch (IOException e) {
	    }
	}
    }//GEN-LAST:event_btnOpenMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdge;
    private javax.swing.JButton btnEnd;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSolve;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStep;
    private javax.swing.JButton btnVertex;
    private javax.swing.JFileChooser jOpenFileChooser;
    private javax.swing.JCheckBox jRandomCheck;
    private javax.swing.JFileChooser jSaveFileChooser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jSolution;
    private javax.swing.JLabel jTextHeap;
    private javax.swing.JTextField jTextStatus;
    private javax.swing.JPanel pnButton;
    /*
    private javax.swing.JPanel pnGraph;
    */private jGraphPanel pnGraph;
    /*
    private javax.swing.JPanel pnHeap;
    */private jHeapPanel pnHeap;
    private javax.swing.JPanel pnSolution;
    // End of variables declaration//GEN-END:variables

    private int numVertexs = 0;

    // for draw
    private boolean draw = false;
    private Vertex head = null;
    private DrawType drawType = DrawType.NODRAW;

    // for function choose start and end Vertex
    private boolean start = false;
    private boolean end = false;
    private Vertex startVertex = null;
    private Vertex endVertex = null;
    
    // for algorithm
    private StateAlgorithm alState = StateAlgorithm.UNLOCK;
    private Vertex curVertex = null;
    private Edge curEdge = null;
    private int curPos = 0;

    private void clearAll() {
	this.pnGraph.listVertexs.clear();
	this.pnGraph.listEdges.clear();
	this.pnGraph.showResult = false;
	this.pnGraph.mDrag = false;
	this.pnGraph.repaint();
	this.pnHeap.heap = null;
	this.pnHeap.repaint();
	this.jTextStatus.setText("");
	this.jTextHeap.setText("");
	this.jSolution.setText("");
	this.jRandomCheck.setEnabled(false);
	this.draw = false;
	this.end = false;
	this.start = false;
	this.head = null;
	this.startVertex = null;
	this.endVertex = null;
	this.numVertexs = 0;
	this.drawType = DrawType.NODRAW;
	this.alState = StateAlgorithm.UNLOCK;
	this.curVertex = null;
	this.curEdge = null;
	this.curPos = 0;
    }

    private void dijkstraAlgorithm() {
	this.jTextHeap.setText("");
	// check solved
	if (this.alState == StateAlgorithm.SOLVED)
	    return;
	// first time run
	if (this.curVertex == null) {
	    this.endVertex.state = State.UNLABELED;
	    this.curVertex = this.pnHeap.heap.deleteMin();
	    this.curVertex.state = State.SCANNED;
	    this.curPos = 0;
	}
	int sz = this.curVertex.outgoingEdges.size();
	if (this.curPos < sz) {
	    if (this.curEdge != null)
		this.curEdge.edgeState = State.UNLABELED;
	    this.curEdge = this.curVertex.outgoingEdges.get(this.curPos);
	    this.curEdge.edgeState = State.SCANNED;
	    Vertex tailOfCurVertex = this.curEdge.getTail();
	    
	    if (tailOfCurVertex.state != State.SCANNED) {
		if (tailOfCurVertex.state == State.UNLABELED) {
		    // insert a vertex with
		    tailOfCurVertex.state = State.LABELED;
		    tailOfCurVertex.setPred(this.curVertex);
		    tailOfCurVertex.setKey(this.curVertex.getKey() + this.curEdge.getLength());
		    this.pnHeap.heap.insertVertex(tailOfCurVertex);
		    this.jTextHeap.setText("Insert vertex " + Integer.toString(tailOfCurVertex.getData()));
		} else if (tailOfCurVertex.getKey() > this.curVertex.getKey() + this.curEdge.getLength()) {
		    // decrease the key of a vertex with finite key
		    tailOfCurVertex.setPred(this.curVertex);
		    this.jTextHeap.setText("Decrease key of vertex " + Integer.toString(tailOfCurVertex.getData())
			    + " from " + Integer.toString(tailOfCurVertex.getKey())
			    + " to " + Integer.toString(this.curVertex.getKey() + this.curEdge.getLength()));
		    this.pnHeap.heap.decreaseKey(this.curVertex.getKey() + this.curEdge.getLength(), tailOfCurVertex);
		}
	    }
	    // check next outgoing edge
	    this.curPos++;
	} else if (!this.pnHeap.heap.isEmpty()) {
	    this.curEdge.edgeState = State.UNLABELED;
	    this.curVertex = this.pnHeap.heap.deleteMin();
	    this.jTextHeap.setText("Delete min vertex " + Integer.toString(this.curVertex.getData()));
	    this.curVertex.state = State.SCANNED;
	    this.curPos = 0;
	} else
	    this.alState = StateAlgorithm.SOLVED;
	this.pnHeap.repaint();
	this.pnGraph.repaint();
    }

    private void showResult() {
	if (this.alState != StateAlgorithm.SOLVED)
	    return;

	this.pnGraph.showResult = true;
	this.endVertex.state = State.LABELED;
	this.startVertex.state = State.LABELED;
	if (this.curEdge != null)
	    this.curEdge.edgeState = State.UNLABELED;
	this.jTextStatus.setText("Solved");

  	if (this.endVertex.getPred() == null)
	    this.jSolution.append("There is no shorttest path from vertex " + Integer.toString(this.startVertex.getData())
			+ " to vertex " + Integer.toString(this.endVertex.getData()) + "\n");
	else {
	    this.jSolution.append("Path:\n");
	    ArrayList<Vertex> result = new ArrayList<Vertex>();
	    Vertex tailN = this.endVertex;
	    do {
		tailN.state = State.LABELED;
		result.add(tailN);
		Vertex headN = tailN.getPred();
		if (headN == null) break;
		tailN.getIncomingEdge(headN).edgeState = State.LABELED;
		tailN = headN;
	    } while (tailN != null);
	    for (int i = result.size() - 1; i > 0; i--)
		this.jSolution.append("Vertex " + Integer.toString(result.get(i).getData()) + " -> ");
	    this.jSolution.append("Vertex " + Integer.toString(result.get(0).getData()) + "\n");
	    this.jSolution.append("\tDistance: " + Integer.toString(this.endVertex.getKey()));
	    this.pnGraph.repaint();
	    this.pnSolution.repaint();
	}
    }
    
}