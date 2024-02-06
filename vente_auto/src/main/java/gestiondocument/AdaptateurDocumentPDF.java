package main.java.gestiondocument;

public class AdaptateurDocumentPDF implements GestionDocument {
	private GestionnaireDocumentPDF gestionnaireDocumentPDF;

    public AdaptateurDocumentPDF(GestionnaireDocumentPDF gestionnaireDocumentPDF) {
        this.gestionnaireDocumentPDF = gestionnaireDocumentPDF;
    }

    public void stockerDocument(String document) {
        gestionnaireDocumentPDF.stockerPDF(document);
    }

    public void convertirHTMLenPDF(String document) {
        gestionnaireDocumentPDF.convertirHTMLenPDF(document);
    }

    public void rechercherDocument(String requete) {
        gestionnaireDocumentPDF.rechercherPDF(requete);
    }
}
