/******************************************************
 Cours : 				LOG735
 Session : 				�t� 2015
 Groupe : 				01
 Projet : 				Laboratoire 2
 �tudiants : 			Huy-Son Pham
 						Antoine McNabb-Baltar
 Code(s) perm. : 		PHAH20118704
 						MCNA06089101
 					
 Date cr�ation : 		21 mai 2015
 Date dern. modif. : 	21 mai 2015
******************************************************
Classe d�crivant la base des �v�nements transmis.
******************************************************/

package events;

public class EventBase implements IEvent {

	private static final long serialVersionUID = 5483268778788190805L;
	
	private String message;
	
	public EventBase(String message){
		this.message = message;
	}
	
	public String getMessage() { return message; }
}
