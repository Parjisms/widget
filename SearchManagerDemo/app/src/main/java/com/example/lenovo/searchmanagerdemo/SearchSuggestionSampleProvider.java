package com.example.lenovo.searchmanagerdemo;

/**
 * Created by LENOVO on 2017/4/19.
 */
import android.content.SearchRecentSuggestionsProvider;
public class SearchSuggestionSampleProvider extends SearchRecentSuggestionsProvider {
    final static String AUTHORITY="com.coding.searchmanagerdemo.SearchSuggestionSampleProvider";
    final static int MODE=DATABASE_MODE_QUERIES;

    public SearchSuggestionSampleProvider(){
        super();
        setupSuggestions(AUTHORITY, MODE);
    }
}
