/*
 /*
 *****************************************************************************
 **
 ** Copyright (C) Siemens AG All Rights Reserved Confidential
 **
 *****************************************************************************
 *
 * History:
 * $Log: NN.java,v $
 */

package launch;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author blicrain
 */
public class LogPhaseListener implements PhaseListener {

  public void afterPhase(PhaseEvent event) {
    System.out.println("LogPhaseListener.afterPhase:" + event.getPhaseId());
  }

  public void beforePhase(PhaseEvent event) {
    System.out.println("LogPhaseListener.beforePhase:" + event.getPhaseId());
  }

  public PhaseId getPhaseId() {
    return PhaseId.ANY_PHASE;
  }
  
}
