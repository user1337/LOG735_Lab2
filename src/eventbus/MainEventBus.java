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
Ex�cutable qui d�marre le bus d'�v�nements sur le
port 12045. Ne devrait pas �tre modifi�.
******************************************************/

package eventbus;

public class MainEventBus {

	public static void main(String[] args) {
		EventBusThread eventBus = new EventBusThread(12045);
		eventBus.start();
	}
}
