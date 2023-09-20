package com.empresa.service;

import java.util.List;

import com.empresa.entity.Empleado;

public interface EmpleadoService {

	public Empleado insertaActualizaEmpleado(Empleado obj);
	public List<Empleado> listaEmpleado();
}
