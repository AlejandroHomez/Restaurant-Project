package data;

import java.util.ArrayList;
import models.Table;

public class TableRepository {
	
	private ArrayList<Table> tables = new ArrayList<Table>();
	
	public boolean crateTable(Table table) {
		
		tables.add(table);
		
		return true;
	}

}
