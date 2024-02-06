package main.java.gestiondocument;

//Classe abstraite pour le builder de liasse de documents
public abstract class LiasseDocumentBuilder{
  //Methodes abstraites pour la construction des differents documents
  public abstract void  buildDemandeImmatriculation();
  public abstract void buildCertificatCession();
  public abstract void buildBonCommande();
  public abstract LiasseDocument getLiasseDocument();
}
