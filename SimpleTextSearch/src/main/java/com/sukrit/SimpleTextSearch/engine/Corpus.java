package com.sukrit.SimpleTextSearch.engine;

import com.google.common.base.Preconditions;

import java.util.List;

/**
 * Created by sukrit
 */
public class Corpus {
    private List<ParsedDocument> parsedDocuments;

    public Corpus(List<ParsedDocument> documents) {
        Preconditions.checkNotNull(documents);
        Preconditions.checkState(!documents.isEmpty());
        this.parsedDocuments = documents;
    }

    public List<ParsedDocument> getParsedDocuments() {
        return this.parsedDocuments;
    }

    public int size() {
        return parsedDocuments.size();
    }

}
