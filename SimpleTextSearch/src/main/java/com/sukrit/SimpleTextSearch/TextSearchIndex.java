package com.sukrit.SimpleTextSearch;

/**
 * Created by sukrit
 */
public interface TextSearchIndex {
    SearchResultBatch search(String searchTerm, int maxResults);

    int numDocuments();

    int termCount();
}
