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

package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author blicrain
 */
public class Servlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.getOutputStream().write("Own Servlet called".getBytes());
  }
  
  
}
