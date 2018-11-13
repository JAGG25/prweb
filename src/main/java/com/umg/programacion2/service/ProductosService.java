package com.umg.programacion2.service;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.umg.programacion2.model.Marcas;
import com.umg.programacion2.model.Productos;

public interface ProductosService {

	
	
	public List<Productos> getAllProductos();
	public String saveProductos(HttpServletRequest request, HttpServletResponse response);
	public Productos getProductosId(HttpServletRequest request, HttpServletResponse response);
	public String updateProductos(HttpServletRequest request, HttpServletResponse response);
	public String deleteProductos(HttpServletRequest request, HttpServletResponse response);
	
}
