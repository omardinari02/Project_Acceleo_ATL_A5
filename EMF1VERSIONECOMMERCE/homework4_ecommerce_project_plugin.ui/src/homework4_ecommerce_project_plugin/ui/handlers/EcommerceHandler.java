package homework4_ecommerce_project_plugin.ui.handlers;
import homework4_ecommerce_project.*;
import homework4_ecommerce_project.EntityRelationships.Attribute;
import homework4_ecommerce_project.EntityRelationships.DataBase;
import homework4_ecommerce_project.EntityRelationships.Entity;
import homework4_ecommerce_project.EntityRelationships.EntityRelationshipsFactory;
import homework4_ecommerce_project.EntityRelationships.EntityRelationshipsPackage;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public class EcommerceHandler {
    public final static String FILENAME = "testEcommerceModel.xmi";
	
    public static DataBase create(){
    	
    	DataBase cmr = EntityRelationshipsFactory.eINSTANCE.createDataBase();
        cmr.setName("E-commerce");
        
        Entity ent1 = EntityRelationshipsFactory.eINSTANCE.createEntity();
        ent1.setName("Order");
        Entity ent2 = EntityRelationshipsFactory.eINSTANCE.createEntity();
        ent2.setName("Product");
        Entity ent3 = EntityRelationshipsFactory.eINSTANCE.createEntity();
        ent3.setName("Customar");
        Entity ent4 = EntityRelationshipsFactory.eINSTANCE.createEntity();
        ent4.setName("Category");
        Entity ent5 = EntityRelationshipsFactory.eINSTANCE.createEntity();
        ent5.setName("Cart");
        Entity ent6 = EntityRelationshipsFactory.eINSTANCE.createEntity();
        ent6.setName("Payment");
        Entity ent7 = EntityRelationshipsFactory.eINSTANCE.createEntity();
        ent7.setName("Shipping");
        Entity ent8 = EntityRelationshipsFactory.eINSTANCE.createEntity();
        ent8.setName("Review");
        Entity ent9 = EntityRelationshipsFactory.eINSTANCE.createEntity();
        ent9.setName("OrderItem");
        
        Attribute atr1 = EntityRelationshipsFactory.eINSTANCE.createAttribute();
        atr1.setName("orderDate");
        Attribute atr2 = EntityRelationshipsFactory.eINSTANCE.createAttribute();
        atr2.setName("productName");
        Attribute atr3 = EntityRelationshipsFactory.eINSTANCE.createAttribute();
        atr3.setName("customarAddress");
        Attribute atr4 = EntityRelationshipsFactory.eINSTANCE.createAttribute();
        atr4.setName("categoryName");
        Attribute atr5 = EntityRelationshipsFactory.eINSTANCE.createAttribute();
        atr5.setName("amountPayment");
        Attribute atr7 = EntityRelationshipsFactory.eINSTANCE.createAttribute();
        atr7.setName("shippingMethod");
        Attribute atr8 = EntityRelationshipsFactory.eINSTANCE.createAttribute();
        atr8.setName("ratingReview");
        Attribute atr9 = EntityRelationshipsFactory.eINSTANCE.createAttribute();
        atr9.setName("orderItemAmount");
        
        ent1.getAttributes().add(atr1);
        ent2.getAttributes().add(atr2);
        ent3.getAttributes().add(atr3);
        ent4.getAttributes().add(atr4);
        ent5.getAttributes().add(atr5);
        ent7.getAttributes().add(atr7);
        ent8.getAttributes().add(atr8);
        ent9.getAttributes().add(atr9);

        
        cmr.getEntities().add(0,ent1);
        cmr.getEntities().add(1,ent2);
        cmr.getEntities().add(2,ent3);
        cmr.getEntities().add(2,ent4);
        cmr.getEntities().add(2,ent5);
        cmr.getEntities().add(2,ent6);
        cmr.getEntities().add(2,ent7);
        cmr.getEntities().add(2,ent8);
        cmr.getEntities().add(2,ent9);
        

        
        return cmr;
    }
    
    public static Diagnostic validate(DataBase wn) {
    	return Diagnostician.INSTANCE.validate(wn);
    }
    
    public static void main(String[] args) {
    	DataBase application = create();
    	serializeModel(application, FILENAME);
    	DataBase libl = load(FILENAME);
    	Diagnostic d = validate(libl);
    	
    	if(d.getSeverity() != Diagnostic.ERROR)
    		System.out.println("Your ecommerce model is valid !!!");
    	else 
    		System.out.println("Your ecommerce model is not valid !!!!!!");
    	System.out.println(application.getEntities().size());
    	application.getEntities().forEach(z -> System.out.println(z.getName()));
    }
    
    public static DataBase load(String fileName) {
		EPackage.Registry.INSTANCE.put(EntityRelationshipsPackage.eNS_URI, EntityRelationshipsPackage.eINSTANCE);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(fileName), true);
		DataBase ecom = (DataBase) resource.getContents().get(0);
		System.out.println(ecom);
		return ecom;
	}
    
    public static void serializeModel(DataBase cmr, String filename) {
    	Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    	Map<String, Object> m = reg.getExtensionToFactoryMap();
    	m.put("xmi", new XMIResourceFactoryImpl());
    	
    	ResourceSet set = new ResourceSetImpl();
    	Resource resource = set.createResource(URI.createURI(filename));
    	resource.getContents().add(cmr);
    	
   
    	try {
    		resource.save(Collections.EMPTY_MAP);
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
}
