package es.cide.prog;

public class Empleado {
    private int nss;
    private String nom;
    private String apellidos;
    private String email;
    private String iban;

    public Empleado(int nss, String nom, String apellidos, String email, String iban) {
        this.nss = nss;
        this.nom = nom;
        this.apellidos = apellidos;
        this.email = email;
        this.iban = iban;
    }

    public int getNss() { 
        return nss; 
    }
    public String getNom() { 
        return nom; 
    }
    public String getApellidos() { 
        return apellidos; 
    }
    public String getEmail() { 
        return email; 
    }
    public String getIban() { 
        return iban; 
    }

    public void setNss(int nss) { 
        this.nss = nss; 
    }
    public void setNom(String nom) { 
        this.nom = nom; 
    }
    public void setApellidos(String apellidos) { 
        this.apellidos = apellidos; 
    }
    public void setEmail(String email) { 
        this.email = email; 
    }
    public void setIban(String iban) { 
        this.iban = iban; 
    }
}