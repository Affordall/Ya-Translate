package realjamapps.com.yatranslate.model;

public enum Lemma {

    // English terms that give attributes to nouns, extending their definitions.
    ADJECTIVE("adjective"),
    // English terms that modify clauses, sentences and phrases directly.
    ADVERB("adverb"),
    // English terms that connect words, phrases or clauses together.
    CONJUNCTION("conjunction"),
    // English terms that reference nouns, expressing their contexts directly.
    DETERMINER("determiner"),
    // English terms that express emotions, sounds, etc. as exclamations.
    INTERJECTION("interjection"),
    // English word-elements used to form full words.
    MORPHEME("morpheme"),
    // English terms that indicate people, beings, things, places, phenomena, qualities or ideas.
    NOUN("noun"),
    // English terms that quantify nouns.
    NUMERAL("numeral"),
    // English terms that do not belong to any of the inflected grammatical word classes,
    // often lacking their own grammatical functions and
    // forming other parts of speech or expressing the relationship between clauses.
    PARTICLE("particle"),
    // English groups of words elaborated to express ideas, not necessarily phrases in the grammatical sense.
    PHRASE("phrase"),
    // English adpositions that are placed after their objects.
    POSTPOSITION("postposition"),
    // English adpositions that are placed before their objects.
    PREPOSITION("preposition"),
    // English terms that refer to and substitute nouns.
    PRONOUN("pronoun"),
    // English terms that indicate actions, occurrences or states.
    VERB("verb");

    /**
     * String representation of this lemmas.
     */
    private final String lemmas;

    /**
     * Enum constructor.
     * @param lemmas The lemmas identifier.
     */
    Lemma(final String lemmas) {
        this.lemmas = lemmas;
    }

    public static Lemma fromString(final String lemma) {
        for (Lemma l : values()) {
            if (l.toString().equals(lemma)) {
                return l;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return lemmas;
    }

}
