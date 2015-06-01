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
Événement lancé par les boutons "Envoyer à App Deux"
des Applications.
******************************************************/

package events;

public class EventForPartTwo extends EventBase implements IPartTwoEvent{

	private static final long serialVersionUID = 286636600291399763L;

	public EventForPartTwo(String m){
		super(m);
	}

}
