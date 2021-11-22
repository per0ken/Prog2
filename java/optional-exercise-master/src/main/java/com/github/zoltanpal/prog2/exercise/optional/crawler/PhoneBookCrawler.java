package com.github.zoltanpal.prog2.exercise.optional.crawler;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Supplier;

import com.github.zoltanpal.prog2.exercise.optional.domain.PhoneBookEntry;

/**
 * Utility class for executing operations on the
 * supplied collection of {@link PhoneBookEntry} instances.
 */
public class PhoneBookCrawler {

    public static final PhoneBookEntry DEFAULT_ENTRY = new PhoneBookEntry("DEFAULT_ENTRY", null);
    public static final String NOT_FOUND_MESSAGE = "Phone book entry is not found";

    private final Supplier<Collection<PhoneBookEntry>> phoneBookEntriesSupplier;

    public PhoneBookCrawler(Supplier<Collection<PhoneBookEntry>> phoneBookEntriesSupplier) {
        this.phoneBookEntriesSupplier = phoneBookEntriesSupplier;
    }

    /**
     * Searches phone book entries by person name.
     *
     * @param name the name of the person used as search criteria
     * @return an {@link Optional} of the entry if it is found, or an empty optional otherwise
     */
    public Optional<PhoneBookEntry> findEntryByName(String name) {
        return phoneBookEntriesSupplier.get().stream().filter(entry -> entry.getName().equals(name)).findFirst();
    }

    /**
     * Searches phone book entries by person name.
     *
     * @param name the name of the person used as search criteria
     * @param fallback the supplier which should provide a default entry when the search does not return result
     * @return the entry if it is found, or the supplied default entry otherwise
     */
    public PhoneBookEntry findEntryByNameWithExternalFallback(String name, Supplier<PhoneBookEntry> fallback) {
        return findEntryByName(name).orElseGet(fallback);
    }

    /**
     * Searches phone book entries by person name.
     *
     * @param name the name of the person used as search criteria
     * @return the entry if it is found, or {@link PhoneBookCrawler#DEFAULT_ENTRY} otherwise
     */

    public PhoneBookEntry findEntryByNameWithFallback(String name) {
        return findEntryByName(name).orElse(DEFAULT_ENTRY);
    }

    /**
     * Prints phone numbers by by person name.
     * In case no entry is found, prints {@link PhoneBookCrawler#NOT_FOUND_MESSAGE} as default message.
     *
     * @param name the name of the person used as search criteria
     */
    public void printPhoneNumberByName(String name) {
        findEntryByName(name)
        .ifPresentOrElse(
            phoneBookEntry -> System.out::println(phoneBookEntry.getPhoneNumber())
            -> System.out.println(NOT_FOUND_MESSAGE));
}
}
