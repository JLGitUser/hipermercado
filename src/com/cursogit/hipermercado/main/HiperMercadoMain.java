package com.cursogit.hipermercado.main;

import java.util.ArrayList;
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
	
	public static CategoriaBaseImpl categoriasQuesos() {
		CategoriaBaseImpl categoriaBaseQuesos = new CategoriaBaseImpl("Quesos");
		ProductoBaseImpl productoBaseImplQuesos = new ProductoBaseImpl("000030");
		List<IProductoBase> listaQuesos = new ArrayList<>();
		productoBaseImplQuesos.setNombre("Semicurado");
		productoBaseImplQuesos.setPrecio(4f);
		listaQuesos.add(productoBaseImplQuesos);
		ProductoBaseImpl productoBaseImplQuesos2 = new ProductoBaseImpl("000031");
		productoBaseImplQuesos2.setNombre("Fresco");
		productoBaseImplQuesos2.setPrecio(3f);
		listaQuesos.add(productoBaseImplQuesos2);
		ProductoBaseImpl productoBaseImplQuesos3 = new ProductoBaseImpl("000032");
		productoBaseImplQuesos3.setNombre("Emmental");
		productoBaseImplQuesos3.setPrecio(4f);
		listaQuesos.add(productoBaseImplQuesos3);
		categoriaBaseQuesos.setProductos(listaQuesos);
		return categoriaBaseQuesos;
		
	}
	
	public static void main(String[] args) {

		HiperMercadoMain hipermercado = new HiperMercadoMain();
		List<ICategoriaBase> listaCategorias = new ArrayList<>();
		CategoriaBaseImpl categoriaBase = new CategoriaBaseImpl("BASE");
		ProductoBaseImpl productoBaseImpl = new ProductoBaseImpl("000011");
		productoBaseImpl.setNombre("Base");
		productoBaseImpl.setPrecio(new Float(0));
		categoriaBase.setProductos(Arrays.asList((IProductoBase)productoBaseImpl));
		listaCategorias.add(categoriaBase);
		
		List<ICategoriaBase> listabebidas = null;
		
		ProductoBaseImpl productoBaseImplC = new ProductoBaseImpl("000012");
		productoBaseImplC.setNombre("Cerveza");
		productoBaseImplC.setPrecio(new Float(1));
		
		listabebidas.add((ICategoriaBase) productoBaseImplC);
		
		ProductoBaseImpl productoBaseImplBebidas2 = new ProductoBaseImpl("000013");
		productoBaseImplBebidas2.setNombre("Fanta");
		productoBaseImplBebidas2.setPrecio(3f);
		listabebidas.add((ICategoriaBase) productoBaseImplBebidas2);
		
		listabebidas.add((ICategoriaBase) productoBaseImplBebidas2);
		ProductoBaseImpl productoBaseImplF = new ProductoBaseImpl("000014");
		productoBaseImplF.setNombre("Fanta");
		productoBaseImplF.setPrecio(new Float(2));
		listabebidas.add((ICategoriaBase) productoBaseImplF);
		
		ProductoBaseImpl productoBaseImplCo = new ProductoBaseImpl("000013");
		productoBaseImplCo.setNombre("Cocacola");
		productoBaseImplCo.setPrecio(new Float(+1.5));
		listabebidas.add((ICategoriaBase) productoBaseImplCo);
		
		ProductoBaseImpl productoBaseImplBebidas3 = new ProductoBaseImpl("000014");
		productoBaseImplBebidas3.setNombre("Cocacola");
		productoBaseImplBebidas3.setPrecio(4f);
		listabebidas.add((ICategoriaBase) productoBaseImplBebidas3);
		

		CategoriaBaseImpl categoriaBaseBebidas = new CategoriaBaseImpl("Bebidas");
		ProductoBaseImpl productoBaseImplBebidas = new ProductoBaseImpl("000012");
		List<IProductoBase> listabebidas1 = new ArrayList<>();
		productoBaseImplBebidas.setNombre("Cerveza");
		productoBaseImplBebidas.setPrecio(2f);
		listabebidas1.add(productoBaseImplBebidas);
		ProductoBaseImpl productoBaseImplBebidas21 = new ProductoBaseImpl("000013");
		productoBaseImplBebidas21.setNombre("Fanta");
		productoBaseImplBebidas21.setPrecio(3f);
		listabebidas1.add(productoBaseImplBebidas21);
		ProductoBaseImpl productoBaseImplBebidas31 = new ProductoBaseImpl("000014");
		productoBaseImplBebidas31.setNombre("Cocacola");
		productoBaseImplBebidas31.setPrecio(4f);
		listabebidas1.add(productoBaseImplBebidas31);
		categoriaBaseBebidas.setProductos(listabebidas1);
		listaCategorias.add(categoriaBaseBebidas);
		
		CategoriaBaseImpl categoriaBasePescaderia = new CategoriaBaseImpl("Pescaderia");
		ProductoBaseImpl productoBaseImplPescaderia = new ProductoBaseImpl("000015");
		List<IProductoBase> listapescaderia = new ArrayList<>();
		productoBaseImplPescaderia.setNombre("Pulpo");
		productoBaseImplPescaderia.setPrecio(2f);
		listabebidas1.add(productoBaseImplPescaderia);
		ProductoBaseImpl productoBaseImplPescaderia2 = new ProductoBaseImpl("000016");
		productoBaseImplPescaderia2.setNombre("Merluza");
		productoBaseImplPescaderia2.setPrecio(3f);
		listabebidas1.add(productoBaseImplPescaderia2);
		ProductoBaseImpl productoBaseImplPescaderia3 = new ProductoBaseImpl("000017");
		productoBaseImplPescaderia3.setNombre("Salmon");
		productoBaseImplPescaderia3.setPrecio(4f);
		listabebidas1.add(productoBaseImplPescaderia3);
		categoriaBasePescaderia.setProductos(listapescaderia);
		listaCategorias.add(categoriaBasePescaderia);



	}




	private static void pintarDatosHiperMercado(HiperMercadoMain hipermercado) {
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append(" ========================================================================= \n");
		strBuffer.append(" =========================== HIPERMERCADO ================================ \n");
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