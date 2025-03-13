package dstoianov.nlgrocerydealsapi.model;

public enum StoreName {
    JUMBO("JUMBO"),
    AH("AH"),
    DIRK("DIRK");

    private final String displayName;

    StoreName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }

    public static StoreName fromString(String text) {
        for (StoreName store: StoreName.values()) {
            if (store.displayName.equalsIgnoreCase(text)) {
                return store;
            }
        }
        return null;
    }
}
