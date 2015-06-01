/******************************************************
 Cours : 				LOG735
 Session : 				Été 2015
 Groupe : 				01
 Projet : 				Laboratoire 2
 Étudiants : 			Huy-Son Pham
 						Antoine McNabb-Baltar
 Code(s) perm. : 		PHAH20118704
 						MCNA06089101
 					
 Date création : 		21 mai 2015
 Date dern. modif. : 	21 mai 2015
******************************************************
Classe décrivant la base des événements transmis.
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
