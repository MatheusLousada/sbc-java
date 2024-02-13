package br.gov.sp.saobernardo.webservice.gui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import thinlet.Thinlet;

@SuppressWarnings("rawtypes")
public class ThinletUtils {
    public static final String DATA = "data";
	public static final String TEXT = "text";
	public static final String CHOICE = "choice";
	public static final String ITEM = "item";
	public static final String SELECTED = "selected";
	public static final String LIST_TO = "lstTo";
    public static final String LIST_FROM = "lstFrom";
    
	public static final String XML_GUI_MOVE_LISTS = "/fut-manager-gui-move-lists.xml";
	public static final String XML_GUI_DIALOG = "/fut-manager-gui-dialog.xml";

	public static void loadObjectsIntoList( Thinlet thinlet, List objects, Object list ) {
        loadObjectsIntoList( thinlet, objects, list, null );
    }

	public static void loadObjectsIntoList( Thinlet thinlet, List objects, Object list, String text ) {
        loadObjectsIntoCollectionComponent( thinlet, objects, list, text, ITEM );
    }

	public static void addObjectIntoList( Thinlet thinlet, Object object, Object list ) {
        addObjectIntoCollectionComponent( thinlet, object, list, null, ITEM );
    }

	public static void addObjectsIntoList( Thinlet thinlet, List objects, Object list ) {
        addObjectsIntoCollectionComponent( thinlet, objects, list, null, ITEM );
    }

	public static void addObjectIntoList( Thinlet thinlet, Object object, Object list, String text ) {
        addObjectIntoCollectionComponent( thinlet, object, list, text, ITEM );
    }

	public static void addObjectsIntoList( Thinlet thinlet, List objects, Object list, String text ) {
        addObjectsIntoCollectionComponent( thinlet, objects, list, text, ITEM );
    }
    
	public static void loadObjectsIntoCombo( Thinlet thinlet, List objects, Object list ) {
        loadObjectsIntoCollectionComponent( thinlet, objects, list, null, CHOICE );
    }
    
	public static void loadObjectsIntoCombo( Thinlet thinlet, List objects, Object list, String text ) {
        loadObjectsIntoCollectionComponent( thinlet, objects, list, text, CHOICE );
    }
    
	public static void addObjectIntoCombo( Thinlet thinlet, List objects, Object list ) {
	    addObjectIntoCollectionComponent( thinlet, objects, list, null, CHOICE );
    }
    
	public static void addObjectsIntoCombo( Thinlet thinlet, List objects, Object list ) {
	    addObjectsIntoCollectionComponent( thinlet, objects, list, null, CHOICE );
    }
    
	public static void addObjectIntoCombo( Thinlet thinlet, Object object, Object list, String text ) {
	    addObjectIntoCollectionComponent( thinlet, object, list, text, CHOICE );
    }
    
	public static void addObjectsIntoCombo( Thinlet thinlet, List objects, Object list, String text ) {
	    addObjectsIntoCollectionComponent( thinlet, objects, list, text, CHOICE );
    }
    
	private static void loadObjectsIntoCollectionComponent( Thinlet thinlet, List objects, Object list, String text, String type ) {
	    thinlet.removeAll( list );
	    addObjectsIntoCollectionComponent( thinlet, objects, list, text, type );
	}

	private static void addObjectsIntoCollectionComponent( Thinlet thinlet, List objects, Object list, String text, String type ) {
        if( objects == null || objects.isEmpty() ) {
            return;
        }
        Iterator it = objects.iterator();
        Object obj = null;
       // Object item = null;
        while( it.hasNext() ) {
            obj = it.next();
            addObjectIntoCollectionComponent( thinlet, obj, list, text, type );
        }
    }

	private static void addObjectIntoCollectionComponent( Thinlet thinlet, Object object, Object list, String text, String type ) {
        if( object == null ) {
            return;
        }
        Object item = Thinlet.create( type );
        thinlet.setString( item, TEXT, Util.parseText( object, text ) );
        thinlet.putProperty( item, DATA, object );
        thinlet.add( list, item );
    }
	
	public void includeAll( Thinlet thinlet, Object fromList, Object toList ) {
	    if( fromList == null || toList == null ) {
	        return;
	    }
	    Object[] objs = thinlet.getItems( fromList );
	    if( objs == null ) {
	        return;
	    }
	    List<Object> list = new ArrayList<Object>();
	    for( int i=0; i<objs.length; i++ ) {
	        list.add( thinlet.getProperty( objs[i], DATA ) );
	    }
	    addObjectsIntoList( thinlet, list, toList, "$name" );
	    thinlet.removeAll( fromList );
	}
	
	public void includeSelected( Thinlet thinlet, Object fromList, Object toList ) {
	    if( fromList == null || toList == null ) {
	        return;
	    }
	    Object obj = thinlet.getSelectedItem( fromList );
	    if( obj == null ) {
	        return;
	    }
	    thinlet.remove( obj );
	    addObjectIntoList( thinlet, thinlet.getProperty( obj, DATA ), toList, "$name" );
	}

	public static void closeDialog( Thinlet thinlet, Object dialog ) {
	    thinlet.remove( dialog );
	}

	public static void showDialog( Thinlet thinlet, String title, String text ) {
	    try {
	        Object dialog = thinlet.parse( XML_GUI_DIALOG );
	        thinlet.setString( dialog, TEXT, title );
	        thinlet.setString( thinlet.find(dialog, "lblDialogText"), TEXT, text );
	        thinlet.add( dialog );
	    } catch( Exception e ) {
	        e.printStackTrace();
	    }
	}
	
	public static void unselectListItem( Thinlet thinlet, Object list ) {
        Object item = thinlet.getSelectedItem( list );
        if( item != null ) {
            thinlet.setBoolean( item, SELECTED, false );
        }
	}
	
	public static void selectListItem( Thinlet thinlet, Object list, Object obj ) {
	    thinlet.setInteger( list, SELECTED, -1 );
	    thinlet.setString( list, TEXT, null );
        if( obj != null ) {
            Object[] items = thinlet.getItems( list );
            if( items != null ) {
                for( int i=0; i<items.length; i++ ) {
                    Object item = thinlet.getProperty( items[i], DATA );
                    if( item.equals( obj ) ) {
                        thinlet.setInteger( list, SELECTED, i );
                        break;
                    }
                }
            }
        }
	}
    
    public static Object getSelectedObject( Thinlet thinlet, Object list ) {
        Object item = thinlet.getSelectedItem( list );
        return thinlet.getProperty( item, DATA );
    }
}