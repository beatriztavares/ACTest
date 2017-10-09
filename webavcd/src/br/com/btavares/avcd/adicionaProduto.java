package br.com.btavares.avcd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class adicionaProduto
 */
@WebServlet("/adicionaproduto")
public class adicionaProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adicionaProduto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>\r\n" + 
				"	    <html>\r\n" + 
				"	        <head>\r\n" + 
				"	            <title>Avenue Code Test - Beatriz Tavares</title>\r\n" + 
				"	            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"	            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n" + 
				"	            <link rel=\"stylesheet\" type=\"text/css\" href=\"./bootstrap-4.0.0/css/bootstrap.min.css\" />\r\n" + 
				"	            <link rel=\"stylesheet\" type=\"text/css\" href=\"./font-awesome-4.7.0/css/font-awesome.min.css\" />\r\n" + 
				"	            <link rel=\"stylesheet\" type=\"text/css\" href=\"./resources/css/actest.css\"/>\r\n" + 
				"	            \r\n" + 
				"	        </head>\r\n" + 
				"	        <body>\r\n" + 
				"	            <nav class=\"navbar navbar-fixed-top\" role=\"navigation\">\r\n" + 
				"        			<div class=\"container\">\r\n" + 
				"            			<div class=\"navbar-header\">\r\n" + 
				"                			<a class=\"navbar-brand\" href=\"#\">\r\n" + 
				"                    			<img src=\"https://assets.avenuecode.com/prd-d1f958ef6040d82ce1606fa67365f884bf49ac9f/images/avenue-code-logo-horizontal.svg\" style=\"width:150px; height:50px\" alt=\"\">\r\n" + 
				"                			</a>\r\n" + 
				"            			</div>\r\n" + 
				"            		</div>\r\n" + 
				"    			</nav>" + 
				"				\r\n" + 
				"	            <div class=\"container div-content\">\r\n" + 
				"					<div class=\"col-md-5 inner\">\r\n" + 
				"    					<div class=\"form-area\">  \r\n" + 
				"        					<form role=\"form\">\r\n" + 
				"        						<br style=\"clear:both\">\r\n" + 
				"                    			<h3 style=\"margin-bottom: 25px; text-align: center;\">Adiciona Produto</h3>\r\n" + 
				"    							<div class=\"form-group\">\r\n" + 
				"									<input type=\"text\" class=\"form-control\" id=\"name\" name=\"name\" placeholder=\"Nome\" required>\r\n" + 
				"								</div>\r\n" +
				"                    			<div class=\"form-group\">\r\n" + 
				"                    				<textarea class=\"form-control\" type=\"textarea\" id=\"message\" placeholder=\"Descricao\" maxlength=\"300\" rows=\"7\"></textarea>\r\n" + 
				"                        			<span class=\"help-block\"><p id=\"characterLeft\" class=\"help-block \">Limite maximo de 300 caracteres</p></span>                    \r\n" + 
				"                    			</div>\r\n" + 
				"            					\r\n" +  
				"        						<button type=\"button\" id=\"cancel\" name=\"cancel\" class=\"btn btn-danger pull-right\" onclick=\"cancelaAdicionaProduto()\">Cancelar</button>\r\n" +
				"        						<button type=\"button\" id=\"submit\" name=\"submit\" class=\"btn btn-primary pull-right\" onclick=\"novoProduto()\">Adicionar</button>\r\n" +
				"        					</form>\r\n" + 
				"    					</div>\r\n" + 
				"					</div>\r\n" + 
				"				</div>" + 
				"	            \r\n" + 
				"	            <script src=\"./bootstrap-4.0/js/bootstrap.min.js\">\r\n" + 
				"	            </script>\r\n" + 
				"	            <script src=\"./resources/js/actest.js\">\r\n" + 
				"	            </script>\r\n" + 
				"	        </body>\r\n" + 
				"	    </html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
