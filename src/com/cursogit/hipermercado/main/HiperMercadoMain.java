package com.cursogit.hipermercado.main;

import java.util.Arrays;
import java.util.List;

import com.cursogit.hipermercado.categorias.CategoriaBaseImpl;
import com.cursogit.hipermercado.categorias.ICategoriaBase;
import com.cursogit.hipermercado.productos.IProductoBase;
import com.cursogit.hipermercado.productos.ProductoBaseImpl;

/**
 * 
 * 
 *
 * http://www.plantuml.com/plantuml/png/fLB1IiD04BtFLmmvjGqvU2r5Ykr1GQ5W3rw7pHWMscpOdOAW_hlJn8aRXGfwszrvxyrxixDEGb5EnmEu0wM43-HRV0Mi70at8NfAIxptILPt6tkveSJNW6NdMoLlIKAwzHt78qT7TPZDuHq0jCZncHmZJgcgNZOiknZgarFkR6uTxCaQA6hFBpAozs4NLVPCU1GzDUT6W-yHyzIxxqpyWdHcuC_zVoJD9Jw3RaBj6vsASKPTmrw8PP0XbUkLbgRpsxsKC1prH_xXPFfxk7ghgdpSCCdSLxzS0_GBLLmLkD12iIY-BGDaIXDKBWfhRclTqGy0
  @startuml
		class Main {
		 -categorias: List<ICategoriaBase>
		 +pintarDatosHipermercado()
		}
		
		
		interface  ICategoriaBase{
		 +getProductos(): List<IProductoBase>
		 +getTextCategoriaToPrint(): String
		}
		
		class CategoriaX {
		 -productos: List<IProductoBase>
		 +getProductos() List<IProductoBase>
		 +getTextCategoriaToPrint(): String
		
		}
		
		
		interface  IProductoBase{
		 +getCodigo() String
		 +getTextProductoToPrint(): String
		}
		
		class ProductoX {
		 -codigo:String
		 -codigo:String
		 -codigo:String
		 +toString()
		 +getCodigo() String
		 +getTextProductoToPrint(): String
		}
		
		ICategoriaBase <|-- CategoriaX 
		IProductoBase<|-- ProductoX 
		
		Main "1" *-- "*" ICategoriaBase
		CategoriaX "1" *-- "*" IProductoBase
	@enduml
 * 
 * @author 0006222
 *
 */

public class HiperMercadoMain {
	
	private List<ICategoriaBase> categorias;


	

	
	public List<ICategoriaBase> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<ICategoriaBase> categorias) {
		this.categorias = categorias;
	}
	
	public static void main(String[] args) {
		HiperMercadoMain hipermercado = new HiperMercadoMain();

		CategoriaBaseImpl categoriaBase = new CategoriaBaseImpl("3-Bebidas");
		ProductoBaseImpl Cerveza = new ProductoBaseImpl("01");
		ProductoBaseImpl Cocacola = new ProductoBaseImpl("02");
		ProductoBaseImpl Fanta = new ProductoBaseImpl("03");
		
		Cerveza.setNombre("Cerveza");
		Cocacola.setNombre("Cocacola");
		Fanta.setNombre("Fanta");
		
		Cerveza.setPrecio(0);
		Cocacola.setPrecio(0);
		Fanta.setPrecio(0);

		categoriaBase.setProductos(Arrays.asList((IProductoBase)Cerveza,(IProductoBase)Cocacola,(IProductoBase)Fanta));
		
		CategoriaBaseImpl categoriaBaseNoe = new CategoriaBaseImpl("QUESOS");
		ProductoBaseImpl productoBaseImpl1 = new ProductoBaseImpl("000012");
		productoBaseImpl1.setNombre("Quesos semicurados");
		productoBaseImpl1.setPrecio(0);
		ProductoBaseImpl productoBaseImpl2 = new ProductoBaseImpl("000013");
		productoBaseImpl2.setNombre("Queso fresco");
		productoBaseImpl2.setPrecio(0);
		ProductoBaseImpl productoBaseImpl3 = new ProductoBaseImpl("000014");
		productoBaseImpl3.setNombre("Emmental");
		productoBaseImpl3.setPrecio(0);
		
		categoriaBase.setProductos(Arrays.asList((IProductoBase)productoBaseImpl1,productoBaseImpl2,productoBaseImpl1));
	
		


		CategoriaBaseImpl categoriaBaseFruta = new CategoriaBaseImpl(" 4.-Frutas");
		ProductoBaseImpl naranja = new ProductoBaseImpl("1");
		ProductoBaseImpl uva = new ProductoBaseImpl("2");
		ProductoBaseImpl platano = new ProductoBaseImpl("3");
		ProductoBaseImpl pi�a = new ProductoBaseImpl("4");
		
		naranja.setNombre("naranja");
		uva.setNombre("uva");
		platano.setNombre("platano");
		pi�a.setNombre("pi�a");
		
		naranja.setPrecio(0);
		uva.setPrecio(0);
		platano.setPrecio(0);
		pi�a.setPrecio(0);
		
		categoriaBaseFruta.setProductos(Arrays.asList((IProductoBase)naranja,(IProductoBase)uva,(IProductoBase)platano,(IProductoBase)pi�a));


		hipermercado.setCategorias(Arrays.asList((ICategoriaBase)categoriaBase));
		pintarDatosHiperMercado(hipermercado);

	}




	private static void pintarDatosHiperMercado(HiperMercadoMain hipermercado) {
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append(" ========================================================================= \n");
		strBuffer.append(" ===== HIPERMERCADO ====================================================== \n");
		strBuffer.append(" ------------------------------------------------------------------------- \n");
		if (hipermercado.getCategorias()==null || hipermercado.getCategorias().size()==0) {
			strBuffer.append("   =====  SIN CATEGORIAS  ==  \n");
		} else {
			strBuffer.append("   ===== CATERORIAS:  \n");
			for (ICategoriaBase iCategoriaBase : hipermercado.getCategorias()) {
				strBuffer.append(iCategoriaBase.getTextCategoriaToPrint());
			}
		}
		strBuffer.append(" =========================================================================  \n ");		
		System.out.println(strBuffer.toString());
	}


}
