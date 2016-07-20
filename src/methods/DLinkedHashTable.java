package methods;

import java.util.Vector;

/**
 * Created by avoge on 20/07/2016.
 */
public class DLinkedHashTable {

    private static final int MAX_TABLE = 700;

    public static final int SURPLUSES = (MAX_TABLE/100)*14; //Es recomendable que la zona de excedentes represente
                                                            // el 14% de la tabla.

    private Vector<HashPair> TABLE;

    public DLinkedHashTable(){

        TABLE = new Vector<>(MAX_TABLE);

    }

    public int hash(String key){

        int id = 7;

        for(int i = 0; i < key.length(); i++) id = (id*31+key.charAt(i))%MAX_TABLE;

        return id;
    }

    public boolean insert(String key){

        if(TABLE.elementAt(hash(key)).getKey() == key){
            TABLE.elementAt(hash(key)).setValue(TABLE.elementAt(hash(key)).getValue()+1);
            return true;
        }

        return false;
    }
}
