package controller;

import java.util.ArrayList;

import data.TableRepository;
import models.Table;

public class TableController {
	
	TableRepository tableRepocitory = new TableRepository();
	
	public String crateTable(String numberTable , int capacity , String location){
		
		if(numberTable.trim().length() < 1 ) {
			return "El numero de la mesa debe ser mayor a 0";
		}
		if(capacity <= 1 ) {
			return "La capacidad de la mesa debe ser mayor a 1";
		}
		if(location.trim().length() <= 5 ) {
			return "La ubicacion de la mesa debe tener mas de 5 caracteres";
		}
		
		Table table = new Table(numberTable, capacity, location);
		boolean result = tableRepocitory.crateTable(table);
		
		if (result) {
			System.out.println("");
			return "La mesa se creo con exito";
		} else {
			System.out.println("");
			return "Hubo un error al crear la mesa";
		}
		
	}
	
	public ArrayList<Table> getAll(){
		ArrayList<Table> tables = tableRepocitory.getTables();
		return tables;
	}
	
	public Table searchTable(String tableNumer) {
		
		Table table = tableRepocitory.findTableById(tableNumer);
		return table;
		
	}
	
	public String updateTable(Table table, String numberTable , int capacity , String location) {
		
		Table uptadeTable = new Table(numberTable,capacity,location);
		tableRepocitory.updateTable(table, uptadeTable);

		return null;
	}
	
	public boolean deleteTable(String id) {
		
		return tableRepocitory.deleteTable(id);
		
	}

}
