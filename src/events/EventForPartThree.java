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
 Date dern. modif. : 	21 juin 2015
******************************************************
�v�nement lanc� par les boutons "Envoyer � App Trois"
des Applications.
******************************************************/

package events;

public class EventForPartThree extends EventBase implements IPartThreeEvent {

	private static final long serialVersionUID = -854026869036649703L;

	public EventForPartThree(String m){
		super(m);
	}
}
