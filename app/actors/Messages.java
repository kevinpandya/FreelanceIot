package actors;

import static java.util.Objects.requireNonNull;

import java.util.LinkedHashMap;
import java.util.Set;

import model.Resultlist;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.Searchphraseresult;
import play.mvc.Result;


public final class Messages {
    private final static Logger logger = LoggerFactory.getLogger("play");

    public static final class UserParentActorCreate {
        public final String id;

        /**
         * Create UserParentActor Message
         */
        public UserParentActorCreate(String id) {
            logger.info("Created actor with id" + id);
            this.id = requireNonNull(id);
        }

        @Override
        public String toString() {
            return "UserParentActorCreate(" + id + ")";
        }
    }
    /**
     * WatchSearchResults Message
     */
    public static final class WatchSearchResults {
        public final String query;

        public WatchSearchResults(String query) {
            this.query = requireNonNull(query);
        }

        @Override
        public String toString() {
            return "WatchSearchResults(" + query + ")";
        }
    }

    /**
     * UnwatchSearchResults Message
     */
    public static final class UnwatchSearchResults {
        public final String query;

        public UnwatchSearchResults(String query) {
            this.query = requireNonNull(query);
        }

        @Override
        public String toString() {
            return "UnwatchSearchResults(" + query + ")";
        }
    }
    /**
     * SearchResults according to the query param passed
     */
    public static final class SearchResult {
        public final Set<LinkedHashMap<String, Resultlist>> searchPhraseResults;
        public final String query;

        public SearchResult(Set<LinkedHashMap<String, Resultlist>> searchPhraseResults, String query) {
            this.searchPhraseResults = searchPhraseResults;
            this.query = query;
        }

        @Override
        public String toString() {
            return "ProjectItem(" + query + ")";
        }
    }

    /**
     * RegisterActor Message
     */
    public static final class RegisterActor {
        @Override
        public String toString() {
            return "RegisterActor";
        }
    }

    /**
     * Override toString for the Messages class
     * @return string "Messages"
     */
    @Override
    public String toString() {
        return "Messages";
    }
}
