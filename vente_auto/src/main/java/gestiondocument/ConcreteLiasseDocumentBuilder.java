package main.java.gestiondocument;

public class ConcreteLiasseDocumentBuilder extends LiasseDocumentBuilder {
	private LiasseDocument liasseDocument = new LiasseDocument();

    public void buildDemandeImmatriculation(){
        //Construction de la demande d'immatriculation
        liasseDocument.setDemandeImmatriculation("Demande d'immatriculation");
    }
    public void buildCertificatCession(){
        //Construction du certificat de cession
        liasseDocument.setCertificatCession("Certificat de cession genere");
    }
    public LiasseDocument getLiasseDocument(){
        return liasseDocument;
    }
}
