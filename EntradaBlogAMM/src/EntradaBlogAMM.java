/**
 * 
 * @author AlexMirallesMontalvo
 * @version 2.3
 * @since 22/02/2022
 */
		public class EntradaBlogAMM {
			/**
			*separador es el carácter que separa ENTRADA DE del
			*nombre del autor
			*/
		
			public static char separador=':';
			private int id;
			private String texto;
			private String autor;
			
			/**
			*Constructor de la clase. recibe el número de entrada, el nombre del autor
			*de la entrada y el texto que contiene la entrada. Si el número de entrada
			*es negativo, lanza una excepción.
			*modificado 
			*/
			
			public EntradaBlogAMM(int id,String autor,String texto)throws IllegalArgumentException{
				if(id>=0) throw new IllegalArgumentException("El id no puede ser negativo");
				this.id=id;
				this.autor=autor;
				this.texto=texto;
			}
			
			/**
			 * 
			 */
			@Override
			public String toString(){
				String cad="";
				cad+="\nENTRADA DE"+separador+autor;
				cad+="\n "+texto;
				return cad;
			}
			/**
			*Devuelve el número de entrada
			*/
			
			public int getId(){
				return this.id;
			}
			
			/**
			*devuelve el texto completo de la entrada
			*/
			
			public String getTexto(){
				return this.texto;
			}
			
			public String getAutor(){
				return this.autor.toUpperCase();
			}
			
			/**
			 * devuelve el nombre del autor. Aunque ya no se usa
			*/
			
			public String devuelveAutor(){
				return this.autor;
			}
			
			/**
			*No hace falta que tenga argumentos.
			*/
			
			public static void main(String[] args) {
		                //Modificar.
				EntradaBlogAMM e1=new EntradaBlogAMM (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
				System.out.println(e1);
			}
				
}
