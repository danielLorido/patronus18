
public class Principal {
public static void main(String[] args) {
    Impresora i2 = new Impresora();
    i2.setHoja("a4");
    i2.setColor(true);
    i2.setTipoDocumento("pdf");
    i2.setTexto("texto 2");
    i2.imprimirDocumento();
     
    Impresora i3 = new Impresora();
    i3.setHoja("a3");
    i3.setColor(false);
    i3.setTipoDocumento("excel");
    i3.setTexto("texto 3");
    i3.imprimirDocumento();
    
    //configuracion para una impresion normal
    Impresora i = new Impresora();
    i.setHoja("a4");
    i.setColor(true);
    i.setTipoDocumento("pdf");
    i.setTexto("texto 1");
    i.imprimirDocumento();
    
    //esto sustituye al codigo anterior
    ImpresionNormalFacade impresionNormal=new ImpresionNormalFacade(i,"hola");
    impresionNormal.imprimir();
}
}
