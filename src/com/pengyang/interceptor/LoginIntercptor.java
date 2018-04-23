package com.pengyang.interceptor;

import java.io.PrintWriter;

import javax.servlet.annotation.HandlesTypes;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.ndktools.javamd5.core.MD5;

/*
 * 鐧婚檰鎷︽埅鍣細闃叉鏈粡鍏佽鐧婚檰缃戠珯锛岄櫎鐧婚檰鐣岄潰澶栭〉闈㈡嫤鎴�
 * 
 * 浣滆�咃細榄忛箯杈�
 * 鏃堕棿锛�2017.9.13
 * 浣滅敤锛氳姹傛嫤鎴紝鍒ゆ柇鏄惁姝ｅ父鐧婚檰杩涘叆绯荤粺锛屽惁锛岃繑鍥炴柊绐楀彛鐧婚檰锛屽叧闂潪娉曠獥鍙ｏ紝鏄墽琛屾帶鍒跺櫒鎿嶄綔
 */
public class LoginIntercptor implements HandlerInterceptor {

	
	MD5 md5 = new MD5();//MD5鍔犲瘑
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

       
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		String url = arg0.getRequestURI();//鑾峰彇璇锋眰鍦板潃
		if(url.indexOf("login")>=0){//妫�鏌ユ槸鍚︾櫥闄嗛〉闈�
			return true;
		}
		HttpSession session = arg0.getSession();
		String str = (String) session.getAttribute("isLogin");//鑾峰彇鐧婚檰鐘舵��  
        if(str!=null){ //鐧婚檰鐘舵�佷笉涓虹┖  
            return true;  
        }  
        PrintWriter out = arg1.getWriter();
       
//      鍦ㄦ柊绐楀彛涓墦寮�鐧婚檰鐣岄潰  鍏抽棴鐖剁獥鍙�
//      鍏抽棴鐖剁獥鍙�:window.opener.opener=null; window.opener.close();
//        out.print("<script> window.open('/test/login.jsp'); </script>"); //杩斿洖鐧婚檰鐣岄潰
        out.print("<script> if(window.opener==null){"
        		+ "window.top.location.href=\"/test/login.jsp\";"
        		+ "}else{"
        		+ "window.opener.top.location.href=\"/test/login.jsp\";"
        		+ "window.close();}</script>"); //杩斿洖鐧婚檰鐣岄潰
        return false;  
    }  
}
