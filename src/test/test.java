package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.handler.MessageContext;

public class test {
//	public boolean login(String userId, String password) {
//		MessageContext msgContext = wsContext.getMessageContext();      
//		HttpSession httpSession = ((HttpServletRequest) msgContext.get(MessageContext.SERVLET_REQUEST)).getSession();      
//		HttpServletRequest request = (HttpServletRequest)msgContext.get("HTTP.REQUEST"); 
//		System.out.println("request from " + request.getRemoteAddr()+", [userId = "+userId+", password="+password);
//
//		httpSession.setAttribute("token", httpSession.getId()+"_"+userId);
//		//save session into webservice context
//		((javax.servlet.ServletContext) msgContext.get(MessageContext.SERVLET_CONTEXT)).setAttribute("session", httpSession);
//		return true;
//	}
}
