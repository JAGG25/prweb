package com.umg.programacion2.serviceImpl;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.umg.programacion2.model.Marcas;
import com.umg.programacion2.model.Productos;
import com.umg.programacion2.model.Puestos;
import com.umg.programacion2.repository.MarcasRepository;
import com.umg.programacion2.repository.ProductosRepository;
import com.umg.programacion2.service.ProductosService;



@Service
public class ProductosServiceImpl implements ProductosService{

	private static Logger logger = LoggerFactory.getLogger(ProductosServiceImpl.class);
	private static final String codigoCorrecto="success";
	private static final String codigoERROR="error";
	
	
	@Autowired MarcasRepository marcasRepository;
	@Autowired ProductosRepository productosRepository;
	@Override
	public List<Productos> getAllProductos() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String saveProductos(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Productos getProductosId(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String updateProductos(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String deleteProductos(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}
	


	
}
