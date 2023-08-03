package mylibrary.database;



public class CostumerModel {
    // atributos
    private int IdentityDoc;
    private String docType;
    private String name;
    private String lastName;
    private String email;
    private String groupClass;

    //constructor vacio
    public CostumerModel() {
    }

    //constructor con parametros
    public CostumerModel(int identityDoc, String docType, String name, String lastName, String email, String groupClass) {
        IdentityDoc = identityDoc;
        this.docType = docType;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.groupClass = groupClass;
    }

    // getter and setter


    public int getIdentityDoc() {
        return IdentityDoc;
    }

    public void setIdentityDoc(int identityDoc) {
        IdentityDoc = identityDoc;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroupClass() {
        return groupClass;
    }

    public void setGroupClass(String groupClass) {
        this.groupClass = groupClass;
    }
}
