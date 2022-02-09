package dao;

import java.util.List;

import model.Hotel;

public interface HotelesDao {
	
	public List<Hotel> devolverHotelesDisponibles(); //se implementa en HotelesDaoImpl

}
