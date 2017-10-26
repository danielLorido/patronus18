
public class ImpresionNormalFacade implements TipoImpresion{
	 Impresora impresora;
	 
	 public ImpresionNormalFacade(Impresora printer,String texto) {
	        super();
	        impresora=printer;
	        impresora= new Impresora();
	        impresora.setColor(true);
	        impresora.setHoja("A4");
	        impresora.setTipoDocumento("PDF");
	        impresora.setTexto(texto);
	    }
	 public void imprimir() {         
	        impresora.imprimirDocumento();
	    }
}
