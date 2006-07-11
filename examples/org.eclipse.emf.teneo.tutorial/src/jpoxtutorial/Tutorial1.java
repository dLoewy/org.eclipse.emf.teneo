/*
 *	Copyright 2004-2006, Elver.org (http://www.elver.org).
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package jpoxtutorial;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Properties;

import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.example.library.Book;
import org.eclipse.example.library.BookCategory;
import org.eclipse.example.library.Library;
import org.eclipse.example.library.LibraryFactory;
import org.eclipse.example.library.LibraryPackage;
import org.eclipse.example.library.Writer;
import org.eclipse.example.library.impl.BookImpl;
import org.eclipse.example.library.impl.LibraryImpl;
import org.eclipse.example.library.impl.WriterImpl;
import org.eclipse.emf.teneo.jpox.emf.JpoxDataStore;
import org.eclipse.emf.teneo.jpox.emf.JpoxHelper;
import org.eclipse.emf.teneo.jpox.emf.resource.JPOXResourceDAO;
import org.jpox.PMFConfiguration;

/**
 * Tutorial
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
*/
public class Tutorial1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	    	// At this position you can add your own specific types for jpox
	    	// This should be done before creating the persistence manager factory, e.g.
	    	// TypeManager.getTypeManager().addType(MyNiceType.class.getName(), MyNiceTypeMapping.class, MyNiceTypeWrapper.class);
	    	
	    	// set the database connection info, PMFConfiguration is org.jpox.PMFConfiguration
		Properties properties = new Properties();
		properties.setProperty(PMFConfiguration.JDO_DATASTORE_DRIVERNAME_PROPERTY, "com.mysql.jdbc.Driver");
		properties.setProperty(PMFConfiguration.JDO_DATASTORE_URL_PROPERTY, "jdbc:mysql://127.0.0.1:3306/mylibrary");
		properties.setProperty(PMFConfiguration.JDO_DATASTORE_USERNAME_PROPERTY, "root");
		properties.setProperty(PMFConfiguration.JDO_DATASTORE_PASSWORD_PROPERTY, "root");
	  
		// create/register the JpoxDataStore, set the db props and the epackages to persist, initialize creates
		// the database
		String pmfName = "MyPMF"; // the name of the JpoxDataStore
	    	JpoxDataStore jpoxDataStore = JpoxHelper.INSTANCE.createRegisterDataStore(pmfName);
	    	jpoxDataStore.setProperties(properties);
	    	jpoxDataStore.setEPackages(new EPackage[]{LibraryPackage.eINSTANCE});
	    	jpoxDataStore.initialize();
	    	
	    	// create a persistence manager and a transaction
	    	PersistenceManager pm = jpoxDataStore.getPMF().getPersistenceManager();
	    	Transaction tx = pm.currentTransaction(); 
	    	
	    	// start a transaction, create a library and make it persistent
	    	tx.begin();
	    	Library lib = LibraryFactory.eINSTANCE.createLibrary();
	    	lib.setName("My Library");
	    	pm.makePersistent(lib);
	    	
	    	// create a writer
	    	Writer writer = LibraryFactory.eINSTANCE.createWriter();
	    	writer.setName("JRR Tolkien");
	       
	    	// and one of his books
	    	Book book = LibraryFactory.eINSTANCE.createBook();
	    	book.setAuthor(writer);
	    	book.setPages(305);
	    	book.setTitle("The Hobbit");
	    	book.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);
	
	    	// add the writer/book to the library. The writer and book are automatically
	    	// made persistent because they are added to the library which is already
	    	// made persistent
	    	lib.getWriters().add(writer);
	    	lib.getBooks().add(book);
	        
	    	// at commit the objects will be present in the database
	    	tx.commit();
	    	pm.close(); // empty the cache
	    	
	    	// at this point the database contains one library, one book and one writer
	    	// Reopen the transaction and query for the library objects
	    	pm = jpoxDataStore.getPMF().getPersistenceManager();
	    	tx = pm.currentTransaction(); 
	    	tx.begin();
	    	
	    	// NOTE: here you see one drawback of the current JPOX implementation:
	    	// for querying you require the concrete implementation instead of the
	    	// interface!
	    	// retrieve all LibraryImpl classes and subclasses.
	    Extent e = pm.getExtent(LibraryImpl.class, true);
	    Query q = pm.newQuery(e);
	
	    // there is only one library
	    Collection c = (Collection)q.execute();
	    lib = (Library)c.iterator().next();
	    
	    // read the writer and book
	    writer = (Writer)lib.getWriters().get(0);
	    System.out.println(writer.getName());
	    book = (Book)lib.getBooks().get(0);
	    System.out.println(book.getTitle());
	    
	    // show that the container is set
	    System.out.println(book.eContainer() == lib);
	    System.out.println(writer.getBooks().get(0) == book);
	    
	    // Now add a new writer and book
	    Writer george = LibraryFactory.eINSTANCE.createWriter();
	    george.setName("G. Orwell");
	    
	    // create a new book and set the writer and library
	    Book georgesBook = LibraryFactory.eINSTANCE.createBook();
	    georgesBook.setPages(250);
	    georgesBook.setTitle("1984");
	    georgesBook.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);
	    georgesBook.setAuthor(george);
	
	    lib.getBooks().add(georgesBook);
	    lib.getWriters().add(george);
	    
	    // and close of
	    tx.commit();
	    pm.close();

	    // reopen the pm/transaction
	    	pm = jpoxDataStore.getPMF().getPersistenceManager();
	    	tx = pm.currentTransaction();
	    tx.begin();
	
	    // retrieve all books
	    Query qry = pm.newQuery("SELECT FROM " + BookImpl.class.getName());
	    Collection coll = (Collection)qry.execute();
	    System.out.println(((Book)coll.iterator().next()).getTitle()); // show a title
	    System.out.println(((Book)coll.iterator().next()).getTitle()); // show a title
	
	    // retrieve a book which has a writer with the name of G. Orwell
	    qry = pm.newQuery("SELECT FROM " + BookImpl.class.getName() + " WHERE " +
	    		" title==\"1984\" && author == writ && writ.name == \"G. Orwell\" " + 
	    		"VARIABLES " + WriterImpl.class.getName() + " writ");
	    coll = (Collection)qry.execute();
	    System.out.println(coll.size()); // should be 1
	    Book bk = (Book)coll.iterator().next();
	    System.out.println(bk.getTitle()); // should be 1984
	    	System.out.println(bk.getAuthor().getName()); // should be G. Orwell
		    
	    	// read the library with a name ending on Library
    		qry = pm.newQuery("SELECT FROM " + LibraryImpl.class.getName() + " WHERE name.endsWith(\"Library\")");
	    coll = (Collection)qry.execute();
	    lib = (Library)coll.iterator().next();
	    
		qry = pm.newQuery("SELECT FROM " + JpoxHelper.INSTANCE.getInstanceClass(Book.class).getName() + " WHERE " +
				" title==\"1984\" && author == writ && writ.name == \"G. Orwell\" " + 
				"VARIABLES " + WriterImpl.class.getName() + " writ");
		System.err.println(((Collection)qry.execute()).size());
		
		// retrieving all books
		qry = pm.newQuery("SELECT FROM " + JpoxHelper.INSTANCE.getInstanceClass(Book.class).getName());
		System.err.println(((Collection)qry.execute()).size());
		
		// retrieving all libraries with a name ending on library
		qry = pm.newQuery("SELECT FROM " +  JpoxHelper.INSTANCE.getInstanceClass(Library.class).getName() + 
				" WHERE name.endsWith(\"Library\")");		
		System.err.println(((Collection)qry.execute()).size());

		// and really close of
	    tx.commit(); 
	    pm.close();
	    
	    try {
		    	String uriStr = "jpox://?" + JPOXResourceDAO.DS_NAME_PARAM + "=MyPMF";
		    	final URI uri = URI.createURI(uriStr);
		    	ResourceSet resourceSet = new ResourceSetImpl();
		    	final Resource res = resourceSet.createResource(uri);

		    	res.load(Collections.EMPTY_MAP);
		    	Iterator it = res.getContents().iterator();
		    	Library libTest;
		    	while (it.hasNext())
		    	{
		    		libTest = (Library)it.next();
		    		System.out.println(libTest.getName());
		    	}	
		    	
		    	Library libNew = LibraryFactory.eINSTANCE.createLibrary();
		    	libNew.setName("My Second Library");
		    	
		    	// create a writer
		    	Writer writerNew = LibraryFactory.eINSTANCE.createWriter();
		    	writerNew.setName("I. Asimov");
		       
		    	// and one of his books
		    	Book bookNew = LibraryFactory.eINSTANCE.createBook();
		    	bookNew.setAuthor(writerNew);
		    	bookNew.setPages(305);
		    	bookNew.setTitle("Foundation and Empire");
		    	bookNew.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);

		    	// add the writer/book to the library.
		    	libNew.getWriters().add(writerNew);
		    	libNew.getBooks().add(bookNew);
		    	    	
		    	// Add the top-level object to the resource
		    	res.getContents().add(libNew);	

		    	// and save them all
		    	res.save(Collections.EMPTY_MAP);
	    } catch (IOException i) {
	    		throw new RuntimeException("IOException " + i.getMessage(), i);
	    }
	    
	    jpoxDataStore.close();
	}
}
