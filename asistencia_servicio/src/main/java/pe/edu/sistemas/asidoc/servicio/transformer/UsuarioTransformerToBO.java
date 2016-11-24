package pe.edu.sistemas.asidoc.servicio.transformer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pe.edu.sistemas.asidoc.bo.UsuarioBO;
import pe.edu.sistemas.asidoc.core.transformer.Transformer;
import pe.edu.sistemas.asidoc.dao.dominio.Usuario;

@Component( "usuarioTransformerToBO" )
@Scope( "singleton" )
public class UsuarioTransformerToBO implements Transformer< Usuario, UsuarioBO >
{	
	@Autowired
	private PersonalTransformerToBO personalTransformerToBO;
	
	public UsuarioBO transformer(Usuario usuario) 
	{
		UsuarioBO usuarioBO = null;
		
		if ( usuario != null ) {
			usuarioBO = new UsuarioBO();
			usuarioBO.setIdUsuario( usuario.getIdUsuario() );
			usuarioBO.setNomUsuario( usuario.getNomUsuario() );
			usuarioBO.setClave( usuario.getClave() );
			usuarioBO.setPersonal( personalTransformerToBO.transformer( usuario.getPersonal() ) );
		}
		
		return usuarioBO;
	}

	public List<UsuarioBO> transformer(List<Usuario> usuarios) 
	{
		List< UsuarioBO > usuariosBO = new ArrayList<UsuarioBO>();
		
		for ( Usuario usuario : usuarios) 
		{
			usuariosBO.add( transformer( usuario ) );
		}
		
		return null;
	}

}
