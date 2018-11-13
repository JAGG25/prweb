package com.umg.programacion2.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.umg.programacion2.model.Marcas;
import com.umg.programacion2.model.Productos;
import com.umg.programacion2.service.MenuService;
import com.umg.programacion2.service.ProductosService;


@Controller
public class ProductosController {

	private static Logger logger = LoggerFactory.getLogger(ProductosController.class);
	@Autowired ProductosService productosService;
	@Autowired MenuService menuService;

	 
	 
	 @RequestMapping(value={"/productos/productos/listProductos"}, method = RequestMethod.GET)
	    public String listProductos(Model model) {
		 List<Productos> productos = productosService.getAllProductos();
		 model.addAttribute("productos", productos);
		 
		 
//		 	SIEMPRE LLAMAR A ESTA FUNCION
//       simpre incluir este metodo
            model = menuService.getAllParameter(model);
	    	model.addAttribute("pagina", "Productos");
	        return "productos/productos/listProductos";
	    }
	 
	 @RequestMapping(value={"/productos/productos/addProductos"}, method = RequestMethod.GET)
	 public String addProductos(Model model) {
		 	List<Productos> productos = productosService.getAllProductos();
		 	model.addAttribute("productos", productos);
		 
//		 	SIEMPRE LLAMAR A ESTA FUNCION
//	        simpre incluir este metodo
	         model = menuService.getAllParameter(model);
	    	model.addAttribute("pagina", "Productos");
	        return "productos/productos/addProductos";
	    }
	 
	 @RequestMapping(value="/productos/productos/addProductos", method = RequestMethod.POST)
	    public String saveProductos(HttpServletRequest request, HttpServletResponse response, Model model, RedirectAttributes redirectAttributes) {
		 	String resp = productosService.saveProductos(request, response);
		 	model.addAttribute("codigo", resp);
		 	
		 	
//		 	SIEMPRE LLAMAR A ESTA FUNCION
//	        simpre incluir este metodo
	         model = menuService.getAllParameter(model);
	    	model.addAttribute("pagina", "Productos");
	        return "redirect:/productos/productos/listProductos";
	    }
	 
	 
	 	@RequestMapping(value="/productos/productos/updateProductos", method = RequestMethod.GET)
	    public String findProductos(HttpServletRequest request, HttpServletResponse response, Model model, RedirectAttributes redirectAttributes) {
		 	
		 	
		 	Productos resp = productosService.getProductosId(request, response);
		 	model.addAttribute("productos", resp);
		 	  List<Productos> productos = productosService.getAllProductos();
		         logger.info("Cantidad de productos "+productos.size());
				 model.addAttribute("productos", productos);
		 	
//		 	SIEMPRE LLAMAR A ESTA FUNCION
//	        simpre incluir este metodo
	         model = menuService.getAllParameter(model);
	    	model.addAttribute("pagina", "Productos");
	        return "productos/productos/updateProductos";
	    }
	 	
	 	@RequestMapping(value="/productos/productos/updateProductos", method = RequestMethod.POST)
	    public String updateProductos(HttpServletRequest request, HttpServletResponse response, Model model, RedirectAttributes redirectAttributes) {
		 	String resp = productosService.updateProductos(request, response);
		 	model.addAttribute("codigo", resp);
		 	
		 	
//		 	SIEMPRE LLAMAR A ESTA FUNCION
//	        simpre incluir este metodo
	         model = menuService.getAllParameter(model);
	    	model.addAttribute("pagina", "Productos");
	        return "redirect:/productos/productos/listProductos";
	    }
	 	
	 	@RequestMapping(value="/productos/productos/eliminarProductos", method = RequestMethod.POST)
		public @ResponseBody String deleteProductos(HttpServletRequest request, HttpServletResponse response,RedirectAttributes redirectAttributes)
		{
			String respuesta = productosService.deleteProductos(request, response);
			return respuesta;
			
		}
	 
}
