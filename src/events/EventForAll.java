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
�v�nement lanc� par les boutons "Envoyer � Tous"
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
