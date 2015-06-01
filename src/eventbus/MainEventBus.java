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
Exécutable qui démarre le bus d'événements sur le
port 12045. Ne devrait pas être modifié.
******************************************************/

package eventbus;

public class MainEventBus {

	public static void main(String[] args) {
		EventBusThread eventBus = new EventBusThread(12045);
		eventBus.start();
	}
}
