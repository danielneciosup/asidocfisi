package pe.edu.sistemas.asidoc.servicio.transformer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pe.edu.sistemas.asidoc.core.transformer.Transformer;
import pe.edu.sistemas.asidoc.bo.PersonalBO;
import pe.edu.sistemas.asidoc.dao.dominio.Personal;

@Component( "personalTransformerToBO" )
@Scope( "singleton" )
public class PersonalTransformerToBO implements Transformer< Personal, PersonalBO >
{
	public PersonalBO transformer(Personal personal) 
	{
		PersonalBO personalBO = null;
		
		if ( personal != null ) {
			personalBO = new PersonalBO();
			personalBO.setIdPersonal( personal.getIdPersonal() );
			personalBO.setNombre( personal.getNombre() );
			personalBO.setApellido( personal.getApellido() );
			personalBO.setCorreo( personal.getCorreo() );
		}
		
		return personalBO;
	}

	public List<PersonalBO> transformer(List<Personal> personales)
	{
		List< PersonalBO > personalBOs = new ArrayList<PersonalBO>();
		
		for (Personal personal : personales) 
		{
			personalBOs.add( transformer( personal ) );
		}
		
		return personalBOs;
	}

}
