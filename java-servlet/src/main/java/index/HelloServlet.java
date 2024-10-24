package index;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.rmi.ServerException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// HTTPServlet을 상속받아 HTTP 요청을 처리하는 서블릿 구현

public class HelloServlet extends HttpServlet {
	
	// service 메서드
	// : HttpServletRequest 객체와 HttpServletResponse 객체를 인자로 받아 HTTP 요청을 처리
	@Override
	public void service (HttpServletRequest request, HttpServletResponse response ) throws IOException, ServletException {
	
		// 응답처리
		// : HTTP 응답의 바디에 데이터 출력 & 문자열로 출력
		OutputStream os = response.getOutputStream(os, true);
		PrintStream out = new PrintStream(os, true);
		out.println("Hello Servlet!!!!!");
	}
}
