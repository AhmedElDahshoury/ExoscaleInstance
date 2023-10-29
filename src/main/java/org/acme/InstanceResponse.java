package org.acme;



class InstanceResponse {
    public String id;
    public String reason;
    public Reference reference;
    public String message;
    public String state;

    class Reference {
        public String id;
        public String link;
        public String command;
    }
}
