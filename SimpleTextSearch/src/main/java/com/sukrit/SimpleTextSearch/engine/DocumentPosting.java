package com.sukrit.SimpleTextSearch.engine;

/**
 * Created by sukrit
 */
public class DocumentPosting {

    private DocumentTerm documentTerm;
    private ParsedDocument parsedDocument;
    public DocumentPosting(DocumentTerm documentTerm, ParsedDocument document) {
        this.documentTerm = documentTerm;
        this.parsedDocument = document;
    }

    public DocumentTerm getDocumentTerm() {
        return documentTerm;
    }

    public ParsedDocument getParsedDocument() {
        return parsedDocument;
    }

}
