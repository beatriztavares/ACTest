package br.com.btavares.avcd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet
 */
@WebServlet("/index")
public class servletIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletIndex() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String responseString = "";
		String wsURL = "http://www.deeptraining.com/webservices/weather.asmx";
		
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
				"	            <div id=\"main\" class=\"container div-content\">\r\n" + 
				"	                <div class=\"col-md-10 col-md-offset-1 inner\">\r\n" + 
				"	                    <div class=\"panel panel-default panel-table\">\r\n" + 
				"	                        <div class=\"panel-heading\">\r\n" + 
				"	                            <div class=\"row\">\r\n" + 
				"	                                <div class=\"col col-xs-6\">\r\n" + 
				"	                                    <h4 class=\"panel-title\">Products</h4>\r\n" + 
				"	                                </div>\r\n" + 
				"	                                <div class=\"col col-xs-6 text-right\">\r\n" + 
				"	                                    <button type=\"button\" class=\"btn btn-sm btn-primary btn-create\" onclick=\"adicionaProduto()\">Add Product</button>\r\n" + 
				"	                                </div>\r\n" + 
				"	                            </div>\r\n" + 
				"	                        </div>\r\n" + 
				"	                        <div class=\"panel-body\">\r\n" + 
				"	                            <table class=\"table table-striped table-bordered table-list\">\r\n" + 
				"	                                <thead>\r\n" + 
				"	                                    <tr>\r\n" + 
				"	                                        <th><em class=\"fa fa-cog\"></em></th>\r\n" + 
				"	                                        <th class=\"hidden-xs\">ID</th>\r\n" + 
				"	                                        <th>Name</th>\r\n" + 
				"	                                        <th>Description</th>\r\n" + 
				"	                                        <th>Parent</th>\r\n" + 
				"	                                    </tr> \r\n" + 
				"	                                </thead>\r\n" + 
				"	                                <tbody>\r\n" + 
				"	                                    <tr>\r\n" + 
				"	                                        <td align=\"center\">\r\n" + 
				"	                                            <button class=\"btn btn-default\"><em class=\"fa fa-pencil\" title=\"Edit\" onclick=\"editaProduto()\"></em></button>\r\n" + 
				"	                                            <button class=\"btn btn-danger\"><em class=\"fa fa-trash\" title=\"Delete\" onclick=\"deletaProduto()\"></em></button>\r\n" + 
				"	                                        </td>\r\n" + 
				"	                                        <td class=\"hidden-xs\">1 </td>\r\n" + 
				"	                                        <td>Product 1</td>\r\n" + 
				"	                                        <td>First product</td>\r\n" + 
				"	                                        <td>Parent</td>\r\n" + 
				"	                                    </tr>\r\n" + 
				"	                                    <tr>\r\n" + 
				"	                                        <td align=\"center\">\r\n" + 
				"	                                            <button class=\"btn btn-default\"><em class=\"fa fa-pencil\" title=\"Edit\" onclick=\"editaProduto()\"></em></button>\r\n" + 
				"	                                            <button class=\"btn btn-danger\"><em class=\"fa fa-trash\" title=\"Delete\" onclick=\"deletaProduto()\"></em></button>\r\n" + 
				"	                                        </td>\r\n" + 
				"	                                        <td class=\"hidden-xs\">1 </td>\r\n" + 
				"	                                        <td>Product 1</td>\r\n" + 
				"	                                        <td>First product</td>\r\n" + 
				"	                                        <td>Parent</td>\r\n" + 
				"	                                    </tr>\r\n" + 
				"	                                    <tr>\r\n" + 
				"	                                        <td align=\"center\">\r\n" + 
				"	                                            <button class=\"btn btn-default\"><em class=\"fa fa-pencil\" title=\"Edit\" onclick=\"editaProduto()\"></em></button>\r\n" + 
				"	                                            <button class=\"btn btn-danger\"><em class=\"fa fa-trash\" title=\"Delete\" onclick=\"deletaProduto()\"></em></button>\r\n" + 
				"	                                        </td>\r\n" + 
				"	                                        <td class=\"hidden-xs\">1 </td>\r\n" + 
				"	                                        <td>Product 1</td>\r\n" + 
				"	                                        <td>First product</td>\r\n" + 
				"	                                        <td>Parent</td>\r\n" + 
				"	                                    </tr>\r\n" + 
				"	                                </tbody>\r\n" + 
				"	                            </table>\r\n" + 
				"	                        </div>\r\n" + 
				"	                    </div>\r\n" + 
				"	                </div>\r\n" + 
				"	            </div>\r\n" + 
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
