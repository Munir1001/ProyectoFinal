package app.lib.queryBuilders;




public enum InlineConstraints {
    PRIMARY_KEY("PRIMARY KEY"),
    NOT_NULL("NOT NULL"),
    UNIQUE("UNIQUE"),
    FOREIGN_KEY("FOREIGN KEY REFERENCES %s(%s) ON DELETE CASCADE");
    
    private String syntax;
    
    private InlineConstraints(String syntax) {
        this.syntax = syntax;
    }
    
    @Override
    public String toString() {
        return syntax;
    }
}

