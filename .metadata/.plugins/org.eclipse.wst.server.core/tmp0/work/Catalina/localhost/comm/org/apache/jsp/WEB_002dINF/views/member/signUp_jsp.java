/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-24 06:10:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signUp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1657269417000L));
    _jspx_dependants.put("jar:file:/C:/springdummy/7_Framework/comm/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <!DOCTYPE html>\n");
      out.write(" <html lang=\"en\">\n");
      out.write(" <head>\n");
      out.write("     <meta charset=\"UTF-8\">\n");
      out.write("     <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("     <title>KH 커뮤니티</title>\n");
      out.write(" \n");
      out.write("     <link rel=\"stylesheet\" href=\"../resources/css/main-style.css\">\n");
      out.write("     \n");
      out.write("     <link rel=\"stylesheet\" href=\"../resources/css/signUp-style.css\">\n");
      out.write(" \n");
      out.write("     <script src=\"https://kit.fontawesome.com/a2e8ca0ae3.js\" crossorigin=\"anonymous\"></script>\n");
      out.write(" </head>\n");
      out.write(" <body>\n");
      out.write("     <main>\n");
      out.write("        <!-- hedaer include -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("         <!-- 회원가입  -->\n");
      out.write("         <section class=\"signUp-content\">\n");
      out.write(" \n");
      out.write("            <!-- 회원가입 화면 전환 주소(GET)와 같은 주소로 \n");
      out.write("                실제 회원가입을 요청(POST)\n");
      out.write("                -> 요청 주소가 같아도 데이터 전달 방식이 다르면 중복 허용\n");
      out.write("            -->\n");
      out.write("\n");
      out.write("            <!-- \n");
      out.write("                절대경로 : /community/member/signUp\n");
      out.write("                상대경로 : signUp\n");
      out.write("             -->\n");
      out.write("\n");
      out.write("            <form action=\"signUp\" method=\"POST\" name=\"signUp-form\" onsubmit=\"return signUpValidate()\">\n");
      out.write(" \n");
      out.write("                 <label for=\"memberEmail\">\n");
      out.write("                     <span class=\"required\">*</span> 아이디(이메일)\n");
      out.write("                 </label>\n");
      out.write("                 \n");
      out.write("                 <div class=\"signUp-input-area\">\n");
      out.write("                     <input type=\"text\" id=\"memberEmail\" name=\"memberEmail\"\n");
      out.write("                             placeholder=\"아이디(이메일)\" maxlength=\"30\"\n");
      out.write("                             autocomplete=\"off\" required>\n");
      out.write(" \n");
      out.write("                     <!-- autocomplete=\"off\" : 자동완성 미사용 -->\n");
      out.write("                     <!-- required : 필수 작성 input 태그 -->\n");
      out.write("                     \n");
      out.write("                     <!-- 자바스크립로 코드 추가 예정 -->\n");
      out.write("                     <button type=\"button\" id=\"sendBtn\">인증번호 받기</button>\n");
      out.write("                 </div>\n");
      out.write(" \n");
      out.write("                 <span class=\"signUp-message\" id=\"emailMessage\">메일을 받을 수 있는 이메일을 입력해주세요.</span>\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("                 <label for=\"emailCheck\">\n");
      out.write("                     <span class=\"required\">*</span> 인증번호\n");
      out.write("                 </label>\n");
      out.write("                 \n");
      out.write("                 <div class=\"signUp-input-area\">\n");
      out.write("                     <!-- cNumber -->\n");
      out.write("                     <input type=\"text\" id=\"cNumber\"  \n");
      out.write("                             placeholder=\"인증번호 입력\" maxlength=\"6\"\n");
      out.write("                             autocomplete=\"off\">\n");
      out.write(" \n");
      out.write("                     <button type=\"button\" id=\"cBtn\">인증하기</button>\n");
      out.write("                 </div>\n");
      out.write(" \n");
      out.write("                 <!-- 5:00 타이머 / 인증되었습니다(녹색) / 인증 시간이 만료되었습니다.(빨간색) -->\n");
      out.write("                 <span class=\"signUp-message\" id=\"cMessage\" ></span>\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("                 <label for=\"memberPw\">\n");
      out.write("                     <span class=\"required\">*</span> 비밀번호\n");
      out.write("                 </label>\n");
      out.write("                 \n");
      out.write("                 <div class=\"signUp-input-area\">\n");
      out.write("                     <input type=\"text\" id=\"memberPw\" name=\"memberPw\"\n");
      out.write("                             placeholder=\"비밀번호\" maxlength=\"30\">\n");
      out.write("                 </div>\n");
      out.write(" \n");
      out.write("                 <div class=\"signUp-input-area\">\n");
      out.write("                     <input type=\"text\" id=\"memberPwConfirm\"\n");
      out.write("                             placeholder=\"비밀번호 확인\" maxlength=\"30\">\n");
      out.write("                 </div>\n");
      out.write(" \n");
      out.write("                 <span class=\"signUp-message\" id=\"pwMessage\">영어, 숫자, 특수문자(!,@,#,-,_) 6~30글자 사이로 작성해주세요.</span>\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("                 <label for=\"memberNickname\">\n");
      out.write("                     <span class=\"required\">*</span> 닉네임\n");
      out.write("                 </label>\n");
      out.write("                 \n");
      out.write("                 <div class=\"signUp-input-area\">\n");
      out.write("                     <input type=\"text\" id=\"memberNickname\" name=\"memberNickname\"\n");
      out.write("                             placeholder=\"닉네임\" maxlength=\"10\">\n");
      out.write("                 </div>\n");
      out.write(" \n");
      out.write("                 <span class=\"signUp-message\" id=\"nicknameMessage\">영어/숫자/한글 2~10글자 사이로 작성해주세요.</span>\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("                 <label for=\"memberTel\">\n");
      out.write("                     <span class=\"required\">*</span> 전화번호\n");
      out.write("                 </label>\n");
      out.write("                 \n");
      out.write("                 <div class=\"signUp-input-area\">\n");
      out.write("                     <input type=\"text\" id=\"memberTel\" name=\"memberTel\"\n");
      out.write("                             placeholder=\"(- 없이 숫자만 입력)\" maxlength=\"11\">\n");
      out.write("                 </div>\n");
      out.write(" \n");
      out.write("                 <span class=\"signUp-message\" id=\"telMessage\">전화번호를 입력해주세요.(- 제외)</span>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("                 <label for=\"memberAddress\">\n");
      out.write("                     주소\n");
      out.write("                 </label>\n");
      out.write("                 \n");
      out.write("                 <div class=\"signUp-input-area\">\n");
      out.write("                     <input type=\"text\" id=\"sample4_postcode\" name=\"memberAddress\"\n");
      out.write("                             placeholder=\"우편번호\" maxlength=\"6\">\n");
      out.write("                     \n");
      out.write("                     <button type=\"button\" onclick=\"sample4_execDaumPostcode()\">검색</button>\n");
      out.write("                 </div>\n");
      out.write(" \n");
      out.write("                 <div class=\"signUp-input-area\">\n");
      out.write("                     <input type=\"text\" id=\"sample4_roadAddress\" name=\"memberAddress\" placeholder=\"도로명주소\">\n");
      out.write("                 </div>\n");
      out.write(" \n");
      out.write("                 <div class=\"signUp-input-area\">\n");
      out.write("                     <input type=\"text\" id=\"sample4_detailAddress\" name=\"memberAddress\" placeholder=\"상세주소\">\n");
      out.write("                 </div>\n");
      out.write(" \n");
      out.write("                 <button type=\"submit\" id=\"signUp-btn\">가입하기</button>\n");
      out.write(" \n");
      out.write("             </form>\n");
      out.write("             \n");
      out.write("         </section>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("     </main>\n");
      out.write(" \n");
      out.write("    <!-- footer include -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- jQuery 라이브러리 추가(CDN) -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\" integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    <!-- 다음 주소 API -->\n");
      out.write("    <script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- signUp.js 연결 -->\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/member/signUp.js\"></script>\n");
      out.write("\n");
      out.write("    \n");
      out.write(" </body>\n");
      out.write(" </html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
