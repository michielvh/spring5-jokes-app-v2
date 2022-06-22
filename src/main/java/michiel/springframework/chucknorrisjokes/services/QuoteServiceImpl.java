package michiel.springframework.chucknorrisjokes.services;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class QuoteServiceImpl implements QuoteService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public QuoteServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQoute() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
