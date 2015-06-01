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
Événement lancé par les boutons "Envoyer à Tous"
des Applications.
******************************************************/

package events;

public class EventForAll extends EventBase implements IPartOneEvent, IPartThreeEvent,
		IPartTwoEvent {

	private static final long serialVersionUID = -2570010132007741935L;

	public EventForAll(String m){
		super(m);
	}
}
