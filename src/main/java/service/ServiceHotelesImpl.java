package service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.HotelesDao;
import model.Hotel;

@Service
public class ServiceHotelesImpl implements ServiceHoteles {

	@Autowired
	HotelesDao dao;

	@Override
	public List<Hotel> devolverHotelesDisponibles() {
		List<Hotel> hoteles = dao.devolverHoteles();
		return hoteles.stream().filter(t -> t.getDisponible() == 1).collect(Collectors.toList());
		// a partir de la lista uso stream() y le aplico filtro: de cada objeto de esa
		// lista, solamente quiero cuya propiedad "diponible" sea 1
	}

}
