package main.java.gestiondocument;

public interface GestionDocument {
	void stockerDocument(String document);
	void convertirHTMLenPDF(String document);
	void rechercherDocument(String requete);
}
