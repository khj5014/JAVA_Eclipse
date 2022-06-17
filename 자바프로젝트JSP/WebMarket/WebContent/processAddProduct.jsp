<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.util.Enumeration"%>
<%@ page import="com.dto.Product"%>
<%@page import="com.dto.ProductRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	
	String uploadPath = application.getRealPath("/upload");
	int maxSize = 1024 * 1024 * 1024;
	String encoding = "utf-8";
	
	MultipartRequest multi = new MultipartRequest(request, uploadPath, maxSize, 
	encoding, new DefaultFileRenamePolicy());

	String productId = multi.getParameter("productId");
	String name = multi.getParameter("name");
	String unitPrice = multi.getParameter("unitPrice");
	String description = multi.getParameter("description");
	String manufacturer = multi.getParameter("manufacturer");
	String category = multi.getParameter("category");
	String unitsInStock = multi.getParameter("unitsInStock");
	String condition = multi.getParameter("condition");
	
	Integer price;

	if (unitPrice.isEmpty())
		price = 0;
	else
		price = Integer.valueOf(unitPrice);

	long stock;
	if (unitsInStock.isEmpty())
		stock = 0;
	else
		stock = Long.valueOf(unitsInStock);
	
	Enumeration files = multi.getFileNames();
	String fname = (String)files.nextElement();
	String filename = multi.getFilesystemName(fname);
		
	ProductRepository dao  = ProductRepository.getInstance();
	
	Product newProduct = new Product();
	newProduct.setProductId(productId);
	newProduct.setPname(name);
	newProduct.setUnitPrice(price);
	newProduct.setDescription(description);
	newProduct.setManufacturer(manufacturer);
	newProduct.setCategory(category);
	newProduct.setUnitsInStock(stock);
	newProduct.setCondition(condition);
	newProduct.setFilename(filename);
	
	dao.addProduct(newProduct);
	
	response.sendRedirect("product.jsp");
	
%>